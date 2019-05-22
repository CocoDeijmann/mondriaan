blocks b;

String name;
int windDirection;
float windSpeed;
float temp;
float humidity;

void setup(){
  size(250,250);
  getWeather();
  b = new blocks();
 
}

void draw(){
  background(240);
  b.display();
  
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

void getWeather(){
  //vul eigen API key in tussen de ""
  String api_key = "";
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
