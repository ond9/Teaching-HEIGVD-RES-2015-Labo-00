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
public class Trumpet implements IInstrument{

  private String sound;
  private static final int soundVolume = 45;
  private static final String color = "golden";
  public Trumpet() {
    this("pouet");
  }

  public Trumpet(String sound) {
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
