import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz : ");
        int heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapmanızı öneririm.");
        } else if (heat >= 5 && heat <= 15) {
            System.out.println("Sinemaya gitmenizi öneririm.");
        } else if (heat > 15 && heat <=25) {
            System.out.println("Piknik yapmanızı öderirim.");
        } else {
            System.out.println("Yüzmeye gitmenizi öneririm.");
        }

        input.close();
    }
}