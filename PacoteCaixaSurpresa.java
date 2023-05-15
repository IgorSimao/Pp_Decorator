public class PacoteCaixaSurpresa extends StreamDecorator{

    public PacoteCaixaSurpresa(Stream stream) {
        super(stream);

    }

    @Override
    public String assinar(){
        
        return super.assinar() + " Adicionando pacote Caixa Surpresa! " + " Valor: " + this.valor();
       
    }
    
    @Override
    public double valor() {
        return stream.valor() + 29.99;
    }
}