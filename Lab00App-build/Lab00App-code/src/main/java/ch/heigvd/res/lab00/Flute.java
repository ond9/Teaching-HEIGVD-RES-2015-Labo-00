/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author st4ck
 */
public class Flute implements IInstrument{
    
    private String sound;
    private static final int soundVolume = 12;
    private static final String color = "green";
    
    public Flute() {
      this("pouet");
    }

    public Flute(String sound) {
      this.sound = sound;
    }
    
    public String play(){
        return sound;
    }
    
    public int getSoundVolume(){
      return soundVolume;
    }
    
    public String getColor(){
        return color;
    }
    
}
