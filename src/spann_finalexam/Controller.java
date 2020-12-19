/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spann_finalexam;

import java.util.ArrayList;
import javax.sound.sampled.LineUnavailableException;

/**
 * @author Shanell A. Spann
 * ITDEV-110 ITOOP
 * Final Exam - Fall 2019
 * Due: December 19th 2019
 */
public class Controller 
{
    String lname;
    String sID;
    
    int total;
    int option;
    int choice;
    int selection;
    int letterGrade;
    
    Admin a = new Admin();
    View vw = new View();
    
    ArrayList<StudentGrade> grade = new ArrayList<>();
    
    public void Controller() throws LineUnavailableException
    {
        a.Intro();
        GradeBookMenu();
        a.Goodbye();
    }
    
    public void GradeBookMenu()
    {
        do{
            option = vw.getTeacherInput();
            System.out.println("This is option " + option);   
          
            switch(option)
            {
                case 0:
                   System.out.println(". . . Exiting the Grading App.");
                   break;
                case 1 :
                  // add
                  vw.addInfo(grade);
                  vw.addAssignmentGrade(grade);
                  sumOfAssignments();
                  vw.addDiscussionGrade(grade);
                  sumOfDiscussions();
                  vw.addExamGrade(grade);
                  sumOfExams();
                  vw.addProjectGrade(grade);
                  System.out.println("TOTAL POINTS = " + totalPoints());
                  LetterGrade();
                  vw.displayAll(vw.grade);
                  break;
                case 2 :
                  // search
                  choice = vw.TeacherSearch();  
                  if (choice == 1)
                   {   
                       System.out.println("You selected to search by Last Name");
                       vw.searchByLastName(grade, vw.addLName);
                       LetterGrade();
                   }
                   else 
                   {
                       System.out.println("You selected to search by Student ID #");
                       vw.searchByStudentID(grade, vw.addStudentID);
                       LetterGrade();
                   }
                  break;
                case 3 :
                   vw.TeacherEdit();
                   selection = vw.EditSelection();
                   if (selection == 1)
                   {   
                       vw.editAssignmentGrade(grade);
                   }
                   if (selection == 2)
                   {   
                       vw.editDiscussionGrade(grade);
                   }
                   if (selection == 3)
                   {   
                       vw.editExamGrade(grade);
                   }
                   if (selection == 4)
                   {   
                       vw.editProjectGrade(grade);
                   }
                   break;
                case 4 :
                    vw.displayAll(vw.grade);
                    break;
                default :
            }
        }while (option != 0);
    }
    
    public int sumOfAssignments() 
     { 
         int sum = 0;
         int i; 
        
         for (i = 0; i < vw.assignmentArray.length ; i++) 
            sum +=  vw.assignmentArray[i]; 
        
         return sum; 
     }
    
    public int sumOfDiscussions() 
     { 
         int sum = 0;
         int i; 
        
         for (i = 0; i < vw.discussionArray.length ; i++) 
            sum +=  vw.discussionArray[i];  
        
         return sum; 
     }
    
    public int sumOfExams() 
     { 
         int sum = 0;
         int i; 
        
        for (i = 0; i < vw.examArray.length ; i++) 
            sum +=  vw.examArray[i];  
        
         return sum; 
     }
    
    public int totalPoints()
    {
        total = (sumOfAssignments() + sumOfDiscussions() + sumOfExams() + vw.addProject);
        return total;
    }
    
    public void LetterGrade()
    {
        if (totalPoints() <= 600)
        {
            System.out.println("Letter Grade =  F");
        }
        else if (totalPoints() <= 649)
        {
            System.out.println("Letter Grade =  D");
        }
        else if(totalPoints() <= 699)
        {
            System.out.println("Letter Grade =  C");
        }
        else if (totalPoints() <= 749)
        {
            System.out.println("Letter Grade =  C+");
        }
        else if (totalPoints() <= 799)
        {
            System.out.println("Letter Grade =  B-");
        }
        else if (totalPoints() <= 849)
        {
            System.out.println("Letter Grade =  B");
        }
        else if (totalPoints() <= 899)
        {
            System.out.println("Letter Grade =  B+");
        }
        else if (totalPoints() <= 949)
        {
            System.out.println("Letter Grade =  A-");
        }
        else if (totalPoints() >= 950)
        {
            System.out.println("Letter Grade =  A");
        }
    }
    
}
