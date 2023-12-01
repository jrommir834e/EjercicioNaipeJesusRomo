/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Random;

/**
 *
 * @author jesus
 */
public class Naipe {
    
    private int numCarta;
    private Palos palo;
    private final Palos[] paloArray=Palos.values();

    //Creamos un constructor sin parámetros para poner un palo y numero de carta random
    public Naipe() {
        //creamos el objeto random
        Random r=new Random();
        
        this.numCarta = r.nextInt(1,11);
        
        //Ponemos un palo random del array de palos
        int numRandom = r.nextInt(paloArray.length);
        this.palo=paloArray[numRandom];
    }

    //Creamos un constructor parametrizado
    public Naipe(int numCarta, Palos palo) {
        this.numCarta = numCarta;
        this.palo = palo;
        
        //Controlamos que los numeros de cartas no puedan ser menor a 0 y mayor a 10
        if(numCarta<1||numCarta>10){
            
            throw new IllegalArgumentException("Introduce un número válido");
            
        }else {
            this.numCarta=numCarta;
        }
        
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naipe{");
        
        if(numCarta==8){
            sb.append("numCarta=").append("Sota");
        }else if(numCarta==9){
            sb.append("numCarta=").append("Caballo");
        } else if(numCarta==10){
            sb.append("numCarta=").append("Rey");
        }else{
               sb.append("numCarta=").append(numCarta);
        }
        
     
        sb.append(", palo=").append(palo);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
    
}
