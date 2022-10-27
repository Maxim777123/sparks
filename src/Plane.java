public class Plane {

    private int x, y, z;
    private int dir;
    private int fuel;
    private int n;
    int i, l, b ;
    private static final String name = "F-16";
    static int nplanes;


    public Plane(int x, int y, int z, int fuel) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.fuel = fuel;
        n = ++nplanes;
        this.b = 5;
    }


    public void flyStraight(int i) {
        if (dir == 0) {
            x = x + i;
            fuel = --fuel;
        } else if (dir == 1) {
            y = y - i;
            fuel = --fuel;
        } else if (dir == 2) {
            x = x - i;
            fuel = --fuel;
        } else if (dir == 3) {
            y = y + i;
            fuel = --fuel;
        } else y -= i;
        printPosition();

    }

    public void flyUp(int l, int i) {
        if (dir == 0) {
            x = x + i;
            z = z + l;
            fuel = --fuel;
        } else if (dir == 1) {
            y = y - i;
            z = z + l;
            fuel = --fuel;
        } else if (dir == 2) {
            x = x - i;
            z = z + l;
            fuel = --fuel;
        } else if (dir == 3) {
            y = y + i;
            z = z + l;
            fuel = --fuel;
        } else y -= i;
        printPosition();
    }

    public void flyDown(int l, int i) {
        if (dir == 0) {
            x = x + i;
            z = z - l;
            fuel = --fuel;
        } else if (dir == 1) {
            y = y - i;
            z = z - l;
            fuel = --fuel;
        } else if (dir == 2) {
            x = x - i;
            z = z - l;
            fuel = --fuel;
        } else if (dir == 3) {
            y = y + i;
            z = z - l;
            fuel = --fuel;
        } else y -= i;
        printPosition();
    }

    public void printPosition() {
        System.out.println("The Plane  " + name + "   " + n + " is at " + x + ", " + y + ",  " + z + " now."+
                "    Топлива осталось"+fuel);
    }

    public void dropBombs() {
        if ((b > 0)&&(b <= 5)) {
            this.b=--b;
            System.out.println("The plane dropped bombs at" + x + ", " + y + ",  " + z + " now" + b + "bombs left");
            }
        else {System.out.println("No bombs");}
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void fillFuel() {
        if (z <= 0) {
            fuel = 100;
            System.out.println("Самолет дозаправилися");}
       else  {System.out.println("Нельзя дозаправиться в воздухе");}

    }
}

