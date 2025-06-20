package basics;

import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the fruit: ");
        String fruit = input.next();

        switch (fruit) {
            case "Apple" -> System.out.println("A red fruit");
            case "Orange" -> System.out.println("A orange fruit");
            case "Grape" -> System.out.println("A small fruit");
            case "Mango" -> System.out.println("King of fruits");
            default -> System.out.println("Enter a valid fruit bro");
        }
    }
}

//        switch (fruit){
//          case "Apple":
//              System.out.println("A red fruit");
//              break;
//          case "Orange":
//              System.out.println("A orange fruit");
//              break;
//          case "Grape":
//               System.out.println("A small fruit");
//               break;
//          case "Mango":
//                System.out.println("King of fruits");
//                break;
//          default:
//                System.out.println("Enter a valid fruit bruh");
//          }
