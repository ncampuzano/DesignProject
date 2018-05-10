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
abstract class BuilderMovieStudioAbstract{
    Movie movie;
		
    abstract void buildName();
    abstract void buildGenere();
    abstract void buildDuration();
	
    Movie getMovie(){return movie;}
	
}
