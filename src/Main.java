import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------Temperature Converter-----------------------------");
        System.out.println("1.Convert Celsius to Fahrenheit");
        System.out.println("2.Convert Fahrenheit to Celsius");
        System.out.println("Enter your choice:");
        Scanner sc= new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice==1){
            celtofar();
        }
        else if (choice==2){
            fartocel();
        }
    }
    public static void celtofar(){
        System.out.println("------------------------Celsius to Fahrenheit------------------------");
        System.out.println("Enter the temperature in Celsius");
        Scanner sc = new Scanner(System.in);
        Double cels = sc.nextDouble();
        Double faren = cels*1.8+32;
        System.out.println("Temperature in Fahrenheit: "+faren);
    }

    public static void fartocel(){
        System.out.println("-----------------------Fahrenheit to Celsius-------------------------");
        System.out.println("Enter the temperature in Fahrenheit: ");
        Scanner sc = new Scanner(System.in);
        Double faren = sc.nextDouble();
        Double cels = faren-32/1.8;
        System.out.println("Temperature in Celsius: "+cels);
    }
}
