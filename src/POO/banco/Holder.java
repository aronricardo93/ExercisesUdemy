
package banco;


public class Holder {

    private String account;
    private String name;
    private double balance;
    
    public Holder(){
    }
    
    public Holder(String account, String name, double balance){
        this.account = account;
        this.name = name;
        this.balance = balance;
    }
    
    public Holder(String account, String name){
        this.account = account;
        this.name = name;
        this.balance = 0.0;
    }
    
    public String getAccount(){
        return this.account;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void depositValue(double deposit){
        this.balance = getBalance() + deposit;
    }

    public void whithdraw(double whithdraw){
        this.balance = getBalance() - whithdraw - 5.00;
    }
    
    @Override
    public String toString() {
        return "Account " + account + ", Holder: " + name + ", Balance: $ " + String.format("%.2f",balance);
    }
    
    
    
}
