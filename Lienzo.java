/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p4.paint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hcarreras
 */
public class Lienzo extends javax.swing.JPanel {
//Para decidir que herramienta tenemos seleccionada
    final static int PUNTO = 1;
    final static int LINEA = 2;
    final static int RECTANGULO = 3;
    final static int OVALO = 4;
    
    
    private int herramientaSeleccionada;
    private Color actual;
    private List<Shape> vShape = new ArrayList();
    private boolean relleno, editar;
    private Shape figuraInteractiva;
    private Stroke stroke;
    private Point puntoFijo;

  
    
    
    public Lienzo() {
        initComponents();
        

        stroke = new BasicStroke();
        herramientaSeleccionada = 0;
    }
    
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setStroke(stroke);
        g2d.setPaint(actual);
        
        for(Shape s:vShape) {
            if(relleno) g2d.fill(s);
            g2d.draw(s);
        }

       
    }  
    public void setStroke(Stroke nuevo){
        this.stroke = nuevo;
        this.repaint();
    }
    
    public void setGrosor(float nuevoGrosor){
        stroke = new BasicStroke(nuevoGrosor);

        this.repaint();

    }
    public void setHerramientaSeleccionada(int nueva){
        herramientaSeleccionada =  nueva;
    }
    
    public void setColor(Color nuevo){
        actual = nuevo;
        this.repaint();
    }
    public void setRelleno(boolean activar){
        relleno = activar;
    }
    public void setEditar(boolean activar){
        editar = activar;
    }    
    public void clear(){
        herramientaSeleccionada = 0;
        this.repaint();
    }
    
    public Shape createShape(Point punto1, Point punto2){

        if(herramientaSeleccionada == PUNTO){
            figuraInteractiva = new Line2D.Float(punto1, punto1);            
        }
        if(herramientaSeleccionada == LINEA) {
            figuraInteractiva = new Line2D.Float(punto1, punto2);            
        }
        if(herramientaSeleccionada == RECTANGULO) {
            figuraInteractiva = new Rectangle2D.Float();
            ((Rectangle2D)figuraInteractiva).setFrameFromDiagonal(punto1, punto2); 
            
        }
        if(herramientaSeleccionada == OVALO) {
            figuraInteractiva = new Ellipse2D.Float();
            ((Ellipse2D)figuraInteractiva).setFrameFromDiagonal(punto1, punto2);
        }
        
        return figuraInteractiva;
                    
        
    }
    
    public void updateShape(Point punto1, Point punto2){

        if(figuraInteractiva instanceof Line2D) {
            ((Line2D)figuraInteractiva).setLine(punto1,punto2);

        }
        if(figuraInteractiva instanceof RectangularShape) {
            ((RectangularShape)figuraInteractiva).setFrameFromDiagonal(punto1, punto2);
        }
      
    }
    
    
    private Shape getSelectedShape(Point2D p){ 
                        
        for(Shape s:vShape)
            if(contains(s,p))
                return s; 
        return null;
    }
    private boolean contains(Shape s, Point2D p){
        if(s instanceof Line2D) {
            if(isNear((Line2D)s, p))
                return true;
        }
        else{
            if(s.contains(p))
                return true;
        }
 
        return false;
    }
    
    private boolean isNear(Line2D line, Point2D p){ 
        return line.ptLineDist(p)<=2.0;
    }    
    
    
    
    private void setLocation(Shape figura, Point2D pos){ 
        
        if(figura.getClass() == Ellipse2D.Float.class){
           ((Ellipse2D) figura).setFrame(pos.getX(), pos.getY(), ((Ellipse2D) figura).getWidth(),((Ellipse2D) figura).getHeight());                                      
        }
        if(figura.getClass() == Line2D.Float.class) {
            double dx=pos.getX()-((Line2D) figura).getX1();
            double dy=pos.getY()-((Line2D) figura).getY1(); 
            Point2D newp2 = new Point2D.Double(((Line2D) figura).getX2()+ dx,
                                                ((Line2D) figura).getY2()+ dy);
            ((Line2D) figura).setLine(pos,newp2);
        }
        if(figura.getClass() == Rectangle2D.Float.class) {
           ((Rectangle2D) figura).setFrame(pos.getX(), pos.getY(), ((Rectangle2D) figura).getWidth(),((Rectangle2D) figura).getHeight());             
        }
        if(figura.getClass() == Ellipse2D.Float.class) {

           ((Ellipse2D) figura).setFrame(pos.getX(), pos.getY(), ((Ellipse2D) figura).getWidth(),((Ellipse2D) figura).getHeight());                            
        }

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked
       
    
    
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        if(editar){
            //((Rectangle2D)figuraInteractiva).getHeight();
            setLocation(figuraInteractiva, evt.getPoint());
        }
        else
            updateShape(puntoFijo, evt.getPoint());
        this.repaint();
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        puntoFijo = evt.getPoint();
        if(editar)
            figuraInteractiva = getSelectedShape(evt.getPoint());
        else
            vShape.add(figuraInteractiva = createShape(puntoFijo,puntoFijo));
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        if(!editar){
            updateShape(puntoFijo, evt.getPoint());
          //  vShape.add(figuraInteractiva);
        }
        this.repaint();    }//GEN-LAST:event_formMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
