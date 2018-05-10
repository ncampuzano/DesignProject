/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

/**
 *
 * @author Estudiante
 */
public class Rambo extends BuilderMovieStudioAbstract{
    
    public Rambo(){
        super.movie = new Movie();
    }
    
    void buildDuration() {
        movie.setDuration(120);
    }
    void buildGenere() {
	movie.setGenere("Action");
    }
    void buildName() {
        movie.setName("Rambo");
    }
}