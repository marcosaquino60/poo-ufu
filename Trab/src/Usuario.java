public class Usuario {
    private String nome;
    private String username;
    private String password;

    public Usuario(String nome, String username, String password) {
        this.nome = nome;
        this.username = username;
        this.password = password;
    }
    public void mostrarDados() {
        System.out.println("Nome: "+ nome);
    }
}
