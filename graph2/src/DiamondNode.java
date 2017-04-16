import java.awt.*;
import java.awt.geom.*;

/**
   A diamond node that is filled with a color.
*/
public class DiamondNode implements Node
{
	/**
    Construct a circle node with a given size and color.
    @param aColor the fill color
	 */
	public DiamondNode(Color aColor)
	{
	   size = DEFAULT_SIZE;
	   x = 0;
	   y = 0;
	   color = aColor;
	}
	
	@Override
	public void draw(Graphics2D g2) {
	      Color oldColor = g2.getColor();
	      g2.setColor(oldColor);
	      
	      Line2D.Double l1 = new Line2D.Double(x, y + size/2, x + size/2, y);
	      Line2D.Double l2 = new Line2D.Double(x + size/2, y, x + size, y + size/2);
	      Line2D.Double l3 = new Line2D.Double(x + size, y + size/2, x + size/2, y + size);
	      Line2D.Double l4 = new Line2D.Double(x + size/2, y + size, x, y + size/2);
	      g2.draw(l1);
	      g2.draw(l2);
	      g2.draw(l3);
	      g2.draw(l4);
	      
	}

	@Override
	public void translate(double dx, double dy) {
		x += dx;
	    y += dy;
		
	}

	@Override
	public boolean contains(Point2D p) {
		double px = Math.abs(p.getX() - size / 2);
		double py = Math.abs(p.getY() - size / 2);
		return (px / (size / 2 * Math.sqrt(2)) + py / (size / 2 * Math.sqrt(2)) <= 1);
	
	}

	@Override
	public Point2D getConnectionPoint(Point2D other) {
		  double centerX = x + size / 2;
	      double centerY = y + size / 2;
	      double dx = other.getX() - centerX;
	      double dy = other.getY() - centerY;
	      double distance = Math.sqrt(dx * dx + dy * dy);
	      Point2D.Double p1 = new Point2D.Double(dx, dy + size / 2);
	      Point2D.Double p2 = new Point2D.Double(dx + size / 2, dy);
	      Point2D.Double p3 = new Point2D.Double(dx + size, dy + size / 2);
	      Point2D.Double p4 = new Point2D.Double(dx + size / 2, dy + size);
	      if (distance == 0) return other;
	      else if (dx < dy && dx >= -dy) {
	    	  return p4;
	      } else if (dx >= dy && dx >= -dy) {
	    	  return p3;
	      } else if (dx >= dy && dx < -dy) {
	    	  return p2;
	      } else return p1;
	}

	@Override
	public Rectangle2D getBounds() {
		 return new Rectangle2D.Double(
		            x, y, size, size);
	}
	
	public void setColor(Color aColor)
    {
       color = aColor;
    }

    public Color getColor()
    {
       return color;
    }
	
	public Object clone()
	   {
	      try
	      {
	         return super.clone();
	      }
	      catch (CloneNotSupportedException exception)
	      {
	         return null;
	      }
	   }
	private double x;
    private double y;
    private double size;
    private Color color;  
    private static final int DEFAULT_SIZE = 20;
}