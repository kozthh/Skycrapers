package payments;

public class mode {

    public void payment(String type, double amount) {

        gcash gcash = new gcash();
        maya maya = new maya();
        uniondigital uniondigital = new uniondigital();
        cash cash = new cash();

        switch (type) {
            case "gcash": new gcash();
            gcash.pay(amount);
                break;
            case "maya": new  maya();
            maya.pay(amount);
                break;
            case "uniondigital": new uniondigital();
            uniondigital.pay(amount);
                break;
            case "cash": new cash();
            cash.pay(amount);
            break;
        }

    }
}
