import java.util.Scanner;

public class IntToRoman {

	// method integerToRoman() 
    public static String integerToRoman(int num) {
    	
    	// values where letter in roman changes
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        // letters according to the above numbers
        String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        // string builder to join the letters
        StringBuilder roman = new StringBuilder();

        // loop to iterate values of the given integer
        // and appending the letters when the number exceeds a particular value
        for(int i=0;i<values.length;i++) {
            while(num >= values[i]) {
                num -= values[i];
                roman.append(romanLiterals[i]);
            }
        }
        return roman.toString();
    }

    // main method
    public static void main(String[] args) {
    	
    	// scanner object to take input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Integer: ");
        
        // storing number in variable from user
        int number = input.nextInt();
        
        // if number exceeds 10,000
        if(number>10000) {
        	System.out.println("Enter number less than 10,000");
        }
        // else conversion will happen by calling integerToRoman()
        else {
    	System.out.println("Integer "+ number+" in Roman will be: "+integerToRoman(number));
 
        }
    }
}