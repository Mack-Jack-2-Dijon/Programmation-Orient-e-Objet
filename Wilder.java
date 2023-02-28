public class Wilder {
  // attributes 
  private String firstname;
  private boolean aware;
  // constructors
  public Wilder(String firstname, boolean aware){
    this.firstname = firstname;
    this.aware = aware;
  }
  // Ajout des getters et setters 
  // getters
  public String getName(){
    return this.firstname;
  }
  public boolean isAware(){
    return this.aware;
  }
  public void setName(String name){
    this.firstname = name;
  }
  // méthode whoAmI() retournant le texte "Je m'appelle firstname et je suis aware" ou "Je m'appelle firstname et je ne suis pas aware", en fonction de l'état des attributs firstname et aware
  public String whoAmI(){
    return this.aware ? "Je m'appelle " + this.getName() + " et je suis aware." : "Je m'appelle " + this.getName() + " et je ne suis pas aware.";
  }
}
