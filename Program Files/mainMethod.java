import java.util.*;
public class mainMethod
{
  public static void main(String[] args)
  {
   Scanner input = new Scanner(System.in);
   boolean mainL = true;
   System.out.println("Welcome to the Arena!");
   while (mainL)
   {
    //MAIN MENU 
    System.out.println("    1.Fight");
    System.out.println("  2.Exit Game");
    int choice1 = input.nextInt();
    switch (choice1)
    {
      case 1:
      {
       //CHARACTER CREATION
       System.out.println("Choose your name:");
       String name = input.next();
       System.out.println("Choose your fighter:");
       System.out.println("    1.Warrior");
       System.out.println("   2.Sorcerer");
       System.out.println("     3.Rogue");
       int choiceC = input.nextInt();
       PLAYER[] pArray = new PLAYER[1];
       switch (choiceC)
       {
         case 1:
         {
          PLAYER player = new PLAYER(name, "Warrior", 125, 75, 1);
          pArray[0] = player;
          break; 
         }
         case 2:
         {
          PLAYER player = new PLAYER(name, "Sorcerer", 75, 125, 2); 
          pArray[0] = player;
          break; 
          
         }
         case 3:
         {
          PLAYER player = new PLAYER(name, "Rogue", 100, 100, 3); 
          pArray[0] = player;
          break; 
         }
       }
       //SETUP
       //System.out.println("How many enemies would you like to fight?");
       int eNum = 3;//TEMP JUST FOR PRESENTATION
       Enemy[] eArray = new Enemy[eNum];
       //fills array
       for (int i = 0; i < eNum; i++)
       {
        int eID =(int)(Math.random()*(( 5 - 1 ) + 1)) + 0;
        switch (eID)
        {
          case 1:
          {
           Enemy gob = new Enemy("GOBLIN",50,25,10);
           eArray[i] = gob;
           break;
          }
          case 2:
          {
           Enemy fig = new Enemy("FIGHTER",100,15,20);
           eArray[i] = fig;
           break;
          }
          case 3:
          {
           Enemy asa = new Enemy("ASSASSIN",75,30,17);
           eArray[i] = asa;
           break;
          }
          case 4:
          {
           Enemy wiz = new Enemy("WIZARD",50,40,15);
           eArray[i] = wiz;
           break; 
          }
          case 5:
          {
           Enemy dra = new Enemy("DRAGON",200,10,25);
           eArray[i] = dra;
           break;  
          } 
        }
       }
       //COMBAT LOOP
       boolean wl = true;
       for (int c = 0; c < eNum; c++)
       {
        if (sgCombat(pArray[0], eArray[c])==true)
        {
         System.out.println("On to the next battle...");
        }
        else
        {
         wl = false;
         break;
        }
       }
       //Checks for Win/Loss
        if (wl == true)
        {
         System.out.println("CONGRATS, you have defeated "+ eNum + " enemies!"); 
        }
        else
        {
         System.out.println("You have failed to defeat the "+ eNum + " Enemies. Better luck next time!"); 
        } 
       break; 
      }
      //Exit Loop
      case 2:
      {
       mainL = false; 
       break;
      }
    } 
   }
    System.out.println("Thanks for Playing!");
  }
  
  
  //COMBAT METHOD
  public static boolean sgCombat(PLAYER p1, Enemy ek)
  {
   Scanner input = new Scanner(System.in);
   System.out.println("Entering Combat...");
   while(true)
   { 
   p1.printStat();
   ek.printStats();
   System.out.println("1.ATTACK");
   System.out.println("2.SPECIAL ABILITIES");
   System.out.println("3.POTIONS");
   System.out.println("4.SURRENDER");
   int comChoice = input.nextInt();
   //PLAYER TURN
   switch (comChoice)
   {
     case 1://base attack
     {
      ek.setHP(ek.getHP()-10);
      System.out.println("YOU HAVE DEALT 10 DAMAGE");
      break; 
     }
     //ABILITIES
     case 2:
     {
      p1.printAbList();
      int abChoice = input.nextInt();
      switch(abChoice)
      {
        case 1:
        {
         ek.setHP(ek.getHP()-20);
         p1.setSP(p1.getSP()-10);
         System.out.println("YOU HAVE DEALT 20 DAMAGE!");
         break;  
        }
        case 2:
        {
         ek.setHP(ek.getHP()-25);
         p1.setSP(p1.getSP()-15);
         System.out.println("YOU HAVE DEALT 25 DAMAGE!");
         break; 
        }
        case 3:
        {
         ek.setHP(ek.getHP()-30);
         p1.setSP(p1.getSP()-20);
         System.out.println("YOU HAVE DEALT 30 DAMAGE!");
         break; 
        }
        case 4:
        {
         ek.setHP(ek.getHP()-50);
         p1.setSP(p1.getSP()-30);
         System.out.println("YOU HAVE DEALT 50 DAMAGE!");
         break; 
        }
      }
      break;
     }
     //POTIONS
     case 3:
     {
      System.out.println("1.HP Potion");
      System.out.println("2.SP Potion");
      int pChoice = input.nextInt();
      switch(pChoice)
      {
        case 1:
        p1.setHP(p1.getHP() + 35);
        System.out.println("You Have Been Healed for 35 HP");
        break;
        case 2:
        p1.setSP(p1.getSP() + 20);
        System.out.println("You Have Been Healed for 20 SP");
        break;
      } 
      break; 
     }
     case 4://surrender
     {
      p1.setHP(0);
      break; 
     }
   } 
   //checks for win/loss
   if(p1.getHP() <= 0)
   {
    System.out.println("YOU HAVE BEEN DEFEATED");
    return false;
   }
   else if(ek.getHP() <= 0)
   {
    System.out.println("YOU HAVE DEFEATED THE "+ek.getName()+"!");
    return true;
   }
   p1.setHP(p1.getHP()-ek.turn());//ENEMY TURN
   //checks for win/loss
   if(p1.getHP() <= 0)
   {
    System.out.println("YOU HAVE BEEN DEFEATED");
    return false;
   }
   else if(ek.getHP() <= 0)
   {
    System.out.println("YOU HAVE DEFEATED THE "+ek.getName()+"!");
    return true;
   }
  }//while   
 }//method
  
}//class