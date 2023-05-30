/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberproject;

import java.io.File;
import java.io.IOException;
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

 
public class Musica implements Runnable{
    private File music;
    public Clip clip = null;
    
 
    public Musica(File music){
        this.music = music;
    }

    public Musica() {
        
    }


    @Override
    public void run() {
        AudioInputStream ais = null;
        try {
            ais = AudioSystem.getAudioInputStream(getClass().getResource("MSC/Skid Row Gauntlet III.wav"));
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Musica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Musica.class.getName()).log(Level.SEVERE, null, ex);
        }

        AudioFormat af = ais.getFormat();
        DataLine.Info info = new DataLine.Info(Clip.class, af);
        try {
            clip = (Clip)AudioSystem.getLine(info);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Musica.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            clip.open(ais);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Musica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Musica.class.getName()).log(Level.SEVERE, null, ex);
        }
        clip.loop(LOOP_CONTINUOUSLY);
        

    
        
    }
    }

    