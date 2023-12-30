// Java program that give sum of array 
// Array input from the user. 
import java.util.Scanner; 
  
public class array2{ 
    public static void main(String[] args) 
    { 
      int sum=0;

      Scanner sc = new Scanner(System.in); 
  
       // Take the array size from the user 
       System.out.println("Enter the size of the array: "); 
       int arr_size = 0; 
       if (sc.hasNextInt()) { 
           arr_size = sc.nextInt(); 
       } 
  
      // Initialize the array's 
      // Size using user input 
      int[] arr = new int[arr_size]; 

      System.out.println("Enter the elements of the array: "); 
      //taking array from user
      for (int i = 0; i < arr_size; i++) { 
          if (sc.hasNextInt()) { 
              arr[i] = sc.nextInt(); 
           } 
      } 
      System.out.print("Sum of the array elements: "); 
      //logic 
      for (int i = 0; i < arr_size; i++) { 
          sum+= arr[i];
      } 
      // prints the sum of array elements 
      System.out.println(sum);
    } 
}
  
