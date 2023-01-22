//file DrinkEnumType.java
package lab_16;

public enum DrinkEnumType {
    WATER(),
    BEER(true),
    WINE(true),
    VODKA(true),
    BRANDY(true),
    CHAMPAGNE(true),
    WHISKEY(true),
    RUM(true),
    JUICE(),
    COFFEE(),
    GREEN_TEA(),
    BLACK_TEA();

    private final boolean alcoholic;

    DrinkEnumType() {
        this.alcoholic = false;
    }

    DrinkEnumType(boolean alcoholic) {
        this.alcoholic = alcoholic;
    }

    public boolean isAlcoholic() {
        return alcoholic;
    }
}
