import java.util.*;

public class c2 {
    public static void main(String[] args) {
        float temperature;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit");
        temperature = myObj.nextFloat();
        temperature = (temperature - 32) * 5 / 9;
        System.out.println("Temperature in Celsius = " + temperature);
        myObj.close();
    }
}
