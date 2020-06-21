/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 *
 * @author 310212371
 */
public class Triangle implements InitializingBean,DisposableBean,Shape{
    private Point pointA;
    private Point pointB;
    private Point pointC;
    public void draw(){
     System.out.println("PointA "+"("+this.getPointA().getX()+","+this.getPointA().getY()+")");
     System.out.println("PointB "+"("+this.getPointB().getX()+","+this.getPointB().getY()+")");
     System.out.println("PointC "+"("+this.getPointC().getX()+","+this.getPointC().getY()+")");
    }

    /**
     * @return the pointA
     */
    public Point getPointA() {
        return pointA;
    }

    /**
     * @param pointA the pointA to set
     */
    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    /**
     * @return the pointB
     */
    public Point getPointB() {
        return pointB;
    }

    /**
     * @param pointB the pointB to set
     */
    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    /**
     * @return the pointC
     */
    public Point getPointC() {
        return pointC;
    }

    /**
     * @param pointC the pointC to set
     */
    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
         //To change body of generated methods, choose Tools | Templates.
        System.out.println("PointA "+"("+this.getPointA().getX()+","+this.getPointA().getY()+")");
     System.out.println("PointB "+"("+this.getPointB().getX()+","+this.getPointB().getY()+")");
     System.out.println("PointC "+"("+this.getPointC().getX()+","+this.getPointC().getY()+")");
        System.out.println("initialize");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy");
        System.out.println("PointA "+"("+this.getPointA().getX()+","+this.getPointA().getY()+")");
     System.out.println("PointB "+"("+this.getPointB().getX()+","+this.getPointB().getY()+")");
     System.out.println("PointC "+"("+this.getPointC().getX()+","+this.getPointC().getY()+")");
    }
    
    public void init(){
        System.out.println("init method");
    }
    
     public void lastClean(){
        System.out.println("destory method");
    }
     
        public void globalInit(){
        System.out.println("global init method");
    }
    
     public void gloalLastClean(){
        System.out.println("global destory method");
    }
     
}
