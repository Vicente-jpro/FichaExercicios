/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichaexercicios;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author vicente-simao
 */
public class ReplaceWithAlphabetPosition {
    
    private Map<String, Integer> elements = new HashMap<>();
    private String palavra; 
    private final String letras = "abcdefghijklmnopqrstuvwzyz";
    
    public ReplaceWithAlphabetPosition(String palavra){
        this.palavra = palavra.toLowerCase().replace(" ", "");
        carregarAlfabeto();
    }
    
    
    public String getFraseConstruidaInteiro(){
        
        String frase = " ";
        for(int i = 0; i < palavra.length(); i++){
            String pl = String.valueOf(  palavra.charAt(i) );
            frase += " "+ encontrarInteiroCorrespondente(pl) ;
        }
        return frase;
    }
    
    private Map<String, Integer> carregarAlfabeto(){
        
        for (int i = 0; i < letras.length(); i++){
            String letra = String.valueOf( letras.charAt(i) );
            elements.put(letra, i+1);
        }
       
       return elements;
    }
    
    private int encontrarInteiroCorrespondente(String letra){
        return elements.get(letra);
    }
    
   
    
}
