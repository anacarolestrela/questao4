
public class CartaoUni extends Cartao
{
    private String instituicao;
    

    public CartaoUni(int codP,int codS,Data expedicao,Data validade, String instituicao)
    {
        super(codP,codS, expedicao, validade);
        this.instituicao=instituicao;
        this.limite=300.00;
        this.dig=1;
        this.pontos=0;

    }

}
