import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String details;
	private JLabel statusbar;

	public GUI() {
		super("tutle");

		statusbar = new JLabel("This is default");
		add(statusbar, BorderLayout.SOUTH);
		addMouseListener(new MouseClass());
	}

	private class MouseClass extends MouseAdapter {
		public void mouseClicked(MouseEvent event) {
			details = String.format("You clicked %d", event.getClickCount());
			if (event.isMetaDown())
				details += "With the right mouse button";
			else if (event.isAltDown())
				details += "with center mouse button";
			else
				details += "with left mouse button";

			statusbar.setText(details);
		}
	}

}
