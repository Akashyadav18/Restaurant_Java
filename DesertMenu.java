package Lab_20;

import java.util.Scanner;

class DesertMenu {
	Scanner sc = new Scanner(System.in);
	int ordered, quantity, desertPrice, price=0;
	String itemName;
	
	double getTotalPrice() {
		return desertPrice;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	 void desertItems()
	{
		System.out.println("Desert Menu");
		System.out.println("1. Til Barfi     \t Rs: 250 ");
		System.out.println("2. Mawa Bati     \t Rs: 370");
		System.out.println("3. Rasgulla      \t Rs: 130");
		System.out.println("4. Coconut Kheer  \t Rs: 110");
		System.out.println("5. Modak          \t Rs: 370");
		
		System.out.println("Enter item from Desert menu :");
		ordered = sc.nextInt();
		 System.out.println("Enter Quantity :");
		 quantity = sc.nextInt();
		 
		 switch(ordered)
		 {
		 case 1:
			 price = 250;
			 itemName = "Til Barfi";
			 break;
		 case 2:
			 price = 370;
			 itemName = "Mawa Bati";
			 break;
		 case 3:
			 price = 130;
			 itemName = "Rasgulla";
			 break;
		 case 4: 
			 price = 110;
			 itemName = "Coconut Kheer";
			 break;
		 case 5:
			 price = 370;
			 itemName = "Modak";
			 break;
		 }
		 
		 desertPrice = quantity*price;
	}

}
