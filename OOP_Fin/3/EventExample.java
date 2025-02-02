/*
 * Event Triggering in Java means an action occurs when a user interacts with the GUI,
 * such as clicking a button, typing in a textbox, etc.
 */


import javax.swing.*;
import java.awt.event.*;

public class EventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Example");
        JButton button = new JButton("Click Me");

        button.setBounds(100, 100, 120, 40);

        // Adding ActionListener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        frame.add(button);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

/*How It Works?

    User clicks the button → actionPerformed() method runs.
    Triggers an event → Displays a pop-up with "Button Clicked!".
    Uses ActionListener → Detects and handles the event.

Importance of Event Triggering

✅ Interactive UI: Users can interact dynamically.
✅ Efficient Handling: Only triggers when necessary, reducing resource usage.
✅ Better User Experience: Provides instant feedback on user actions. */