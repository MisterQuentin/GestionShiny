import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Bouton extends JButton implements MouseListener{
		/**
		 * 
		 * Classe pour faire les boutons
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private String name;
		public Bouton(String str, String icon){
			super(str);
			
			this.name = str;
			this.addMouseListener(this);
			try {
				Image fondBtn = ImageIO.read(new File(icon));
				Image newdimention = fondBtn.getScaledInstance(200,80,0);
				setForeground(Color.WHITE);
				setOpaque(false);
				setContentAreaFilled(false);
				setBorderPainted(false);
				setFocusPainted(false);
				setHorizontalAlignment(0);
		        setHorizontalTextPosition(0);
				setIcon(new ImageIcon(newdimention));
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		@Override
		public void mouseClicked(MouseEvent arg0) { 
			
		}
		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	
	}