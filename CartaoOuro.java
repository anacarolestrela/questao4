
public class CartaoOuro extends Cartao
{
    private int pontos;

    public CartaoOuro(int codP,int codS,Data expedicao,Data validade)
    {
        super(codP,codS, expedicao, validade);
        this.limite=10000.00;
        this.dig=2;
        this.pontos=0;
    }

}