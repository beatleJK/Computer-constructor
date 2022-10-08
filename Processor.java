public  class Processor {
    private final double frequency;
    private final int cores;
    private final ProducerProcessor producer;
    private final double weight;

    public Processor(double frequency, int cores, ProducerProcessor producer, double weight) {
        this.frequency = frequency;
        this.cores = cores;
        this.producer = producer;
        this.weight = weight;
    }

    public double getFrequency() {
        return frequency;
    }

    public Processor setFrequency(double frequency) {
        return new Processor(frequency, cores, producer, weight);
    }

    public int getCores() {
        return cores;
    }

    public Processor setCores(int cores) {
        return new Processor(frequency, cores, producer, weight);
    }

    public ProducerProcessor getProducer() {
        return producer;
    }

    public Processor setProducer(ProducerProcessor producer) {
        return new Processor(frequency, cores, producer, weight);
    }

    public double getWeight() {
        return weight;
    }

    public Processor setWeight(double weight) {
        return new Processor(frequency, cores, producer, weight);
    }
}