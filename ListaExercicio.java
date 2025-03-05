public class ListaExercicio{

public static int multDeSomasSucessivas(int a, int b){
    // caso base primeiro
    if (a == 0 || b == 0){
        return 0;
    }
    if (b == 1){
        return a;
    }
    if (a == 1){
        return b;
    }
    
    return a + multDeSomasSucessivas(a, b-1);
}

 public static int somaDeIncrementosSucessivos(int a, int b){
     if (b == 0){
         return a;
     }
     a++;
     return (somaDeIncrementosSucessivos(a, b-1));
 
 }
 
 // public float calculoDeFracoes(int a){
 
 // }
 
 // public String inversaoDeString(String abc){
 
 // }
 
 // public int funcaoDeEckerman(int a, int b){
 //     int resultado = b + 1;
     
 // }
 
 public static void main(String[] args) {
    System.out.println("4 * 3 = " + multDeSomasSucessivas(4,3));
    System.out.println("5 + 4 = " + somaDeIncrementosSucessivos(5,4));
}
























}