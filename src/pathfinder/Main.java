package pathfinder;


public class Main {
	
	public static final int[][] map =   {{1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1},
										 {1,1,0,1,1,1,1,0,1,1,1,0,0,0,1,1,0,1,1,1,1},
										 {1,1,0,1,1,1,1,0,1,1,1,0,1,0,1,1,0,0,0,1,1},
										 {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1},
										 {0,1,1,0,1,1,1,1,0,0,1,1,1,1,0,1,1,0,0,1,1},
										 {1,1,1,0,0,0,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1},
										 {1,1,1,0,1,1,1,1,1,0,0,0,1,1,0,0,1,1,1,1,1},
										 {1,0,1,1,1,0,1,0,1,1,1,0,1,1,1,1,1,0,1,1,1},
										 {1,0,1,0,1,1,1,1,1,1,1,0,1,1,1,1,1,0,1,1,1},
										 {1,0,1,0,0,1,0,0,1,1,1,0,0,1,1,1,1,1,0,1,1},
										 {1,1,1,1,1,1,0,1,1,1,1,0,1,1,1,1,1,1,0,1,1},
										 {1,0,1,0,1,1,0,1,1,0,1,0,1,1,1,1,1,0,0,0,0},
										 {1,0,1,1,0,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1},
										 {1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1},
										 {1,0,0,0,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1},
										 {1,1,1,0,1,1,1,1,0,0,0,0,1,1,1,1,1,0,1,1,1},
										 {1,1,1,0,1,1,1,0,0,1,1,0,1,1,1,1,0,0,0,1,1},
										 {1,1,0,1,1,1,1,1,1,1,1,0,1,1,0,1,1,0,1,1,1},
										 {1,1,1,1,1,0,1,1,1,1,1,1,0,1,1,1,1,0,1,1,1},
										 {1,0,0,1,1,0,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1},
										 {1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,0,1,1,1}}; 

	public static Node start = new Node(0,0);
	public static Node end = new Node(20,20);
	
	
	public static void main(String[] args) {
		
		FindPath A = new FindPath(start, end, map);
		
		Window window = new Window();
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}

}
