public class MontyHall {
  private boolean shutdown = false;
  
  public static void main(String[] args) { 
    //Scanner Guess = new Scanner(System.in); //Not taking in user input; complete automation
    
    MontyHall mh = new MontyHall(); //Initiate shutdown hook. This is here for aesthetic purposes. It will allow me to input a newline on program termination.
    mh.attachShutDownHook();
    
    System.out.println("This program will automatically prove the 2/3 chance Monty Hall Theory");
    
    int totalTrials, switched, noSwitch;
    totalTrials = switched = noSwitch = 0;
    
    while(true) {
      //System.out.println("Randomly choosing doors...");
      //randomNum = minimum + (int)(Math.random()*maximum); 
      int car = 1 + (int)(Math.random()*3); //Choose a random door to put the car behind.
      int guessOne = 1 + (int)(Math.random()*3); //Randomly guess a door the car may be behind.
      
      int removedDoor = 1 + (int)(Math.random()*3); //Choose a door to remove for second step of the Monty Hall problem.
      while(removedDoor == car || removedDoor == guessOne) { //If the removed door happened to be the one with the car behind it or the guessed door, choose a different door.
        removedDoor = 1 + (int)(Math.random()*3);
      }
      
      int guessTwo = 1 + (int)(Math.random()*3); //Make a second guess for part two of the problem.
      while(guessTwo == removedDoor || guessTwo == guessOne) { //To force the second guess to be a switch, make sure it is not guess one or the removed door.
        guessTwo = 1 + (int)(Math.random()*3);
      }
      
      if(guessOne == car) { //If the guess that was not switched happened to be right, record it.
        noSwitch++;
      } else if(guessTwo == car) { //If the switched guess happened to be right, record it. Only one of these could be right, so checking both will not skew the results.
        switched++;
      }
      
      totalTrials++; //Increase the count of total number of tries. This is to calculate percentages of right.
      
      if(mh.getShutdown() == false) { //If statement prevents text on newline when shutting down the program. Completely aesthetic.
        System.out.print("Not Switched: " + noSwitch + " Switched: " + switched + " Total: " + totalTrials); //Display number of guesses for switch and no switch and total trials.
        System.out.print(" --- Not Switched %: " + ((float) noSwitch/(float) totalTrials)*100 + " Switched %: " + ((float) switched/(float) totalTrials)*100 + '\r'); //Display percentages of switched or no switch being correct.
      }
    }
  }
  
  public void attachShutDownHook(){ //This is to detect shutdown of program. Allows me to insert newline when program is terminated. Completely aesthetic, this code is not needed.
    Runtime.getRuntime().addShutdownHook(new Thread() {
      @Override
      public void run() {
        shutdown = true;
        System.out.println();
      }
    });
  }

  public boolean getShutdown() { //This is to bypass the cannot get non-static reference from static method issue. Use mh.getShutdown().
    return shutdown;
  }
}
