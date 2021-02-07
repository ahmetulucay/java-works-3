/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eier
 */
public class Film {
    private String nameF;
    private int ageFilm;
    
    public Film (String nameFilm, int ageRatingFilm){
        this.nameF=nameFilm;
        this.ageFilm=ageRatingFilm;
        
    }

    public String name(){
        return this.nameF;
    }
    
    public int ageRating(){
        return this.ageFilm;
    }
    
}
