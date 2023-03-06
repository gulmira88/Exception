import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Parallelepiped parallelepiped = new Parallelepiped();
        Cylinder cylinder = new Cylinder();
        while (true) {
            System.out.println("""
                    Hello! choose your next function

                    find parallelepiped square - input square
                    find parallelepiped volume - input volume
                    find cylinder square - input square2
                    find cylinder volume - input volume2""");


            String search = scanner.nextLine();
            switch (search) {
                case "square":
                    try {
                        System.out.println("Input height");
                        parallelepiped.setHeight(scanner.nextInt());
                        System.out.println("Input length");
                        parallelepiped.setLength(scanner.nextInt());
                        System.out.println("Input width");
                        parallelepiped.setWidth(scanner.nextInt());
                        if (parallelepiped.getHeight() < 0 || parallelepiped.getLength() < 0 || parallelepiped.getWidth() < 0) {
                            throw new RuntimeException(" number can't be smallest 0");
                        }
                        System.out.println(parallelepiped.findSquare(parallelepiped.getHeight(), parallelepiped
                                .getLength(), parallelepiped.getWidth()));
                    } catch (ArithmeticException e) {
                        System.out.println("number can't be deleted to zero");
                    } catch (InputMismatchException e) {
                        System.out.println("number can't be word");
                    }

                    break;
                case "area":

                    try {
                        System.out.println("Input radius");
                        cylinder.setRadius(scanner.nextInt());
                        System.out.println("Input height");
                        cylinder.setHeight(scanner.nextInt());
                        if (cylinder.getHeight() < 0 || cylinder.getRadius() < 0) {
                            throw new RuntimeException("number can't be small zero");
                        }
                        System.out.println(cylinder.findArea(cylinder.getHeight(),
                                cylinder.getHeight()));
                    } catch (ArithmeticException e) {
                        System.out.println("Number can't be deleted to zero");
                    } catch (InputMismatchException e) {
                        System.out.println("Number can't be word");
                    }
                    break;
                case "Volume":
                    try {
                        System.out.println("Input radius");
                        cylinder.setHeight(scanner.nextInt());
                        System.out.println("Input height");
                        cylinder.setHeight(scanner.nextInt());
                        if (cylinder.getHeight() < 0 || cylinder.getRadius() < 0) {
                            throw new RuntimeException("number can't be small zero");
                        }
                        System.out.println(cylinder.findVolume(cylinder.getHeight(),
                                cylinder.getRadius()));
                    } catch (ArithmeticException e) {
                        System.out.println("Number can't be deleted to zero");
                    } catch (InputMismatchException e) {
                        System.out.println("Number can't be word");


                    }

            }

        }
    }
    }

