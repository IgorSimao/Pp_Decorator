public class PacoteCashBack extends StreamDecorator{

    public PacoteCashBack(Stream stream) {
        super(stream);
    }
    

    @Override
    public String assinar(){
        
        return super.assinar() + " Adicionando pacote Cash Back! " + " Valor: " + this.valor();
       
    }
    
    @Override
    public double valor() {
        return stream.valor() + 19.99;
    }
}
