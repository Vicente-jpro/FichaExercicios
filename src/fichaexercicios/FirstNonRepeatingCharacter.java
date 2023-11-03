package fichaexercicios;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vicente-simao
 */
public class FirstNonRepeatingCharacter {
    
    private String palavras;
    
    public FirstNonRepeatingCharacter(String palavras){
        this.palavras = palavras;
        
    }
    
    public String primeiraLetraRepetida(){
    
        String palavraRepetida = getLetrasRepetidas();
        boolean repetiu = false;
        String  letraNaoRepetida = "";
        
        if (exitLetraRepetida()){
            for( int j = 0; j < palavras.length(); j++){
                repetiu = false;
                letraNaoRepetida = String.valueOf( palavras.charAt(j) );
                for (int i = 0; i < palavraRepetida.length(); i++ ){

                    String letra = letraToStringAndLowerCase( palavraRepetida.charAt(i) );
                    String letraSeguinte = letraToStringAndLowerCase( palavras.charAt(j) );


                    if(letra.equalsIgnoreCase(letraSeguinte)){
                        repetiu = true;
                    }
                }

                if (!repetiu)
                    return letraNaoRepetida;

            }
        }
        return null;
     
    }
    
    private String getLetrasRepetidas(){
        
        String letras = "";
         System.err.println("Tamanho do array: "+palavras.length());
                        
        for(int i = 0; i < palavras.length(); i++){
            for(int j = i + 1; j < palavras.length(); j++ ){
                
                String letra = letraToStringAndLowerCase( palavras.charAt(i) );
                String letraSeguinte = letraToStringAndLowerCase( palavras.charAt(j));
             
                if (letra.equalsIgnoreCase(letraSeguinte) )
                    letras += letra;
            }
            
        }
        
        return letras;
    }
    
    private boolean exitLetraRepetida(){
        return getLetrasRepetidas().length() > 0;
    }
    
    private String letraToStringAndLowerCase(char letra){
        return String.valueOf( letra ).toLowerCase();
    }
    
}
