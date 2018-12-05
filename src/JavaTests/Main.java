/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaTests;
import util.text;
import java.util.Scanner;
/**
 *
 * @author Truxton
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String digitado = input.nextLine();
        System.out.println(text.CountWords(digitado));
        
    }
    
}
