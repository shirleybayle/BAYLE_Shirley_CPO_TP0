/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_bayle;

/**
 *
 * @author shirl
 */
public class Grille {
   Cellule [][] CellulesJeu = new Cellule [6][7];
   
   public Grille() {
       for (int i=0; i<6; i++) {
           for (int j=0; j<7; j++) { 
               CellulesJeu[i][j] = new Cellule();
           }
       }
   }
   
   public boolean ajouterJetonDansColonne(Jeton jet, int colonne) {
       for (int i=0; i<6; i++) {
           if (CellulesJeu[i][colonne-1].jetonCourant == null){
               CellulesJeu[i][colonne-1].jetonCourant = jet;
               return true;
           }
       }
       return false;
   }
   
   public boolean etreRemplie() {
       for (int i=0; i<6; i++) {
           for (int j=0; j<7; j++) {
               if (CellulesJeu[i][j].jetonCourant == null) {
                   return false;
               }
           }
       }
       return true;
   }
   
   public void viderGrille() {
       for (int i=0; i<6; i++) {
           for (int j=0; j<7; j++) {
               CellulesJeu[i][j].jetonCourant = null;
           }
       }
   }
   
   public static final String ANSI_RESET = "\u001B[0m";
   public static final String ANSI_RED = "\u001B[31m";
   public static final String ANSI_YELLOW = "\u001B[33m";
   public static final String ANSI_BLACK = "\u001B[30m";
   public static final String ANSI_WHITE = "\u001B[37m";
   
   public void afficherGrilleSurConsole() {
       for (int i=5; i>=0; i--){
           System.out.print(ANSI_WHITE + "\n|" + ANSI_RESET);
           for (int j=0; j<7; j++) {
               String couleur = CellulesJeu[i][j].lireCouleurDuJeton();
               if (couleur == "pas de jeton") {
                   System.out.print(ANSI_WHITE + " \u2022 |" + ANSI_RESET);
               }
               else if (couleur == "rouge") {
                   System.out.print(ANSI_RED + " \u2022 "+ ANSI_WHITE + "|"+ ANSI_RESET);
               }
               else if (couleur == "jaune") {
                   System.out.print(ANSI_YELLOW + " \u2022 " + ANSI_WHITE + "|" + ANSI_RESET);
               }
           }
       }
   }
   
   public boolean celluleOccupee(int ligne, int colonne) {
       if (CellulesJeu[ligne-1][colonne-1].jetonCourant != null){
       return true;
       }
       else{
       return false;
       }
   }
   
   public String lireCouleurDuJeton(int ligne, int colonne) {
       Jeton jeton = CellulesJeu[ligne-1][colonne-1].jetonCourant;
       String couleur;
       if (jeton != null) {
       couleur = jeton.Couleur;
       }
       else {
           couleur = "pas de jeton";
       }
       return couleur;
   }
   
   public boolean etreGagnantePourJoueur(Joueur j1) {
       String couleur = j1.Couleur;
       for (int i=0; i<6; i++){ // vérif ligne gagnante
           for (int j=0; j<4; j++){
               String CJ1 = CellulesJeu[i][j].lireCouleurDuJeton();
               String CJ2 = CellulesJeu[i][j+1].lireCouleurDuJeton();
               String CJ3 = CellulesJeu[i][j+2].lireCouleurDuJeton();
               String CJ4 = CellulesJeu[i][j+3].lireCouleurDuJeton();
               if (CJ1 == couleur && CJ2 == couleur && CJ3 == couleur && CJ4 == couleur) {
                   return true;
               }
           }
       } 
       for (int i=0; i<3; i++) {  // vérif colonne gagnante
           for (int j=0; j<7; j++) { 
               String CJ1 = CellulesJeu[i][j].lireCouleurDuJeton();
               String CJ2 = CellulesJeu[i+1][j].lireCouleurDuJeton();
               String CJ3 = CellulesJeu[i+2][j].lireCouleurDuJeton();
               String CJ4 = CellulesJeu[i+3][j].lireCouleurDuJeton();
               if (CJ1 == couleur && CJ2 == couleur && CJ3 == couleur && CJ4 == couleur) {
                   return true;
               }
           }
       }
       for (int i=0; i<3; i++){  //vérif diagonale haute gagnante
           for (int j=0; j<4; j++) {
               String CJ1 = CellulesJeu[i][j].lireCouleurDuJeton();
               String CJ2 = CellulesJeu[i+1][j+1].lireCouleurDuJeton();
               String CJ3 = CellulesJeu[i+2][j+2].lireCouleurDuJeton();
               String CJ4 = CellulesJeu[i+3][j+3].lireCouleurDuJeton();
               if (CJ1 == couleur && CJ2 == couleur && CJ3 == couleur && CJ4 == couleur) {
                   return true;
               }
           }
       }
       for (int i=3; i<6; i++){  // vérif diagonale basse gagnante
           for (int j=0; j<4; j++) {
               String CJ1 = CellulesJeu[i][j].lireCouleurDuJeton();
               String CJ2 = CellulesJeu[i-1][j+1].lireCouleurDuJeton();
               String CJ3 = CellulesJeu[i-2][j+2].lireCouleurDuJeton();
               String CJ4 = CellulesJeu[i-3][j+3].lireCouleurDuJeton();
               if (CJ1 == couleur && CJ2 == couleur && CJ3 == couleur && CJ4 == couleur) {
                   return true;
               }
           }
       }
       return false;
   }
   
   public boolean colonneRemplie(int colonne) {
       for (int i=0; i<6; i++) {
           if (CellulesJeu[i][colonne-1] == null) {
               return false;
           }
       }
       return true;
   }
}
