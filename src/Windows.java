import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Windows extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Windows(){
		this.setTitle("ShinyGest");
	    this.setSize(1000, 1000);
	    this.setLocationRelativeTo(null);               
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Color FondUni = new Color(179, 203, 242);
	    this.setBackground(FondUni);
	    this.setContentPane(new Style());
	    this.setVisible(true);
	    
	}
}

class Style extends JPanel{
	private Bouton newPoke= new Bouton("Ajouter un nouveau pokémon","image/fond_btn2.png");
	private Bouton collection = new Bouton("Collection","image/fond_btn2.png");
	private Bouton Quitter = new Bouton("Quitter","image/fond_btn2.png");
	
	public void paintComponent(Graphics g){
		int largeur = this.getWidth();
		int hauteur = this.getHeight();
		Graphics2D FImage = (Graphics2D)g;
		try {
			Image image = ImageIO.read(new File("image/fond_ShinyGestion.jpeg"));
			Image Imagedim = image.getScaledInstance(largeur-largeur/4,hauteur/8+hauteur/16,0);
			FImage.drawImage(Imagedim,this.getWidth()/8,50,this);
		} catch (IOException e) {
		}
		

		Graphics2D titre = (Graphics2D)g;
		Font Policetitre = new Font("Arrows", Font.BOLD,50);
		titre.setColor(Color.BLACK);
		titre.setFont(Policetitre);
		titre.drawString("ShinyGest", largeur/2-largeur/8,hauteur/8 );
		
		add(newPoke);
		add(collection);
		add(Quitter);
		newPoke.setLocation(largeur/2-largeur/8,hauteur/4+hauteur/16);
		collection.setLocation(largeur/2-largeur/8,hauteur/2-hauteur/16);
		Quitter.setLocation(largeur/2-largeur/8,hauteur/2+hauteur/16);
	}
}