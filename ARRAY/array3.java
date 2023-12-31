// Java program that sort the  array 
// Array input from the user.
import java.util.Scanner;  
  
public class array3  
{  
   public static void main(String args[])  
   {  
       int size, i, j, temp;  
      // Initialize the array's 
       int arr[] = new int[50];  

       Scanner scan = new Scanner(System.in);  
         
       // Take the array size from the user 
       System.out.print("Enter Array Size : ");  
       size = scan.nextInt();  
         
       //taking array from user
       System.out.print("Enter Array Elements : ");  
       for(i=0; i<size; i++)  
       {  
           arr[i] = scan.nextInt();  
       }  
         
       System.out.print("Sorting Array using Selection Sort Technique..\n");  
       //logic
       for(i=0; i<size; i++)  
       {  
           for(j=i+1; j<size; j++)  
           {  
               if(arr[i] > arr[j])  
               {  
                   temp = arr[i];  
                   arr[i] = arr[j];  
                   arr[j] = temp;  
               }  
           }  
       }  
         
       System.out.print("Now the Array after Sorting is :\n");  
       for(i=0; i<size; i++)  
       {  
            // prints the sorted array elements 
           System.out.print(arr[i]+ "  ");  
       }  
   }  
}  