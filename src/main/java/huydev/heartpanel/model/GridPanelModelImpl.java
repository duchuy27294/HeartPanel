package huydev.heartpanel.model;

public class GridPanelModelImpl implements GridPanelModel {
    private int width;
    private int height;

    public GridPanelModelImpl(int width, int height){
        this.width = width;
        this.height = height;
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
    
}
