package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
public class Main {

    public static void main(String[] args) {

        final File file  = new File("data.txt");


        NumberFormat fmt = NumberFormat.getNumberInstance();
        fmt.setMinimumFractionDigits(2);
        fmt.setMaximumFractionDigits(2);
        String name;

        bankAccount ba[] = new bankAccount[500];
        ba[0] = new bankAccount(128);
        ba[1] = new bankAccount(1200);
        ba[2] = new bankAccount(621);
        Comparator comp = new BA_comparator();
        Arrays.sort(ba,comp);


        //bankAccount Ba[] = new bankAccount[5];
        //for (int i = 0; i <Ba.length ; i++) {
            Scanner kbReader = new Scanner (System.in);
            System.out.println("Please enter the name of whom the bank account belongs");
            name = kbReader.nextLine();
            System.out.println("Please enter the amount of the deposit");
            double amount = kbReader.nextDouble();
            System.out.println(" ");
            Comparable comp = new bankAccount();
            //Ba[i] = new bankAccount(name,amount);
            //Arrays.sort(Ba,comp);
            //for (int j = 0; j <Ba.length ; j++) {
                //System.out.println(Ba[j].name+">>>"+Ba[j].balance);

            }


        }

    }
}
//ArrayList aryLst = new ArrayList();
//        ListIterator iter = aryLst.listIterator();
//        do {
//            Scanner kbReader = new Scanner(System.in);
//            System.out
//                    .print("Please enter the name to whom the account belongs. (\"Exit\" to abort) ");
//            name = kbReader.nextLine();
//            if (!name.equalsIgnoreCase("EXIT")) {
//                System.out.print("Please enter the amount of the deposit. ");
//                double amount = kbReader.nextDouble();
//                System.out.println(" ");
//                // between accounts
//                bankAccount theAccount = new bankAccount(name, amount);
//                iter.add(theAccount);
//            }
//        } while (!name.equalsIgnoreCase("EXIT"));
//
//        // Search aryLst and print out the name and amount of the largest bank
//        // account
//        bankAccount ba = (bankAccount) iter.previous();
//        double maxBalance = ba.balance; // set last account as the winner so far
//        String maxName = ba.name;
//        while (iter.hasPrevious()) {
//            ba = (bankAccount) iter.previous();
//            if (ba.balance > maxBalance) {
//                // We have a new winner, chicken dinner
//                maxBalance = ba.balance;
//                maxName = ba.name;
//            }
//        }
//        System.out.println(" ");
//        System.out.println("The account with the largest balance belongs to "
//                + maxName + ".");
//        System.out.println("The amount is $" + fmt.format(maxBalance) + ".");
