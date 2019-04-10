import java.awt.*;
import java.util.Random;

public class Kulka {

    private int x;
    private int y;
    private Color kolor;
    private int xSpeed;
    private int ySpeed;
    private int size;


    public Kulka( int x ,int y, int size ) {

        this.x = x;
        this.y = y;
        this.size = size;

        Random random = new Random();

        kolor = new Color( random.nextFloat() , random.nextFloat() , random.nextFloat() );
        xSpeed = (int) ( (random.nextFloat( ) + 0.2) * 5 * ( random.nextBoolean() ? -1 : 1) );
        ySpeed = (int) ( (random.nextFloat( ) + 0.2) * 5 * ( random.nextBoolean() ? -1 : 1) );

    }

    public void move(){

        x += xSpeed;
        y += ySpeed;

        if( x  < 0 || x + size > 1200){

            xSpeed = -xSpeed;
        }

        if( y  < 0 || y + size > 600){

            ySpeed = -ySpeed;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getKolor() {
        return kolor;
    }


    public int getSize() {
        return size;
    }
}
