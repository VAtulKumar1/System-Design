package SOLID_Principles.interface_segeregation_principle.incorrect;
/*
 * The Interface Segregation Principle (ISP) states that no client should be forced to implement
 * methods it does not need.
 *
 * In the example below, the interface contains three methods, all of which the implementing class
 * must provide, regardless of whether they are required.
 *
 * To adhere to the ISP, we should break down the interface into smaller, more specific interfaces,
 * ensuring that classes only implement the functionality they need.
 */
public interface UPIPayments {
    void makePayment();
    void getScratchCard();
    void getCashbackAsCreditBalance();

}
