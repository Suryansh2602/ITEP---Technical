import java.lang.Math;
class P1{
    public static void main(String... args){
        double h = 4.0, sl = 5, rate = 10.0;
double r = Math.sqrt((sl*sl)-(h*h));
double area = (3.14*r*r)+(3.14*r*sl);
double cost = area * rate;
System.out.println("Cost will be :"+cost);
    }
}