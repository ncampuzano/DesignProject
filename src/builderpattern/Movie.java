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
public class Movie {
    public String name = "";
    public String genere = "";
    public int duration;

    public void setName(String name){
        this.name=name;
    }
    public void setGenere(String genere){
        this.genere=genere;
    }
    public void setDuration(int duration){
	this.duration=duration;
    }		
}
