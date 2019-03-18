import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Area in Square Feet:");
    int area=sc.nextInt();
    System.out.println("Choose one options from below options:");
    System.out.println("1:STANDARD");
    System.out.println("2:ABOVE STANDARD");
    System.out.println("3:HIGH STANDARD");
    System.out.println("4:FULLY AUTOMATED");
    int funcvalue=sc.nextInt();
    double finalcost=0;//it is used to store finalcost 
    if(funcvalue==1){
	      finalcost=area*1200;
        System.out.println("Estimation cost for standard house of "+area+" square feet is "+finalcost);
    }
    else if(funcvalue==2){
	      finalcost=area*1500;
        System.out.println("Estimation cost for above standard house of "+area+" square feet is "+finalcost);
    }
    else if(funcvalue==3){
	      finalcost=area*1800;
        System.out.println("Estimation cost for high standard house of "+area+" square feet is "+finalcost);
	  }
    else if(funcvalue==4){
	      finalcost=area*2500;
        System.out.println("Estimation cost for fully standard house of "+area+" square feet is "+finalcost);
	  }
    else{
        System.out.println("Inavalid Option Entered..");
    } 
  }
}
