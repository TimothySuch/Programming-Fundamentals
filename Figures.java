import java.util.Scanner;

/*
 * Timothy Suchomel
 * CPSC-21000-LT1 Programming Fundamentals
 * Fall 2018
 * Project 2
 */



public class Figures {
	
	static int size = 0;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int menuPick = 0;
		
		
		
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Timothy Suchomel");
		System.out.println("PROGRAMMING ASSIGNMENT 2");
		
		
		System.out.print("\n\nEnter the size of the figure (odd number): ");
		size = scan.nextInt();

		while((size % 2) == 0) {
			System.out.println("Invalid figure size - must be an odd number");
			System.out.print("\nReneter the size of the figure: ");
			size = scan.nextInt();
		}		
		
		
		// Process the menu option 
		while (menuPick != 4) {
			
			System.out.println("\nMENU:");
			System.out.println("1. Print box");
			System.out.println("2. Print diamond");
			System.out.println("3. Print X");
			System.out.println("4. Quit program");
			System.out.print("\nPlease select an option: ");
			menuPick = scan.nextInt();
			
			
			switch(menuPick) {
			case 1:
				printBox(size);
				menuPick = 0;
				break;
			case 2:
				printDiamond(size);
				menuPick = 0;
				break;
			case 3:
				printX(size);
				menuPick = 0;
				break;
			case 4:
				System.out.println("\nGood bye!");
			default:
				System.out.println("Invalid option");
			}
		}
		
		
		System.out.println("\nGood bye!");
		
		scan.close();
	} // End of main

	
	
	
	//---------------------------------------------------------------------
	// Prints a box
	//---------------------------------------------------------------------
	public static void printBox(int size) {
		
		System.out.println();
		
		for (int row = 1; row <= size; row++) {
			for(int col = 1; col <= size; col++) {
				System.out.print("X");
			}
			System.out.println();
		}
	} // End of method printBox
	
	
	//---------------------------------------------------------------------
	// Prints a diamond shape
	//---------------------------------------------------------------------
	public static void printDiamond(int size) {
		
		System.out.println();
		
		
	    int limit = ((size/2) + 1);
        int space = limit - 1;
        
        
        for (int row = 0; row < limit; row++) {
            for (int col = 0; col <= size; col++) {
            	if (col == limit || col == space) {
            		System.out.print("X");
            		}
            	else {
            		System.out.print(" ");}
            }
            for (int col = 0; col <= (2 * row) - 1; col++) {
            	if (row + col == limit || row + col == space)
            		System.out.print(" ");
            }
            System.out.println("");
            space--;
        }
        
        
        space = 0;
        for (int row = limit; row < size; row++) {
        	
        	
            for (int col = -1; col < space; col++) {
            	if (row + col != limit || row + col != space)
            		System.out.print(" ");
            }
            for (int col = -1; col < (2 * row) -1; col++) {
            	if (row + col == limit || row + col == space)
            		System.out.print("X");
            	else if (row + col == limit*2 || row + col == space*2)
            		System.out.print("X");
            }
            System.out.println("");
            space++;
        }
		
        
	} // End of method printDiamond
	
	
	//---------------------------------------------------------------------
	// Prints an X
	//---------------------------------------------------------------------
	public static void printX(int size) {
		
		System.out.println();
		
	    for (int row = 0; row < size; row++) {
	        for (int col = 0; col < size; col++) {
	            if (row == col || row + col == size - 1) {
	                System.out.print("X");
	            } else 
	                System.out.print(" ");
	        }
	        System.out.println();
	    }
	    
	} // End of method printX
	

} // End of class Figures