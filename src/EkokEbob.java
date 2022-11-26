import java.util.Scanner;

public class EkokEbob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter First Number : ");
        int firstnumber = input.nextInt();
        System.out.print("Please Enter Second Number : ");
        int secondnumber = input.nextInt();
        int obeb = 1;
        int okek = 1;

        if (firstnumber >= secondnumber) {
            System.out.print("First Number Cannot Be Big");
        } else {
            for (int i = 1; i <= firstnumber; i++) {
                if (firstnumber % i == 0 && secondnumber % i == 0) {
                    obeb = i;
                }
            }
            System.out.println("Obeb : " + obeb);

            for (int k = 1; k <= (firstnumber * secondnumber); k++) {
                if (k % firstnumber == 0 & k % secondnumber == 0) {
                    okek = k;
                    break;
                }
            }
            System.out.println("Okek : " + okek);
        }

        System.out.println("Okek : " + (firstnumber*secondnumber)/obeb);

    }
}
