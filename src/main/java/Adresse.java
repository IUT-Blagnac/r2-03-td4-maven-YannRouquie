

public class Adresse
{
  // Variable de travail  
    int numRue;
    String nomRue;
    String codePostal;
    String ville;

    /**
     * Role : Constructeur non parametrique qui initialise chaque champs par defauts
     */
    // Constructeur Adresse
    Adresse(){
        this.numRue = 1;  // champs numRue
        this.nomRue = "";
        this.codePostal = "";
        this.ville = "";
  }
  
  /**
   * Role : Role : Constructeur non parametrique qui initialise chaque champs avec les parametres suivants
   * @param pfnumRue
   * @param pfnomRue
   * @param pfcodePostal
   * @param pfville
   */
    Adresse(int pfnumRue, String pfnomRue, String pfcodePostal,String pfville){
        this.numRue = pfnumRue;  // champs numRue
        this.nomRue = pfnomRue;
        this.codePostal = pfcodePostal;
        this.ville = pfville;
  }
}
