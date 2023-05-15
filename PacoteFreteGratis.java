public class PacoteFreteGratis extends StreamDecorator{

    public PacoteFreteGratis(Stream stream) {
        super(stream);
    }
    
    @Override
    public String assinar(){
        
        return super.assinar() + " Adicionando pacote Frete Gratis! " + " Valor: " + this.valor();
       
    }
    
    @Override
    public double valor() {
        return stream.valor() + 9.99;
    }
}
