package CFCJavaAssignment.assignment2;

import java.util.Scanner;

public class question1 {
    public static void DecToOcta(int n) {
        int rem;

        String str = "";
        char dig[]={'0','1','2','3','4','5','6','7'};
        while(n>0){
            rem = n%8;
            str=dig[rem]+str;
            n=n/8;
        }
        System.out.println("Decimal to octal: "+str);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        DecToOcta(num);
    }
}
