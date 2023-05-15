public class PacoteCartaoPlatinum  extends StreamDecorator{

    public PacoteCartaoPlatinum(Stream stream) {
        super(stream);
    }
    
    @Override
    public String assinar(){
        
        return super.assinar() + " Adicionando pacote Cartão Platinum! " + " Valor: " + this.valor();
       
    }
    
    @Override
    public double valor() {
        return stream.valor() + 49.99;
    }
}
