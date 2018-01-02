public class originAddress extends Address {

    public boolean house;
    public originAddress(String street, int num, boolean biz, boolean house){
        super(street, num, biz);
        this.house = house;
    }
}
