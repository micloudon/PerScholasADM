import java.util.Scanner;


public class Area {
  public static void main(String[] args) {
    double radius;
    double area;

    Scanner scanner = new Scanner(System.in);

    System.out.println("enter the circles radius");

    radius = scanner.nextDouble();

    area = radius * radius * 3.14;

    System.out.println(area);
  }
}
