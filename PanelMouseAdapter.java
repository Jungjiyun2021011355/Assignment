package Adapter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import Assignment15.MyPanel;

public class PanelMouseAdapter extends MouseAdapter{

   MyPanel panel;

   public PanelMouseAdapter(MyPanel panel) {
      this.panel = panel;
   }
   public void mouseClicked(MouseEvent e) {
      panel.x = e.getX();
      panel.y = e.getY();

      panel.repaint();

   }
}
