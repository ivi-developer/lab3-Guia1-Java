public class ItemVenta {
    private int id;
    private String description;
    private int cantidad;
    private int pUnitario;
    private int pTotal;
    public ItemVenta(int id,String description,int pUnitario,int cantidad){
        this.id=id;
        this.description=description;
        this.pUnitario=pUnitario;
        this.cantidad=cantidad;
        this.pTotal=pUnitario*cantidad;
    }
    public ItemVenta() {
        this.id = 0;
        this.description = null;
        this.cantidad = 0;
        this.pUnitario = 0;
        this.pTotal = 0;
    }
    public int getId() {
        return id;
    }
    public int getCantidad() {
        return cantidad;
    }
    public int getpUnitario() {
        return pUnitario;
    }
    public String getDescription() {
        return description;
    }
    public int getpTotal() {
        return pTotal;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setpUnitario(int pUnitario) {
        this.pUnitario = pUnitario;
    }
    public void setpTotal() {
        this.pTotal = this.cantidad*this.pUnitario;
    }
    @Override
    public String toString() {
        return "ItemVenta{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", cantidad=" + cantidad +
                ", pUnitario=" + pUnitario +
                ", pTotal=" + pTotal +
                '}';
    }
}
