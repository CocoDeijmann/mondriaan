class blocks {
  
  float x;
  float y;

 void display(){
  x = mouseX;
  y = mouseY;
  
  strokeWeight(7);
   
  //rood blok
  createShape();
  beginShape();
  fill(255,0,0);
  vertex(2,2);
  vertex(2,y);
  vertex(x,y);
  vertex(x,2);
  endShape(CLOSE);
  
  //wit blok 1
  createShape();
  beginShape();
  fill(255);
  vertex(x,2);
  vertex(x,y);
  vertex(248,y);
  vertex(248,2);
  endShape(CLOSE);
  
  //geel blok
  createShape();
  beginShape();
  fill(255,200,0);
  vertex(2,160);
  vertex(2,248);
  vertex(25,248);
  vertex(25,160);
  endShape(CLOSE);
  
  //wit blok 4
  createShape();
  beginShape();
  fill(255);
  vertex(25,160);
  vertex(25,248);
  vertex(x,248);
  vertex(x,160);
  endShape(CLOSE);
  
  //blauw blok
  createShape();
  beginShape();
  fill(0,20,160);
  vertex(x,160);
  vertex(x,230);
  vertex(190,230);
  vertex(190,160);
  endShape(CLOSE);
  
  //wit blok 6
  createShape();
  beginShape();
  fill(255);
  vertex(x,230);
  vertex(x,248);
  vertex(190,248);
  vertex(190,230);
  endShape(CLOSE);
  
  //wit blok 5
  createShape();
  beginShape();
  fill(255);
  vertex(190,160);
  vertex(190,248);
  vertex(248,248);
  vertex(248,160);
  endShape(CLOSE);
  
  //wit blok 2
  createShape();
  beginShape();
  fill(255);
  vertex(2,y);
  vertex(2,160);
  vertex(x,160);
  vertex(x,y);
  endShape(CLOSE);
  
  //wit blok 3
  createShape();
  beginShape();
  fill(255);
  vertex(x,y);
  vertex(x,160);
  vertex(248,160);
  vertex(248,y);
  endShape(CLOSE);
 }
  
}
