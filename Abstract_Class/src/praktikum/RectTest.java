/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author user
 */
public class RectTest {
    public static void main (String[] args ){
        Rect r1 = new Rect(5, 6, 7, 9);
        Rect r2 = new Rect(1, 3, 5, 8);
        Rect u = r1.union(r2);
        Rect i = r1.intersection(r2);
        
        if (u.isInside(r2.x1, r2.y1))
            System.out.println("(" + r2.x1 + "," + r2.y1 +") is Inside the union");
        
        System.out.println(r1 +"union" +r2+"=" +u);
        System.out.println(r1 +"intersect" +r2+"=" +i);
    }
}
