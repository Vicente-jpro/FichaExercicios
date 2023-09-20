/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichaexercicios.exercicios;

/**
 *
 * @author vicente-simao
 */
public class Exercicio1 {
 
    private Integer[] array = {1,2,0,1,0,1,0,3,0,1};
    
    public Integer[] moverZeros(){
        for (int i = 0; i < array.length; i++){
            if ( array[i] == 0 ){
                
                Integer aux = 0;
                for (int j = i; j < array.length-1; j++){
                    aux = array [j];
                    array [j] = array [j+1];
                    array [j+1] = aux;
                }
            }
        }
        return array;
    }
    
    public void mostrar(){
        for (Integer numero: array){
            System.out.print(numero+",");
        }
    }

}
