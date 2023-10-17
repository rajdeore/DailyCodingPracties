package JavaConceptPracties.ProducerAndConsumers;

class Producer extends Thread{
    private final Buffer buffer;
    private final int producerId;
    private final int item;

    public Producer(Buffer buffer, int producerId, int item) {
        this.buffer = buffer;
        this.producerId = producerId;
        this.item = item;
    }

    @Override
    public void run() {
        try {
            buffer.addItem(this.item, this.producerId);
            sleep((long) Math.random() * 100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}