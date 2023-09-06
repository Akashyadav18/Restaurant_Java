package Lab_20;

import java.util.Scanner;

class Online_food_System {

	public static void main(String[] args) {
		
		System.out.println("********** Hotel **********");
		
		Online_food_System obj = new Online_food_System();
		obj.foodOrdering();
	}
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		char ans;
		String totalItems;
		double totalprice,starterPrice, mainCoursePrice, desertPrice;
		
			 void foodOrdering()
			{
				startMenu obj2 = new startMenu();
				mainCourseMenu obj3 = new mainCourseMenu();
				DesertMenu obj4 = new DesertMenu();
				
				do
				{
						System.out.println("##### Menu ######");
						System.out.println("1. Starter");
						System.out.println("2. MainCourse");
						System.out.println("3. Desert");
						System.out.println("Enter your choice :");
						choice = sc.nextInt();
				
				switch(choice)
				{
				case 1:
					obj2.starterItems();
					starterPrice = obj2.getTotalPrice();
					obj2.getItemName();
					break;
				case 2:
					obj3.mainCourseItems();
					mainCoursePrice = obj3.getTotalPrice();
					obj3.getItemName();
					break;
				case 3:
					obj4.desertItems();
					desertPrice = obj4.getTotalPrice();
					obj4.getItemName();
					break;
				default :
					System.out.println("Invalid item");
					break;
				}
				System.out.println("Do you want more items Y/N");
				ans = sc.next().charAt(0);
			}
			while(ans == 'y' || ans == 'Y');
				totalItems = obj2.getItemName()+", "+ obj3.getItemName() +", "+ obj4.getItemName();
				totalprice = starterPrice + mainCoursePrice + desertPrice;
				
				System.out.println("You have selected: " + totalItems);
				System.out.println("Here is Your bill: Rs:"+totalprice );
				System.out.println("Thanks for Ordring.");
		}
		
		
	}


