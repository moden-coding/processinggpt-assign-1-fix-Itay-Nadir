import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args)  {
        PApplet.main("App");
    }
        public void settings() {
            size(800, 600); 
        }
    
        public void setup() {
            background(0, 100, 0); 
        }
    
        public void draw() {
            background(0, 0, 255); 
    
            fill(0,255,0);
            rect(100,100,200,100);

            fill(255,0,0);
            triangle(100,600,350,400,350,600);

            stroke(0,10,0);
            strokeWeight(5);
            line(100,200,300,500);
    }

}
