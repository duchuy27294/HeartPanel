package huydev.heartpanel.model;

public class GridPanelModelFactory {
    public static GridPanelModelImpl getModel(int length, int width, int horizontalDistance, int verticalDistance){
        return new GridPanelModelImpl(length,width,horizontalDistance,verticalDistance);
    }
}
