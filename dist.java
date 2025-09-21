public class dist {
    public static double dist(double x1, double y1, double x2, double y2) {
        double diffX = x2-x1;
        double diffY = y2-y1;
        double answer = Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));
        return answer;
    }
}