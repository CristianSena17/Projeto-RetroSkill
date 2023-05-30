/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceship.battle.SND;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import static javax.sound.sampled.Clip.LOOP_CONTINUOUSLY;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

 
public class Tocarsom implements Runnable{
    private File music;
    public Clip clip = null;
 
    public Tocarsom(File music){
        this.music = music;
    }

    public Tocarsom() {
        
    }


    @Override
    public void run() {
        AudioInputStream ais = null;
        try {
            ais = AudioSystem.getAudioInputStream(getClass().getResource("nopetsallowed.wav"));
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Tocarsom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Tocarsom.class.getName()).log(Level.SEVERE, null, ex);
        }

        AudioFormat af = ais.getFormat();
        DataLine.Info info = new DataLine.Info(Clip.class, af);
        
        try {
            clip = (Clip)AudioSystem.getLine(info);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Tocarsom.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            clip.open(ais);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Tocarsom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Tocarsom.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        clip.loop(LOOP_CONTINUOUSLY);
        

    
        
    }
    }

    