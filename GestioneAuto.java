public class GestioneAuto 
{
    public static void main(String[] args) 
    {
        Auto auto = new Auto(" Ferrari", " Testarossa", " Rosso ", 1984);
        auto.mostraDettagli();
        auto.setColore("Giallo");
        auto.mostraDettagli();
    }
}
