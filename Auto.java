public class Auto 
{
    private String marca;
    private String modello;
    public String colore;
    private int anno;
    public String nuovoColore;

    public Auto(String marca, String modello, String colore, int anno) 
    {
        this.marca = marca;
        this.modello = modello;
        this.colore = colore;
        this.anno = anno;
    }
    
    
    public String getMarca() 
    {
        return marca;
    }
    public void setMarca(String marca) 
    {
        this.marca = marca;
    }

    public String getModello()
    {
        return modello;
    }
    public void setModello(String modello) 
    {
        this.modello = modello;
    }

    public int getAnno()
    {
        return anno;
    }
    public void setAnno(int anno) 
    {
        this.anno = anno;
    }

    public int getColore(int colore) 
    {
        return colore;
    }
    public void setColore(String colore) 
    {
       this.colore = colore;
    }

    public void mostraDettagli() 
    {
        System.out.println("Marca: " + marca + ", Modello: " + modello + ", Colore: " + colore + ", Anno: " + anno);
    }
   
}
