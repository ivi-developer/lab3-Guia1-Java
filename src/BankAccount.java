public class BankAccount {
    private int id;
    private String nombre;
    private int balance;
    public BankAccount(int id,String nombre,int balance){
        this.balance=balance;
        this.id=id;
        this.nombre=nombre;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }
    public int getBalance() {
        return balance;
    }
    public String getNombre() {
        return nombre;
    }
    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", balance=" + balance +
                '}';
    }
    public int deposito(int n){
        return balance+=n;
    }
    public int debito(int n){
        if(n<=balance){
            balance-=n;
            System.out.println("Operacion realizada con exito");
            return n;
        }
        System.out.println("No te alcanza la guitarra");
        return 0;
    }

}
