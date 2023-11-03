/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fichaexercicios;

import fichaexercicios.exercicios.Exercicio1;
import fichaexercicios.exercicios.TestEmpres;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author vicente-simao
 */
public class FichaExercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      //int[] numbers = {9, 4, 4, 8, 8, 9, 7, 2, 2, 0};
    
        //CreatePhoNumber create = new CreatePhoNumber();
       //System.out.println( create.create_phone_number(numbers) );
       
      // NumeroTelefone numeroTelefone = new NumeroTelefone(numbers);
       
        //System.out.println(numeroTelefone.numeroTelefone());
        
        String palavras = "Abcd";
        FirstNonRepeatingCharacter firstNonRepeatingCharacter 
                = new FirstNonRepeatingCharacter(palavras);
        
        System.out.println("Letra não repetida:"
                +firstNonRepeatingCharacter.primeiraLetraRepetida());
    }
    

 }