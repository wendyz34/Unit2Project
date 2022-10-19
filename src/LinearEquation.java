import java.lang.Math;
public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        if (x1 != x2) {
            String coord1 = "(x1,y1)";
            String coord2 = "(x2,y2)";
        }
    }
    public double distance(){
        double x = Math.pow(x2-x1,2.0);
        double y = Math.pow(y2-y1,2.0);
        double dis = Math.sqrt(x+y);
        return dis;



    }
    public double yIntercept(){
        double slope = (y2/y1)/(x2/x1);
        double yInter = y2/(slope*x2);
        return yInter;
    }
    public double slope(){
        double slope = (y2/y1)/(x2/x1);
        return slope;
    }
}
