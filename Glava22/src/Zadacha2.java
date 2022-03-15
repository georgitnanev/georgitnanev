import java.util.Vector;

    class Spot {
        int x, y;
        Spot(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    class ConvexHull {

        public static int orientation(Spot check1, Spot check2, Spot check3) {
            int val = (check2.y - check1.y) * (check3.x - check2.x) - (check2.x - check1.x) * (check3.y - check2.y);
            if (val == 0)
                return 0;
            return (val > 0) ? 1 : 2;
        }

        public static void convexHull(Spot[] spots, int lengths) {
            if (lengths < 3) return;
            Vector<Spot> result = new Vector<> ();
            int startPoint = 0;
            for (int i = 1; i < lengths; i++)
                if (spots[i].x < spots[startPoint].x)
                    startPoint = i;
            int point = startPoint, nextPoint;
            do {
                result.add(spots[point]);
                nextPoint = (point + 1) % lengths;
                for (int i = 0; i < lengths; i++) {
                    if (orientation(spots[point], spots[i], spots[nextPoint]) == 1) {
                        nextPoint = i;
                    }
                }
                point = nextPoint;
            }
            while (point != startPoint);
            System.out.println("The spots in the convex hull are: ");
            for (Spot temp: result)
                System.out.println("(" + temp.x + ", " + temp.y + ")");
        }

        public static void main(String[] args) {
            Spot[] spots = new Spot[13];
            spots[0] = new Spot(60, 50);
            spots[1] = new Spot(100, 30);
            spots[2] = new Spot(40, 40);
            spots[3] = new Spot(20, 70);
            spots[4] = new Spot(50, 20);
            spots[5] = new Spot(30, 70);
            spots[6] = new Spot(10, 10);
            spots[7] = new Spot(110, 70);
            spots[8] = new Spot(90, 60);
            spots[9] = new Spot(80, 20);
            spots[10] = new Spot(70, 80);
            spots[11] = new Spot(20, 20);
            spots[12] = new Spot(30, 60);
            int lengths = spots.length;
            convexHull(spots, lengths);
        }
    }