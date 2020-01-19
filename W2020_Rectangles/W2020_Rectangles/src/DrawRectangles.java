/**
 * Created by Dave on 1/16/2016.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class DrawRectangles extends JFrame {

  ArrayList<Rect2D> rectsToDraw;

  public DrawRectangles( ArrayList<Rect2D> rects ) {
    super( "Drawing Rectangles Test" );
    rectsToDraw = rects;

    getContentPane().setBackground( Color.WHITE );
    setSize( 800, 800 );
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    setLocationRelativeTo( null );
  }

  void drawRectangles( Graphics g ) {
    Color[] colors = new Color[]{ Color.BLUE, Color.RED };
    int toggle = 0;

    Graphics2D g2d = (Graphics2D) g;

    // draw rectangles
    for( Rect2D r : rectsToDraw ) {
      g2d.setColor( colors[toggle] );
      toggle = 1 - toggle;
      System.out.println( r );
      g2d.draw( new Rectangle2D.Double( r.x1, r.y1, r.width, r.height ) );
      g2d.drawString( r.rectName, (float) r.x1 + 5, (float) r.y2 - 5 );
    }
  }

  public void paint( Graphics g ) {
    super.paint( g );
    drawRectangles( g );
  }
}
