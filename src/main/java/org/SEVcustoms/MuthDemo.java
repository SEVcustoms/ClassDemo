package org.SEVcustoms;

public class MuthDemo {
    private int x, y;
    private String text;
    public MuthDemo(int x, int y, String text){
        this.x = x;
        this.y = y;
        this.text = text;
    }
    public void doSquareUp(){
        x = x * x;
        y = y * y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public String doString() {
        return text = " " + text;
    }

    public String getText(){
        return text;
    }

    public void getObject(MuthDemo muthDemo){
        new MuthDemo(x * 3, y * 3, text);
    }
}
