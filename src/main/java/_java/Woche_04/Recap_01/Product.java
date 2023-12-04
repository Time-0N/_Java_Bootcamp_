package _java.Woche_04.Recap_01;


public record Product(
        String name,
        int priceInCent,
        int productNumber
) {
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", priceInCent=" + priceInCent +
                ", productNumber=" + productNumber +
                '}';
    }
}
