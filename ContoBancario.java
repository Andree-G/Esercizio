public class ContoBancario 
{
    private int numeroConto;
    private double saldo;
    public String titolare;
    private double importo;
    private double preleva;

    public ContoBancario (int numeroConto, double saldo, String titolare)
    {
        this.numeroConto = numeroConto;
        this.saldo = saldo;
        this.titolare = titolare;

    }
    
    public int getNumeroConto()
    {
        return numeroConto;
    }
    public void setNumeroConto(int numeroConto)
    {
        this.numeroConto = numeroConto;
    }

    public double getSaldo()
    {
        return saldo;
    }
    public void setSaldo(double saldo)
    {
        if (saldo < 0)
        {
            System.out.println("Impossibile");
        }
        else
        {
            this.saldo = saldo;
        }
    }

    public void Importo(double importo) 
    {
        if (importo < 0)
        {
            System.out.println("Impossibile");
        }
        else
        {
            this.importo = importo;
            saldo += importo;
        }
    }

    public void Preleva(double preleva) 
    {
        if (preleva > saldo)
        {
            System.out.println("Impossibile");
        }
        else
        {
            this.preleva = preleva;
            saldo -= preleva;
        }
    }


    

    


    
}
