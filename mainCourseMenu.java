package Lab_20;

import java.util.Scanner;

class mainCourseMenu {
	Scanner sc = new Scanner(System.in);
	int ordered, quantity,mainCoursePrice, price=0;
	String itemName;
	
	double getTotalPrice() {
		return mainCoursePrice;
	}
	
	public String getItemName() {
		return itemName;
	}
	
		 void mainCourseItems() 
		{ 
			System.out.println(" Main Course Menu");
			System.out.println("1. pizza   \t Rs: 200");
			System.out.println("2. Burger  \t Rs: 150");
			System.out.println("3. roll    \t Rs: 90");
			System.out.println("4. Biryani  \t Rs: 300");
			System.out.println("5. Curry    \t Rs: 270");
			
			System.out.println("Enter item from Main Course menu :");
			ordered = sc.nextInt();
			System.out.println("Enetr Quentity :");
			quantity = sc.nextInt();
			
			switch(ordered)
			{
			case 1:
				price = 200;
				itemName = "pizza";
				break;
			case 2:
				price = 150;
				itemName = "Burger";
				break;
			case 3:
				price = 90;
				itemName = "roll";
				break;
			case 4:
				price = 300;
				itemName = "Biryani";
				break;
			case 5:
				price = 270;
				itemName = "Curry";
				break;
			}
			mainCoursePrice = quantity*price;
		}
}
