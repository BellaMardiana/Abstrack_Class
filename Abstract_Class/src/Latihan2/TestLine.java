/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author user
 */
public class TestLine {
    public static void main (String[]args ){
        Line a = new Line ( 3, 6, 8, 9);
        Line b = new Line ( 2, 5, 3, 9);
        System.out.println("Length a : " +a.getLength());
        System.out.println("Length b : " +b.getLength());
        System.out.println("aLen > bLen = " +a.isGreater(a,b));
        System.out.println("aLen < bLen = " +a.isLess(a,b));
        System.out.println("aLen == bLen = " +a.isEqual(a,b));
    }
}
