package huydev.heartpanel.model;

public interface GridPanelModel {
    public final static int DIMENSION = 20;
    public final static int DISTANCE = 1;
    public abstract int getHeight();
    public abstract int getWidth();
    public abstract void setHeight(int height);
    public abstract void setWidth(int width);
}
