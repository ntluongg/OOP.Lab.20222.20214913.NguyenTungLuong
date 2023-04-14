import javax.swing.JOptionPane;
public class TwoNumber {

    public static void main(String[] args){
        String strNum1, strNum2, strOption;
        strNum1 = JOptionPane.showInputDialog(null, "Please input first number","Input first number",JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input second number","Input second number",JOptionPane.INFORMATION_MESSAGE);
        strOption = JOptionPane.showInputDialog(null, "Please input your option","Input calculate option",JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        switch (strOption){
            case "sum":
                JOptionPane.showMessageDialog(null, num1+num2, "Show result", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "difference":
                JOptionPane.showMessageDialog(null, num1-num2, "Show result", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "product":
                JOptionPane.showMessageDialog(null, num1*num2, "Show result", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "quotient":
                JOptionPane.showMessageDialog(null, num1/num2, "Show result", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
}
