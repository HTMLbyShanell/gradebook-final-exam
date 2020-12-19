/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spann_finalexam;

import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author Shanell Spann
 */

public class Sounder {
    
    SoundUtils  su = new SoundUtils();
    
    public void IntroSound() throws LineUnavailableException
    {
        su.tone(450, 300);
    }
    
    public void GoodbyeSound() throws LineUnavailableException
    {
        su.tone(700, 300);
        su.tone(250, 300);
        su.tone(700, 300);
    }
   
}
