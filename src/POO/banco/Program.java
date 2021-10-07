
package banco;

import java.util.Locale;
import javax.swing.JOptionPane;


public class Program {


    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Holder holder;
        
        String account = JOptionPane.showInputDialog(null,"Enter account number: ");
        String name = JOptionPane.showInputDialog(null,"Enter account holder: ");
        String option = JOptionPane.showInputDialog(null,"Is there an initial deposit(y/s)?");
        
        if(option.equals("y") || option.equals("Y")){
            double balance = Double.parseDouble(JOptionPane.showInputDialog("Enter initial deposit value: "));
            holder = new Holder(account, name, balance);
        }else{
            holder = new Holder(account, name);
        }
    
        JOptionPane.showMessageDialog(null,"\nAccout data:\n" + holder.toString());
        double deposit = Double.parseDouble(JOptionPane.showInputDialog("Enter a deposit value: "));
        holder.depositValue(deposit);
        JOptionPane.showMessageDialog(null, "\nUpdated accout data:\n" + holder.toString());
        double withdraw = Double.parseDouble(JOptionPane.showInputDialog("Enter a withdraw value: "));
        holder.whithdraw(withdraw);
        JOptionPane.showMessageDialog(null, "\nUpdated accout data:\n" + holder.toString());
    }    
}
