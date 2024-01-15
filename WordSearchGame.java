import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class WordSearchGame extends JFrame {
  //GUI components
  private JLabel title;
  private JTextField wordField;
  private JTextArea wordList;
  private JButton playButton;
  private JButton newButton;
  private String[] dictionary;
  private String searchWord;
  private String[] words;


  //constructor
  public WordSearchGame() throws IOException {
    super("WordSearchGame");
    this.setTitle("Word Search Game");
    this.setSize(1000,1000);
    this.setVisible(true);
    readDictionary();
    searchWord = getSearchWord();
    //System.out.println(dictionary[5]);

    //this.setSubTitle("Word Search");
    this.setLayout(new BorderLayout());
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel mainPanel = new JPanel();


    // instantiate the components
    title = new JLabel("Word Search Game");
    wordField = new JTextField(10);
    playButton = new JButton("Play");
    newButton = new JButton("New  Game");


    // instantiate and add action listener to listen to button
    //playButton.addActionListener(new playButtonListener());


    // add components to panel
    mainPanel.add(title);
    mainPanel.add(wordField);
    mainPanel.add(playButton);
    mainPanel.add(newButton);
    this.add(mainPanel); // Add panel to this JFrame
    this.setVisible(true);

  }//WordSearchGame


  public static void main( String[] args ) throws IOException {
    WordSearchGame frame = new WordSearchGame();
  }


  private void readDictionary() throws IOException {
    File inFile = new File("words.txt");
    Scanner fileScan = new Scanner(inFile);
    int size = fileScan.nextInt();
    dictionary = new String[size];
    for(int i= 0; i < size; i++) {
      dictionary[i] = fileScan.nextLine();
    }//for
  }//readDictionary

  private String getSearchWord() throws IOException {
    Random rand = new Random();
    String result = "";
    while(result.length() < 6) {
      int numWords = rand.nextInt(172823);
      result = dictionary[numWords];
    }//while
    return result;
  }//getSearchWord

  //get the player’s words from the text area and return them in an array
  private String[] getPlayerWords() {
    words = wordList.getText().split("\\s+");
    return words;
  }

  //Display each of the player's words, errors if applicable, and score.
  private void checkPlayerWords() throws IOException{
    int score = 0;
    for (int i=0; i<words.length(); i++) {
      if(words[i].length < 4){
        wordList.append("       too short\n");
      }
      else if(!searchDictionary(words[i])){
        wordList.append("       not in dictionary\n");
      }
      else if(!inSearchWord(words[i])){
        wordList.append("       not in searchWord\n");
      }
      else if(words[i].equalsIgnoreCase(searchWord)){
        wordList.append("       is search word\n");
      }
      else {

      }
    }//for
  }//checkPlayerWords


  //Find a word in the dictionary array and return true if found.
  private boolean searchDictionary(String word) {
    for(int i=0; i<dictionary.length; i++) {
      if(word.equals(dictionary[i]))
        return true;
    }
    return false;
  }//searchDictionary


  //count number of occurences for each letter.
  private void charCount(String s, int count[]) {
    for (int i = 0; i < s.length(); i++) {
      count[s.charAt(i) - 'a']++;
    }//for
  }//charCount


  //return true if a word can be formed
  private boolean inSearchWord(String word) {
    int[] wordCount = new int[26];
    int[] searchWordCount = new int[26];
    charCount(word, wordCount);
    charCount(searchWord, searchWordCount);
    for(int i =0; i<wordCount.length; i++) {
      if(wordCount[i] > searchWordCount[i]) {
        return false;
      }
    }
    return true;
  }//inSearchWord


  //implement action listener
  public void actionPerformed(ActionEvent e) {

  }//actionPerformed
}//class
