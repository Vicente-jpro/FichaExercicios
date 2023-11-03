/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichaexercicios;

/**
 *
 * @author vicente-simao
 */
public class NumeroTelefone {
    
    private int[] array = new int[10];

    public NumeroTelefone(int[] array) {
        this.array = array;
    }

    public String numeroTelefone(){
        if (!isValidoArray(array))
            return "";
        return "("+codigoPais()+")"+" "+codigoOperadora()+"-"+codigoCliente();
    }
    
    private String codigoPais(){
        
        String numeroPais = "";
        
        for (int i = 0; i < 3; i++)
           numeroPais += String.valueOf(array[i]);
        
        return numeroPais;
    }
    
    private String codigoOperadora(){
        String numeroOperadora = "";
        for (int i = 3; i < 6; i++)
           numeroOperadora += String.valueOf(array[i]);
        
        return numeroOperadora;
        
    }
    
     private String codigoCliente(){
        String numeroCliente = "";
        for (int i = 6; i < 10; i++)
           numeroCliente += String.valueOf(array[i]);
        
        return numeroCliente;
        
    }
     
    private boolean isValidoArray(int[] array){
    
        for(int elemento: array){
            if (elemento > 9 )
                return false;
        }
        return true;
    }
    
   
    
}
