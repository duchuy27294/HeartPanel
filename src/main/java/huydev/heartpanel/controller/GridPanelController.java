package huydev.heartpanel.controller;

import huydev.heartpanel.model.GridPanelModel;
import huydev.heartpanel.view.GridPanelView;

public class GridPanelController {
    private GridPanelModel model;
    private GridPanelView view;

    public GridPanelController(GridPanelModel model, GridPanelView view){
        this.model = model;
        this.view = view;
    }
}
