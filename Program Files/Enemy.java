import java.util.*;
public class Enemy
{
 //VARIABLES
 private String eName;
 private int hP;
 private int sP;
 private int dP;
 
 //CONSTRUCTOR
 public Enemy(String name, int hp, int sp, int dp)
 {
  eName = name; 
  hP = hp;
  sP = sp;
  dP = dp;
 }
 public Enemy()
 {
  hP = 50;
  sP = 25;
  dP = 10;
 }
 
 //GETTERS & SETTERS
 public String getName()
 {
  return eName; 
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
 public int getDP()
 {
  return dP; 
 }
 
 //METHODS
 public void printStats()
 {
  System.out.println("--------------------");
  System.out.println(getName());
  System.out.println("HP: " + getHP());
  System.out.println("SP: " + getSP());
  System.out.println("DP: " + getDP());
    System.out.println("--------------------");
 }
 
 public void heal()
 {
   if (sP > 5)
   {
    hP+=dP;
    setSP(getSP()-5);
    System.out.println(getName()+ " HEALED HIMSELF FOR " +getDP() + " POINTS");
   }
 }
 
 public int turn()
 {
  if (hP < (hP/4))
  {
   heal(); 
   return 0;
  }
  else if (hP > (hP/2) && sP >= 5)
  {
   setSP(getSP()-5); 
   System.out.println(getName()+ " DEALT " +(getDP()*3)/2 + " POINTS OF DAMAGE TO YOU");
   return (getDP()*3)/2; 
  }
  else
  {
   System.out.println(getName()+ " DEALT " +getDP() + " POINTS OF DAMAGE TO YOU");
   return getDP(); 
  }
 }
}