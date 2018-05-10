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
public class MakeAMovie {

    BuilderMovieStudioAbstract abstractMovie;

    public MakeAMovie(BuilderMovieStudioAbstract abstractMovie) {
        this.abstractMovie = abstractMovie;

    }
    public void filmAMovie(){
        this.abstractMovie.buildDuration();
        this.abstractMovie.buildGenere();
        this.abstractMovie.buildName();
    }
    public Movie seeMovie(){
        return this.abstractMovie.movie;
    }
    public void cleanUp(){
        this.abstractMovie.movie.duration = 0;
        this.abstractMovie.movie.genere = null;
        this.abstractMovie.movie.name = null;
    }
}
