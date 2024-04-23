import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        do {
            System.out.println("Ingrese el punto: ");
            switch(tec.nextInt()){
                case 1:
                    punto1(tec);
                    break;
                case 2:
                    punto2();
                    break;
                case 3:
                    punto3();
                    break;
                case 4:
                    punto4();
                    break;
                case 5:
                    punto5();
                    break;
                default:
                    System.out.println("cualquier numero ingresaste wachin");
                    break;
            }
            System.out.println("n para cortar programa");
        }while(tec.next().charAt(0)!='n');
    }
    public static void punto1(Scanner tec){
                    Rectangulo rectangulo=new Rectangulo(5,10);
                    System.out.println(rectangulo.toString());
                    System.out.println("El area del rectangulo: "+rectangulo.getArea()+" el perimetro: "+rectangulo.getPerimetro());
                    System.out.println("Ingrese el nuevo alto: ");
                    rectangulo.setAlto(tec.nextDouble());
                    System.out.println("Ingrese el nuevo ancho: ");
                    rectangulo.setAncho(tec.nextDouble());
                    System.out.println(rectangulo.toString()+"\nsu nueva area: "+rectangulo.getArea()+" y su nuevo perimetro: "+rectangulo.getPerimetro());
                    rectangulo=new Rectangulo();
                    System.out.println(rectangulo.toString());
    }
    public static void punto2(){
                    Empleado empleado1=new Empleado("23456345","Carlos","Gutiérrez",25000);
                    Empleado empleado2=new Empleado("34234123","Ana","Sánchez",27500);
                    System.out.println(empleado1.toString());
                    System.out.println(empleado2.toString());
                    empleado1.setSalarioAumentado(20);
                    System.out.println(empleado1.toString());
    }
    public static void punto3(){
        ItemVenta itemVenta=new ItemVenta(333,"macucas",500,20);
        System.out.println(itemVenta.toString());
    }
    public static void punto4(){
        BankAccount bankAccount=new BankAccount(1,"ivi",10);
        System.out.println(bankAccount.toString());
        bankAccount.deposito(5);
        System.out.println(bankAccount.toString());
        bankAccount.debito(10);
        System.out.println(bankAccount.toString());
        bankAccount.debito(10);
        System.out.println(bankAccount.toString());
    }
    public static void punto5(){
        Hora hora=new Hora(4,8,58);
        System.out.println(hora.toString());
        hora.aumentarSec();
        System.out.println(hora.toString());
        hora.aumentarSec();
        System.out.println(hora.toString());
    }

}
