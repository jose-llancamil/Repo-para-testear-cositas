package TDAs;

public abstract class Cuenta {
    public static int count = 0;
    private int id;
    private String type;
    private boolean blockstatus;
    private int money;

    public Cuenta(int id, String type, boolean blockstatus, int money) {
        setId(++count);
        this.id = id;
        this.type = type;
        this.blockstatus = blockstatus;
        this.money = money;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Cuenta.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBlockstatus() {
        return blockstatus;
    }

    public void setBlockstatus(boolean blockstatus) {
        this.blockstatus = blockstatus;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", blockstatus=" + blockstatus +
                ", money=" + money +
                '}';
    }
    public abstract void addMoney(int amount);

    public abstract String getInfo();
}
