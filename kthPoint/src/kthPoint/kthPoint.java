package kthPoint;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class kthPoint {
	
	public static class Point {
	    public int x;
	    public int y;
	    public Point() {
	    	
	    }
	    public Point(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }
	    public String toString() {
	    	return "X:" + x + " " + "Y:" + y;
	    }
	}
	
	 
	public static List<Point> findKClosest(Point[] p, int k) {
	    PriorityQueue<Point> pq = new PriorityQueue<>(k, new Comparator<Point>() { 
	        @Override
	        public int compare(Point a, Point b) {
	            return (b.x * b.x + b.y * b.y) - (a.x * a.x + a.y * a.y);
	        }
	    });
	     
	    for (int i = 0; i < p.length; i++) {
	        if (i < k)
	            pq.offer(p[i]);
	        else {
	            Point temp = pq.peek();
	            if ((p[i].x * p[i].x + p[i].y * p[i].y) - (temp.x * temp.x + temp.y * temp.y) < 0) {
	                pq.poll();
	                pq.offer(p[i]);
	            }
	        }
	    }
	     
	    List<Point> x = new ArrayList<>();

	    while (!pq.isEmpty())
	        x.add(pq.poll());
	     
	    return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point[] p = new Point[5];
		for (int i = 0; i < 5; i++) {
			p[i] = new Point();
		}
		p[0].x = 0; p[0].y = 0;
		p[1].x = 1; p[1].y = 1;
		p[2].x = 2; p[2].y = 2;
		p[3].x = 3; p[3].y = 3;
		p[4].x = 4; p[4].y = 4;
		
		
		System.out.println(findKClosest(p, 3));
		

	}
}
