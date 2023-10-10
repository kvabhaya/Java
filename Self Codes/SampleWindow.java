/* Sample Program: Displaying a Window
File: SampleWindow.java */
import javax.swing.*;
class SampleWindow {
    public static void main(String[] args) {
        JFrame myWindow;
        myWindow = new JFrame();
        myWindow.setSize(300, 200);
        myWindow.setTitle("My Window");
        myWindow.setVisible(true); //false-Not Showing the Window
    }
}
