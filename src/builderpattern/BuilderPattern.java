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
public class BuilderPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        MakeAMovie makeAMovie = new MakeAMovie(new Rambo());
	makeAMovie.filmAMovie();
	Movie movie = makeAMovie.seeMovie();
	System.out.println(movie.genere);
	System.out.println(movie.name);
	System.out.println(movie.duration);
    }
}
