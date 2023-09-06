package Lab_20;

import java.util.Scanner;

class startMenu {
	Scanner sc = new Scanner(System.in);
	int ordered, quantity,starterPrice, price=0;
	String itemName;
	
	public double getTotalPrice() {
        return starterPrice;
    }
	
	public String getItemName() {
		return itemName;
	}

		 void starterItems() {
			 
			System.out.println(" Starter Menu");
			System.out.println("1. soup 		\t \t Rs: 50");
			System.out.println("2. Risotto Balls with Sauce  \t \t Rs: 110");
			System.out.println("3. Mexican Bread Rolls 	\t \t Rs: 130");
			System.out.println("4. Indian Masala Vada 	\t \t Rs: 80");
			System.out.println("5. Sausage Rolls  	\t \t Rs: 150");
			 
			 System.out.println("Enter item from Starter menu :");
			 ordered = sc.nextInt();
			 System.out.println("Enter Quantity :");
			 quantity = sc.nextInt();
			 
			 switch(ordered)
			 {
			 case 1:
				  price=50;
				  itemName = "soup";
				  break;
			 case 2: 
				 price=60;
				 itemName = "Risotto Balls with Sauce";
				 break;
			 case 3:
				 price=30;
				 itemName = "Mexican Bread Rolls";
				 break;
			 case 4:
					price = 80;
					itemName = "Indian Masala Vada";
					break;
			 case 5:
					price = 150;
					itemName = "Sausage Rolls ";
					break;
			 }
			 starterPrice = quantity*price;	
			 	
	}
}
