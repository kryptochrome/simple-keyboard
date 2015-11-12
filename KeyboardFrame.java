import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class KeyboardFrame extends JFrame{

    JButton testButton = new JButton("Test");    
    FlowLayout myLayout = new FlowLayout();
    
    public void fillMyPane(final Container pane) {
        final JPanel myPanel  = new JPanel();
        myPanel.setLayout(myLayout);
        myLayout.setAlignment(FlowLayout.TRAILING);
        JPanel controls = new JPanel();
        controls.setLayout(new FlowLayout());
        
        myPanel.add(testButton);

        
        //Process the Apply component orientation button press
        testButton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			System.out.println("Button Pressed"+e);
		    
		    //update the experiment layout
		    myPanel.validate();
		    myPanel.repaint();
		}
	    });
        pane.add(myPanel, BorderLayout.CENTER);
    }




    public KeyboardFrame(String name) {
        super(name);
    }

    private static void showFrame() {
        KeyboardFrame frame = new KeyboardFrame("FlowLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.fillMyPane(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
	javax.swing.SwingUtilities.invokeLater(new Runnable() {
		public void run() {
		    showFrame();
		}
	    });
    }
}
