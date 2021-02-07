/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eier
 */
public class Song {
    
    private String name;
    private int length;
    
    
    public Song(String nameSong, int lengthSong){
        this.name=nameSong;
        this.length=lengthSong;
    }
    
    public String name(){
        return this.name;
    }
            
    public int length(){
        return this.length;
    }
    
}
