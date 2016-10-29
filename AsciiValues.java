/*program to print the characters corresponding to ASCII codes from 65 to 90*/
//Start of Program
/*Declaring the class*/
public class AsciiValues {
	/*  Defining the main method. First line of the execution of the code */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=65; i<=90; i++)//Declaring the for loop to traverse from the value 65 untill 90 
		{
			System.out.println(i + "--> "+ (char)i + "\n");//Printing the output like numeric value --> and its ascii vale
		}
	}
}
//End of program