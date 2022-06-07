import java.util.ArrayList;
import java.util.*;

public class CafeUtil {

    public int getStreakGoal(int number) {
        // Used Programiz.com for help 
        int num = number, sum = 0;
        for(int i = 1; i <= num; ++i) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        // Used delftStack.com for help
        double arr[] = prices;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for(int i=0; i< menuItems.size(); i++){
            System.out.println(i + " : " + menuItems.get(i));
        }
    } 

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s\n", userName);
        customers.add(userName);
        // Stack Overflow for help
        int sum = 0;
        for (int i = 0; i < customers.size() - 1; i ++){
            sum ++;
        }
        System.out.printf("There are %s\n people in front of you", sum);
        System.out.println(customers);
    }






}