package default_package;

import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String[] args){
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
        JOptionPane.showMessageDialog(null, "You've chosen: " + (option==JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
        /* to custom buttoms
        Object[] options = {"I do", "I don't"};
        int option = JOptionPane.showOptionDialog(frame, "Do you want to change to the first class ticket?", "Confirm message", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        */
    }
}
