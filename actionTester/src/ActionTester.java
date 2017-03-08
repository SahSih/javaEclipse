import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ActionTester
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      final int FIELD_WIDTH = 20;
      final JTextField textField = new JTextField(FIELD_WIDTH);
      textField.setText("Click a button!");

      JButton helloButton = new JButton("Say Hello");

      helloButton.addActionListener(event ->
         textField.setText("Goodbye, World!"));

      JButton goodbyeButton = new JButton("Say Goodbye");
      
      //use enable and disable to control the button
      //counter set as an array, it's a reference
      goodbyeButton.addActionListener(event ->
         textField.setText("Hello, World!"));

      frame.setLayout(new FlowLayout());

      frame.add(helloButton);
      frame.add(goodbyeButton);
      frame.add(textField);

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
   }
}
