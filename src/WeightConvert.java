public class WeightConvert {
    public double kilogramToGram(double kilogram){
        double gram = kilogram * 1000;
        return gram;
    }

    public double kilogramToMiligramy(double kilogram){
        double pow = Math.pow(10,6);
        double miligram = kilogram * pow;
        return miligram;
    }

    public double gramToKilogram (double gram){
        double kilogram = gram * 0.001;
        return kilogram;
    }

    public double gramToMiligram(double gram){
        double miligram = gram *1000;
        return miligram;
    }

    public double miligramTokilogram(double miligram){
        double kilogram = miligram * (1.0 * Math.pow(10,-6));
        return kilogram;
    }

    public double miligramToGram(double miligram){
        double gram = miligram * 0.001;
        return gram;
    }
}
