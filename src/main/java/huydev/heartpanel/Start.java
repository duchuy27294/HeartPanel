/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package huydev.heartpanel;

import huydev.heartpanel.model.GridPanelModel;
import huydev.heartpanel.model.GridPanelModelFactory;
import huydev.heartpanel.view.GridPanelView;
import huydev.heartpanel.controller.GridPanelController;
/**
 *
 * @author duchu
 */
public class Start {

    public Start(){
        GridPanelModel model = GridPanelModelFactory.getModel(40,40);
        GridPanelView view = new GridPanelView(model);
        GridPanelController controller = new GridPanelController(model,view);
        view.setVisible(true);
    }

    public static void main(String[] args) {
        new Start();
    }
}
