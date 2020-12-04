package af;

import java.util.ArrayList;

public class Reserva {

    private int numero;
    private Cliente cliente;
    private ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

    public Reserva() {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public boolean addVeiculo(int numero, String modelo, double valorDiaria, int quantidade){
        return veiculos.add(new Veiculo(numero, modelo, valorDiaria, quantidade));
    }

    @Override
    public String toString() {
        return "Reserva [cliente=" + cliente + ", numero=" + numero + "]";
    }

}
