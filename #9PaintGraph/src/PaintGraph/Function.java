package PaintGraph;

/**
 * Created by Lena on 28.04.2017.
 */
public class Function {
   public double calcY(double x){
        double a=0.01;
        double b=0;
        double c=-50;

        return a*x*x+b*x+c;
    }
    private int panelSizeX;
    private int panelSizeY;


    public void setParameters(int panelSizeX_,int panelSizeY_){
        panelSizeX =panelSizeX_;
        panelSizeY =panelSizeY_;

    }

    public int calcYPix(int xPix)
    { double x=xPix-panelSizeX/2;
    double y=panelSizeY/2-calcY(x);
    return (int)Math.round(y);

    }

    

}
