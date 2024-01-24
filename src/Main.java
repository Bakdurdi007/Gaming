import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Scanner;

/*******************************************************
 * Author: Davletov Bakdurdi
 * Date: 24-January. 2024-year.
 * Week day: Wednesday
 * Time: 3:48 p.m.
 *******************************************************///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {

        Scanner scanner = new Scanner(System.in);

        Place.showPlace();

        System.out.println("(1. Right)  (2. Left)  (3. Up)  (4. Down)  (0. Quit)");
        System.out.print(">>> ");

        int n = scanner.nextInt();

        switch (n){
            case 0:
                System.out.println(" Dastur yopildi! ");
                return;


            case 1:
                Right();
                Menu();
                break;

            case 2:
                Left();
                Menu();
                break;


            case 3:
                Up();
                Menu();
                break;


            case 4:
                Down();
                Menu();
                break;


            default:
                System.out.println(" Siz mavjud bo'lmagan buyrug'ni tanladingiz! ");
                Menu();
                break;
        }

    }

    public static void Right() {
        if (Place.col < 10) {
            Place.place[Place.row][Place.col] = Place.B;
            Place.place[Place.row][Place.col + 1] = Place.Q;
            Place.col++;
        } else {
            System.out.println(" Maydon chegarasi tugadi! ");
        }
    }

    public static void Left() {
        if (Place.col > 0) {
            Place.place[Place.row][Place.col] = Place.B;
            Place.place[Place.row][Place.col - 1] = Place.Q;
            Place.col--;
        } else {
            System.out.println(" Maydon chegarasi tugadi! ");
        }
    }

    public static void Up() {
        if (Place.row > 0) {
            Place.place[Place.row][Place.col] = Place.B;
            Place.place[Place.row - 1][Place.col] = Place.Q;
            Place.row--;
        } else {
            System.out.println(" Maydon chegarasi tugadi! ");
        }
    }

    public static void Down() {
        if (Place.row < 10) {
            Place.place[Place.row][Place.col] = Place.B;
            Place.place[Place.row + 1][Place.col] = Place.Q;
            Place.row++;
        } else {
            System.out.println(" Maydon chegarasi tugadi! ");
        }
    }
}