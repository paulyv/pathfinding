package pathfinder;

public class Dist {
	
	public int calculateManhattanDistGoal(int row1, int row0, int col1, int col0) {
		
		int distToGoal = Math.abs(row1-row0) + Math.abs(col1-col0);
		return distToGoal;

	}
	
	public int calculateManhattanDistHome(int row1, int row0, int col1, int col0) {
		
		int distToStart = Math.abs(row1-row0) + Math.abs(col1-col0);
		return distToStart;

	}
	
	public double calculateEuclidean(int x1, int y1, int x2, int y2) {
	    return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	}

}
