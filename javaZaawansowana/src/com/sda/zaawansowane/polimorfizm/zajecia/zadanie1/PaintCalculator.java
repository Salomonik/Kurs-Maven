package com.sda.zaawansowane.polimorfizm.zajecia.zadanie1;

public class PaintCalculator {

    public static void main(String[] args) {

        Figure[] area = new Figure[]{
                new Circle(4.5),
                new Rectangle(5.3, 8.2),
                new Square(2.4),
                new Triangle(2, 4.4),
                new Trapezoid(3.1, 1.6, 2.34)};

        double bucketEfficiency = 10;

        printFigures(area);

        System.out.println(bucketEfficiency + "-L paint buckets needed to cover area: " + paintNeeded(area, bucketEfficiency));
    }

    public static double paintNeeded(Figure[] areaOfFigures, double bucketEfficiency) {
        double sum = 0;

        for (Figure f :
                areaOfFigures) {
            sum += f.getArea();
        }

        return Math.ceil(sum / bucketEfficiency);
    }

    public static void printFigures(Figure[] figures) {
        for (Figure f :
                figures) {
            System.out.println(f.getClass().getSimpleName() + " - " + f.getArea() + " m2");
        }
        System.out.println();
    }

}
