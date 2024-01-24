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

        JFrame myJFrame = new JFrame();

        Place.showPlace();

        myJFrame.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_UP) {
                    Up();
                    Menu();
                } else if (keyCode == KeyEvent.VK_DOWN) {
                    Down();
                    Menu();
                } else if (keyCode == KeyEvent.VK_LEFT) {
                    Left();
                    Menu();
                } else if (keyCode == KeyEvent.VK_RIGHT) {
                    Right();
                    Menu();
                }
            }
        });

        myJFrame.setVisible(true);
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