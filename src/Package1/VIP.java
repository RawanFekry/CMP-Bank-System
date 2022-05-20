package Package1;

import Package1.BankAccount;
import java.util.Date;

public class VIP extends BankAccount { //VIP account inherted from Bankccount
    
       public VIP (){
           this.creditCard=100000; // the allowable limit for VIP accounts
           
       }
	public VIP(String username, String fristname, String lastname,String  PIN, double balance) { // Constructor
	super( username,  fristname,  lastname, PIN,  balance);
        this.creditCard=100000; // the allowable limit for VIP accounts
	
	}
        
	
@Override
	public int checkStatus() {  // increase the limitation of days to 90 days instead of 60 days in personal accounts
		int daysleft=90-this.dayDifference();
                if (daysleft >= 0)  // Condition that prevent days from being negative numbers
     		     return daysleft;   
                else 
                    return 0;     
	}

@Override
	public void deposit(double amount)   // To change condition of check beacuse of increaing credit card limit in VIP accounts 
	   { 
		if(this.creditCard<100000) {
                    this.setDateOfDebt(null);
		 this.creditCard = creditCard + amount;
			if(creditCard>100000) {
				double restamount=this.creditCard-100000;
				this.creditCard=this.creditCard-restamount;
				this.balance=this.balance+restamount;
			}	 
		}
		else {
                   this.balance= this.balance + amount;
  	             	
		}	
       }
}
