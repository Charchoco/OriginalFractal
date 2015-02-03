import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {

public void setup(){
	size(800,800);
	background(0);
}
public void draw(){
	
	originalFractal(400,400,100);
}
public void originalFractal(int x, int y, int siz){
	
	
		
		ellipse(x, y, siz-2, siz-2);
		fill(0xffA961F7,20);
		if(siz > 20){
			

			originalFractal(x+(siz-2), y, siz-10);
			originalFractal(x-(siz-2), y, siz-10);
			originalFractal(x, y+(siz-2), siz-10);
			originalFractal(x, y-(siz-2), siz-10);
		}
	
	
	

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
