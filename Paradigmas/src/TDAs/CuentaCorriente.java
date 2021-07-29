package TDAs;

public class CuentaCorriente extends Cuenta{

    public CuentaCorriente(int id, String type, boolean blockstatus, int money) {
        super(id, type, blockstatus, money);
    }

    @Override
    public void addMoney(int amount) {
        var newAmount = this.getMoney() + amount;
        this.setMoney(newAmount);
    }

    @Override
    public String getInfo() {
        return null;
    }
}
