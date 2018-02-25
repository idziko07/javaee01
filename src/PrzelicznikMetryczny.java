public class PrzelicznikMetryczny {

    public double centymetryNaMetry(Double centymetry){
        double metry = centymetry * 0.01;
        return metry;
    }

    public double centymetryNaMilimetry(Double centymetry){
        double milimetry = centymetry * 10;

        return milimetry;
    }
}
