package af;

//import java.util.ArrayList;

public class Veiculo{
    private int codigo;
    private String modelo;
    private double valorDiaria; 
   // private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public Veiculo(int codigo, String modelo, double valorDiaria, int quantidade) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }

    public Veiculo() {
	}

	public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    @Override
    public String toString() {
        return "Veiculo [modelo=" + modelo + ", codigo=" + codigo + ", valorDiaria=" + valorDiaria + "]";
    }




}
