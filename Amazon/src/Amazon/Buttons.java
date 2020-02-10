package Amazon;

import java.awt.Component;

import javax.swing.JButton;

public class Buttons {
	public static Component TodaysDeals() {
		JButton TodaysDeals = new JButton("Today's Deals");
		TodaysDeals.setOpaque(true);
		TodaysDeals.setBorderPainted(false);
		TodaysDeals.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				TodaysDeals.setBorderPainted(true);
			}
			
			public void mouseExited(java.awt.event.MouseEvent evt) {
				TodaysDeals.setBorderPainted(false);
			}
		});
		return TodaysDeals;
	}
	
	public static Component FindaGift() {
		JButton FindaGift = new JButton("Find a Gift");
		FindaGift.setOpaque(true);
		FindaGift.setBorderPainted(false);
		FindaGift.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				FindaGift.setBorderPainted(true);
			}
			
			public void mouseExited(java.awt.event.MouseEvent evt) {
				FindaGift.setBorderPainted(false);
			}
		});
		return FindaGift;
	}
	
	public static Component CustomerService() {
		JButton CustomerService = new JButton("Customer Service");
		CustomerService.setOpaque(true);
		CustomerService.setBorderPainted(false);
		CustomerService.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				CustomerService.setBorderPainted(true);
			}
			
			public void mouseExited(java.awt.event.MouseEvent evt) {
				CustomerService.setBorderPainted(false);
			}
		});
		return CustomerService;
	}
	
	public static Component Registry() {
		JButton Registry = new JButton("Registry");
		Registry.setOpaque(true);
		Registry.setBorderPainted(false);
		Registry.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				Registry.setBorderPainted(true);
			}
			
			public void mouseExited(java.awt.event.MouseEvent evt) {
				Registry.setBorderPainted(false);
			}
		});
		return Registry;
	}
	
	public static Component NewReleases() {
		JButton NewReleases = new JButton("New Releases");
		NewReleases.setOpaque(true);
		NewReleases.setBorderPainted(false);
		NewReleases.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				NewReleases.setBorderPainted(true);
			}
			
			public void mouseExited(java.awt.event.MouseEvent evt) {
				NewReleases.setBorderPainted(false);
			}
		});
		return NewReleases;
	}
	
	public static Component Books() {
		JButton Books = new JButton("Books");
		Books.setOpaque(true);
		Books.setBorderPainted(false);
		Books.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				Books.setBorderPainted(true);
			}
			
			public void mouseExited(java.awt.event.MouseEvent evt) {
				Books.setBorderPainted(false);
			}
		});
		return Books;
	}

	public static Component BestSellers() {
		JButton BestSellers = new JButton("Best Seller");
		BestSellers.setOpaque(true);
		BestSellers.setBorderPainted(false);
		BestSellers.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				BestSellers.setBorderPainted(true);
			}
			
			public void mouseExited(java.awt.event.MouseEvent evt) {
				BestSellers.setBorderPainted(false);
			}
		});
		return BestSellers;
	}
}
