package Amazon;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JPanel {
	public Home() {
		add(Buttons.TodaysDeals());
		add(Buttons.BestSellers());
		add(Buttons.FindaGift());
		add(Buttons.CustomerService());
		add(Buttons.Registry());
		add(Buttons.NewReleases());
		add(Buttons.Books());
	}
}
