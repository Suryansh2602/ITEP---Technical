import java.lang.Math;
class P1{
    public static void main(String... args){
        int perimeter = 36, s1 = 10, s2 = 9;
        int semiperimeter = 36/2;
        int s3 = (s1+s2)-36;
        double
         area = Math.sqrt(semiperimeter*(semiperimeter-s1)*(semiperimeter-s2)*(semiperimeter-s3));
        System.out.println("Area of Triangle is: "+area);
    }}