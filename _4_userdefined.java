// 4.	Write a program to create a user defined exception say Pay Out of Bounds. 

import java.util.Scanner;

class Payoutbound extends Exception {
    Payoutbound(String msg) {
        System.out.println("out of range " + msg);
    }
}

public class _4_userdefined {
     //        ^ remove this _4_ before runninng
    public static void main(String[] args) throws Payoutbound {
        System.out.println("Enter salary ");
        Scanner sc = new Scanner(System.in);
        int pay = sc.nextInt();
        if (pay < 10000 || pay > 50000) {
            throw new Payoutbound("invalid range");
        } else {
            System.out.println("30% hike");
        }
    }
}
