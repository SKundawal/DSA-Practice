import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int W = in.nextInt();
        System.out.println(W <= 2 ? "NO" : (W % 2 == 0 ? "YES" : "NO"));
    }
}