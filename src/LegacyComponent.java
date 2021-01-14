public class LegacyComponent {
    private final int amount1;
    private final int amount2;
    private final String operation;

    public LegacyComponent(int amount1, int amount2, String operation) {
        this.amount1 = amount1;
        this.amount2 = amount2;
        this.operation = operation;
    }

    public int execute() {
        switch (this.operation) {
            case "soma":
                return this.amount1 + this.amount2;
            case "subtração":
                return this.amount1 - this.amount2;
            case "exponenciação":
                return ((int) Math.pow(this.amount1, this.amount2));
        }
        return -1;
    }
}
