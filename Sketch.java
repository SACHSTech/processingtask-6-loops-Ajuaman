import processing.core.PApplet;

public class Sketch extends PApplet {

  int r = 0;
  int g = 0;
  int b = 0;
  public void settings() {
    size(600, 600);
  }

  public void setup() {
    background(255);
    strokeWeight(2);
  }

  public void draw() {
	  // Drawing The 10x10 Grid
    for (int lineX = 30; lineX <= 300; lineX += 30) {
      line(lineX, 0, lineX, 300);
    }
    for (int lineY = 30; lineY <= 300; lineY += 30) {
      line(0, lineY, 300, lineY);
    }

    // Drawing Circles
    fill(200);
    for (int circleX = 330; circleX <= 580; circleX += 60) {
      ellipse(circleX, 50, 35, 35);
    }
    for (int circleX = 330; circleX <= 580; circleX += 60) {
      ellipse(circleX, 100, 35, 35);
    }
    for (int circleX = 330; circleX <= 580; circleX += 60) {
      ellipse(circleX, 150, 35, 35);
    }
    for (int circleX = 330; circleX <= 580; circleX += 60) {
      ellipse(circleX, 200, 35, 35);
    }
    for (int circleX = 330; circleX <= 580; circleX += 60) {
      ellipse(circleX, 250, 35, 35);
    }
    
    translate(450, 450);
    // draw 8 petals, rotating after each one
    for (int i = 0; i < 8; i++) {
      ellipse(0, -50, 50, 100);
      rotate(radians(45));
    }
    // centre circle
    ellipse(0, 0, 50, 50);
    
    for(int i = 0; i < width; i++){
      line(0, i, width, i);
    }
    
  }
 
}