package outros;

import java.util.Scanner;


public class BitBit {
    public static void main(String[] args) {
        int n1= 89;
        int n2= 60;
        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);
        //89 = 0101 1001
        //60 = 0011 1100
        //& =  FFFV VFFF
        //| =  FVVV VVFV
        //^ =  FVVF FVFV
        Scanner sc = new Scanner(System.in);
        int mask = 0b100000;
        int n = sc.nextInt();
        if ((n & mask) != 0 ){
            System.out.println("6th bit is true");
        }
        else {
            System.out.println("6th bit is false");
        }

        sc.close();
    }
}
