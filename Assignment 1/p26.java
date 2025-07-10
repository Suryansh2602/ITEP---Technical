class P1{
    public static void main(String... arg){
        double l = 120.0, w = 2.4, bl = 0.24, bw = 0.15;
double p_area = l*w;
double b_area = bl*bw;

int num = (int)(p_area/b_area);
System.out.println("The number of brick is : "+num);


    }
}