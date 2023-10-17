import javax.swing.*;

public class LabSheet1_4MyFirstFrame {
    public static void main(String[] args) {
        // Create a JFrame and set its title
        JFrame frame = new JFrame("My First Frame");

        // Set the size of the frame (300 pixels wide and 200 pixels high)
        frame.setSize(300, 200);

        // Position the frame (50 pixels from the top, 100 pixels from the left)
        frame.setLocation(50, 50);

        // Set default close operation to exit the application when the frame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}

