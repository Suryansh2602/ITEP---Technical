class P1{
    public static void main(String... arg){
        int l = 7, b=4 , h=8, a = 7;
        double cuboid = l * b * h;
        System.out.println("Volume of the cuboid is: " + cuboid);
        double cube = a * a * a;
        System.out.println("Volume of the cube is: " + cube);
        System.out.println("volume of cuboid is greater than cube: " + (cuboid > cube));
        System.out.println("volume of cube is greater than cuboid: " + (cube > cuboid));
        System.out.println("volume of cuboid is equal to cube: " + (cuboid  == cube));
    }
}