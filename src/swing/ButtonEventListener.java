package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEventListener implements ActionListener
{
    private JLabel labelPic=new JLabel();
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JLabel label1 = new JLabel("Вопрос");
    private JRadioButton radio1 = new JRadioButton("Select this");
    private JRadioButton radio2 = new JRadioButton("Select that");
    private JCheckBox check = new JCheckBox("Check", false);

    public void actionPerformed(ActionEvent e)
    {
        String message = "";
        message += "Button was pressed\n";
        message += "Text is " + input.getText() + "\n";
        message += (radio1.isSelected() ? "Radio #1" : "Radio #2")
                + " is selected\n";
        message += "CheckBox is " + ((check.isSelected())
                ? "checked" : "unchecked");
        JOptionPane.showMessageDialog(null,
                message,
                "Output",
                JOptionPane.PLAIN_MESSAGE);

        //String s="swing/pictures/pic1.jpg";
       //ImageIcon img =new ImageIcon("swing/pictures/pic1.jpg");

    }

}

