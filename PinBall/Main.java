import javax.swing.JFrame;
import javax.swing.JPanel;
public class Main
{
      public static void main(String[] args)
      {
            JFrame bframe = new JFrame();
            bframe.setSize(1920,1080);
            bframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Board board = new Board();
            bframe.add(board);
            bframe.setVisible(true);
      }
}