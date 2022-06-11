package Assignment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
public class MyMouseAdapter extends MouseAdapter {
    JLabel label;
    public MyMouseAdapter(JLabel label) {
        this.label = label;
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("mousePressed");
        int x = e.getX();
        int y = e.getY();
        label.setLocation(x, y);
    }
}