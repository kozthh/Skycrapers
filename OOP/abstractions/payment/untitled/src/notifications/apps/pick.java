package notifications.apps;

import payments.cash;

public class pick {

    public void pick(String app) {

        Gmail gmail = new Gmail();
        gcash gg = new gcash();
        maya maya = new maya();
        sms sms = new sms();
        uniondigital un = new uniondigital();

        switch (app) {
            case "gcash": new payments.gcash();

                break;
            case "maya": new payments.maya();

                break;
            case "uniondigital": new payments.uniondigital();

                break;
            case "cash": new cash();

                break;
            case "sms": new sms();
            break;


        }

    }
}
