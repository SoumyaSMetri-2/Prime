package Prime;
import java.util.Scanner;
public class Prime {
    // this function will print the value such as weather the number is prime or not
    public static void sopln(String str){
        System.out.println(str);
    }
    public static void main(String[] args) {
        // For taking inputs Scanner calss is must
        Scanner a = new Scanner(System.in);
        
        // calling the function *sopln* to print message
        sopln("Please insert any number: ");
        
        // calling the function of Scanner class to take an integer input
        int num = a.nextInt();
        
        // initializing the default value
        boolean isprime = true;

        // iterating the loop from 2 to the input number
        for(int i = 2; i<num; i++){
        
            // checking if number is divisble from 2 to *n-1* or not
            if(num % i == 0) {
            
                //if yes, updating the default value 
                isprime = false;
                break;
            }
        }
        
        // printing the desired messages
        if(isprime) {
            sopln(num + " is a prime number");
        }else {
            sopln(num + " is not a prime number");
        }
    }
}
