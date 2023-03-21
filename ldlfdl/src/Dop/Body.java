package Dop;

public enum Body {
    EYES1("из глаз"), EYES2("перед глазами"), HEAD1("с головы"), HEAD2("по головке"), HEAD3("над головой"), FACE("лицом"), HAIR("волосы"), HAND("из рук"), BREAST("на колени"), LEGS("ногами"), LAP("грудь");
    private String value;

    Body(String s) {
        this.value = s;
    }

    @Override
    public String toString() {
        return value;
    }
}
