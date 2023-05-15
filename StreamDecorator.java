public class StreamDecorator implements Stream{
    public Stream stream;

    public StreamDecorator(Stream stream){
        this.stream = stream;
    }

    @Override
    public String assinar() {
        return this.stream.assinar();
    }

    @Override
    public double valor() {
        return 9.99;
    }
    
}
