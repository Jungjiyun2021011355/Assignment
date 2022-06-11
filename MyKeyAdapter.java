package Adapter;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import Assignment15.MyPanel;

public class MyKeyAdapter extends KeyAdapter{
   MyPanel panel;
   public MyKeyAdapter(MyPanel panel){
      this.panel = panel;

   }

   public void keyPressed(KeyEvent e) {
      int KeyCode = e.getKeyCode();
      switch(KeyCode) {
      case KeyEvent.VK_UP:
         panel.setLocation(panel.getX(), panel.getY()-5);
         panel.repaint();
         break;
      case KeyEvent.VK_DOWN:
         panel.setLocation(panel.getX(), panel.getY()+5);
         panel.repaint();
         break;
      case KeyEvent.VK_RIGHT:
         panel.setLocation(panel.getX()+10, panel.getY());
         panel.repaint();
         break;
      case KeyEvent.VK_LEFT:
         panel.setLocation(panel.getX()-10, panel.getY());
         panel.repaint();
         break;


      default:

      }
   }
}

