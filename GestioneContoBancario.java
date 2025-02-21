public class GestioneContoBancario 
{
    public static void main(String[] args) 
    {
        ContoBancario contoBancario = new ContoBancario(12345 , 334.923844 , "Gammella");
        contoBancario.mostraDettagli();
        contoBancario.setImporto(34.5454);
        contoBancario.mostraDettagli();


    }
}
