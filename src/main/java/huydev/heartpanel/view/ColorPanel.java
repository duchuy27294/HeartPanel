package huydev.heartpanel.view;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class ColorPanel extends JPanel implements MouseListener{
    // private Color color;

    public ColorPanel(){
        super();
        // this.color = new Color(255,255,255);
        this.setBackground(Color.WHITE);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    public void registerEvents(){
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        Color c = this.getBackground();
        if (c.getRGB() == Color.WHITE.getRGB()){
            this.setBackground(Color.RED);  
        }
        else{
            this.setBackground(Color.WHITE);  
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

}
