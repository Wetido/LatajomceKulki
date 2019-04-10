import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Okno extends JPanel {

    protected ArrayList<Kulka> kulki = new ArrayList<Kulka>();

    protected Timer timer = new Timer( 30 , new Nawigacja() );

    protected final int size = 10;


    public Okno() {

        addMouseMotionListener( new Nawigacja() );

        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(1200, 600));

        timer.start();
    }


    @Override
    protected void paintComponent(Graphics g){

        super.paintComponent( g );

        for( Kulka k : kulki ){

            g.setColor( k.getKolor() );
            g.fillOval( k.getX(), k.getY(), k.getSize(), k.getSize() );
        }

    }

    public class Nawigacja implements  ActionListener, MouseMotionListener {


        @Override
        public void actionPerformed(ActionEvent e) {

            for( Kulka k : kulki){

                k.move();
            }

            repaint();
        }

        @Override
        public void mouseDragged(MouseEvent e) {

            kulki.add( new Kulka( e.getX() , e.getY(), size ));
            kulki.add( new Kulka( e.getX() , e.getY(), size ));
            kulki.add( new Kulka( e.getX() , e.getY(), size ));

            repaint();
        }

        @Override
        public void mouseMoved(MouseEvent e) {

        }
    }




}
