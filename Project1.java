import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {
	// Build hotel billing System
        System.out.println("------------HOTEL BILLING SYSTEM-------------");
        Scanner sc=new Scanner(System.in);

        int totalQuantity=0;
        int totalPrice=0;
        System.out.println("Do you want to make Bill : ");
        char ch=sc.next().charAt(0);

        while (ch!='N'|| ch!='n'){
            System.out.println("Enter Dish Name : ");
            String dishName=sc.next();
           System.out.println("Enter Dish Price : ");
            int dishPrice= sc.nextInt();
            System.out.println("Enter Dish Quantity : ");
            int dishQuantity= sc.nextInt();
           totalQuantity+=dishQuantity;
           totalPrice+=dishPrice*dishQuantity;
            System.out.println("Do you want to add other dish : ");
             ch=sc.next().charAt(0);
        }
        System.out.println("Total Quantity = "+totalQuantity  +  "'\t'Total Price = "+totalPrice);
    }
}
