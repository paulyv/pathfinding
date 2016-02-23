package pathfinder;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;



public class Window extends JFrame {
	
	private JPanel contentPane;
	
	public Window() {
		
		setTitle("Pathfinder");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 673);
		
		contentPane = new panel();
		contentPane.setBorder(new EmptyBorder(100, 100, 791, 470));
		setContentPane(contentPane);
		contentPane.setLayout(null);

	}
	
private class panel extends JPanel implements ActionListener {
       
		Timer t = new Timer(150, this);
		int iter = 0;

		@Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            t.start();
            
            // Draw the grid
            for(int i = 0; i < Main.map.length; i++) {
            	for(int j = 0; j < Main.map[i].length; j++) {
            		
            			if(Main.map[j][i] == 1) {
            			g.setColor(Color.darkGray);
            			g.drawRect(30 * i, 30 * j, 30, 30);
            			} else {
            			g.fillRect(30 * i, 30 * j, 30, 30);
            			}
            	}
            }
            
            // Draw full path
            for(Node n : FindPath.closedList) {
            	int i = n.getRow();
            	int j = n.getCol();
            	g.setColor(Color.GREEN);
            	g.fillRect(30 * j, 30 * i, 30, 30);
            	g.setColor(Color.darkGray);
            	g.drawRect(30 * j, 30 * i, 30, 30);
            } 
            
            g.setColor(Color.YELLOW);
            g.fillRect(Main.start.getRow(), Main.start.getCol(), 30, 30);
            
           // Animate the route
           int row = FindPath.closedList.get(iter).getRow();
           int col = FindPath.closedList.get(iter).getCol();
	       g.setColor(Color.RED);
	       g.fillRect(30 * col, 30 * row, 30, 30);
	       g.setColor(Color.darkGray);
	       g.drawRect(30 * col, 30 * row, 30, 30);
	     
	       	if(iter >= FindPath.closedList.size() - 1) {
	       		t.stop();
	       	}  
        }

		@Override
		public void actionPerformed(ActionEvent e) {
			  if(iter <= FindPath.closedList.size())
			  iter++;

			  repaint();
		}
	}

}
