PImage pepperoni;
    void setup(){
        size(800,800); 
        
fill(#742113);
rect(200,200,400,400);
fill(#C68B1C);
ellipse(400,400,300,300);
fill(#F0E51B);
ellipse(400,400,250,250);
 pepperoni = loadImage("P-2.png");
 image(pepperoni,400,400);
    }


    void draw(){
if(mousePressed){
  image(pepperoni,mouseX-65,mouseY-70);
    }
    }
