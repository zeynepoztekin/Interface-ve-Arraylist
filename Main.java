import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] araba1 = keyboard.nextLine().split(", ");
        String[] araba2 = keyboard.nextLine().split(", ");
        String[] calisan1 = keyboard.nextLine().split(", ");
        String[] calisan2 = keyboard.nextLine().split(", ");
        
        System.out.println(new Araba(araba1[0].replaceAll("\"", ""), araba1[1].replaceAll("\"", ""), araba1[2]));
        System.out.println(new Araba(araba2[0].replaceAll("\"", ""), araba2[1].replaceAll("\"", ""), araba2[2]));
        System.out.println(new Calisan(calisan1[0].replaceAll("\"", ""), calisan1[1].replaceAll("\"", ""), calisan1[2]));
        System.out.println(new Calisan(calisan2[0].replaceAll("\"", ""), calisan2[1].replaceAll("\"", ""), calisan2[2]));
    }
}
