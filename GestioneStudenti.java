public class GestioneStudenti {
    public static void main(String[] args) {
        // Creazione di un oggetto Studente
        Studente studente1 = new Studente("Alice", -24, "Informatica");
        Studente studente2 = new Studente("Bob", 22, "Fisica");

        // Stampa i dettagli dello studente
        studente1.mostraDettagli();
        // Modifica dell’età con il setter
        studente1.setEta(-21);
        // Visualizzazione dei dettagli aggiornati
        studente1.mostraDettagli();
        studente1.cambiaCorso("Matematica"); 
        studente1.mostraDettagli();
        studente2.mostraDettagli();

    }
 }
 

