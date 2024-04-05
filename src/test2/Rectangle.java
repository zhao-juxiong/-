package test2;

public class Rectangle {
    private int length;
    private int width;


    public Rectangle() {
    }
    public void setLength ( int length){
        this.length = length;
    }

    public void setWidth ( int width){
        this.width = width;
    }

    public int Getgirth () {
        return (length + width) * 2;
    }


    public int Getarea () {
        return length * width;
    }

}

