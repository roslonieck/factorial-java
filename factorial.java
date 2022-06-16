import java.util.Scanner;

public class factorial {
public static void main(String[] args) {
    System.out.println("A programme for calculating the factorial. Enter a number: ");
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    System.out.println("The factorial of the number entered is: " + calculator(n));

}
public static int calculator(int n){
    if (n == 0 || n == 1) {
        return 1;
    }
    else 
    return calculator(n-1) * n;
}

}  
