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

public class middleEastRiddle extends PApplet {

//add more cities i dont think the ones i have now match

public void setup() {
  String[] countries = loadStrings("1List of Countries.txt");
  String[] wordBank = loadStrings("AllTwelve.txt");
  String[] egypt = loadStrings("EgyptTwelve.txt");
  String[] iran = loadStrings("IranTwelve.txt");
  String[] iraq = loadStrings("IraqTwelve.txt");
  String[] syria = loadStrings("SyriaTwelve.txt");
  String[] turkey = loadStrings("TurkeyTwelve.txt");
  String[] yemen = loadStrings("YemenTwelve.txt");
  String[] list = loadStrings("Cyprus.txt");
  // print(findSum(list, 6, 12));
  println(anagram(wordBank, wordBank));

}

public String findSum(String[] list, int len, int target) { //for each word in "list": if chars in word plus chars in "len" equal to a number "target", then this returns it in a form of a string 
  String tempStorage = new String();

  for (int i = 0; i < list.length; i++) {
    String tempString = new String();

    for (int j = 0; j < list[i].length(); j++) //removes spaces and punctuation
      if (Character.isLetter(list[i].charAt(j)))
        tempString = tempString + list[i].charAt(j);

    if (tempString.length()+len == target) //adds up numbers to see if they equal "target"
      tempStorage = tempStorage + tempString + " ";
  }

  if (tempStorage.equals(""))
    return "none found";

  return tempStorage;
}

public boolean isAnagram(String firstWord, String secondWord) { //checks if the words rearranged can make each other (anagrams)
  char[] word1 = firstWord.replaceAll("[\\s]", "").toCharArray(); //deletes all spaces in word and puts each letter in char array 
  char[] word2 = secondWord.replaceAll("[\\s]", "").toCharArray();

  word1 = sort(word1); //sorts arrays in alphabetical order to be checked
  word2 = sort(word2);

  String string1 = new String(word1); //cant do Arrays.equals(word1,word2) ? i cant find it in processing reference
  String string2 = new String(word2); //so i just changed the char arrays into strings and compared them this way

  return string1.equals(string2); //checks if arrays are equal
}

public String anagram(String[] one, String[] two) {
  String tempStorage = new String();

  for (int i = 0; i < one.length; i++) {
    for (int j = 0; j < two.length; j++) {
      if (!one[i].equals(two[j])) { //this is to take out duplicates since they always equal even before .toLowerCase()
      	if (isAnagram(one[i].toLowerCase(), two[j].toLowerCase())) {
      	  tempStorage = tempStorage + " " + one[i] + two[j] + ", ";
      	}
      }	
    }
  }

  if (tempStorage.equals(""))
    return "none found";

  return tempStorage;
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "middleEastRiddle" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
