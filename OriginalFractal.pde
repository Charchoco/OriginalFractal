public void setup(){
	size(800,800);
	background(0);
}
public void draw(){
	
	originalFractal(400,400,100);
}
public void originalFractal(int x, int y, int siz){
	
	
		
		ellipse(x, y, siz-2, siz-2);
		fill(#A961F7,20);
		if(siz > 20){
			

			originalFractal(x+(siz-2), y, siz-10);
			originalFractal(x-(siz-2), y, siz-10);
			originalFractal(x, y+(siz-2), siz-10);
			originalFractal(x, y-(siz-2), siz-10);
		}
	
	
	

}