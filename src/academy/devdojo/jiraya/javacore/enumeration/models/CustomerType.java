package academy.devdojo.jiraya.javacore.enumeration.models;

public enum CustomerType {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    public final int VALUE;

    CustomerType(int value) {
        this.VALUE = value;
    }

    public static CustomerType customerTypePerValue(int value) {
        for (CustomerType customerType: values()) {
            if (customerType.VALUE == value) {
                return customerType;
            }
        }
        return null;
    }
}
