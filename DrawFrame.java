
import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * This class extends JFrame and contains the main entry point for the program.
 * 
 * @author CS2334. Modified by: Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class DrawFrame extends JFrame
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;
    
    /** Contains and draws all the shapes */
    private static DrawPanel drawPanel;

    /**
     * Creates an invisible window, the objects to be drawn and adds them to the panel.
     * 
     * @param title String title of the drawing window
     */
    public DrawFrame(String title)
    {
        super(title);
        
        int width = 800;
        int height = 600;
        
        // TODO: draw a dog:
        
        // Base head:
        Circle circleOutline = new Circle(new Point(100, 25), 600, Color.BLACK, false);
        Circle head = new Circle(new Point(215, 150), 375, Color.DARK_GRAY, true);
        Circle nose = new Circle(new Point(380, 300), 50, Color.BLACK, true);
 
        // Ears:
        RightTriangle insideEar1 = new RightTriangle(new Point(500, 270), 50, -100, Color.PINK, true);
        RightTriangle insideEar2 = new RightTriangle(new Point(300, 270), -50, -100, Color.PINK, true);
        RightTriangle earOutline1 = new RightTriangle(new Point(495, 270), 60, -110, Color.DARK_GRAY, true);
        RightTriangle earOutline2 = new RightTriangle(new Point(305, 270), -60, -110, Color.DARK_GRAY, true);

        // Eyes:
        Oval eye1 = new Oval(new Point(450,260), 50, 75, Color.WHITE, true);
        Oval eye2 = new Oval(new Point(300,260), 50, 75, Color.WHITE, true);
        Oval pupil1 = new Oval(new Point(450,260), 43, 70, Color.BLACK, true);
        Oval pupil2 = new Oval(new Point(300,260), 43, 70, Color.BLACK, true);

        // Mouth:
        PolyLine rightMouth = new PolyLine(new Point(400,375), new Point(500,365), 60, Color.BLACK, true);
        PolyLine leftMouth = new PolyLine(new Point(300,365),new Point(400,375), 60, Color.BLACK, true);
       
        // Tongue:
        Oval tongue = new Oval(new Point(410, 400), 50, 75, Color.PINK, true);
            
        // Collar:
        Oval collar = new Oval(new Point(215,500), 400, 50, Color.BLUE, true);
       
        // Collar tag:
        Circle outsideTag = new Circle(new Point(350,475), 100, Color.RED, true);
        Circle insideTag = new Circle(new Point(360,485), 80, Color.GREEN, false);
        
        // Square around the dog:
        Square squareOutline = new Square(new Point(400, 300), 500, Color.MAGENTA, false);

        // initialize the panel and add the shapes to it
        drawPanel = new DrawPanel();
        
        // TODO: add shapes to the panel:
        drawPanel.addShape(circleOutline);
        drawPanel.addShape(head);
        drawPanel.addShape(nose);
        drawPanel.addShape(eye1);
        drawPanel.addShape(eye2);
        drawPanel.addShape(pupil1);
        drawPanel.addShape(pupil2);
        drawPanel.addShape(earOutline1);
        drawPanel.addShape(earOutline2);
        drawPanel.addShape(insideEar1);
        drawPanel.addShape(insideEar2);
        drawPanel.addShape(rightMouth);
        drawPanel.addShape(leftMouth);
        drawPanel.addShape(tongue);
        drawPanel.addShape(collar);
        drawPanel.addShape(outsideTag);
        drawPanel.addShape(insideTag);
        drawPanel.addShape(squareOutline);


        
        // set background color
        drawPanel.setBackground(Color.CYAN);
        
        // add panel to frame
        this.add(drawPanel);
        
        // finish setting up the frame
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * The main method, initializes the frame to draw the images.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args)
    {
        DrawFrame frame = new DrawFrame("Woof :3");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
