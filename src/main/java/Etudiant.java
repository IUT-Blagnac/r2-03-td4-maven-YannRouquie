
/**
 *Classe etudiant avec un constructeur parametrique et non parametrique  
 * @author Yann Rouquie
 */
public class Etudiant
{
    String nom;
    String prenom;
    String ine;
    Adresse adr;
    char promo;
    
    Etudiant (String pfnom, String pfprenom, String pfine, char pfpromo, Adresse pfadresse){
        this.nom = pfnom;
        this.prenom = pfprenom;
        this.ine = pfine;
        this.adr = pfadresse;
        this.promo = pfpromo;
    }
    
    Etudiant(){
        this.nom =" ";
        this.prenom = " ";
        this.ine = " ";
        this.adr = new Adresse();
        this.promo = ' ';
    }
}
