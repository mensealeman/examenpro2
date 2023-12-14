import java.util.Scanner;
public class Ejer2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String valuesDni = "TRWAGMYFPDXBNJZSQVHLCKE";
        String num8D = "12345678", num;
        char [] valuesDni2 = valuesDni.toCharArray();
        int aux, auxX2 = 0, auxY=0, auxZ=0;

        do {

            System.out.println("Introduzca documento identificación:");
            System.out.print("-> ");
            num = sc.nextLine();

            if (num.charAt(0)!='x' && num.charAt(0)!='X' && num.charAt(0)!='y' && num.charAt(0)!='Y' && num.charAt(0)!='z' && num.charAt(0)!='Z') {

                int num2 = Integer.parseInt(num);
                aux = num2;

                aux = aux /23;
                aux = Math.round(aux);
                aux = aux * 23;
                aux = num2 - aux;
                System.out.println("Para este número de dni la posición de la letra es "+aux);
                System.out.println("El dni representado es: "+num+"-"+valuesDni2[aux]);

            }   else {

                if (num.charAt(0)=='x' || num.charAt(0)=='X') {

                        String aux2 = num.substring(1);
                        int numX = Integer.parseInt(aux2);
                        auxX2 = numX;
                        auxX2 = auxX2 /23;
                        auxX2 = Math.round(auxX2);
                        auxX2 = auxX2 * 23;
                        auxX2 = numX - auxX2;
                        System.out.println("Para este número de nie la posición de la letra es "+auxX2);
                        System.out.println("El nie representado es: "+num+"-"+valuesDni2[auxX2]);
                    }
                           else if (num.charAt(0)=='y' || num.charAt(0)=='Y') {

                                String aux3 = num.substring(1);
                                String aux4 = "1";
                                String aux5 = aux4+aux3;
                                int numY = Integer.parseInt(aux5);
                                auxY = numY;
                                auxY = auxY /23;
                                auxY = Math.round(auxY);
                                auxY = auxY * 23;
                                auxY = numY - auxY;
                                System.out.println("Para este número de nie la posición de la letra es "+auxY);
                                System.out.println("El nie representado es: "+num+"-"+valuesDni2[auxY]);
                            }
                                else if (num.charAt(0)=='z' || num.charAt(0)=='Z') {

                                    String aux3 = num.substring(1);
                                    String aux4 = "2";
                                    String aux5 = aux4+aux3;
                                    int numZ = Integer.parseInt(aux5);
                                    auxZ = numZ;
                                    auxZ = auxZ /23;
                                    auxZ = Math.round(auxZ);
                                    auxZ = auxZ * 23;
                                    auxZ = numZ - auxZ;
                                    System.out.println("Para este número de nie la posición de la letra es "+auxZ);
                                    System.out.println("El nie representado es: "+num+"-"+valuesDni2[auxZ]);
                                }
                }

        } while (num.length()!=num8D.length());

    }
}