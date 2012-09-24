package lab1.solution;

//import lab1.*;

/**
 *
 * @author jlombardo
 */
public class LeatherBelt extends Product {

    public LeatherBelt() {
    }

    public LeatherBelt(String partName, String partNumber, double price, DiscountStrategy discount) {
        this.setPartName(partName);
        this.setPartNumber(partNumber);
        this.setPrice(price);
        setDiscountStrategy(discount);
    }
    
//    @Override
//    public double getDiscountInDollars() {
//        return this.getPrice() * .15;
//    }

}
