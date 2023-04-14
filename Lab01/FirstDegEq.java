import javax.swing.JOptionPane;
public class FirstDegEq {
    public static void main(String[] args){
        String strA11, strA12,strA21, strA22, strB1, strB2;
        strA11 = JOptionPane.showInputDialog(null, "Please input a11 number","Input number",JOptionPane.INFORMATION_MESSAGE);
        strA12 = JOptionPane.showInputDialog(null, "Please input a12 number","Input number",JOptionPane.INFORMATION_MESSAGE);
        strB1 = JOptionPane.showInputDialog(null, "Please input b1 number","Input number",JOptionPane.INFORMATION_MESSAGE);
        strA21 = JOptionPane.showInputDialog(null, "Please input a21 number","Input number",JOptionPane.INFORMATION_MESSAGE);
        strA22 = JOptionPane.showInputDialog(null, "Please input a22 number","Input number",JOptionPane.INFORMATION_MESSAGE);
        strB2 = JOptionPane.showInputDialog(null, "Please input b2 number","Input number",JOptionPane.INFORMATION_MESSAGE);
        double a11,a12,a21,a22,b1,b2,d,d1,d2;
        a11 = Double.parseDouble(strA11);
        a12 = Double.parseDouble(strA12);
        b1 = Double.parseDouble(strB1);
        a21 = Double.parseDouble(strA21);
        a22 = Double.parseDouble(strA22);
        b2 = Double.parseDouble(strB2);
        d = a11*a22 - a21*a12;
        d1 = b1*a22 - b2*a12;
        d2 = a11*b2 - a21*b1;
        JOptionPane.showMessageDialog(null, d1/d, "X1 =", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, d2/d, "X2 =", JOptionPane.INFORMATION_MESSAGE);
        
    }
}