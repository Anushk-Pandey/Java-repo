import java.util.Scanner; 
public class array3{ 
    public static void main(String[] args) 
    { 
      int temp=0;

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
      for(int i = 0; i < arr_size; i++){
        for(int j = i+1; i < arr_size; j++){
          if(arr[j] < arr[i]){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
          }
        }
      }
      System.out.println("Elements after sorting :");
      for (int i = 0; i < arr_size; i++){
          System.out.println(arr[i]);
      }
    }
  }