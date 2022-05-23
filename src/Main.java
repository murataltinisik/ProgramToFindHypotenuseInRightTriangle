import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // VARIABLES
        int x, y, z, u;
        double area;

        // SCANNER
        Scanner sc = new Scanner(System.in);

        // USER'S VALUES
        System.out.print("1. Kenarı Giriniz...");
        x = sc.nextInt();

        System.out.print("2. Kenarı Giriniz...");
        y = sc.nextInt();

        System.out.print("3. Kenarı Giriniz...");
        z = sc.nextInt();

        // END
        u = (x + y + z) / 2;
        area = Math.sqrt(u * (u - x) * (u - y) * (u - z));
        System.out.println("Üçgenin Alanı: " + area);


    }
}
