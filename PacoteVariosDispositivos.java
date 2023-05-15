public class PacoteVariosDispositivos extends StreamDecorator{

    public PacoteVariosDispositivos(Stream stream) {
        super(stream);
    }

    @Override
    public String assinar(){
        
        return super.assinar() + " Adicionando pacote Varios Dispositivos! " + " Valor: " + this.valor();
       
    }
    
    @Override
    public double valor() {
        return stream.valor() + 19.99;
    }
}
