package exercise_due_2023_06_24;

public class plot {
    private int plotNumber;
    private int plotWidth;
    public plot(int plotNumber, int plotWidth, String fenceColor) {
        this.plotNumber = plotNumber;
        this.plotWidth = plotWidth;
        this.fenceColor = fenceColor;
    }
    @Override
    public String toString() {
        return "plot [plotNumber=" + plotNumber + ", plotWidth=" + plotWidth + ", fenceColor=" + fenceColor + "]";
    }
    private String fenceColor;
    public int getPlotNumber() {
        return plotNumber;
    }
    public void setPlotNumber(int plotNumber) {
        this.plotNumber = plotNumber;
    }
    public int getPlotWidth() {
        return plotWidth;
    }
    public void setPlotWidth(int plotWidth) {
        this.plotWidth = plotWidth;
    }
    public String getFenceColor() {
        return fenceColor;
    }
    public void setFenceColor(String fenceColor) {
        this.fenceColor = fenceColor;
    }
}
