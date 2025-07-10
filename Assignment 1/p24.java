class P1{
    public static void main(String... arg){
        double bl= 25, bw= 10, bh = 7.5;
        double cost = (double)(900/1000);
        double bvol = bl * bw * bh;

        double wl = 2000, wb = 200, wh = 7.5;
        double wvol = wl * wb * wh;

        double num = (wvol/bvol);

        System.out.println("Total number of bricks is : "+num);
        double totalCost = num *cost;

        System.out.println("Total cost of bricks is : "+totalCost);



    }
}