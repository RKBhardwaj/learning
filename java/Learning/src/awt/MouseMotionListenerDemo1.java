package awt;

import java.awt.*;  
import java.awt.event.*;

@SuppressWarnings("serial")
public class MouseMotionListenerDemo1 extends Frame implements MouseMotionListener{
  MouseMotionListenerDemo1(){
    addMouseMotionListener(this);  

    setSize(500,500);  
    setLayout(null);  
    setVisible(true);  
  }  
  public void mouseDragged(MouseEvent a) {  
    Graphics mM_g=getGraphics();  
    mM_g.setColor(Color.ORANGE);  
    mM_g.fillOval(a.getX(),a.getY(),10,10);  
  }  
  public void mouseMoved(MouseEvent e) {}  

  public static void main(String[] args) {  
    new MouseMotionListenerDemo1();  
  }  
}
