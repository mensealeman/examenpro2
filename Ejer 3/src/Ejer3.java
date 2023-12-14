import java.util.Scanner;
public class Ejer3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int sumN;
        String num6 = "123456", number, aux;

        do {

            System.out.println("Introduzca número:");
            System.out.print("-> ");
            number = sc.nextLine();

            aux = number;

            String num01 = String.valueOf(number.charAt(0));
            int num011 = Integer.parseInt(num01);
            String num02 = String.valueOf(number.charAt(1));
            int num012 = Integer.parseInt(num02);
            String num03 = String.valueOf(number.charAt(2));
            int num013 = Integer.parseInt(num03);
            String num04 = String.valueOf(number.charAt(3));
            int num014 = Integer.parseInt(num04);
            String num05 = String.valueOf(number.charAt(4));
            int num015 = Integer.parseInt(num05);
            String num06 = String.valueOf(number.charAt(5));
            int num016 = Integer.parseInt(num06);

            num011 = num011 * 7;
            num012 = num012 * 6;
            num013 = num013 * 5;
            num014 = num014 * 4;
            num015 = num015 * 3;
            num016 = num016 * 2;

            sumN = num011+num012+num013+num014+num015+num016;

            sumN = sumN % 9;

            if (sumN % 2 == 0) {
                System.out.println("El número "+aux+" tas las operaciones da como resultado "+sumN+".");
                System.out.println("Al ser número par el dígito de control es 0.");
                System.out.println("Representación: "+aux+"-0.");
            } else {
                System.out.println("El número "+aux+" tas las operaciones da como resultado "+sumN+".");
                System.out.println("Al ser número impar el dígito de control es 1.");
                System.out.println("Representación: "+aux+"-1.");
            }

        } while (number.length()!=num6.length());
    }
}