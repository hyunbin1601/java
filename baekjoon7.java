import java.util.Scanner;

public class baekjoon7 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        for(int i=1; i<=n; i++) {
            for(int j=n-i; j>0; j--) {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
