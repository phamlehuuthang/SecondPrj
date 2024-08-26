/*
 * @ (#) TestRectangle.java       1.0     26/08/2024
 *
 * Copuright (c) 2024 IUH, All rights reserved
 */
package iuh.fit.se;

import java.util.Scanner;

/*
 * @description:
 * @auther: Pham Le Huu Thang
 * @date:   26/08/2024
 * @version:    1.0
 */
public class TestRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input length và width
        System.out.print("Enter the length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();

        //Tao đói tượng Rectangle
        Rectangle rc = new Rectangle(length, width);

        //In diện tích và chu vi
        System.out.println("Area =  "+rc.getArea());
        System.out.println("Perimeter = " + rc.getPrimeter());

        //In toàn bộ thông tin của hình chữ nhật
        System.out.println(rc);
        // hoặc System.out.println(rc.toString());

        scanner.close();

    }
}
