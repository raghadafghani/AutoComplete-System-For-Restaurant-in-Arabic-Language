package application;

public class CorpusRecord {
    private int frequency;
    private float probability;

    public CorpusRecord() {
        this.frequency=1;
    }

    public CorpusRecord(int frequency, float probability) {
        this.frequency = frequency;
        this.probability = probability;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public float getProbability() {
        return probability;
    }

    public void setProbability(float probability) {
        this.probability = probability;
    }
}
