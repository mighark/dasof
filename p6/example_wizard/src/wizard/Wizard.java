package wizard;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import listeners.ChangePageListener;
import listeners.CloseWizardListener;

public class Wizard extends JFrame {
	public static final String PAGE_1 = "Page 1";
	public static final String PAGE_2 = "Page 2";
	public static final String PAGE_3 = "Page 3";
	
	private JPanel wizard = new JPanel();
	private CardLayout layout = new CardLayout();
	private JTextField text1, text2;
	private JCheckBox check1, check2, check3, check4, check5, check6;
	
	public boolean check1() { return check1.isSelected(); }
	public boolean check2() { return check2.isSelected(); }
	public boolean check3() { return check3.isSelected(); }
	public boolean check4() { return check4.isSelected(); }
	public boolean check5() { return check5.isSelected(); }
	public boolean check6() { return check6.isSelected(); }
	public void check1(boolean v) { check1.setSelected(v); }
	public void check2(boolean v) { check2.setSelected(v); }
	public void check3(boolean v) { check3.setSelected(v); }
	public void check4(boolean v) { check4.setSelected(v); }
	public void check5(boolean v) { check5.setSelected(v); }
	public void check6(boolean v) { check6.setSelected(v); }
	
	public String text1() { return text1.getText(); }
	public String text2() { return text2.getText(); }
	public void text1(String v) { text1.setText(v); }
	public void text2(String v) { text2.setText(v); }
	
	public Wizard () {
		super ("New Java Class");
		
		JPanel page, fields, buttons;
		GridBagConstraints c = new GridBagConstraints();		
		c.ipadx = 10;
		c.anchor = GridBagConstraints.WEST;
		
		// panel containing all pages
		wizard = new JPanel(layout);
		
		// page of wizard ....................................................
		
		// fields		
		fields = new JPanel(new GridBagLayout());
		JLabel label1 = new JLabel("Class name");
		c.gridx = 0;
		c.gridy = 0;	
		fields.add(label1, c);
		text1  = new JTextField(10);
		c.gridx = 1;
		c.gridy = 0;		
		fields.add(text1, c);
		JLabel label2 = new JLabel("abstract");
		c.gridx = 0;
		c.gridy = 2;	
		fields.add(label2, c);
		check1 = new JCheckBox();
		c.gridx = 1;
		c.gridy = 2;	
		fields.add(check1, c);
		JLabel label3 = new JLabel("final");
		c.gridx = 0;
		c.gridy = 3;	
		fields.add(label3, c);
		check2  = new JCheckBox();
		c.gridx = 1;
		c.gridy = 3;	
		fields.add(check2, c);
		JLabel label4 = new JLabel("default package");
		c.gridx = 0;
		c.gridy = 4;	
		fields.add(label4, c);
		check3  = new JCheckBox();
		check3.setSelected(true); // to select the checkbox
		c.gridx = 1;
		c.gridy = 4;	
		fields.add(check3, c);			
		
		// buttons
		buttons = new JPanel();		
		JButton button1 = new JButton("Next");
		button1.setActionCommand("button1");
		button1.addActionListener(new ChangePageListener(this));
		buttons.add(button1);
		JButton button2 = new JButton("Cancel");
		button2.addActionListener(new CloseWizardListener(this));
		buttons.add(button2);
		
		// adding page to wizard
		page = new JPanel(new BorderLayout());
		page.add(fields,  BorderLayout.CENTER);
		page.add(buttons, BorderLayout.SOUTH);
		wizard.add(page, PAGE_1);
		
		// page of wizard ....................................................
		
		// fields
		fields = new JPanel(new GridBagLayout());
		JLabel label5 = new JLabel("Package name");
		c.gridx = 0; 
		c.gridy = 0; 
		fields.add(label5, c);
		text2 = new JTextField(10);
		c.gridx = 1; 
		c.gridy = 0; 
		fields.add(text2, c);
		
		// buttons
		buttons = new JPanel();		
		JButton button3  = new JButton("Next");
		button3.setActionCommand("button3");
		button3.addActionListener(new ChangePageListener(this));
		buttons.add(button3);
		JButton button4  = new JButton("Cancel");
		button4.addActionListener(new CloseWizardListener(this));
		buttons.add(button4);
		
		// adding page to wizard
		page = new JPanel(new BorderLayout());
		page.add(fields,   BorderLayout.CENTER);
		page.add(buttons, BorderLayout.SOUTH);
		wizard.add(page, PAGE_2);
		
		// page of wizard ....................................................
		
		// fields
		fields = new JPanel(new GridBagLayout());
		JLabel label6 = new JLabel("create main");
		c.gridx = 0; 
		c.gridy = 0; 
		fields.add(label6, c);
		check4  = new JCheckBox();
		c.gridx = 1; 
		c.gridy = 0; 
		fields.add(check4, c);
		JLabel label7 = new JLabel("create constructor");
		c.gridx = 0; 
		c.gridy = 1; 
		fields.add(label7, c);
		check5  = new JCheckBox();
		c.gridx = 1; 
		c.gridy = 1; 
		fields.add(check5, c);
		JLabel label8 = new JLabel("create comments");
		c.gridx = 0; 
		c.gridy = 2; 
		fields.add(label8, c);
		check6  = new JCheckBox();
		c.gridx = 1; 
		c.gridy = 2; 
		fields.add(check6, c);
		
		// buttons
		buttons = new JPanel();		
		JButton button5  = new JButton("New class");
		button5.setActionCommand("button5");
		button5.addActionListener(new ChangePageListener(this));
		buttons.add(button5);
		JButton button6 = new JButton("Finish");
		button6.addActionListener(new CloseWizardListener(this));
		buttons.add(button6);
		JButton button7 = new JButton("Cancel");
		button7.addActionListener(new CloseWizardListener(this));
		buttons.add(button7);		
		
		// adding page to wizard
		page    = new JPanel(new BorderLayout());
		page.add(fields, BorderLayout.CENTER);
		page.add(buttons, BorderLayout.SOUTH);
		wizard.add(page, PAGE_3);
		
		// add panel to window
		getContentPane().add(wizard);
	}
	
	/**
	 * show wizard
	 */
	public void showWizard() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}

	/**
	 * show page of wizard
	 */
	public void showPage(String page) {
		layout.show(wizard, page);
	}
}