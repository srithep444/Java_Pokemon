/*
fdsf * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.test.x;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class POKEMONTestX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            
            System.out.println("Wellcome to the PokemonWorld");
            Map map = new Map();
            System.out.println("Start pokemon is Zenigame");
            Zenigame zeni = new Zenigame(0.5f,1.5f,1.0f);
            
            float stay ; 
            
            for(int i=1;i<11;i++){
                zeni.walk();
                System.out.println("Zenigame distance with walk ["+ i + "] : " + zeni.getDistance());
                stay = zeni.sumDistance(zeni.getDistance(),0,0);
                map.gps(stay);
                     
            }
            for(int i=1;i<4;i++){
                zeni.jump();
                System.out.println("Zenigame distance with jump ["+ i + "] : " + zeni.getJump());
                stay = zeni.sumDistance(zeni.getDistance(),zeni.getJump(),0);
                map.gps(stay);  
                
            }
            for(int i=1;i<6;i++){
                zeni.swim();
                System.out.println("Zenigame distance of swim  ["+ i + "] : " + zeni.getSwim());
                stay = zeni.sumDistance(zeni.getDistance(),zeni.getJump(),zeni.getSwim());
                map.gps(stay);   
            }
            System.out.println("SumDistance:"+ zeni.sumDistance(zeni.getDistance(),zeni.getJump(),zeni.getSwim()));
                
    }
    
}
