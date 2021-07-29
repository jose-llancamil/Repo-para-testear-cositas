package TDAs;

import java.util.List;

public class Cliente {
    private long id;
    private List<Cuenta> listaCuentas;

    public Cliente(long id, List<Cuenta> listaCuentas) {
        this.id = id;
        this.listaCuentas = listaCuentas;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Cuenta> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(List<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", listaCuentas=" + listaCuentas +
                '}';
    }
}
