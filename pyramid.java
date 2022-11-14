import java.util.*;
  
class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the quantity of layers: ");
    int n = input.nextInt();

    for (int i=1; i<=n; i ++){ 
      int a = 2*i-1;
      for (int j=2*(n-i); j>0; j--){
        System.out.print(" ");
      }      
      for (int j=1; j<=i; j++){
        System.out.print((i-j+1) + " ");
      }
      for (int k=2; k<i+1; k++){
        System.out.print(k + " ");
      } 
      System.out.println();

    }
      
  }
}


/*
input: 7
            1 
          2 1 2 
        3 2 1 2 3 
      4 3 2 1 2 3 4 
    5 4 3 2 1 2 3 4 5 
  6 5 4 3 2 1 2 3 4 5 6 
7 6 5 4 3 2 1 2 3 4 5 6 7


*/
