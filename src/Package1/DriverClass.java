package Package1;




import Package1.BankAccount;
import static java.util.logging.Logger.global;
 import javax.swing.JFrame;


public class DriverClass {
       static int x =0; // this variable is used to determine which account(username &PIN) will be logging it's changing accrodingg to (isFound) Method
       static int y =0; //this variable is used to determine which username will be used to transfer money to from another one
       
       // this declaration for 10 random accounts to test methods on them
       static BankAccount acc1  = new BankAccount("rawan","Rawan","Mohamed","1234", 50000.0);
       static BankAccount acc2 = new BankAccount("romaisaa","Romaisaa","Shrief","1254",600000.0);
       static BankAccount acc3 = new BankAccount("sara","Sara","Amgad","5643",60000.0);
       static VIP acc4 = new VIP("rawda","Rawda","Yousry","1569",1195000.0);
       static VIP acc5 = new VIP("habiba","Habiba","Fathallah","1368",1500000.0);
       static VIP acc6 = new VIP("rawn","Rawan","Rashad","1365",6000000.0);
       static VIP acc7 = new VIP("salma","Salama","Mohamed","5237",2500000.0);
       static BankAccount acc8 = new BankAccount("khalid","Khalid","Ahmed","1024",65000);
       static BankAccount acc9 = new BankAccount("malak","Malak","Mohamed","1365",100000.0);
       static BankAccount acc10 = new BankAccount("nada","Nada","Adel","1265",150000.0);
       static BankAccount[] arr = {acc1,acc2,acc3,acc4,acc5,acc6,acc7,acc8,acc9,acc10}; // Array that carry all accounts(objects) with their data
       
       
    public static void main(String[] args) {

            NewJFrame frame = new NewJFrame(); //   creating an new object from NewJFrame (login frame) 
              frame.setVisible(true);  // setting the frame visible to appear after running the project

    }
    
    
    
    
    static boolean isFoundUserName(String username) { // Method that is used to determine the validation of data to login 
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].getUsername().equals(username) ){
                 y = i;
                 return true;
            }
               
        }
        return false;
     }

     static boolean isFound(String username,String PIN) { //Method that is used to determine if the username is existing or not
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].getUsername().equals(username) && arr[i].getPIN().equals(PIN) ){
                 x = i;
                 return true;
            }
        
               
        }
        return false;
     }
}
