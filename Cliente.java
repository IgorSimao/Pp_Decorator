public class Cliente {
    public static void main(String[] args) {
        Stream streamBasica = new StreamBasica();
        System.out.println(streamBasica.assinar());
        
        

        Stream streamComFreteGratis = new PacoteFreteGratis(streamBasica);
        System.out.println(streamComFreteGratis.assinar());
        

        Stream streamCompleta = new PacoteFreteGratis(new PacoteCaixaSurpresa(new PacoteVariosDispositivos(new PacoteCartaoPlatinum(new PacoteCashBack(new StreamBasica())))));
        System.out.println(streamCompleta.assinar());
        
        
    }
}
