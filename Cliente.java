package af;

import java.util.ArrayList;

/**
 * Cliente
 */
public class Cliente {
    private int codigo;
    private String nome;
    private String cpf;
    private ArrayList<Reserva> reservas = new ArrayList<Reserva>();

    public Cliente(int codigo, String nome, String cpf) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String string) {
        this.cpf = string;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public boolean addReserva(Reserva reserva){
        return reservas.add(reserva);
    }

    public boolean removeReserva(Reserva reserva){
        return reservas.remove(reserva);
    }

    public int getQuantidadeReservas(){
        return reservas.size();
    }

}
