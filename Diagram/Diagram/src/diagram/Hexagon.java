
package diagram;


public class Hexagon extends Shape{
    double edge;
    
    Hexagon() {edge=0;}
    
    Hexagon(int x,int y,String color,boolean move,double edge)
    {
        super(x,y,color,move);
        this.edge=edge;
    }
    
    public String toString(){
        return super.toString()+edge;
    }
    
    @Override
    public boolean equals(Object object) {
        if(object instanceof Hexagon)
        {
            Hexagon he = (Hexagon)object;
            return he.edge==this.edge;
        }
        return false;
    }
    
}
