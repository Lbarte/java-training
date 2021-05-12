package sinkShipGame;

import sinkShipGame.ConsoleClassTest;
import sinkShipGame.GameProcessingTest;



public class SSGame {

  public static void main(String[] args) {
     //consoleInputTest();
     
     //outputTest();
     
     //gridPrintingTest();
     
     //remainderTest();
     
     //secondGridPrintingTest();
     
     //gridPrintingTest();
     
     //pointingTest();
     
     //gridSizeInputTest();
     
     //consoleInputXTest();
     
     //consoleInputYTest();
     
     //gridInputOutputTest();
     
     //cellInputTest();
     
     //createPointTest();
     
     //userPointCheckingTest();
     
     //endgameTest();
     
     //foundTest();
     
     //hideTargetTest();
     
     //randomNumberTest();
     
     targetRandomnessTest();
     
     
     //next
     //gameTest();
     
     System.out.println("The end");
  }
  
  void consoleInputTest() {
    System.out.println("Space, we are asking for console input test");
     ConsoleClassTest cst = new ConsoleClassTest();
     cst.consoleInputTest();
  }
  
  void outputTest() {
    System.out.println("Space, we are asking for output test");
     OutputTest ot = new OutputTest();
     ot.launchOutputTest();
  }
  
  /*static void gridPrintingTest() {
    System.out.println("Space, we are asking for grid printing test");
     OutputTest ot = new OutputTest();
     ot.launchGridTest();
  }*/
  
  void remainderTest() {
    System.out.println("Remainder test");
     System.out.println("7/3="+ (7/3));
     System.out.println("7%3="+ (7%3));
  }
  
  static void secondGridPrintingTest() {
    System.out.println("Space, we are askimg for second grid printing test");
     OutputTest ot = new OutputTest();
     ot.launchGridTest1();
  }
  
  static void gridPrintingTest() {
    System.out.println("Space, we are asking for grid printing test");
    OutputTest ot = new OutputTest();
    ot.testPrintGrid();
  }
  
  static void pointingTest() {
   System.out.println("Space, we are asking for pointing test");
    OutputTest ot = new OutputTest();
    ot.testPointed();
  }
  
  static void gridSizeInputTest() {
    System.out.println("Space, we are asking to test grid size input");
    GameProcessingTest gpt = new GameProcessingTest();
    gpt.gridSizeInputTest();
    
  }
  
  static void consoleInputXTest() {
    System.out.println("Space, we are asking to test console x input");
    ConsoleClassTest cst = new ConsoleClassTest();
    cst.getXTest();
  }
  
  static void consoleInputYTest() {
    System.out.println("Space, we are asking to test console y input");
    ConsoleClassTest cst = new ConsoleClassTest();
    cst.getYTest();
  }
  
  static void gridInputOutputTest() {
    
    System.out.println("Space, we are asking for grid input output test");
    GameProcessingTest gpt = new GameProcessingTest();
    gpt.gridInputOutputTest();
  }
  
  static void cellInputTest() {
    
    System.out.println("Space, we are asking for cell input test");
    GameProcessingTest gpt = new GameProcessingTest();
    gpt.cellInputTest();
  }
  
  static void createPointTest() {
    System.out.println("Space, we are asking for point creation test");
    OutputTest ot = new OutputTest();
    ot.createPointTest();
  }
  
  static void foundTest() {
    System.out.println("Space, we are asking for test to find point");
    GameProcessingTest gp = new GameProcessingTest();
    gp.searchTest();
  }
  
  
  static void userPointCheckingTest() {
    System.out.println("Space, we are asking for checking user point test");
    OutputTest ot = new OutputTest();
    ot.checkUserPointTest();
  }
  
  static void endgameTest() {
    System.out.println("Space, we are asking for endgame test");
    ConsoleClassTest cct = new ConsoleClassTest();
    cct.checkEndgameTest();
  }
  
  static void hideTargetTest() {
    System.out.println("Space, we are asking for hiding target test");
    GameProcessingTest gp = new GameProcessingTest();
    gp.searchTest();
  }
  
  static void randomNumberTest() {
    System.out.println("Space, we are asking for random number test");
    NumbersTest nt = new NumbersTest();
    nt.randomNumberTest();
  }
  
  static void targetRandomnessTest() {
    System.out.println("Space, we are asking for target randomness test");
    //todo
  }
  
  static void gameTest() {
    //todo next
  }
  
  
}
