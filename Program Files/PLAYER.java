import java.util.*;
public class PLAYER
{
 //VARIABLES
 private String pName;
 private String clas;
 private int hP;
 private int sP;
 private int iD;
 private int[] abList = new int[4];
 
 //CONSTRUCTORS
 public PLAYER (String name, String classs, int hp, int sp, int id)
 {
  pName = name;
  clas = classs;
  hP = hp;
  sP = sp;
  iD = id;
  abList[0] = 0;
  abList[1] = 0; 
  abList[2] = 0; 
  abList[3] = 0; 
 }
 public PLAYER ()
 {
  pName = "Nerevarine";
  clas = "Adventurer";
  hP = 100;
  sP = 100;
  iD = 3;
  abList[0] = 0;
  abList[1] = 0; 
  abList[2] = 0; 
  abList[3] = 0; 
 }
 
 //GETTERS/SETTERS
 //name
 public void setName(String name)
 {
  pName = name; 
 }
 public String getName()
 {
  return pName;
 }
 //stats
 public String getClas()
 {
  return clas; 
 }
 public void setHP(int hp)
 {
  hP = hp; 
 }
 public int getHP()
 {
  return hP; 
 }
 public void setSP(int sp)
 {
 sP = sp;  
 }
 public int getSP()
 {
  return sP; 
 }
 public int getID()
 {
  return iD; 
 }
 //abillities
 public void setAb0(int ab0)
 {
  abList[0] = ab0; 
 }
 public int getAb0(int ab0)
 {
  return abList[0]; 
 }
 public void setAb1(int ab1)
 {
  abList[1] = ab1; 
 }
 public int getAb1(int ab1)
 {
  return abList[1]; 
 }
 public void setAb2(int ab2)
 {
  abList[2] = ab2; 
 }
 public int getAb2(int ab2)
 {
  return abList[2]; 
 }
 public void setAb3(int ab3)
 {
  abList[3] = ab3; 
 }
 public int getAb3(int ab3)
 {
  return abList[3]; 
 }
 
 //METHODS
 public void printStat()
 {
  System.out.println("--------------------");
  System.out.println("NAME: " + getName()); 
  System.out.println("CLASS: " + getClas()); 
  System.out.println("HP: " + getHP()); 
  System.out.println("SP: " + getSP());  
  System.out.println("--------------------"); 
 }
 
 public void printAbList()
 { 
  if (getID() == 1)
  {
   System.out.println("--------------------"); 
   System.out.println("1: SHIELD BASH"); 
   System.out.println("2: UPPERCUT");  
   System.out.println("3: HEAVY BLOW"); 
   System.out.println("4: DRAGON SHOUT"); 
   System.out.println("--------------------"); 
  }
   else if (getID() == 2)
  {
   System.out.println("--------------------"); 
   System.out.println("1: FIREBALL"); 
   System.out.println("2: LIGHTNING STRIKE");  
   System.out.println("3: ICE WALL"); 
   System.out.println("4: METEOR STRIKE"); 
   System.out.println("--------------------"); 
  }
  else if (getID() == 3)
  {
   System.out.println("--------------------"); 
   System.out.println("1: BACK STAB"); 
   System.out.println("2: ARROW SHOT");  
   System.out.println("3: POISON DAGGER"); 
   System.out.println("4: SHADOW STRIKE"); 
   System.out.println("--------------------"); 
  }
 }
}
