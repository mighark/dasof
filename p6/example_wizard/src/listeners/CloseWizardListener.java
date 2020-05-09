package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class CloseWizardListener implements ActionListener {
	private JFrame window;
	
	public CloseWizardListener(JFrame window) {
		this.window = window;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		window.setVisible(false);
		window.dispose();
	}
}