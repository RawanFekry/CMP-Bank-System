package Package1;


import Package1.NewJFrame;
import Package1.BankAccount;
import Package1.VIP;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JComboBox;
import Package1.DriverClass;
import static Package1.DriverClass.arr;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Operation extends javax.swing.JFrame {  //Frame of Operations 

    
    public Operation() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        operationsPanel = new javax.swing.JPanel();
        operationsComboBox = new javax.swing.JComboBox<>();
        operationsLabel1 = new javax.swing.JLabel();
        CheckPanel = new javax.swing.JPanel();
        indebtedLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        balanceLabel = new javax.swing.JLabel();
        balanceTextField = new javax.swing.JTextField();
        daysLeftLabel = new javax.swing.JLabel();
        daysLeftTextField = new javax.swing.JTextField();
        doneButton = new javax.swing.JButton();
        accountTypeLabel = new javax.swing.JLabel();
        accountTypeTextField = new javax.swing.JTextField();
        operationsLabel = new javax.swing.JLabel();
        balanceLabel1 = new javax.swing.JLabel();
        balanceTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        DepositPanel = new javax.swing.JPanel();
        depositionLabel = new javax.swing.JLabel();
        depositButton = new javax.swing.JButton();
        amountOfMoneyLabel = new javax.swing.JLabel();
        amountOfMoneyTextField = new javax.swing.JTextField();
        invalidLabel = new javax.swing.JLabel();
        TransferPanel = new javax.swing.JPanel();
        tAmountTextField = new javax.swing.JTextField();
        tAmountLabel = new javax.swing.JLabel();
        accountUsrNameTextField = new javax.swing.JTextField();
        accountNameLabel = new javax.swing.JLabel();
        transferDataLabel = new javax.swing.JLabel();
        transferButton = new javax.swing.JButton();
        invalidUsrName = new javax.swing.JLabel();
        notEnoughLabel = new javax.swing.JLabel();
        invalidNumberLabel1 = new javax.swing.JLabel();
        invalidUsrName1 = new javax.swing.JLabel();
        WithdrawalPanel = new javax.swing.JPanel();
        withdrawalDataLabel = new javax.swing.JLabel();
        amountOfMoneyLabel2 = new javax.swing.JLabel();
        amountMoneyTextField2 = new javax.swing.JTextField();
        invalidLabel5 = new javax.swing.JLabel();
        creditCardButton = new javax.swing.JButton();
        withdrawelButton = new javax.swing.JButton();
        invalidLabel4 = new javax.swing.JLabel();
        wantToLabel = new javax.swing.JLabel();
        CreditCardPanel = new javax.swing.JPanel();
        creditCardDataLabel = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        dateLabel = new javax.swing.JLabel();
        amountOfMoneyTextField5 = new javax.swing.JTextField();
        amountOfMoneyLabel3 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        invalidDateLabel = new javax.swing.JLabel();
        invalidnum1 = new javax.swing.JLabel();
        invalidnum2 = new javax.swing.JLabel();
        DonePanel = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        jLabel6.setBackground(new java.awt.Color(255, 255, 0));
        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("User Information");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        operationsPanel.setBackground(new java.awt.Color(0, 153, 102));
        operationsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        operationsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        operationsComboBox.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        operationsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Check Status", "Deposit", "Withdraw","Transfer", "Log out"}));
        operationsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operationsComboBoxActionPerformed(evt);
            }
        });
        operationsPanel.add(operationsComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 214, 48));

        operationsLabel1.setBackground(new java.awt.Color(255, 255, 0));
        operationsLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        operationsLabel1.setForeground(new java.awt.Color(255, 255, 204));
        operationsLabel1.setText(" Choose your Operation:");
        operationsPanel.add(operationsLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 60));

        getContentPane().add(operationsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 487, 134));

        CheckPanel.setVisible(false);
        CheckPanel.setBackground(new java.awt.Color(0, 153, 102));
        CheckPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CheckPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        indebtedLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        indebtedLabel.setForeground(new java.awt.Color(204, 0, 0));
        indebtedLabel.setText("You are indebted!");
        indebtedLabel.setVisible(false);
        CheckPanel.add(indebtedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 130, -1));

        firstNameTextField.setEditable(false);
        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });
        CheckPanel.add(firstNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 240, 30));

        firstNameLabel.setBackground(new java.awt.Color(153, 0, 76));
        firstNameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        firstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstNameLabel.setText("First Name:");
        CheckPanel.add(firstNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 150, 50));

        lastNameLabel.setBackground(new java.awt.Color(153, 0, 76));
        lastNameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastNameLabel.setText("Last Name:");
        CheckPanel.add(lastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 150, 50));

        lastNameTextField.setEditable(false);
        lastNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextFieldActionPerformed(evt);
            }
        });
        CheckPanel.add(lastNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 240, 30));

        balanceLabel.setBackground(new java.awt.Color(153, 0, 76));
        balanceLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        balanceLabel.setForeground(new java.awt.Color(255, 255, 255));
        balanceLabel.setText("Balance:");
        CheckPanel.add(balanceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 150, 50));

        balanceTextField.setEditable(false);
        balanceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceTextFieldActionPerformed(evt);
            }
        });
        CheckPanel.add(balanceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 240, 30));

        daysLeftLabel.setBackground(new java.awt.Color(153, 0, 76));
        daysLeftLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        daysLeftLabel.setForeground(new java.awt.Color(255, 255, 255));
        daysLeftLabel.setText("Days Left:");
        CheckPanel.add(daysLeftLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 150, 50));

        daysLeftTextField.setEditable(false);
        daysLeftTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daysLeftTextFieldActionPerformed(evt);
            }
        });
        CheckPanel.add(daysLeftTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 240, 30));

        doneButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doneButton.setText("Done");
        doneButton.setToolTipText("");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });
        CheckPanel.add(doneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 90, 40));

        accountTypeLabel.setBackground(new java.awt.Color(153, 0, 76));
        accountTypeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        accountTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        accountTypeLabel.setText("Type of Account");
        CheckPanel.add(accountTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 120, 50));

        accountTypeTextField.setEditable(false);
        accountTypeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountTypeTextFieldActionPerformed(evt);
            }
        });
        CheckPanel.add(accountTypeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 240, 30));

        operationsLabel.setBackground(new java.awt.Color(255, 255, 0));
        operationsLabel.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        operationsLabel.setForeground(new java.awt.Color(255, 255, 204));
        operationsLabel.setText("User Information");
        CheckPanel.add(operationsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 300, 60));

        balanceLabel1.setBackground(new java.awt.Color(153, 0, 76));
        balanceLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        balanceLabel1.setForeground(new java.awt.Color(255, 255, 255));
        balanceLabel1.setText("CeditCard Balance");
        CheckPanel.add(balanceLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 150, 50));

        balanceTextField.setEditable(false);
        balanceTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceTextField1ActionPerformed(evt);
            }
        });
        CheckPanel.add(balanceTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 240, 30));

        jLabel1.setVisible(false);
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("E = Pervious num *10^(followed num)");
        CheckPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 280, -1));

        getContentPane().add(CheckPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 141, 487, 420));

        DepositPanel.setBackground(new java.awt.Color(0, 153, 102));
        DepositPanel.setVisible(false);
        DepositPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        DepositPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        depositionLabel.setBackground(new java.awt.Color(255, 255, 0));
        depositionLabel.setFont(new java.awt.Font("Yu Gothic", 1, 30)); // NOI18N
        depositionLabel.setForeground(new java.awt.Color(255, 255, 204));
        depositionLabel.setText("Deposition Data ");
        DepositPanel.add(depositionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 260, 70));

        depositButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        depositButton.setText("Deposit");
        depositButton.setToolTipText("");
        depositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButtonActionPerformed(evt);
            }
        });
        DepositPanel.add(depositButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 140, 50));

        amountOfMoneyLabel.setBackground(new java.awt.Color(153, 0, 76));
        amountOfMoneyLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        amountOfMoneyLabel.setForeground(new java.awt.Color(255, 255, 255));
        amountOfMoneyLabel.setText("Amount of money:");
        DepositPanel.add(amountOfMoneyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 200, 40));

        amountOfMoneyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountOfMoneyTextFieldActionPerformed(evt);
            }
        });
        amountOfMoneyTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                amountOfMoneyTextFieldKeyPressed(evt);
            }
        });
        DepositPanel.add(amountOfMoneyTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 170, 30));

        invalidLabel.setForeground(new java.awt.Color(255, 0, 0));
        invalidLabel.setText("x invalid Number");
        invalidLabel.setVisible(false);
        DepositPanel.add(invalidLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 120, 20));

        getContentPane().add(DepositPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 141, 487, 390));

        TransferPanel.setVisible(false);
        TransferPanel.setBackground(new java.awt.Color(0, 153, 102));
        TransferPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TransferPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tAmountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tAmountTextFieldActionPerformed(evt);
            }
        });
        tAmountTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tAmountTextFieldKeyPressed(evt);
            }
        });
        TransferPanel.add(tAmountTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 170, 30));

        tAmountLabel.setBackground(new java.awt.Color(153, 0, 76));
        tAmountLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        tAmountLabel.setForeground(new java.awt.Color(255, 255, 255));
        tAmountLabel.setText("Amount of money:");
        TransferPanel.add(tAmountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 200, 40));

        accountUsrNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountUsrNameTextFieldActionPerformed(evt);
            }
        });
        accountUsrNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                accountUsrNameTextFieldKeyPressed(evt);
            }
        });
        TransferPanel.add(accountUsrNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 170, 30));

        accountNameLabel.setBackground(new java.awt.Color(153, 0, 76));
        accountNameLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        accountNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        accountNameLabel.setText("Account user name");
        TransferPanel.add(accountNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 200, 40));

        transferDataLabel.setBackground(new java.awt.Color(255, 255, 0));
        transferDataLabel.setFont(new java.awt.Font("Yu Gothic", 1, 30)); // NOI18N
        transferDataLabel.setForeground(new java.awt.Color(255, 255, 204));
        transferDataLabel.setText("Transfer Data ");
        TransferPanel.add(transferDataLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 260, 70));

        transferButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        transferButton.setText("Transfer");
        transferButton.setToolTipText("");
        transferButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferButtonActionPerformed(evt);
            }
        });
        TransferPanel.add(transferButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 140, 50));

        invalidUsrName.setForeground(new java.awt.Color(255, 51, 51));
        invalidUsrName.setText("x Invalid User name");
        invalidUsrName.setVisible(false);
        TransferPanel.add(invalidUsrName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 120, -1));

        notEnoughLabel.setForeground(new java.awt.Color(255, 51, 51));
        notEnoughLabel.setVisible(false);
        notEnoughLabel.setText("x Not Enough Money");
        TransferPanel.add(notEnoughLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 120, -1));

        invalidNumberLabel1.setVisible(false);
        invalidNumberLabel1.setForeground(new java.awt.Color(255, 51, 51));
        invalidNumberLabel1.setText("x Invalid number");
        TransferPanel.add(invalidNumberLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 120, -1));

        invalidUsrName1.setVisible(false);
        invalidUsrName1.setForeground(new java.awt.Color(255, 51, 51));
        invalidUsrName1.setText("x Invalid,  It's yours!");
        invalidUsrName.setVisible(false);
        TransferPanel.add(invalidUsrName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 120, -1));

        getContentPane().add(TransferPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 141, 487, 390));

        WithdrawalPanel.setVisible(false);
        WithdrawalPanel.setBackground(new java.awt.Color(0, 153, 102));
        WithdrawalPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        WithdrawalPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        withdrawalDataLabel.setBackground(new java.awt.Color(255, 255, 0));
        withdrawalDataLabel.setFont(new java.awt.Font("Yu Gothic", 1, 30)); // NOI18N
        withdrawalDataLabel.setForeground(new java.awt.Color(255, 255, 204));
        withdrawalDataLabel.setText("Withdrawal Data ");
        WithdrawalPanel.add(withdrawalDataLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 260, 70));

        amountOfMoneyLabel2.setBackground(new java.awt.Color(153, 0, 76));
        amountOfMoneyLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        amountOfMoneyLabel2.setForeground(new java.awt.Color(255, 255, 255));
        amountOfMoneyLabel2.setText("Amount of money:");
        WithdrawalPanel.add(amountOfMoneyLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 200, 40));

        amountMoneyTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountMoneyTextField2ActionPerformed(evt);
            }
        });
        amountMoneyTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                amountMoneyTextField2KeyPressed(evt);
            }
        });
        WithdrawalPanel.add(amountMoneyTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 170, 30));

        invalidLabel5.setVisible(false);
        invalidLabel5.setForeground(new java.awt.Color(255, 0, 0));
        invalidLabel5.setText("x Not enough balance");
        invalidLabel.setVisible(false);
        WithdrawalPanel.add(invalidLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 130, 20));

        creditCardButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        creditCardButton.setText("Credit Card");
        creditCardButton.setToolTipText("");
        creditCardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditCardButtonActionPerformed(evt);
            }
        });
        WithdrawalPanel.add(creditCardButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 140, 50));

        withdrawelButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        withdrawelButton.setText("Withdraw");
        withdrawelButton.setToolTipText("");
        withdrawelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawelButtonActionPerformed(evt);
            }
        });
        WithdrawalPanel.add(withdrawelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 140, 50));

        invalidLabel4.setVisible(false);
        invalidLabel4.setForeground(new java.awt.Color(255, 0, 0));
        invalidLabel4.setText("x invalid Number");
        invalidLabel.setVisible(false);
        WithdrawalPanel.add(invalidLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 120, 20));

        wantToLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        wantToLabel.setForeground(new java.awt.Color(255, 255, 255));
        wantToLabel.setText("Want to Debt?");
        WithdrawalPanel.add(wantToLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        getContentPane().add(WithdrawalPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 141, 487, 390));

        CreditCardPanel.setBackground(new java.awt.Color(0, 153, 102));
        CreditCardPanel.setVisible(false);
        CreditCardPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        creditCardDataLabel.setBackground(new java.awt.Color(255, 255, 0));
        creditCardDataLabel.setFont(new java.awt.Font("Yu Gothic", 1, 30)); // NOI18N
        creditCardDataLabel.setForeground(new java.awt.Color(255, 255, 204));
        creditCardDataLabel.setText("Credit Card Data ");
        CreditCardPanel.add(creditCardDataLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 260, 70));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("Confirm");
        jButton6.setToolTipText("");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        CreditCardPanel.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 120, 40));

        dateLabel.setBackground(new java.awt.Color(153, 0, 76));
        dateLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel.setText("Date of debtion:");
        CreditCardPanel.add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 200, 40));

        amountOfMoneyTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountOfMoneyTextField5ActionPerformed(evt);
            }
        });
        amountOfMoneyTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                amountOfMoneyTextField5KeyPressed(evt);
            }
        });
        CreditCardPanel.add(amountOfMoneyTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 170, 30));

        amountOfMoneyLabel3.setBackground(new java.awt.Color(153, 0, 76));
        amountOfMoneyLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        amountOfMoneyLabel3.setForeground(new java.awt.Color(255, 255, 255));
        amountOfMoneyLabel3.setText("Amount of money:");
        CreditCardPanel.add(amountOfMoneyLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, 40));

        jDateChooser1.setMaxSelectableDate(Calendar.getInstance().getTime());
        jDateChooser1.setDateFormatString("\"dd MMM yyyy\"");
        CreditCardPanel.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 170, 30));

        invalidDateLabel.setVisible(false);
        invalidDateLabel.setForeground(new java.awt.Color(255, 0, 0));
        invalidDateLabel.setText("Please Enter the date");
        invalidLabel.setVisible(false);
        CreditCardPanel.add(invalidDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 130, 20));

        invalidnum1.setVisible(false);
        invalidnum1.setForeground(new java.awt.Color(255, 0, 0));
        invalidnum1.setText("x invalid Number");
        invalidLabel.setVisible(false);
        CreditCardPanel.add(invalidnum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 120, 20));

        invalidnum2.setVisible(false);
        invalidnum2.setForeground(new java.awt.Color(255, 0, 0));
        invalidnum2.setText("x You don't have enough credit card!");
        invalidLabel.setVisible(false);
        CreditCardPanel.add(invalidnum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 230, 20));

        getContentPane().add(CreditCardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 141, 487, 390));

        DonePanel.setVisible(false);
        DonePanel.setBackground(new java.awt.Color(0, 153, 102));
        DonePanel.setForeground(new java.awt.Color(255, 255, 204));
        DonePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 204));
        jLabel27.setText("is done Successfully!");
        DonePanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 340, 160));

        jLabel28.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 204));
        jLabel28.setText("The Operation ");
        DonePanel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 480, 160));

        getContentPane().add(DonePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 141, 487, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void operationsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operationsComboBoxActionPerformed
         JComboBox jComboBox1 = (JComboBox) evt.getSource();

                Object selected = jComboBox1.getSelectedItem();
                int z = DriverClass.x;   // z value express the rank of the account in the array
                if(selected.toString().equals("Check Status")){ 
                  
                    // the up coming code for displaying data
                   firstNameTextField.setText(DriverClass.arr[z].getfirstName());
                   lastNameTextField.setText(DriverClass.arr[z].getlastName());
                   String balance = Double. toString(DriverClass.arr[z].getBalance()); // Casting double Balance data type into String type
                   balanceTextField.setText(balance);
                   String creditCard = Double. toString(DriverClass.arr[z].getcreditcard());// Casting double creditcard data type into String type
                   balanceTextField1.setText(creditCard);
                   
                   if (DriverClass.arr[z] instanceof VIP)   // Check the Account Type and dispalying the tyoe accroding to object type
                       accountTypeTextField.setText("VIP");
                       else
                        accountTypeTextField.setText("Personal"); 
                   
                   
                    if (DriverClass.arr[z].getDateOfDebt() != null){    // test if user has withrad from credit card before or not by checking date attribute value
                        if (DriverClass.arr[z].checkStatus() == 0){  // if the user exceeded the days limit show label of (indebt)
                        indebtedLabel.setVisible(true);
                    }     
                    else   // if he doesn't exceeded the days limit and still has days, then, the days left  will be shown
                        indebtedLabel.setVisible(false); 
                    
                         String Days = String.valueOf(DriverClass.arr[z].checkStatus());
                         daysLeftTextField.setText(Days);   
                }
                    else { // if his date arttibute is null this means he has a full credit card 
                        indebtedLabel.setVisible(false);
                        daysLeftTextField.setText("Your Credit Card is already full!");
                    }
                    
                    if ( DriverClass.arr[z].getBalance() >= 10000000 )    // Label visibilty if the user limit exceeded the 10 M and starts to show him E symbol
                    jLabel1.setVisible(true);
                    else 
                   jLabel1.setVisible(false);
                        
                          
                
                   
                   
                  // this code is related to design of GUI  
                    CheckPanel.setVisible(true);
                    DepositPanel.setVisible(false);
                    TransferPanel.setVisible(false);
                    WithdrawalPanel.setVisible(false);
                    CreditCardPanel.setVisible(false);
                    invalidLabel.setVisible(false);
                    invalidUsrName.setVisible(false);
                    invalidDateLabel.setVisible(false);
                    amountOfMoneyTextField5.setText("");
                    notEnoughLabel.setVisible(false);
                    invalidLabel5.setVisible(false);
                    invalidLabel4.setVisible(false);
                    amountOfMoneyTextField.setText("");
                    amountMoneyTextField2.setText("");
                    accountUsrNameTextField.setText("");
                    tAmountTextField.setText("");
                    DonePanel.setVisible(false);
                }
                    
                else if(selected.toString().equals("Deposit")){  // GUI Design while going to another panel
                    
                    DepositPanel.setVisible(true);
                    CheckPanel.setVisible(false);
                     TransferPanel.setVisible(false);
                     WithdrawalPanel.setVisible(false);
                     CreditCardPanel.setVisible(false);
                     invalidLabel.setVisible(false);
                     invalidUsrName.setVisible(false);
                     notEnoughLabel.setVisible(false);
                     invalidLabel5.setVisible(false);
                     invalidLabel4.setVisible(false);
                     amountOfMoneyTextField.setText("");
                     amountMoneyTextField2.setText("");
                     accountUsrNameTextField.setText("");
                     tAmountTextField.setText("");
                     DonePanel.setVisible(false);
                }
                    
                    
                else if(selected.toString().equals("Transfer")){// GUI Design while going to another panel
                    DepositPanel.setVisible(false);
                    CheckPanel.setVisible(false);
                    TransferPanel.setVisible(true);
                    WithdrawalPanel.setVisible(false);
                    CreditCardPanel.setVisible(false);
                    invalidLabel.setVisible(false);
                    invalidUsrName.setVisible(false);
                    notEnoughLabel.setVisible(false);
                    invalidLabel5.setVisible(false);
                    invalidLabel4.setVisible(false);
                    invalidDateLabel.setVisible(false);
                    amountOfMoneyTextField5.setText("");
                    amountOfMoneyTextField.setText("");
                    amountMoneyTextField2.setText("");
                    accountUsrNameTextField.setText("");
                    tAmountTextField.setText("");
                    DonePanel.setVisible(false);
                }
                else if(selected.toString().equals("Withdraw")){// GUI Design while going to another panel
                    DepositPanel.setVisible(false);
                    CheckPanel.setVisible(false);
                    TransferPanel.setVisible(false);
                    WithdrawalPanel.setVisible(true);
                    CreditCardPanel.setVisible(false);
                    invalidLabel.setVisible(false);
                    invalidUsrName.setVisible(false);
                    notEnoughLabel.setVisible(false);
                    invalidLabel5.setVisible(false);
                    invalidLabel4.setVisible(false);
                     invalidDateLabel.setVisible(false);
                     amountOfMoneyTextField5.setText("");
                    amountOfMoneyTextField.setText("");
                    amountMoneyTextField2.setText("");
                    accountUsrNameTextField.setText("");
                    tAmountTextField.setText("");
                    DonePanel.setVisible(false);
                }
                else if (selected.toString().equals("Log out")){  // Goes to the login panel to check another accounts by logging out from the existing one
                    CheckPanel.setVisible(false);
                    new NewJFrame().setVisible(true); 
                    dispose();
                    DepositPanel.setVisible(false);
                    TransferPanel.setVisible(false);
                    WithdrawalPanel.setVisible(false);
                    CreditCardPanel.setVisible(false);
                    invalidLabel.setVisible(false);
                    invalidUsrName.setVisible(false);
                    invalidDateLabel.setVisible(false);
                    amountOfMoneyTextField5.setText("");
                    notEnoughLabel.setVisible(false);
                    invalidLabel5.setVisible(false);
                    invalidLabel4.setVisible(false);
                    amountOfMoneyTextField.setText("");
                    amountMoneyTextField2.setText("");
                    accountUsrNameTextField.setText("");
                    tAmountTextField.setText("");
                    DonePanel.setVisible(false);
                }
                   
                    
    }//GEN-LAST:event_operationsComboBoxActionPerformed

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldActionPerformed

    private void lastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTextFieldActionPerformed

    private void balanceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balanceTextFieldActionPerformed

    private void daysLeftTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daysLeftTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daysLeftTextFieldActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        CheckPanel.setVisible(false);
    }//GEN-LAST:event_doneButtonActionPerformed

    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButtonActionPerformed
        String n = amountOfMoneyTextField.getText();
        try{  // Handelling Exception of enetering non double data type in the textfiled of amount of money
            double i = Double.parseDouble(n);
           
       }
       catch (NumberFormatException ex){
           invalidLabel.setVisible(true);
           amountOfMoneyTextField.setText("-1");
           
       }
       double i = Double.parseDouble(amountOfMoneyTextField.getText());
       if (i < 0 ){   //  Check if user has enetred a valid number or not
           invalidLabel.setVisible(true);
           amountOfMoneyTextField.setText(n);
       }
       else {   // Usage of deposit method if all data is valid 
           int z = DriverClass.x;
           DriverClass.arr[z].deposit(i);
           amountOfMoneyTextField.setText("");
           invalidLabel.setVisible(false);
           DepositPanel.setEnabled(false);
           DepositPanel.setVisible(false);
           DonePanel.setVisible(true); 
           
        
       }
    }//GEN-LAST:event_depositButtonActionPerformed

    private void amountOfMoneyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountOfMoneyTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountOfMoneyTextFieldActionPerformed

    private void amountOfMoneyTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountOfMoneyTextFieldKeyPressed
       

    }//GEN-LAST:event_amountOfMoneyTextFieldKeyPressed

    private void tAmountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tAmountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tAmountTextFieldActionPerformed

    private void tAmountTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tAmountTextFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tAmountTextFieldKeyPressed

    private void accountUsrNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountUsrNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountUsrNameTextFieldActionPerformed

    private void accountUsrNameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountUsrNameTextFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountUsrNameTextFieldKeyPressed

    private void transferButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferButtonActionPerformed
          String n = tAmountTextField.getText();
          int userFrom = DriverClass.x;  // refers to account rank in the array
          Boolean Found =DriverClass.isFoundUserName(accountUsrNameTextField.getText());
          int userTo = DriverClass.y;  //refers to account to transfer to rank in the array
        
          
          if ( Found ) // This tests if username is found or not
              invalidUsrName.setVisible(false);
          else
              invalidUsrName.setVisible(true);
          
          
          if (userFrom == userTo)  // this tests if user enters his username or not
              invalidUsrName1.setVisible(true);
          else 
              invalidUsrName1.setVisible(false);
          
          
        try{  // Handelling Exception of enetering not double number in the amounttextbox
            double i = Double.parseDouble(n);
           
       }
       catch (NumberFormatException ex){
           notEnoughLabel.setVisible(true);
           tAmountTextField.setText("-1");
           
       }
        
        
       double i = Double.parseDouble(tAmountTextField.getText());
       
        if (i>0){   // Test if the money amount is negative or not (if the users don't enter numbers and put letters instead)
           invalidNumberLabel1.setVisible(false);
        }
       else  {
           invalidNumberLabel1.setVisible(true);
           tAmountTextField.setText(n);
           notEnoughLabel.setVisible(false);
       }
     
       
       if (DriverClass.arr[userFrom].getBalance() < i){  // Tests if the user balance is enough for the transfer
           notEnoughLabel.setVisible(true);
       }       
       else 
           notEnoughLabel.setVisible(false);
           
       
     if (i > 0 && Found &DriverClass.arr[userFrom].getBalance() >  i &&( userFrom != userTo)){   // if all data is accepted the operation is done
           DriverClass.arr[userFrom].transfer(i,arr[userTo]);
           tAmountTextField.setText("");
           notEnoughLabel.setVisible(false);
           TransferPanel.setEnabled(false);
           DonePanel.setVisible(true);
           TransferPanel.setVisible(false);
           DonePanel.setVisible(true);
          
           
           
          
       }
      
                                       
    }//GEN-LAST:event_transferButtonActionPerformed

    private void amountMoneyTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountMoneyTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountMoneyTextField2ActionPerformed

    private void amountMoneyTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountMoneyTextField2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountMoneyTextField2KeyPressed

    private void creditCardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditCardButtonActionPerformed
        // Switching from withdraw panel to credit card panel
        CreditCardPanel.setVisible(true);
        WithdrawalPanel.setVisible(false);
    }//GEN-LAST:event_creditCardButtonActionPerformed

    private void withdrawelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawelButtonActionPerformed
        String amount = amountMoneyTextField2.getText();
        int z = DriverClass.x;  // z value express the rank of the account in the array
      
        double i;
        try{  // Handelling Exception of enetering non double data type in the textfiled of amount of money
             i = Double.parseDouble(amount);
           
       }
       catch (NumberFormatException ex){
           invalidLabel4.setVisible(true);
           amountMoneyTextField2.setText("-1");
       }
         i = Double.parseDouble(amountMoneyTextField2.getText());
         
         // Check same Validation in the deposti button
       if (i < 0 ){ 
           invalidLabel4.setVisible(true);
            invalidLabel5.setVisible(false);
           amountMoneyTextField2.setText(amount);
       }
       else if (DriverClass.arr[z].getBalance() < i){
           invalidLabel5.setVisible(true);
           invalidLabel4.setVisible(false);
       }
       else {
             DriverClass.arr[z].withdraw(i);
           WithdrawalPanel.setEnabled(false);
           amountMoneyTextField2.setText(" ");
           invalidLabel4.setVisible(false);
           WithdrawalPanel.setVisible(false);
           DonePanel.setVisible(true);
           invalidLabel5.setVisible(false);
           
       
       }
           
    }//GEN-LAST:event_withdrawelButtonActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     Date date = jDateChooser1.getDate();
     int z = DriverClass.x; // z value express the rank of the account in the array
     
     // Date Part
     if (DriverClass.arr[z].getDateOfDebt() == null  || DriverClass.arr[z].getDateOfDebt().compareTo(date) > 0 ){  
         // Checks if the entered date is already before the another one or if it's first time to eneter a date 
         // If any one is yes the new date is saved to the date attribute in the account
         DriverClass.arr[z].setDateOfDebt(date);
     }
    // Momey Amont Part
     String amount = amountOfMoneyTextField5.getText();
        try{ // Handelling Exception of enetering non double data type in the textfiled of amount of money
            double i = Double.parseDouble(amount);
           
       }
       catch (NumberFormatException ex){
           invalidnum1.setVisible(true);
           amountOfMoneyTextField5.setText("-1");
       }
        double i = Double.parseDouble(amountOfMoneyTextField5.getText());
       if (i < 0 ){
           invalidnum1.setVisible(true);
           amountOfMoneyTextField5.setText(amount);
           invalidnum2.setVisible(false);
       }
        if (i > 0 ){
           invalidnum1.setVisible(false);
           if (DriverClass.arr[z].getcreditcard() > i){
               invalidnum2.setVisible(false);
           }
           else 
               invalidnum2.setVisible(true);
        }
        
           // Labels Visibity according to data input
        if(date==null)
           invalidDateLabel.setVisible(true);
        if(date!= null)
             invalidDateLabel.setVisible(false);
        
       // if all data is validated successfully opeartion is done
         if(date!= null && i > 0 && DriverClass.arr[z].getcreditcard() >= i)
       {
         DriverClass.arr[z].creditWithdraw(i);
         jDateChooser1.setDate(null);
        invalidnum1.setVisible(false);   
        WithdrawalPanel.setVisible(false);
        CreditCardPanel.setVisible(false);
        amountOfMoneyTextField5.setText("");
        invalidDateLabel.setVisible(false);
        DonePanel.setVisible(true);
        invalidnum2.setVisible(false);
       }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void amountOfMoneyTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountOfMoneyTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountOfMoneyTextField5ActionPerformed

    private void amountOfMoneyTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountOfMoneyTextField5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountOfMoneyTextField5KeyPressed

    private void accountTypeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountTypeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountTypeTextFieldActionPerformed

    private void balanceTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balanceTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Operation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CheckPanel;
    private javax.swing.JPanel CreditCardPanel;
    private javax.swing.JPanel DepositPanel;
    private javax.swing.JPanel DonePanel;
    private javax.swing.JPanel TransferPanel;
    private javax.swing.JPanel WithdrawalPanel;
    private javax.swing.JLabel accountNameLabel;
    private javax.swing.JLabel accountTypeLabel;
    private javax.swing.JTextField accountTypeTextField;
    private javax.swing.JTextField accountUsrNameTextField;
    private javax.swing.JTextField amountMoneyTextField2;
    private javax.swing.JLabel amountOfMoneyLabel;
    private javax.swing.JLabel amountOfMoneyLabel2;
    private javax.swing.JLabel amountOfMoneyLabel3;
    private javax.swing.JTextField amountOfMoneyTextField;
    private javax.swing.JTextField amountOfMoneyTextField5;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JLabel balanceLabel1;
    private javax.swing.JTextField balanceTextField;
    private javax.swing.JTextField balanceTextField1;
    private javax.swing.JButton creditCardButton;
    private javax.swing.JLabel creditCardDataLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel daysLeftLabel;
    private javax.swing.JTextField daysLeftTextField;
    private javax.swing.JButton depositButton;
    private javax.swing.JLabel depositionLabel;
    private javax.swing.JButton doneButton;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel indebtedLabel;
    private javax.swing.JLabel invalidDateLabel;
    private javax.swing.JLabel invalidLabel;
    private javax.swing.JLabel invalidLabel4;
    private javax.swing.JLabel invalidLabel5;
    private javax.swing.JLabel invalidNumberLabel1;
    private javax.swing.JLabel invalidUsrName;
    private javax.swing.JLabel invalidUsrName1;
    private javax.swing.JLabel invalidnum1;
    private javax.swing.JLabel invalidnum2;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel notEnoughLabel;
    private javax.swing.JComboBox<String> operationsComboBox;
    private javax.swing.JLabel operationsLabel;
    private javax.swing.JLabel operationsLabel1;
    private javax.swing.JPanel operationsPanel;
    private javax.swing.JLabel tAmountLabel;
    private javax.swing.JTextField tAmountTextField;
    private javax.swing.JButton transferButton;
    private javax.swing.JLabel transferDataLabel;
    private javax.swing.JLabel wantToLabel;
    private javax.swing.JLabel withdrawalDataLabel;
    private javax.swing.JButton withdrawelButton;
    // End of variables declaration//GEN-END:variables
}
