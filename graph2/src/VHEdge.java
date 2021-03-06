import java.awt.*;
import java.awt.geom.*;

/**
   An edge that is shaped like a straight line.
*/
public class VHEdge extends LineEdge
{
   public VHEdge()
   {
      lineStyle = LineStyle.SOLID;
   }

   @Override
   public void draw(Graphics2D g2)
   {
	   double p1x = getConnectionPoints().getX1();
	   double p1y = getConnectionPoints().getY1();
	   double p2x = getConnectionPoints().getX2();
	   double p2y = getConnectionPoints().getY2();
	   
	   Line2D.Double l1 = new Line2D.Double(p1x, p1y, p1x, p2y);
	   Line2D.Double l2 = new Line2D.Double(p1x, p2y, p2x, p2y);
	   
	   g2.draw(l1);
	   g2.draw(l2);   
   }

   public boolean contains(Point2D aPoint)
   {
      final double MAX_DIST = 2;
      return getConnectionPoints().ptSegDist(aPoint) 
         < MAX_DIST;
   }

   /**
      Sets the line style property.
      @param newValue the new value
   */
   public void setLineStyle(LineStyle newValue) { lineStyle = newValue; }

   /**
      Gets the line style property.
      @return the line style
   */
   public LineStyle getLineStyle() { return lineStyle; }
   
   private LineStyle lineStyle;
}
