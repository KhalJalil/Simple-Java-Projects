import java.util.Scanner;
public class DecryptionClass {

    public static void main (String[]args){

        System.out.println("Enter your digits");

        Scanner scanner = new Scanner(System.in);

        String plainText = scanner.next();

        int digit1 = Integer.parseInt(plainText.substring(0,1));
        int digit2 = Integer.parseInt(plainText.substring(1,2));
        int digit3 = Integer.parseInt(plainText.substring(2,3));
        int digit4 = Integer.parseInt(plainText.substring(3,4));


//        System.out.println(digit1+""+digit2+""+digit3+""+ digit4);
        System.out.println(plainText);
        int newNum1 = digit1 + 10;
        int newNum2 = digit2 + 10;
        int newNum3 = digit3 + 10;
        int newNum4 = digit4 + 10;

        if (newNum1>16 & newNum2>16 & newNum3>16 & newNum4>16) {
            newNum1 -= 10;
            newNum2 -= 10;
            newNum3 -= 10;
            newNum4 -= 10;
        }
        newNum1-=7;
        newNum2-=7;
        newNum3-=7;
        newNum4-=7;
        System.out.print("Decrypted Digits:");
        System.out.println(newNum3+""+newNum4+""+newNum1+""+ newNum2);
    }
}
