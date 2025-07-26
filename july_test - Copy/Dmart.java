import java.util.Scanner;
import java.lang.String;

public class Dmart {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your name: ");
        String name = sc.nextLine();
        System.out.println("Gender (m/f): ");
        char gender = sc.next().charAt(0);
        double totalPrice = 0;
        String gift = "gift";
          if (gender == 'M'||gender == 'm') {
                 gift = "Ladger Wallet";
            }else if(gender == 'F'||gender == 'f'){
                gift = "Cadeberry";
            }

        // Item1
      System.out.println("Enter name of item-1: ");
        String itemName1 = sc.next();
        System.out.println("Enter quantity for item-1: ");
        int qty1 = sc.nextInt();
        int price1 = 10;
        double total1 = qty1 * price1;
        double itemDiscount1 = 0.0;
        if (qty1 > 4) {
            itemDiscount1 = total1 * 0.05;
        }
        double afterDisc1 = total1 - itemDiscount1;

        // Item2
          System.out.println("Enter name of item-2: ");
        String itemName2 = sc.next();
        System.out.println("Enter quantity for item-2: ");
        int qty2 = sc.nextInt();
        int price2 = 20;
        double total2 = qty2 * price2;
        double itemDiscount2 = 0.0;
        if (qty1 > 4) {
            itemDiscount2 = total2 * 0.05;
        }
        double afterDisc2 = total2 - itemDiscount2;

        // Item3
         System.out.println("Enter name of item-3: ");
        String itemName3 = sc.next();
        System.out.println("Enter quantity for item-3: ");
        int qty3 = sc.nextInt();
        int price3 = 30;
        double total3 = qty3 * price3;
        double itemDiscount3 = 0.0;
        if (qty1 > 4) {
            itemDiscount3 = total3 * 0.05;
        }
        double afterDisc3 = total3 - itemDiscount3;

        // Item4
          System.out.println("Enter name of item-4: ");
        String itemName4 = sc.next();
        System.out.println("Enter quantity for item-4: ");
        int qty4 = sc.nextInt();
        int price4 = 40;
        double total4 = qty4 * price4;
        double itemDiscount4 = 0.0;
        if (qty1 > 4) {
            itemDiscount4 = total4 * 0.05;
        }
        double afterDisc4 = total4 - itemDiscount4;

        // Item5
         System.out.println("Enter name of item-5: ");
        String itemName5 = sc.next();
        System.out.println("Enter quantity for item-5: ");
        int qty5 = sc.nextInt();
        int price5 = 50;
        double total5 = qty5 * price5;
        double itemDiscount5 = total5 * 0.10; // 10% for 5th
        double afterDisc5 = total5 - itemDiscount5;
        if (qty1 > 4) {
            itemDiscount5 = total5 * 0.05;
        }
        afterDisc5 = total5 - itemDiscount5;

        // Item6
  System.out.println("Enter name of item-6: ");
        String itemName6 = sc.next();        System.out.println("Enter quantity for item-6: ");
        int qty6 = sc.nextInt();
        int price6 = 60;
        double total6 = qty6 * price6;
        double itemDiscount6 = 0.0;
        if (qty1 > 4) {
            itemDiscount6 = total6 * 0.05;
        }
        double afterDisc6 = total6 - itemDiscount6;

        // Item7
         System.out.println("Enter name of item-7: ");
        String itemName7 = sc.next();
        System.out.println("Enter quantity for item-7: ");
        int qty7 = sc.nextInt();
        int price7 = 70;
        double total7 = qty7 * price7;
        double itemDiscount7 = 0.0;
        if (qty1 > 4) {
            itemDiscount7 = total7 * 0.05;
        }
        double afterDisc7 = total7 - itemDiscount7;

        // Item8
          System.out.println("Enter name of item-8: ");
        String itemName8 = sc.next();
        System.out.println("Enter quantity for item-8: ");
        int qty8 = sc.nextInt();
        int price8 = 80;
        double total8 = qty8 * price8;
        double itemDiscount8 = 0.0;
        if (qty1 > 4) {
            itemDiscount8 = total8 * 0.05;
        }
        double afterDisc8 = total8 - itemDiscount8;

        // Item9
          System.out.println("Enter name of item-9: ");
        String itemName9 = sc.next();
        System.out.println("Enter quantity for item-9: ");
        int qty9 = sc.nextInt();
        int price9 = 90;
        double total9 = qty9 * price9;
        double itemDiscount9 = 0.0;
        if (qty1 > 4) {
            itemDiscount9 = total9 * 0.05;
        }
        double afterDisc9 = total9 - itemDiscount9;

        // Item10
        System.out.println("Enter name of item-10: ");
        String itemName10 = sc.next();
        System.out.println("Enter quantity for item-10: ");
        int qty10 = sc.nextInt();
        int price10 = 100;
        double total10 = qty10 * price10;
        double itemDiscount10 = total10 * 0.15; // 10% for 5th
        double afterDisc10 = total10 - itemDiscount10;
        if (qty1 > 4) {
            itemDiscount10 = total10 * 0.10;
        }
        afterDisc5 = total10 - itemDiscount10;

        // dicount calculation

        double totalBeforeDiscount = afterDisc1 + afterDisc2 + afterDisc3 + afterDisc4 + afterDisc5 + afterDisc6
                + afterDisc7 + afterDisc8 + afterDisc9 + afterDisc10;

        double billDiscount = 0.0;
        if (totalBeforeDiscount > 10000) {
            billDiscount = totalBeforeDiscount * 0.15;
        } else if (totalBeforeDiscount > 5000 || totalBeforeDiscount < 10000) {
            billDiscount = totalBeforeDiscount * 0.10;
        }
        double totalAfterDiscount = totalBeforeDiscount - billDiscount;
        double gst = totalAfterDiscount * 0.10;

        // Carry Bag
        System.out.print("Do you want a carry bag (y/n)? ");
        char carryBag = sc.next().charAt(0);
        double carryBagCharge = 0;
        String bagYesNo = "no";
        switch (carryBag) {
            case 'y' | 'Y':
                carryBagCharge = 10;
                break;
            default:
                carryBagCharge = 0.0;
                break;
        }

                double grandTotal = totalAfterDiscount + gst + carryBagCharge;

                // bill Print 
            System.out.println("\n\t\t D-Mart");

            // Name : Cheeku Sing			Data: 12/9/2022
            System.out.println("\n\t Name: "+ name+"\t\tDate: 21/07/2025");

            //   -----------------------------------------------------------
            System.out.println("\n-----------------------------------------------------------");
            
            //  Item Name	Quantity    Price	Total   After-Discount	
            System.out.println("\n\t Item Name \t Quantity \t Price \t total \t Ater-Discount");
            //  Item-1	   5	      10        50 Rs       47.5 Rs
            System.out.print("\t "+ itemName1+ "\t\t"+qty1+"\t\t"+price1+"\t"+total1+"rs\t\t"+afterDisc1+"\n");
            System.out.print("\t\t "+ itemName2+ "\t"+qty2+"\t\t"+price2+"\t"+total2+"rs\t\t"+afterDisc2+"\n");
            System.out.print("\t "+ itemName3+ "\t\t"+qty3+"\t\t"+price3+"\t"+total3+"rs\t\t"+afterDisc3+"\n");
            System.out.print("\t "+ itemName4+ "\t\t"+qty4+"\t\t"+price4+"\t"+total4+"rs\t\t"+afterDisc4+"\n");
            System.out.print("\t "+ itemName5+ "\t\t"+qty5+"\t\t"+price5+"\t"+total5+"rs\t\t"+afterDisc5+"\n");
            System.out.print("\t "+ itemName6+ "\t\t"+qty6+"\t\t"+price6+"\t"+total6+"rs\t\t"+afterDisc6+"\n");
            System.out.print("\t "+ itemName7+ "\t\t"+qty7+"\t\t"+price7+"\t"+total7+"rs\t\t"+afterDisc7+"\n");
            System.out.print("\t "+ itemName8+ "\t\t"+qty8+"\t\t"+price8+"\t"+total8+"rs\t\t"+afterDisc8+"\n");
            System.out.print("\t "+ itemName9+ "\t\t"+qty9+"\t\t"+price9+"\t"+total9+"rs\t\t"+afterDisc9+"\n");
            System.out.print("\t "+ itemName10+ "\t\t"+qty10+"\t\t"+price10+"\t"+total10+"rs\t\t"+afterDisc10+"\n");
            System.out.println("\n-----------------------------------------------------------");
            System.out.println("\t\t\t A.P \tD.P.");
            System.out.println("\t\t\t "+ totalBeforeDiscount+"\t "+totalAfterDiscount);
            System.out.println("Gift : "+gift +"\t\t0.00"+"\t0.00");
        System.out.println("GST (10%)\t\t" + gst + "\t" + gst);
        System.out.println("Carry Bag : " + bagYesNo + "\t" + carryBagCharge + "\t" + carryBagCharge);
        System.out.println("GST (10%)\t\t" + gst + "\t" + gst);
        System.out.println("-----------------------------------------------------------");
        System.out.println("\t\t\t" + (totalAfterDiscount+gst+carryBagCharge) + "\t" + grandTotal + " RS");
        System.out.println("\n\t\tThank You");
        System.out.println("\t\tTo Visit");
        System.out.println("\t\tD-Mart");
        System.out.println("-----------------------------------------------------------");

System.out.println("\t\t\t\t\t\n\n\t\t\t\t\t\t\t\t\t");
          




    }
}