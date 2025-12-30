class P1{
    public static void main(String... arg){
        int wallLength = 1500, wallBreadth = 1000, wallHeight = 800;
      int bricklength = 15, brickwidth = 8, brickheight = 5;

        double wallVolume = wallLength * wallBreadth * wallHeight;
        double brickVolume = bricklength * brickwidth * brickheight;

        int num = (int)(wallVolume / brickVolume);
        System.out.println("Number of bricks required to build the wall: " + num);
    }
}