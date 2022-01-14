public class Zadacha9 {
    public static void main(String[] args) {

        int c = 5;
        int x,y,xz,yz,x2z,y2z;
        x = 0;
        y = 0;
        xz = -1;
        yz = 1;
        x2z = 5;
        y2z = 5;
        boolean xy = ((x * x) + (y * y) <= c * c);
        boolean xyz = (x2z>=x & x >=xz & y>= yz & y<=y2z);
        System.out.println("In the box," + xyz);
        System.out.println("In the circle," + xy);




    }
}
