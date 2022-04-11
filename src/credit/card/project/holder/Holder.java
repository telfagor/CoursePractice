package credit.card.project.holder;

public class Holder {
    private long bankIdCounter;
    private long id;
    private String name;

    public Holder(long id, String name, long bankIdCounter) {
        this.name = name;
        this.id = id;
        this.bankIdCounter = bankIdCounter;
    }

    @Override
    public String toString() {
        return "Holder{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
