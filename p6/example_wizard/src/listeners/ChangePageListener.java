package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import wizard.Wizard;

public class ChangePageListener implements ActionListener {
	private Wizard window;
	
	public ChangePageListener(Wizard window) {
		this.window = window;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// button 1
		if (arg0.getActionCommand().equals("button1")) {
			if (window.text1().equals("")) {
				JOptionPane.showMessageDialog(window, "The class name cannot be empty");
				return;
			}
			if (window.check3()) 
				window.showPage(Wizard.PAGE_3);
			else 
				window.showPage(Wizard.PAGE_2);
		}
		
		// button 3
		else if (arg0.getActionCommand().equals("button3")) {
			window.showPage(Wizard.PAGE_3);
		}
		
		// button 5
		else if (arg0.getActionCommand().equals("button5")) {
			window.text1("");
			window.check1(false);
			window.check2(false);
			window.check3(true); 
			window.showPage(Wizard.PAGE_1);		
		}
	}
}