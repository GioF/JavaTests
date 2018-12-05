/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import java.util.Arrays;
/**
 *
 * @author Gio
 */
public class text {
    
    public static String StrReverse(String string){
        
        String revString = new String();
        
        for(int len = string.length() - 1; len>=0; len--){
        
            revString += string.charAt(len);
        
        }
        
        return revString;
    }
    
    public static int CountVowels(String string){
        char[] vowels = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};
        
        int vowelsInString = 0;
        
        for(int i = 0; i<string.length(); i++){
        for(char curChar: vowels){
            if(string.charAt(i) == curChar){
                vowelsInString++;
            }
        }
        }
        
        return vowelsInString;
    }
    
    public static boolean IsPalindrome(String string){
        String reverse = StrReverse(string);
        if(string.equals(reverse)){
            return true;
        }else{
            return false;
        }
    }
    
    public static int CountWords(String string){
        int amount = 1;
        for(int i=0; i<string.length(); i++){
            if(string.charAt(i)==' '){
                amount++;
            }
        }
        
        return amount;
    }
    
    
    
}
