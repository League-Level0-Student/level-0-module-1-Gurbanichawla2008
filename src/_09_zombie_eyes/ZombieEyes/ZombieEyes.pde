 void setup(){
   size(1000,1000);
   PImage face = loadImage("ZombieFace.jpg");
   face.resize(900,900);
image(face, 0, 0);
 }
 
   void draw(){
     
     fill(mouseX,mouseY,mouseY);
     ellipse(280,380,120,110);
     ellipse(590,380,120,110);
     fill(0,0,0);
    ellipse(280,380,40,30);
     ellipse(590,380,40,30);
   }
