import java.util.Scanner;
public class EncryptionClass {

    public static void main (String[]args){

        System.out.println("Enter your digits");

        Scanner scanner = new Scanner(System.in);

        String plainText = scanner.next();

        int digit1 = Integer.parseInt(plainText.substring(0,1))+7;
        int digit2 = Integer.parseInt(plainText.substring(1,2))+7;
        int digit3 = Integer.parseInt(plainText.substring(2,3))+7;
        int digit4 = Integer.parseInt(plainText.substring(3,4))+7;


        System.out.println(digit1+""+digit2+""+digit3+""+ digit4);

        int newNum1 = (digit1 %10);
        int newNum2 = digit2 % 10;
        int newNum3 = digit3 % 10;
        int newNum4 = digit4 % 10;

        System.out.println(newNum1+""+newNum2+""+newNum3+""+ newNum4);
//        System.out.print("Encrypted Digits:");
        System.out.println("Encrypted Digits:" + newNum3+""+newNum4+""+newNum1+""+ newNum2);
    }
}
