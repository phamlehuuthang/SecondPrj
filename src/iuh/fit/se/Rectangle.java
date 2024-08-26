/**
 * @ (#) Rectangle.java       1.0     26/08/2024
 *
 * Copuright (c) 2024 IUH, All rights reserved
 */
package iuh.fit.se;

/**
 * @description: This class represents a rectangle
 * @auther: Pham Le Huu Thang
 * @date:   26/08/2024
 * @version:    1.0
 */
public class Rectangle {
    private double length;
    private double width;
    /**
     * Constructs a rectangle with default length and width of 0.
     */
    // Constructor không tham số
    public Rectangle(){
        this.length = 0.0;
        this.width = 0.0;
    }

    /**
     * Constructs a rectangle with the specified length and width.
     *
     * @param length the length of the rectangle, must be greater than 0
     * @param width the width of the rectangle, must be greater than 0
     * @throws IllegalArgumentException if length or width is less than or equal to 0
     */
    // Constructor có tham số
    public Rectangle(double length, double width){
        if(length < 0.0 || width < 0.0){
            throw new IllegalArgumentException("Length and width must be greater than 0");
        }
        this.length = length;
        this.width = width;
    }

    /**
     * Returns the area of the rectangle.
     *
     * @return the area of the rectangle
     */
    // Phương thức tính diện tích
    public double getArea(){
        return length * width;
    }

    /**
     * Returns the perimeter of the rectangle.
     *
     * @return the perimeter of the rectangle
     */
    // Phương thức tính chu vi
    public double getPrimeter(){
        return (length + width) * 2;
    }

    /**
     * Sets the length of the rectangle.
     *
     * @param length the new length of the rectangle, must be greater than 0
     * @throws IllegalArgumentException if the length is less than or equal to 0
     */
    //Setter cho length
    public void setLength(double length){
        if(length < 0.0){
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        this.length = length;
    }

    /**
     * Returns the length of the rectangle.
     *
     * @return the length of the rectangle
     */
    //Getter cho length
    public double getLength(){
        return length;
    }

    /**
     * Sets the width of the rectangle.
     *
     * @param width the new width of the rectangle, must be greater than 0
     * @throws IllegalArgumentException if the width is less than or equal to 0
     */
    //Setter cho width
    public void setWidth(double width){
        if(width < 0.0){
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = width;
    }

    /**
     * Returns the width of the rectangle.
     *
     * @return the width of the rectangle
     */
    //Getter cho width
    public double getWidth(){
        return width;
    }

    /**
     * Returns a string representation of the rectangle.
     *
     * @return a string representation of the rectangle in the format
     *         "Rectangle[length=..., width=..., area=..., perimeter=...]"
     */
    //Phương thức toString (trả về thông tin chi tiết của hình chữ nhật(kiểu chuổi))
    @Override
    public String toString(){
        return "Rectangle[length = " + length + ", width = " + width + ",area = " + getArea() + ", perimeter = " + getPrimeter() + "]";
    }
}