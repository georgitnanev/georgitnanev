package MobilePhone;

public class Display {
    private double size;
    private int colours;

    public Display() {
        this.size = 0;
        this.colours = 0;
    }
    public Display(double size, int colours) {
        super();
        this.size = size;
        this.colours = colours;
    }

    public double getSize() {
        return size;
    }

    public int getColours() {
        return colours;
    }
}


