// Java program that gives index of sum user want 
// Array input from the user.
import java.util.Scanner;

class array4{
  public static void main(String []args){

    Scanner sc = new Scanner(System.in);

    // Take the array size from the user
    System.out.println("Enter size of array");
    int l = sc.nextInt();

    System.out.println("Enter the sum you want :");
    int target = sc.nextInt();

    // Initialize the array's 
    // Size using user input 
    int[] a = new int[l];

    //taking array from user
    for(int i = 0; i<l; i++ ){
      a[i] = sc.nextInt();
    }
    
    for(int i = 0; i<l; i++ ){
      System.out.println("Original array : "+ a[i]);  
    }

    System.out.println("  ");
    
    //logic
    for(int i = 0; i<l-1; i++){
      for(int j = i+1; j<l; j++){
        if(a[i] + a[j] == target){
          // prints the index 
          System.out.println("Index of that sum is : [" + i + "," + j + "]");
        }
      }
    }
    System.out.println("Sum not found");
  }
}