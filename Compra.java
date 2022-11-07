public class Compra

{
    private Data dCompra;
    private Cartao card;
    private double valorCompra;
    private double testePontos;
    private int parcelas;
    private double valParcelas;
    
    public Compra (Data dCompra, Cartao card,double valorCompra,int parcelas)
    { 
       this.dCompra = dCompra;
       this.card = card;
       this.valorCompra =valorCompra;
       this.parcelas=parcelas;
 
    }
    
    public void fazcompra(){
        if(this.valorCompra<=card.limite){
         System.out.println("compra efetuada");
         valParcelas=valorCompra/parcelas;
         System.out.println(parcelas+" de "+valParcelas+" reais ");
         card.limite=card.limite-this.valorCompra;
         ++card.numCompras;
         if(card.dig==1){
             card.pontos=card.pontos+this.valorCompra;
        }
        else if(card.dig==2){
            card.pontos=card.pontos+this.valorCompra*2;

        }}
        else{
        System.out.println("compra nao efetuada limite indisponivel");
    }

   }
   
   public void printpontos(){
       if(card.dig==1){
             testePontos=this.valorCompra;
             System.out.println("pontos nesta compra:"+ testePontos);

        }
        else if(card.dig==2){
            testePontos=this.valorCompra*2;
            System.out.println("pontos nesta compra:"+ testePontos);

        }
       
    
    }
  
}