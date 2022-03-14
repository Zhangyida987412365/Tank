import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Tank {

	public static void main(String[] args) throws InterruptedException {
		TankFrame tk = new TankFrame();
		while(true){
			Thread.sleep(50);
			tk.repaint();
		}
	}

}
