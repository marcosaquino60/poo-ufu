package Exe;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.cadastro("Marcos Aquino", "123.456.789-10", 19, "1234-5678");
        cliente.mostrarDados();
    }
}
