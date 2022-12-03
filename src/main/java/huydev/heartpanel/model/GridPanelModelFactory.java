package huydev.heartpanel.model;

public class GridPanelModelFactory {
    public static GridPanelModelImpl getModel(int length, int width){
        return new GridPanelModelImpl(length,width);
    }
}
