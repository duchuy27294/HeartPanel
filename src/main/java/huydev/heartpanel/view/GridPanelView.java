package huydev.heartpanel.view;

import java.awt.Container;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;

import huydev.heartpanel.model.GridPanelModel;

public class GridPanelView extends JFrame {
    private GridPanelModel model;
    
    public GridPanelView(GridPanelModel model){
        this.model = model;
        this.setTitle("Grid Panel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(this.model.getWidth()*GridPanelModel.DIMENSION,
                    this.model.getHeight()*GridPanelModel.DIMENSION);
        Container c = this.getContentPane();
        c.setBackground(Color.BLACK);
        c.setLayout(new GridLayout(this.model.getHeight(),this.model.getWidth()));
        for (int i = 0; i < this.model.getHeight()*this.model.getWidth(); i++){
            ColorPanel panel = new ColorPanel();
            panel.registerEvents();
            //panel.addMouseListener(new ColorPanel());
            c.add(panel);
        }
    }

}
