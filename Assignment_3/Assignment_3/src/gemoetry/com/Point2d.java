package gemoetry.com;


	
	public class Point2d {
	    private double x;
	    private double y;

	
	    public Point2d(double x, double y) {
	        this.x = x;
	        this.y = y;
	    }

	
	    public String getDetails() {
	        return "Point(" + x + ", " + y + ")";
	    }

	
	    public boolean isEqual(Point2d other) {
	        return this.x == other.x && this.y == other.y;
	    }

	   
	    public double calculateDistance(Point2d other) {
	        double dx = this.x - other.x;
	        double dy = this.y - other.y;

	        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	    }
	}
