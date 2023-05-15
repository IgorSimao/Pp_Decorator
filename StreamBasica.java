public class StreamBasica implements Stream{

    // public double valor = 9.99;

    @Override
    public String assinar(){
        
        return "Assinatura Basicia! " + " Valor: " + this.valor();
    }

    @Override
    public double valor() {
        return 9.99;    
    }
    
}
