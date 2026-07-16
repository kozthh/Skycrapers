package notifications.apps;
import notifications.absrule.rule;
public class Gmail extends rule {
    @Override
    public void paidnotifacations() {
        System.out.print("Gmail: Hey you paid your parking fee successfully");
    }
}
