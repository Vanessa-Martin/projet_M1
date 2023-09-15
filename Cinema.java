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
public class Cinema {
    private String[] films;
    
    public Cinema( int salles) 
    {
        this.films = new String[salles];
    }

    public String film(int i)
    {
        return films[i - 1];
    }
    
    public void programmer(int i,String film)
    {
        films[i - 1] = film;
    }
    
    public static void main(String[] args)
    {
        Cinema c = new Cinema(3);
        
        c.programmer(1,"Titre 1");
        c.programmer(2,"Titre 2");
        c.programmer(3,"Titre 3");
        
        for(int i = 1;i <= 3;i++)
            System.out.println(String.format("Salle %d : %s",i,c.film(i)));
    }
}
