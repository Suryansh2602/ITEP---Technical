// Create class Tile to store the edge length of a square tile , and create another class Floor to store length and width of a rectangular floor. Add method totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole number of tiles needed to cover the floor completely.

import java.util.Scanner;
import java.lang.Math;

class Tile {
    double edgeLength;

    public Tile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the edge length of the tile: ");
        this.edgeLength = sc.nextDouble();
    }

    public double area() {
        return edgeLength * edgeLength;
    }
}

class Floor {
    double length;
    double width;

    public Floor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the floor:  ");
        this.length = sc.nextDouble();
        System.out.print("Enter the Width of the floor: ");
        this.width = sc.nextDouble();
    }

    public double area() {
        return length * width;
    }

    public int totalTiles(Tile t) {
        double floorArea = this.area();
        double tileArea = t.area();
        return (int) (floorArea / tileArea);
    }
}

class Main {
    public static void main(String[] args) {
        Floor f = new Floor();
        Tile t = new Tile();
        double fArea = f.area();
        double tArea = t.area();
        int tiles = (int) (fArea / tArea);

        System.out.println("Total number of tiles are: " + (tiles + 1));

    }
}