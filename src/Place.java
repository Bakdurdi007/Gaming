/*******************************************************
 * Author: Davletov Bakdurdi
 * Date: 24-January. 2024-year.
 * Week day: Wednesday
 * Time: 3:48 p.m.
 *******************************************************/
public class Place {
    static String U = "\uD83C\uDFE1";
    static String E = " ";
    static String B = "\uD83C\uDF32";
    static String Q = "\uD83E\uDD89";

    public static int row = 5;
    public static int col = 5;
    public static String[][] place = new String[][]{

            {B, B, B, B, B, B, B, B, B, B, B},
            {B, B, B, B, B, B, B, B, B, B, B},
            {B, B, B, B, B, B, B, E, U, B, B},
            {B, B, B, B, B, B, B, E, B, B, B},
            {B, B, B, B, B, B, B, E, B, B, B},
            {B, B, B, B, B, Q, E, E, B, B, B},
            {B, B, B, B, B, B, B, B, B, B, B},
            {B, B, B, B, B, B, B, B, B, B, B},
            {B, B, B, B, B, B, B, B, B, B, B},
            {B, B, B, B, B, B, B, B, B, B, B},
            {B, B, B, B, B, B, B, B, B, B, B},
    };

    public static void showPlace(){
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print("\t" + place[i][j]);
            }
            System.out.println();
        }
    }
}
