package Package1;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
public class BankAccount {
  
	//Attributes
	protected  String username;
	protected  String firstName;
	protected  String lastName;
	protected  String accountType;
	protected  String PIN;
	protected  double balance;
	protected  double creditCard;
        protected  Date dateOfDebt;  // this attribute refers to the earlier date the user withdraw from credit card and didn't deposit them again
	
	//Constructors
	// default constructor
	public BankAccount () {
		this.creditCard=10000;
		 
	}
	
	public BankAccount(String username, String fristname, String lastname,String password, double balance) {
		this.username=username;
		this.firstName=fristname;
		this.lastName=lastname;
		this.PIN=password;
		this.balance=balance;
                this.creditCard=10000;
		
	 }
	
	//Setters and Getters 
	
	public String getUsername() {
		return this.username;
	}
	
	
	public String getfirstName() {
		return this.firstName;
	}
	
	
	public String getlastName() {
		return this.lastName;
	}
	

	public String getPIN() {
		return this.PIN;
	}

	public double getBalance() {
		return this.balance;
	}

	
	public double getcreditcard() {
		return this.creditCard;
	}
        
        public void setDateOfDebt(Date d) {
		this.dateOfDebt = d;
	}
         public Date getDateOfDebt() {
		return this.dateOfDebt;
	}
	
	
	
// Deposit Method
	public void deposit(double amount)   
// the method depends if the user has debt from creditcard or not, if yes, the money he took from credit card go automaticaaly to the credit card balanace
	   { 
	   if(this.creditCard<10000 ) {
		 this.creditCard = this.creditCard + amount;
		if(this.creditCard >= 10000) {
                    this.setDateOfDebt(null);
		double restAmount=this.creditCard-10000;
		this.creditCard=this.creditCard-restAmount;
		this.balance = this.balance+restAmount;
			}	 
		}
		else {
                    this.balance = this.balance + amount;
		}
		
   }
	
	//Withdraw Method from balance 
	public void withdraw(double amount){ // restiraction to this method that prevent him from taking more than his balance is determined in the GUI
            balance=balance-amount;
        }

	  
	//Withdraw from the credit card
	public boolean creditWithdraw(double amount) {
		if ( amount <= this.creditCard) {
			
			this.creditCard = this.creditCard-amount;
                        return true;
		}
                return false;
	}
	
    
     	
    	// Transfer amount function
     	public boolean transfer (double amount, BankAccount to) 

     	{                                                             
     		if(this.getBalance() >= amount){ 
         	this.balance = this.getBalance() - amount;
        	to.balance = to.balance + amount;
      	  return true;
     	} 
     		else { 
     			return false;
     	}
   	}
     	
	 
       // Function to calculate the difference between today and the entered day in the creditWithdraw	 
	public  int dayDifference() {
	  int diffDays=0;
          Date d1 = Calendar.getInstance().getTime();
	  DateFormat dateFormat1 = new SimpleDateFormat("MM/dd/yyyy"); 
	  String strDate = dateFormat1.format(d1);
          String AccDate = dateFormat1.format(this.dateOfDebt);
					
	  String format = "MM/dd/yyyy";  
	  SimpleDateFormat sdf = new SimpleDateFormat(format);
				
	   try {
	      Date date1 = sdf.parse(strDate + " " );
	      Date date2 = sdf.parse(AccDate + " " );
	      long diff = date1.getTime() - date2.getTime();
	      diffDays=(int) (diff / (24 * 60 * 60 * 1000));
		}
		catch (Exception e)
                {
 		e.printStackTrace();
 		}
					
		return diffDays;
			}
        
        // Days left Method
     	public int checkStatus() {
     		int daysleft=60-this.dayDifference();
                if (daysleft >= 0)
     		     return daysleft;   
                else 
                    return 0;   
     			}
    
 }


    

