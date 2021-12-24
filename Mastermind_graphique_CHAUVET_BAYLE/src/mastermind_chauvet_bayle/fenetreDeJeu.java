/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_chauvet_bayle;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author shirl
 */
public class fenetreDeJeu extends JFrame{
    
    int nbEssais;
    Ligne ligneTest;
    Ligne ligneGagnante;
    
    public fenetreDeJeu() {
        super("Mastermind");
        WindowListener test = new WindowAdapter() {
         public void windowClosing(WindowEvent e){
            System.exit(0);
         }
        };
        addWindowListener(test);
        setSize(1200,900);
        
        this.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
        PolygonPanel panneauJeu = new PolygonPanel();
        add(panneauJeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20,50,-1,-1));
        panneauJeu.setSize(200,200);
        //panneauJeu.setBackground(Color.red);
        panneauJeu.setPreferredSize(new Dimension(680,880));
        setVisible(true);
        
        nbEssais = 0;
        ligneGagnante = new Ligne();
        
        JLabel texte = new JLabel("<html>Veuillez choisir la couleur de vos pions<br>(de gauche à droite)</html>");
        Dimension size = texte.getPreferredSize();
        texte.setFont(new Font("Serif",Font.BOLD, 20));
        texte.setHorizontalAlignment(SwingConstants.CENTER);
        //texte.setBounds(620, 20, size.width, size.height);
        add(texte, new org.netbeans.lib.awtextra.AbsoluteConstraints(750,50,360,100));
        //texte.setOpaque(true);
        //texte.setBackground(Color.red);
        setVisible(true);
        
        JButton rouge = new JButton();
        rouge.setBounds(650,200,60,60);
        add(rouge,new org.netbeans.lib.awtextra.AbsoluteConstraints(750,200,60,60));
        rouge.setBackground(Color.red);
        
        JButton jaune = new JButton();
        jaune.setBounds(750,200,60,60);
        add(jaune, new org.netbeans.lib.awtextra.AbsoluteConstraints(850,200,60,60));
        jaune.setBackground(Color.yellow);
        
        JButton vert = new JButton();
        vert.setBounds(850,200,60,60);
        add(vert, new org.netbeans.lib.awtextra.AbsoluteConstraints(950,200,60,60));
        vert.setBackground(Color.green);
        
        JButton bleu = new JButton();
        bleu.setBounds(950,200,60,60);
        add(bleu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050,200,60,60));
        bleu.setBackground(Color.blue);
        
        JButton blanc = new JButton();
        blanc.setBounds(650,300,60,60);
        add(blanc, new org.netbeans.lib.awtextra.AbsoluteConstraints(750,300,60,60));
        blanc.setBackground(Color.white);
        
        JButton violet = new JButton();
        violet.setBounds(750,300,60,60);
        add(violet, new org.netbeans.lib.awtextra.AbsoluteConstraints(850,300,60,60));
        violet.setBackground(Color.black);
        
        JButton rose = new JButton();
        rose.setBounds(850,300,60,60);
        add(rose, new org.netbeans.lib.awtextra.AbsoluteConstraints(950,300,60,60));
        rose.setBackground(Color.pink);
        
        JButton orange = new JButton();
        orange.setBounds(950,300,60,60);
        add(orange, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050,300,60,60));
        orange.setBackground(Color.orange);
        
        this.setVisible(true);
        initialiserPartie();
        Pion [] tabGagnant = ligneGagnante.LigneAssociee;
        
        
    }
    
    
    
    public void nouveauTest() {
        
    }
    
    public void initialiserPartie() {
        Random generateurAleat = new Random();
        int n1 = generateurAleat.nextInt(8);
        int n2 = generateurAleat.nextInt(8);
        int n3 = generateurAleat.nextInt(8);
        int n4 = generateurAleat.nextInt(8);
        String tabCouleurs[] = {"rouge","jaune","vert","bleu","orange","blanc","violet","rose"};
        Pion pion1 = new Pion(tabCouleurs[n1]);
        Pion pion2 = new Pion(tabCouleurs[n2]);
        Pion pion3 = new Pion(tabCouleurs[n3]);
        Pion pion4 = new Pion(tabCouleurs[n4]);
        ligneGagnante.placerPion(pion1, pion2, pion3, pion4);
    }
    
    public class PolygonPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int [] xValues = {10,610,456,165};
        int [] yValues = {800,800,183,183};
        Polygon p = new Polygon(xValues, yValues, 4);
        g.setColor(Color.BLUE);
        g.drawPolygon(p);
        //g.fillPolygon(p);
        g.setColor(Color.BLACK);
        g.drawLine(158,211,453,211);
        g.drawLine(149,243,470,243);
        g.drawLine(140,278,480,278);
        g.drawLine(131,318,489, 318);
        g.drawLine(120,362,500,362);
        g.drawLine(107,412,513,412);
        g.drawLine(93,469,527,469);
        g.drawLine(77,534,544,534);
        g.drawLine(57,610,562,610);
        g.drawLine(35,700,585,700);
        g.drawLine(310,800,310,183); //milieu
        g.drawLine(160,800,237,183); //un quart
        g.drawLine(460,800,383,183); //trois quarts
        
    }
}
    
    public static void main(String [] args) {
        JFrame frame = new fenetreDeJeu();
    }
}
