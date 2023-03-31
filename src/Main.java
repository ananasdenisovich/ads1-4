import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(Rec(n));
    }
    public static int Rec(int n){
        int x = 1;
        if (n >= 1){
            x = n * Rec(n-1);
        } else{
            x = 1;
        }
        return x;
    }
}