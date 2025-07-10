class P1{
    public static void main(String... arg){
        int s1 = 3, l = 15, b = 9, h = 12;
        int vol1= s1*s1*s1;
        int vol = l*b*h;
        int num = vol/vol1;

        System.out.println("number of cubical boxes :"+num);
        
    }
}