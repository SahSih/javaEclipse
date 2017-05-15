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

import java.awt.Graphics2D;
//import java.awt.geom.Line2D;
//import java.awt.geom.Point2D;
//import java.awt.geom.Rectangle2D;

// JavaFX imports
import javafx.scene.shape.Rectangle;
import javafx.geometry.Point2D;
import javafx.scene.shape.Line;


/**
   A class that supplies convenience implementations for 
   a number of methods in the Edge interface
*/
abstract class AbstractEdge implements Edge
{  
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

   public void connect(Node s, Node e)
   {  
      start = s;
      end = e;
   }

   public Node getStart()
   {
      return start;
   }

   public Node getEnd()
   {
      return end;
   }

   public Rectangle getBounds(Graphics2D g2)
   {      
      Line conn = getConnectionPoints();      
      Rectangle r = new Rectangle();
      r.setX(conn.getStartX());
      r.setY(conn.getStartY());
      r.setWidth(Math.abs(conn.getEndX() - conn.getStartX()));
      r.setHeight(Math.abs(conn.getEndY() - conn.getStartY()));
      return r;
   }

   public Line getConnectionPoints()
   {
      Rectangle startBoundsFX = start.getBounds();
      Rectangle endBoundsFX = end.getBounds();
      Point2D startCenterFX = new Point2D(
         startBoundsFX.getWidth()/2, endBoundsFX.getHeight()/2);
      Point2D endCenterFX = new Point2D(
         endBoundsFX.getWidth()/2, endBoundsFX.getHeight()/2);
      Direction toEndFX = new Direction(startCenterFX, endCenterFX);
      return new Line(
         start.getConnectionPoint(toEndFX).getX(), start.getConnectionPoint(toEndFX).getY(),
         end.getConnectionPoint(toEndFX.turn(180)).getX(), end.getConnectionPoint(toEndFX.turn(180)).getY());
            
   }

   private Node start;
   private Node end;
}
