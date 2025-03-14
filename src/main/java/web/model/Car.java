package web.model;

public class Car {
    private String series;
    private Integer model;
    private String color;

    public Car() {
    }

    public Car(String series, Integer model, String color) {
        this.series = series;
        this.model = model;
        this.color = color;
    }

    public String getSeries() {
        return series;
    }

    public Integer getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return model + " " + series + " " + color;
    }
}
