public class MetricConverter {

    public double centimeterToMeter(Double centimeter){
        double meter = centimeter * 0.01;
        return meter;
    }

    public double centimeterToMilimeter(Double centimeter){
        double milimeter = centimeter * 10;

        return milimeter;
    }

    public double meterToCentimeter(double meter){
        double centimeter = meter * 100;
        return centimeter;
    }
    public double meterToMilimeter(double meter){
        double miligram = meter * 1000;
        return miligram;
    }

    public double milimeterToMeter(double milimeter){
        double meter = milimeter * -0.0001;
        return meter;
    }

    public double milimeterToCentimeter(double milimeter){
        double centimeter = milimeter * 0.1;
        return centimeter;
    }
}
