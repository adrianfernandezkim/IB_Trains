public class destinationAddress extends Address {
    String instructions;
    public destinationAddress(String street, int num, boolean biz, String instructions) {
        super(street, num, biz);
        this.instructions = instructions;
    }
}
