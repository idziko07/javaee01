public class PrzelicznikWag {
    public double kilogramyNaGramy(Double kilogramy){
        double gramy = kilogramy * 1000;
        return gramy;
    }

    public double kilogramyNaMiligramy(Double kilogramy){
        double pow = Math.pow(10,6);
        double miligramy = kilogramy * pow;
        return miligramy;
    }
}
