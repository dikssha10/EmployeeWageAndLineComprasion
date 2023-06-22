package employeeWageAndLineComprasion;
import java.util.Scanner;
import java.lang.Integer;
public class LineComparsion {
    public static final double LENGTH_X1=0;
    public static final double LENGTH_Y1=0;

    static void length(int x2,int y2){
        double length1=Math.pow(x2-LENGTH_X1,2);
        double length2=Math.pow(y2-LENGTH_Y1,2);
        double length3=length1+length2;
        double lengthOfALine=Math.sqrt(length3);
        System.out.println("Length of a line= " + lengthOfALine);
    }
    static void Equality(double a1, double b1,double c1,double a2, double b2,double c2 ){

        double A =a1/a2;
        double B= b1/b2;
        double C= c1/c2;
        if (A==B && A==C && B==C) {
            System.out.println("True two lines are equal");
        }else {
            System.out.println("False two lines are not equal'");
        }
        double x=1;
        double y=2;
        double  x1=a1*x +b1*y+c1;
        double y1=a2*x + b2*y +c2;
        System.out.println("In Compare Method\n" +
                "1) 0=(x1==y1)\n" +
                "2) -1=(x1<y1)\n" +
                "3) 1=(x1>y1)");
        System.out.println("Comparing x1 and y1 we get " +Double.compare(x1,y1)+ " which means line x1 is less than line y1");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Line Comparison Computation Porgram");
        length(3,4);
        Equality(-2,4,3,-6,12,9);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Line Comparison Computation Porgram");
        length(3,4);
    }
}
