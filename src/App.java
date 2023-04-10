import java.util.Scanner; 
import java.util.Locale; 

public class App {
    public static void main(String[] args) throws Exception {
        // 1-Faça um Programa que peça:  
        // 2- A temperatura em graus Celsius
        // 3- E transforme e mostre em graus Fahrenheit.
        float celsius, fahrenheit; 
       
        Locale locale = new Locale("pt", "BR"); 

        System.out.println("A temperatura em graus Celsius é de: ");
        Scanner teclado = new Scanner(System.in); 
        celsius = teclado.nextFloat(); 

        fahrenheit = (celsius * 9 / 5 ) + 32; 

        System.out.println("A temperatura em graus Fahrenheit é de: " + fahrenheit);
        teclado.close();
    }
}
