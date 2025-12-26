package diagnostic_frq;

public class diceSimulation {
    private int numSampleSize;
    private int numFaces;

    public diceSimulation(int numSamples, int faces) {
        numSampleSize = numSamples;
        numFaces = faces;
    };

    public int roll() {
        int rng = ((int)(Math.random()*(numFaces))) + 1;
        return rng;
    };

    public int runSimulation() {

        double doublesCount = 0;

        for (int i = 0; i < numSampleSize; i++) {
            int r1 = roll();
            int r2 = roll();
            
            if (r1 == r2) {
                doublesCount = doublesCount + 1;
            }
        }
        
        double proportion = doublesCount/numSampleSize;

        return (int)(proportion * 100);
    };

    public static void main(String[] args) {
        diceSimulation instance = new diceSimulation(4, 6);
        // System.out.println(instance.roll());
        System.out.println(instance.runSimulation());
    }
}
