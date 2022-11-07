
import java.util.ArrayList;

public class Cliente 
{
    private int cpf ;
    private String nome;
    private String email;
    private String telefone;
    private ArrayList<Cartao> listaCartao;
    private double mPontos;
    
    public Cliente(int cpf,String nome,String email,String telefone)
    {
     this.cpf=cpf;
     this.nome=nome;
     this.email=email;
     this.telefone=telefone;
     this.listaCartao = new ArrayList<Cartao>();
     this.mPontos=0;
     
    }

        public void addCartao(Cartao card)
    {
        this.listaCartao.add(card);
    }
    
    public void clienteMPontos(){
        for( int i=0; i<listaCartao.size(); i++){
            Cartao c = listaCartao.get(i);
            if( c.getPontos()>mPontos){
                mPontos=c.getPontos();
            }
        }
    }
}
