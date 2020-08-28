package prime;
import java.util.Scanner;
public class Prime {
    public static void sopln(String str){
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        sopln("Please insert any number: ");
        int num = a.nextInt();
        boolean isprime = true;
        for(int i = 2; i<num; i++){
            if(num%i==0){
                isprime = false;
                break;
            }
        }
        if(isprime){
            sopln(num + " is prime number");
        }else{
            sopln(num + " is not a prime number");
        }
    }
}
