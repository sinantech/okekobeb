import java.util.Scanner;

public class EkokEbobWhileLoops {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = inp.nextInt();
        System.out.print("Enter Second Number Please : ");
        int b = inp.nextInt();
        int obeb = 1;
        int okek = 1;
        int i = 1;
        int k = 1;
        if (a >= b) {
            System.out.println("Second Number Should Be Big");
        } else {

            while (i <= a) {
                if (a % i == 0 && b % i == 0) {
                    obeb = i;
                }
                i++;
            }
            System.out.println("Obeb : " + obeb);

            while (k <= a * b) {
                if (k % a == 0 && k % b == 0) {
                    okek = k;
                    break;
                }
                k++;
            }
            System.out.println("Okek : " + okek);
        }
    }
}
