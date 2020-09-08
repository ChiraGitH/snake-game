import javax.swing.JFrame;

public class Snake extends JFrame{

	Snake(String s){
		super(s);
		
		add(new Board());
		pack();
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Snake("Snake Game");
	}
}