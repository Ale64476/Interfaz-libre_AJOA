package tarea1;

import java.awt.*;
import java.util.Set;

import javax.swing.*;

public class reproductor{
	String [] c = {"Shake your grove thing - EarthWindFire", "Tu falta de querer - Mon Laferte", "BABY SAID - MANESKIN", "505 - Artic Monkeys" , "My Way Of Life - Frank Sinatra"};
	public void ventana() {
		JFrame frame = new JFrame("Reproductor de musica");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,300);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();

		frame.add(panel);
		frame.setLocationRelativeTo(null);
		
		panel.setLayout(new BorderLayout());
		
		JLabel t = new JLabel("Portada del album");
		panel.add(t, BorderLayout.WEST);
		JList canciones = new JList(c);
		panel.add(canciones, BorderLayout.CENTER);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.gray);
		JButton previous = new JButton("PREVIOUS");
		panel2.add(previous);
		JButton play = new JButton("PLAY");
		panel2.add(play);
		JButton next = new JButton("NEXT");
		panel2.add(next);
		panel.add(panel2, BorderLayout.SOUTH);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.lightGray);
		JButton b = new JButton("Canciones");
		panel3.add(b);
		JButton artistas = new JButton("Artistas");
		panel3.add(artistas);
		JButton albums = new JButton("Albumes");
		panel3.add(albums);
		JButton listas = new JButton("Listas de reproduccion");
		panel3.add(listas);
		panel.add(panel3, BorderLayout.NORTH);
		
		JScrollBar s = new JScrollBar();
		panel.add(s, BorderLayout.EAST);
		
	//	JComboBox lista = new JComboBox(c);
	//	panel.add(lista, BorderLayout.EAST);
		
	//	JProgressBar barrita = new JProgressBar(0,3);
	//	panel.add(barrita, BorderLayout.CENTER);
		
	}
}
