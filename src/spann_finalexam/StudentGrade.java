/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spann_finalexam;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Shanell A. Spann
 * ITDEV-110 ITOOP
 * Final Exam - Fall 2019
 * Due: December 19th 2019
 */
public class StudentGrade 
{
    
    View vw = new View ();

    StudentGrade(String nameF, String nameL, String IDs, int[] arrayA, int[] arrayD, int[] arrayE, int prj) 
    {
      vw.addFName = nameF;
      vw.addLName = nameL;
      vw.addStudentID = IDs;
      vw.assignmentArray = arrayA;
      vw.discussionArray = arrayD;
      vw.examArray = arrayE;
      vw.addProject = prj;
    }
    
    @Override
    public String toString()
    {
        return "\nStudent Gradebook: \n\tFirst Name = " + this.vw.addFName + 
                "\n\tLast Name = " + this.vw.addLName +
                "\n\tStudent ID = " + this.vw.addStudentID +
                "\n\tAssignments = " + convertArray(this.vw.assignmentArray) +
                "\n\tDiscussion Topics = " + convertArray(this.vw.discussionArray) +
                "\n\tExams = " + convertArray(this.vw.examArray) + 
                "\n\tProjects = " + this.vw.addProject ;   
    }
    
    public String convertArray(int[] array) // means we want to recieve an array
    {
       String ZERO = "0";
       String myDisplay;
       
       String strArray[] = new String[array.length]; 
       for(int i = 0; i < array.length; i++)
       {
           if(array[i] > 0) 
           {
               strArray[i] = String.valueOf(array[i]);
           }
           else
           {
              strArray[i] = ZERO; 
           }         
       }
   
        myDisplay = Arrays.toString(strArray).replace(", ", "][");
       
       return myDisplay;
       
       
    }
    
    
    
}
