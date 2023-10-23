import java.util.Scanner;
import java.util.ArrayList;
//main method
class Main {
  public static void main(String[] args) {
    //user input initialization with scanner
    System.out.println("Enter a sentence");
    Scanner writingSample = new Scanner(System.in);
    String sample;    
    sample = writingSample.nextLine();
    
   //next user input
    System.out.println("Which style would you like your sentence to be re-written in? (1. EE cummings, 2. Archaic)");
    
    int choice;
    choice = writingSample.nextInt();

    //conditionals for style choices
    if(choice==1){
      
      eeCumings(sample);
    
    }
    else if(choice==2){
      archaic(sample);
    }
    //closing scanner class
     writingSample.close();
  }
  //method for ee cummings style
  public static void eeCumings(String sentence){
    int sentIndex=sentence.length()-1;
    //conditional for checking punctuation
    if(sentence.charAt(sentIndex)=='.' || sentence.charAt(sentIndex)=='!' || sentence.charAt(sentIndex)=='?'){
      sentence=sentence.substring(0,sentIndex);
    }
    //make string lowercase and print it out
    System.out.println(sentence.toLowerCase());
  
  }

  public static void archaic(String sentence){
    String[] archaicArr = sentence.split(" ",-1);
    int index=0;
    for(String word:archaicArr){
      switch(word){
        case "you":
          archaicArr[index]="thou";
          break;
        case "your":
          archaicArr[index]="thy";
          break;
        case "yours":
          archaicArr[index]="thine";
          break;
        case "yourself":
          archaicArr[index]="thyself";
          break;
        case "nauseous":
          archaicArr[index]="wamblecropt";
          break;
        case "liar":
          archaicArr[index]="snollygoster";
          break;
      }
      index+=1;
    }
    String newArchaic = String.join(" ",archaicArr);
    System.out.println(newArchaic);
  }
  
}