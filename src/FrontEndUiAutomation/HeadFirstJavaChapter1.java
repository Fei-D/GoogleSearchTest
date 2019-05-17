package FrontEndUiAutomation;

import javax.swing.plaf.synth.SynthDesktopIconUI;

import org.junit.jupiter.api.Test;

public class HeadFirstJavaChapter1
{

  public static void main(String[] args) {
    //make three sets of words to choose from. Add your own!
    String[] wordListOne = {"24/7", "One-Way", "Return", "Multi-Stop", "Direct", "Transit", "Stopover", "OpenJaw"};
    String[] wordListTwo = {"Domestic","Tasman","Short-haul","Long-haul", "ExtraLong", "Islands", "Asia", " Pacific", "UK", "U.S.A"};
    String[] wordListThree = {"NZ", "CodeShare", "OAL", "DryLease", "ChinaAirLine", "CathyPacific", "UnityStateAirLine"};

    //find out how many words are in each list
    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = wordListThree.length;

    //generate three random numbers
    int rand1 = (int) (Math.random() * oneLength);
    int rand2 = (int) (Math.random() * twoLength);
    int rand3 = (int) (Math.random() * threeLength);

    //one build a phrase
    String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

    //print out the phrase
    System.out.println("What we need is a " + phrase);

  } //end main method
}
