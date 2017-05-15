/*
Violet - A program for editing UML diagrams.

Copyright (C) 2002 Cay S. Horstmann (http://horstmann.com)

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/

package com.horstmann.violet.framework;

//import java.awt.BasicStroke;
import java.awt.Graphics2D;
//import java.awt.Shape;
//import java.awt.geom.Line2D;
//import java.awt.geom.Point2D;
//import java.awt.geom.Rectangle2D;

// JavaFX imports
import javafx.scene.shape.Rectangle;
import javafx.geometry.Bounds;
import javafx.scene.shape.Shape;
import javafx.scene.shape.Line;
import javafx.geometry.Point2D;


/**
   A class that assumes that an edge can yield its shape
   and then takes advantage of the fact that containment testing can 
   be done by stroking the shape with a fat stroke.
   NOTE: Ideally, you should be able to draw the same shape that
   is used for containment testing. However, in JDK 1.4, 
   BasicStroke.createStrokedShape returns shitty-looking shapes. 
*/
public abstract class ShapeEdge extends AbstractEdge
{  
   /**
      Returns the path that should be stroked to
      draw this edge. The path does not include
      arrow tips or labels.
      @return a path along the edge
   */
   public abstract Shape getShape();

   /**
    * Get bounding Rectangle of Shape
    * @return bounding Rectangle of Shape
    */
   public Rectangle getBounds(Graphics2D g2)
   {  
      Bounds b = getShape().getLayoutBounds();
      Rectangle r = new Rectangle(b.getMinX(), b.getMinY(), b.getWidth(), b.getHeight());
      return r;
   }

   public boolean contains(Point2D aPoint)
   {
      final double MAX_DIST = 3;

      // the end points may contain small nodes, so don't
      // match them
      Line conn = getConnectionPoints();
      if (aPoint.distance(conn.getStartX(), conn.getStartY()) <= MAX_DIST 
         || aPoint.distance(conn.getEndX(), conn.getEndY()) <= MAX_DIST)
         return false;
      
      Shape p = getShape();
      p.setStrokeWidth(2 * MAX_DIST);
      return p.contains(aPoint);
   }
}
