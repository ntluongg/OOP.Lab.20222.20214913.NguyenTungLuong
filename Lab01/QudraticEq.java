import javax.swing.JOptionPane;
public class QudraticEq {

    public static void main(String[] args){
        String strA, strB, strC;
        strA = JOptionPane.showInputDialog(null, "Please input number","Input A number",JOptionPane.INFORMATION_MESSAGE);
        strB = JOptionPane.showInputDialog(null, "Please input number","Input B number",JOptionPane.INFORMATION_MESSAGE);
        strC = JOptionPane.showInputDialog(null, "Please input number","Input C number",JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        double c = Double.parseDouble(strC);
        if (a == 0){
            JOptionPane.showMessageDialog(null, -(c/b), "Show result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            double delta = b*b - 4*a*c;
            if (delta == 0){
                JOptionPane.showMessageDialog(null, -(b/(2*a)), "double root x=", JOptionPane.INFORMATION_MESSAGE);
            } else if (delta >0){
                JOptionPane.showMessageDialog(null, (-b + Math.sqrt(delta))/(2*a), "x1 =", JOptionPane.INFORMATION_MESSAGE);   
                JOptionPane.showMessageDialog(null, (-b - Math.sqrt(delta))/(2*a), "x2 =", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "complex root", "complex root", JOptionPane.INFORMATION_MESSAGE);
            }


        }
    }
}
