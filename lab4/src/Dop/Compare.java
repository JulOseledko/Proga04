package Dop;

public enum Compare{
    ASIF("будто"), AS("как"), LIKE("словно");
    private String value;
    Compare(String s){
        this.value = s;
    }

    @Override
    public String toString(){
        return value;
    }
}
