import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board extends JPanel {
	Timer time = new Timer(1, new Listener());
	int ctr = 0;
	double G = 0.1; 
	final int posx = 280;
	double[] pd = {280, 200};
	double[] vd = {0, 0};
	int points = 0;
	int life = 0;
	int sides = 13;
	double snorm = 400;
	double sd = 450;
	double sv = 0;
	boolean lock = false;
	boolean downr, downl;
	double paddle = 130;
	double rang = 0;
	double lang = 0;
	int pre[][] = {
			{0, 400, 135, 450,1}, 
			{135, 450, 270, 400,1},
			{270, 0, 300, 20, 1}, 
			{291, 0, 291, 500, 1},
			{-1, 0, 270, 0, 1},
			{0, -1, 0, 500, 1} 
	};
	int[][] ball = {
			{80, 80, 30, 50},
			{230, 280, 20, 200},
			{50, 200, 25, 100},
			{200, 100, 10, 500}
	};
	int path[][] = new int[100][5];
	public Board(){
		super();
		time.start();
		addKeyListener(new Key());
		setFocusable(true);
		for(int i = 0; i < pre.length; i++){
		    path[i] = pre[i];
		}
		int len = pre.length;
		int ct = 0;
		for(int k = 0; k < ball.length; k++){
			int px = ball[k][0], py = ball[k][1], rad = ball[k][2];
			for(double i = 0; i < 2 * Math.PI; i+= 2 * Math.PI/ sides){
				ct++;
				path[len + ct][0] = px + (int) (rad * Math.cos(i));
				path[len + ct][1] = py + (int) (rad * Math.sin(i));
				path[len + ct][2] = px + (int) (rad * Math.cos(i - 2 *Math.PI / sides));
				path[len + ct][3] = py + (int) (rad * Math.sin(i - 2 * Math.PI / sides));
			}
		}
	}
	private class Listener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			repaint();
		}
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		vd[1] += G;
		pd[1] += vd[1];
		pd[0] += vd[0];
		if(pd[1] > 1000){
			pd[0] = 280;
			pd[1] = 200;
			vd[0] = 0;
			vd[1] = 0;
			life++;
		}
		if(pd[0] == 280 && pd[1] > sd){
			pd[1] = sd;
			vd[1] = Math.min(vd[1], sv);
		}
		if(lock == false){
			sv *= 0.95;
			sv -= (sd - snorm)/30;
			sd += sv;
		}
		double rc = 0.1;
		if(downr){
			rang = Math.max(-0.5, rang - rc);
		}else{
			rang = Math.min(0.5, rang + rc);
		}
		if(downl){
			lang = Math.max(-0.5, lang - rc);
		}else{
			lang = Math.min(0.5, lang + rc);
		}
		path[0][2] = path[0][0] + (int) (Math.cos(lang) * paddle);
		path[0][3] = path[0][1] + (int) (Math.sin(lang) * paddle);
		path[1][0] = path[1][2] + (int) (-Math.cos(rang) * paddle);
		path[1][1] = path[1][3] + (int) (Math.sin(rang) * paddle);
		int rX = (int) pd[0];
		int rY = (int) pd[1];
		int r = 10;
		g.setColor(Color.blue);
		g.drawArc(rX - r, rY - r, 2 * r, 2 * r, 0, 360);
		g.setColor(Color.black);
		for(int i = 0; i < path.length; i++){
			int x1 = path[i][0],
				y1 = path[i][1],
				x2 = path[i][2];
			double y2 = path[i][3] + 0.0001;
			if(i > pre.length){
				g.setColor(Color.red);
			}
			g.drawLine(x1, y1, x2, (int) Math.round(y2));
			double bmag = Math.sqrt(vd[0] * vd[0] + vd[1] * vd[1]);
			double lineslope = ((double)(x2 - x1))/((double)(y2 - y1));
			double ballslope = vd[0] / vd[1];
			double binter = pd[0] - ballslope * pd[1];
			double linter = x1 - lineslope * y1;
			double y = (binter - linter)/(lineslope - ballslope);
			double sx = y * ballslope + binter;
			double la = Math.atan2(y2 - y1, x2 - x1);
			double ba = Math.atan2(vd[1], vd[0]);
			double da = 2 * la -  ba;
			if(sx >= Math.min(x2, x1) && sx <= Math.max(x1, x2) && 
			   Math.min(y1, y2) <= y && Math.max(y1, y2) >= y){
				double interdist = Math.sqrt(Math.pow(sx - pd[0],2) + Math.pow(y - pd[1],2));
				double tiny = 0.0001;
				double futuredist = Math.sqrt(Math.pow(sx - (pd[0] + Math.cos(ba) * tiny),2) + Math.pow(y - (pd[1] + Math.sin(ba) * tiny),2));
				
				if(interdist <=  bmag + r && futuredist < interdist){ 
					if(i > pre.length){
						int b = (int) Math.floor((i - pre.length)/sides);
						points += ball[b][3] * bmag;
					}
					vd[0] = Math.cos(da) * bmag;
					vd[1] = Math.sin(da) * bmag;
				}
			}
		}
		g.setColor(Color.black);
		g.fillRect(posx - 5, (int)sd + 10, 10, 20);
		g.drawString("Score: " + points + " Resets: " + life, 10, 15);
		
	}
	
	private class Key extends KeyAdapter {
		public void keyPressed(KeyEvent e){
			if(e.getKeyCode() == KeyEvent.VK_DOWN){
				lock = true;
				sd += 2;
			}
			if(e.getKeyCode() == KeyEvent.VK_LEFT){
				downl = true;
			}
			if(e.getKeyCode() == KeyEvent.VK_RIGHT){
				downr = true;
			}
		}
		public void keyReleased(KeyEvent e){
			lock = false;
			if(e.getKeyCode() == KeyEvent.VK_LEFT){
				downl = false;
			}
			if(e.getKeyCode() == KeyEvent.VK_RIGHT){
				downr = false;
			}
		}
	}
}