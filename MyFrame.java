package Assignment;
import javax.swing.JFrame;
import panel.MyPanel;
public class MyFrame extends JFrame {
    public MyFrame() {
    this.setSize(500, 500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("MyFrame");
    MyPanel panel = new MyPanel();
    this.add(panel);
    this.setVisible(true);
}
}