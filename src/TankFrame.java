import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame{
	
	int x=200,y=200;
	
	public TankFrame() {
		this.setVisible(true);
		this.setSize(800,600);
		this.setResizable(false);
		this.setTitle("坦克世界");
		
		
		this.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});	
		
		this.addKeyListener(new MyKeyListener());
		
	}

	@Override
	public void paint(Graphics g) {
		System.out.println("paint");
		g.fillRect(x, y, 50, 50);
//		x += 30;
	}
	
	//键盘监听处理类
	class MyKeyListener extends KeyAdapter{
		boolean bl= false;
		boolean bU= false;
		boolean br= false;
		boolean bD= false;
		@Override
		public void keyPressed(KeyEvent e) {
			int key = e.getKeyCode();
			switch (key) {
			case KeyEvent.VK_LEFT: {
				bl = true;
				break;
			}
			case KeyEvent.VK_RIGHT: {
				br = true;
				break;
			}
			case KeyEvent.VK_UP: {
				bU = true;
				break;
			}
			case KeyEvent.VK_DOWN: {
				bD = true;
				break;
			}
			default:
				break;
			}
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			int key = e.getKeyCode();
			switch (key) {
			case KeyEvent.VK_LEFT: {
				bl = false;
				break;
			}
			case KeyEvent.VK_RIGHT: {
				br = false;
				break;
			}
			case KeyEvent.VK_UP: {
				bU = false;
				break;
			}
			case KeyEvent.VK_DOWN: {
				bD = false;
				break;
			}
			default:
				break;
			}
		}
		
		
	}
}
