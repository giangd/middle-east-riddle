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

public class change extends PApplet {

public void setup() {
  String words = "Paphos Argaki Asinou Galata Giolou Kampia Kambos Kantou Kilani Kornos Latsia Paphos Maroni Meniko Melini Miliou Pachna Pegeia Pyrgos Sotira Sotira Tymvou";
  String[] list = split(words, ' ');
  saveStrings("test.txt", list);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "change" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
