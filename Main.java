import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Area in Square Feet:");
    int area=sc.nextInt();//it is used to store the area
    System.out.println("Choose one options from below options:");
    System.out.println("1:STANDARD");
    System.out.println("2:ABOVE STANDARD");
    System.out.println("3:HIGH STANDARD");
    System.out.println("4:FULLY AUTOMATED");
    //reading the integer value which represents type of house    
    int funcvalue=sc.nextInt();
    costEstimation(area,funcvalue); 
    }
    /*
      This function is used to calculates the House Construction Estimation cost
    */
    public static void costEstimation(int area,int funcvalue){
        double finalcost=0;//it is used to store finalcost
        if(area<=0){
            System.out.println("Area must be greater the zero..");
        }
        else{  
            //calculating cost for standard house
            if(funcvalue==1){
	              finalcost=area*1200;
                System.out.println("Estimation cost for standard house of "+area+" square feet is "+finalcost);
            }
            //calculating cost for above standard house
            else if(funcvalue==2){
	              finalcost=area*1500;
                System.out.println("Estimation cost for above standard house of "+area+" square feet is "+finalcost);
            }
            //calculating cost for standard house
            else if(funcvalue==3){
	              finalcost=area*1800;
                System.out.println("Estimation cost for high standard house of "+area+" square feet is "+finalcost);
	          }
            //calculating cost for fully automated house
            else if(funcvalue==4){
	              finalcost=area*2500;
                System.out.println("Estimation cost for fully automated house of "+area+" square feet is "+finalcost);
	          }//condition for valid option
            else{
                System.out.println("Inavalid Option Entered..");
            } 
        }
    }
} 
