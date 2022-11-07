
public abstract class Cartao 
{
    protected int codP;
    protected int codS;
    protected Data expedicao;
    protected Data validade;
    protected double limite;
    protected int dig;
    protected double pontos;
    protected int numCompras;
    protected double mPontos;

    public Cartao(int codP,int codS,Data expedicao,Data validade)
    {
    this.codP=codP;
    this.codS=codS;
    this.expedicao=expedicao;
    this.validade=validade;
    this.numCompras=0;
    
    }
    
    public double calclimite()
    { 
        return 300.00;
        
    }
    
    public void printNumComp(Cartao card){
     System.out.println("o total de compras deste cliente é"+card.numCompras);
    
    }
    
    public double getPontos(){
    System.out.println(pontos);
     return this.pontos;
    
    }
    

}
