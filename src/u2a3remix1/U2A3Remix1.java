/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u2a3remix1;

/**
 *
 * @author Jack
 */
import java.util.Scanner;
public class U2A3Remix1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //define variables
        Scanner keyedInput = new Scanner (System.in);
   	 
    	int [ ] numbers = new int [20];
    	int total = 0;
   	//collect inputs
    	System.out.println("Enter twenty integers and they will be added together:");
    	for (int i = 0; i <= 19; i = i + 1)
    	{
       	numbers[i] = keyedInput.nextInt();
    	}
   	//calculate total 
    	for (int i = 0; i <= 19; i = i + 1)
    	{
         	total = total + numbers[i];
    	}
   	//output total
    	System.out.println("The sum of those numbers is:");
    	System.out.println(total);
    }
    
}
