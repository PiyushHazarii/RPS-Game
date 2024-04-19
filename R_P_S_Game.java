import java.util.*;

public class R_P_S_Game {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);                            // Take The Input From The Scanner Class.
           
        System.out.println("0 is for Rock");                            // We Assign 0 is For Rock.
        System.out.println("1 is for Paper");                           // We Assign 1 is For Paper.
        System.out.println("2 is for Scissor");                         // We Assign 2 is For Scissor.
     
        
        
        int computerChoice;                                             // computerchoice is of Integer Type.
        int userChoice;                                                 // userChoise is of Integer Type.
        int userWins = 0;                                               // Initially userWins is Zero and will Increment When user Wins the Game.
        int computerWins = 0;                                           // Initially computerWins is Zero and will Increment When computer Wins the Game.
        
        
        
        
        int count = 1;                                                  //  count is Initially 1 Then Increment And Goes to noOfTimesOfGamesRuns.
        System.out.println("Enter The Number That how many times the Game Runs");
        int noOfTimesGameRuns = sc.nextInt();                           // Take the Input of noOfTimesGameRuns From Scanner class .
        

        while(count <= noOfTimesGameRuns)                               // while count is Less Than or Equal to timesOfGamesRuns TheN The Futher Code Runs.
        {
            Random rand = new Random();                                 // An instance of Java Random class is used to generate random numbers. 
            computerChoice = rand.nextInt(2);                           // It will Choose Randomly Between 0 to 2.
                
        
        
            System.out.println("Enter The User Input");                
            userChoice = sc.nextInt();                                  // Take the Input of userChoice From Scanner class. 
            switch(userChoice)                                         
            {
                case 0:                                                 // If the Input of userChoice is Equal to 0 Then only It will Execute.
                System.out.println("User Choose Rock");
                break;                                                  // It is used to Terminate the processing of a particular case Within a switch Statement.
        
                case 1:                                                 // If the Input of userChoice is Equal to 1 Then only It will Execute.
                System.out.println("User Choose Paper");               
                break;
        
                case 2:                                                 // If the Input of userChoice is Equal to 1 Then only It will Execute.
                System.out.println("User Choose Scissor");
                break;

            } 
        
            switch(computerChoice)
            {
                case 0:
                System.out.println("Computer Choose Rock");             // If the Input of computerChoice is Equal to 0 Then only It will Execute.
                break;                                                  // It is used to Terminate the processing of a particular case Within a switch statement.
        
                case 1:                                                 //  If the Input of computerChoice is Equal to 1 Then only It will Execute.
                System.out.println("Computer Choose Paper");
                    break;
        
                case 2:                                                 // If the input of computerChoice is Equal to 1 Then only It will Execute.
                System.out.println("Computer Choose Scissor");
                break;
        
            } 
                      
        
        
            if(computerChoice == userChoice)                            // If computerChoice is Equal to userChoice Then The Match will draw.
            {
                System.out.println("Match Draw");
            }

            else if(computerChoice == 0 && userChoice == 1)             // If conputerChoice is  0 and userChoice is 1 then User Wins the Game.
            {                                                           // And Increment the userWins by +1.
                System.out.println("User Wins...!!!"); 
                userWins++;
            }

            else if(computerChoice == 0 && userChoice == 2)             // If conputerChoice is  0 and userChoice is 2 Then Computer Wins the Game.
            {                                                           // And Increment the computerWins by +1.
                System.out.println("Computer Wins...!!!");
                computerWins++;
            }

            else if(computerChoice == 1 && userChoice == 0)             // If conputerChoice is  1 and userChoice is 0 Then Computer Wins the Game.
            {                                                           // And Increment the computerWins by +1.                                                                     
                System.out.println("Computer Wins...!!!");
                computerWins++;
            }

            else if(computerChoice == 1 && userChoice == 2)             // If conputerChoice is  1 and userChoice is 2 Then User Wins the Game.
            {                                                           // And Increment the userWins by +1.
                System.out.println("User Wins...!!!");
                userWins++;
            }

            else if(computerChoice == 2 && userChoice == 0)             // If conputerChoice is  2 and userChoice is 0 Then User Wins the Game.
            {                                                           // And Increment the userWins by +1.
                System.out.println("User Wins...!!!");
                userWins++;
            }

            else if(computerChoice == 2 && userChoice == 1)             // If conputerChoice is  2 and userChoice is 1 Then Computer Wins the Game.
            {                                                           // And Increment the computerWins by +1.
                System.out.println("Computer Wins...!!!");
                computerWins++;
            }
                   
            if(count == noOfTimesGameRuns)                              // If the count is Equal to noOfTimesGameRuns Then break the loop.
            {
                break;
            }
            count++;                                                    // Increment the count by +1 in while count is not equal to noOfTimesGameRuns.

        }
        
        
           System.out.println("#####################################");
        
        
           System.out.println("Computer :"+computerWins);               // It will print how many Times computerWins the Game 
           System.out.println("User :"+ userWins);                      // It will print how many Times userWins the Game.
        
        
           System.out.println("#####################################");
        

        
           if(computerWins > userWins)                                  // If computerWins is More Than the userWins Then Computer Wins The Game.
           {
                System.out.println("Computer wins the game");
           }

           else if(computerWins == userWins)                            // If computerWins is Equal to the user Wins Then Match Draw.
           {
                System.out.println("Match Draw");
           }

           else                                                         // If computerWins is Less Than the userWins Then User Wins The Game.
           { 
                System.out.println("User won The Game");
           }

        }
    }

    

