package oop1.ex;

public class Rectangle {
    int width = 5;
    int height = 8;

    void calculateArea(){
        int area;
        area = width*height;
        System.out.println("넓이: " + area);
    }

    void calculatePerimeter(){
        int perimeter;
        perimeter = 2*(width+height);
        System.out.println("둘레 길이: " + perimeter);
    }

    void isSquare(){
        boolean isSquare;
        isSquare = width == height;
        System.out.println("정사각형 여부: " + isSquare);
    }
}
