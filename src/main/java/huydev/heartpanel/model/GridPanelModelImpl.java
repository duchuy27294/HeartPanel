package huydev.heartpanel.model;

public class GridPanelModelImpl implements GridPanelModel {
    private int width;
    private int height;
    private int verticalDistance;
    private int horizontalDistance;

    public GridPanelModelImpl(){
        this.width = 800;
        this.height = 800;
        this.verticalDistance = 10;
        this.horizontalDistance = 10;
    }

    public GridPanelModelImpl(int width, int height, int horizontalDistance, int verticalDistance){
        this.width = width;
        this.height = height;
        this.verticalDistance = verticalDistance;
        this.horizontalDistance = horizontalDistance;
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getHorizontalDistance() {
        return this.horizontalDistance;
    }

    @Override
    public int getVerticalDistance() {
        return this.verticalDistance;
    }

    @Override
    public void setHorizontalDistance(int distance) {
        this.horizontalDistance = distance;
    }

    @Override
    public void setVerticalDistance(int distance) {
        this.verticalDistance = distance;
    }
    
}
