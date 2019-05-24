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

public class mondriaan extends PApplet {


String name;
int windDirection;
float windSpeed;
float temp;
float humidity;
  float x;
  float y;

public void setup(){
  
  getWeather(); 
 println("setup");
}

public void draw(){
  background(240,0,0);
  display();
  
}

// Amsterdam = 2759794
// Reykjavik = 3413829
// Sao Paulo = 3448439
// Delhi     = 1273294
// Fairbanks = 5861897
// Dakar     = 2253354
// Houston   = 4699066
// Pai       = 1151601
// Milan     = 6542283
// Melbourne = 2158177

public void getWeather(){
  //vul eigen API key in tussen de ""
  String api_key = "618fa36521d85b5e5d52af9f3874d91d";
  String id = "5861897";
  JSONObject weatherjson = loadJSONObject("https://api.openweathermap.org/data/2.5/weather?id=" + id + "&units=metric&APPID=" + api_key);

  JSONObject main = weatherjson.getJSONObject("main");
  JSONObject wind = weatherjson.getJSONObject("wind");
  
  name = weatherjson.getString("name");
  windDirection = wind.getInt("deg");
  windSpeed = wind.getFloat("speed");
  temp = main.getFloat("temp");
  humidity = main.getFloat("humidity");

  println("name:" + name);
  println("wind direction:" + windDirection);
  println("wind speed:" + windSpeed);
  println("temp:" + temp);
  println("humidity:" + humidity);
}

public void display(){
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
class blocks {
  //comment by vincentsijben
  float x;
  float y;

 
  
}
  public void settings() {  size(250,250); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "mondriaan" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
