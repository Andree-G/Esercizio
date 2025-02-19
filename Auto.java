public class Auto 
{
    private String marca;
    private String modello;
    public String colore;
    private int anno;

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
    public void setAnno(String anno) 
    {
        this.anno = anno;
    }
   
}
