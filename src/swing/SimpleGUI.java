package swing;

import javax.swing.*;
import java.awt.*;

public class SimpleGUI extends JFrame
{
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JLabel label1 = new JLabel("Вопрос");
    private JRadioButton radio1 = new JRadioButton("Select this");
    private JRadioButton radio2 = new JRadioButton("Select that");
    private JCheckBox check = new JCheckBox("Check", false);


    public SimpleGUI()
    {
        super("Тестирование");
        this.setBounds(200, 200, 500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 1, 2, 2));
        container.add(label1);
        container.add(input);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        container.add(radio1);

        radio1.setSelected(true);
        container.add(radio2);
        container.add(check);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }


}
