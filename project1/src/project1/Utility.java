package project1;

import java.util.Scanner;

public class Utility {
    private static Scanner scanner = new Scanner(System.in);

    
    /**
     Used for interface menu selection. 
     The method reads the keyboard and returns if the user types any character from '1'-'4'. 
     The return value is the character typed by the user.
     */
	public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4') {
				System.out.print("Selection Error, Please re-enter: ");
            } else break;
        }
        return c;
    }
	
	/**
	 Used for input of income and expense amounts. 
	 The method reads an integer of up to 5 digits in length from the keyboard and uses it as the return value of the method
	 */ 
    public static int readNumber() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(5);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
				System.out.print("Input Error, Please re-enter: ");
            }
        }
        return n;
    }
    
    
    /**
     Input for income and expense descriptions.
     This method reads a string of up to 36 bits in length from the keyboard and uses it as the return value of the method.
     */
    public static String readString() {
        String str = readKeyBoard(36);
        return str;
    }
	
	/**
	*The input used to confirm the selection.
	*The method reads 'Y' or 'N' from the keyboard and uses it as the return value of the method.
	*/
    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
				System.out.print("Selection Error, Please re-enter: ");
            }
        }
        return c;
    }
	
	
    private static String readKeyBoard(int limit) {
        String line = "";

        while (scanner.hasNext()) {
            line = scanner.nextLine();
            if (line.length() < 1 || line.length() > limit) {
                System.out.print("Input length (no greater than " + limit + ").Please re-enter: ");
                continue;
            }
            break;
        }

        return line;
    }
}



