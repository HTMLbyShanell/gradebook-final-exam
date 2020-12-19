/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spann_finalexam;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Shanell A. Spann
 * ITDEV-110 ITOOP
 * Final Exam - Fall 2019
 * Due: December 19th 2019
 */
public class View 
{
    String addFName;
    String addLName;
    String addStudentID;
    String studentID;
    String search;
   
    int sum;
    int option;
    int choice;
    int selection;
    int[] assignmentArray = new int[10];
    int[] discussionArray = new int[10];
    int[] examArray = new int [2];
    int addProject;
   
    Scanner keyboard = new Scanner(System.in);   
    ArrayList<StudentGrade> grade = new ArrayList<>();
    StudentGrade sg;
    
    public int getTeacherInput()
    {
       System.out.println();
       System.out.println("PLEASE SELECT THE FOLLOWING: \n\t1. ADD GRADES \n\t2. SEARCH GRADES \n\t3. EDIT GRADES \n\t4. DISPLAY GRADES \n\t0. EXIT");
       System.out.println();
       option = keyboard.nextInt();
       return option;
    }
    
    public void addInfo(ArrayList<StudentGrade> grade)
    {
       Scanner addScan = new Scanner(System.in);

       System.out.println("ENTER FIRST NAME TO ADD: ");
       addFName = addScan.nextLine();   
       
       System.out.println("ENTER LAST NAME TO ADD: ");
       addLName = addScan.nextLine();
       
       
       System.out.println("ENTER STUDENT ID # TO ADD: ");
       addStudentID = addScan.nextLine();
       grade.add(sg);
    }
    
    
    public void addAssignmentGrade(ArrayList<StudentGrade> grade)
    {
        System.out.println("ADD THE 10 ASSIGNMENT SCORES");

        for (int i = 0 ; i < assignmentArray.length; i++ ) 
        {
           assignmentArray[i] = keyboard.nextInt();
           grade.add(sg);
          
        }
        
        System.out.println("ASSIGNMENT SCORES ADDED: ");
        printArray(assignmentArray);
    }
 
    public void addDiscussionGrade(ArrayList<StudentGrade> grade)
    {
       System.out.println("\nADD THE 10 DISCUSSION TOPIC SCORES");

        for (int i = 0 ; i < discussionArray.length; i++ ) 
        {
           discussionArray[i] = keyboard.nextInt();
           grade.add(sg);
        } 
        
        System.out.println("DISCUSSION SCORES ADDED: ");
        printArray(discussionArray);
    }
    
    public void addExamGrade(ArrayList<StudentGrade> grade)
    {
       System.out.println("\nADD THE 2 EXAM SCORES");

        for (int i = 0 ; i < examArray.length; i++ ) 
        {
           examArray[i] = keyboard.nextInt();
           grade.add(sg);
        }  
        
        System.out.println("EXAM SCORES ADDED: ");
        printArray(examArray);
    }
    
    public void addProjectGrade(ArrayList<StudentGrade> grade)
    {
       System.out.println("\nADD A PROJECT SCORE ");
       addProject = keyboard.nextInt();  
       
       System.out.println("PROJECT SCORE ADDED: " + addProject);
       sg = new StudentGrade(addFName, addLName, addStudentID, assignmentArray, discussionArray, examArray, addProject);
       grade.add(sg);
    }
    
    public void printArray(int arr[]){

        int n = arr.length;

        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + ", ");    
        }
    }
    
    public int TeacherSearch()
    {
       keyboard.nextLine();
 
       System.out.println("Press 1 TO SEARCH BY LAST NAME");
       System.out.println("Press 2 TO SEARCH STUDENT ID #: \n");
       choice = keyboard.nextInt();
       
       return choice;
    }
    
    public String TeacherEdit()
    {
       keyboard.nextLine();
 
       System.out.println("ENTER STUDENT ID# TO SEARCH: ");
       studentID = keyboard.nextLine();
       
       return studentID;
    }
    
    public int EditSelection()
    {
        System.out.println("SELECT GRADES TO EDIT:  \n\t1. ASSIGNMENTS \n\t2. DISCUSSION TOPICS \n\t3. EXAMS \n\t4. PROJECT");
        selection = keyboard.nextInt();
        return selection;
    }
    
    public void editAssignmentGrade(ArrayList<StudentGrade> grade)
    {
        System.out.println("CURRENT ASSIGNMENT SCORES: " + assignmentArray);
        System.out.println("REENTER SCORES TO EDIT");
        grade.remove(3);
        grade.set(3, sg);
        
        for (int i = 0 ; i < assignmentArray.length; i++ ) 
        {
           assignmentArray[i] = keyboard.nextInt();
           grade.add(sg);
        }
        
        System.out.println("ASSIGNMENT SCORES EDITED: ");
        printArray(assignmentArray);    
    }
    
    public void editDiscussionGrade(ArrayList<StudentGrade> grade)
    {
        System.out.println("CURRENT DISCUSSION SCORES: " + discussionArray);
        System.out.println("REENTER SCORES TO EDIT");
        grade.remove(4);
        grade.set(4, sg);
        
        for (int i = 0 ; i < discussionArray.length; i++ ) 
        {
           discussionArray[i] = keyboard.nextInt();
           grade.add(sg);
           
        }
        
        System.out.println("DISCUSSION SCORES EDITED: ");
        printArray(discussionArray);    
    }
    
    public void editExamGrade(ArrayList<StudentGrade> grade)
    {
        System.out.println("CURRENT EXAM SCORES: " + examArray);
        System.out.println("REENTER SCORES TO EDIT");
        grade.remove(5);
        grade.set(5, sg);
        
        for (int i = 0 ; i < examArray.length; i++ ) 
        {
           examArray[i] = keyboard.nextInt();
           grade.add(sg);
           
        }
        
        System.out.println("EXAM SCORES EDITED: ");
        printArray(examArray);    
    }
    
    public void editProjectGrade(ArrayList<StudentGrade> grade)
    {
        System.out.println("CURRENT PROJECT SCORE: " + addProject);
        System.out.println("REENTER SCORE TO EDIT");
        grade.remove(6);
        grade.set(6, sg);
        
        addProject = keyboard.nextInt();  
        grade.add(sg);
       System.out.println("PROJECT SCORE EDITED: " + addProject);   
    }
    
    
    public void addStudentGrade(ArrayList<StudentGrade> grade, StudentGrade sg)
    {
      grade.add(sg);  
    }

    public void searchByLastName(ArrayList<StudentGrade> grade, String addLName)
    {
        System.out.println("Enter a last name to search: ");
        search = keyboard.nextLine();
        search = keyboard.nextLine();
        
        for (StudentGrade sg : grade) 
        { 
            if (search.equals(addLName)) {
                System.out.println("RECORD FOUND: ");
                System.out.println("Name: " + addFName + " " + addLName + "\n\t" + "StudentID: " + addStudentID
                        + "\n\t" + "Assignment Grades: " + Arrays.toString(assignmentArray) + "\n\t" + "Discussion Grades: " + Arrays.toString(discussionArray) + 
                        "\n\t" + "Exam Grades: " + Arrays.toString(examArray) + "\n\t" + "Project Grade: " + addProject);
            }
        }    
    }
    public void searchByStudentID(ArrayList<StudentGrade> grade, String addStudentID)
    {
        System.out.println("Enter a student ID #");
        search = keyboard.nextLine(); 
        search = keyboard.nextLine();
        
        for (StudentGrade sg : grade) 
        {
                if (search.equals(addStudentID)) {
                System.out.println("RECORD FOUND: ");
                System.out.println("Name: " + addFName + " " + addLName + "\n\t" + "StudentID: " + addStudentID
                        + "\n\t" + "Assignment Grades: " + Arrays.toString(assignmentArray) + "\n\t" + "Discussion Grades: " + Arrays.toString(discussionArray) + 
                        "\n\t" + "Exam Grades: " + Arrays.toString(examArray) + "\n\t" + "Project Grade: " + addProject);
            }
        }    
    }
    
    public void editGrades(ArrayList<StudentGrade> grade, String addStudentID)
    {
        System.out.println("Enter a student ID #");
        search = keyboard.nextLine(); 
        search = keyboard.nextLine();
        
        for (StudentGrade sg : grade) 
        {
                if (search.equals(addStudentID)) {
                System.out.println("RECORD FOUND: ");
                System.out.println("Name: " + addFName + " " + addLName + "\n\t" + "StudentID: " + addStudentID
                        + "\n\t" + "Assignment Grades: " + Arrays.toString(assignmentArray) + "\n\t" + "Discussion Grades: " + Arrays.toString(discussionArray) + 
                        "\n\t" + "Exam Grades: " + Arrays.toString(examArray) + "\n\t" + "Project Grade: " + addProject);
            }
        }
    }

    public void displayAll(ArrayList<StudentGrade> grade)
    { 
            
        for (StudentGrade sg : grade) 
        {
            System.out.println("STUDENT RECORD: ");
                System.out.println("Name: " + addFName + " " + addLName + "\n\t" + "StudentID: " + addStudentID
                        + "\n\t" + "Assignment Grades: " + Arrays.toString(assignmentArray) + "\n\t" + "Discussion Grades: " + Arrays.toString(discussionArray) + 
                        "\n\t" + "Exam Grades: " + Arrays.toString(examArray) + "\n\t" + "Project Grade: " + addProject);
        }
    }
    
}

