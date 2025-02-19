public class Studente {
    private String nome;
    private int eta;
    public String corso;
    public String nuovoCorso;
    // Costruttore
    public Studente(String nome, int eta, String corso) {
        this.nome = nome;
        this.eta = eta;
        this.corso = corso;
    }
 
    public void cambiaCorso(String nuovoCorso) {
        if (nuovoCorso != null)
        {
            this.corso = nuovoCorso;
        }
     }
     
    // Getter e Setter per nome
    public String getNome() {
        return nome;
    }
 
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
 
    // Getter e Setter per età
    public int getEta() {
        return eta;
    }
 
 
    public void setEta(int eta) {
        if (eta > 0) { // Controllo per evitare età negative
            this.eta = eta;
        }
    }
 
 
    // Metodo per mostrare i dettagli dello studente
    public void mostraDettagli() {
        System.out.println("Nome: " + nome + ", Età: " + eta + ", Corso: " + corso );
    }
 }
 
