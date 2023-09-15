/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutions;

import codes.*;

/**
 *
 * @author laurent
 */
public class CinemaQuartier extends Cinema {
    
    public CinemaQuartier() 
    {
        super(1);
    }

    public String film() {
        return super.film(1);
    }

    public void programmer(String film) {
       super.programmer(1,film);
    }
    
    public static void main(String[] args)
    {
        CinemaQuartier c = new CinemaQuartier();
        
        c.programmer("Titre");
        
        System.out.println(c.film());
    }
}
