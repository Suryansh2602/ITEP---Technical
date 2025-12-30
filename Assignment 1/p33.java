class P1{
    public static void main(String... arg){
       int l = 30, w = 20 , l2 = 3, w2= 4;
       int area = l*w;
       int path = (l*l2)+(w*w)- (l*w2);
       int r = area - path;

       System.out.println("Usable Area : "+r);


    }
}