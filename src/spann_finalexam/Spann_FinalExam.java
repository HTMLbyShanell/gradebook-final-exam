/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spann_finalexam;

import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author Shanell A. Spann
 * ITDEV-110 ITOOP
 * Final Exam - Fall 2019
 * Due: December 19th 2019
 */
public class Spann_FinalExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws LineUnavailableException{
        
       Controller c = new Controller();
       Sounder sr = new Sounder();
       
       sr.IntroSound();
       c.GradeBookMenu(); 
       sr.GoodbyeSound();
    }
    
}
