import java.util.ArrayList;

public class Administradora
{
    private String bandeira;
    private ArrayList<Cliente> listaCliente;

    public Administradora(String bandeira)
    {
        this.bandeira=bandeira;
    }

    public void addCliente(Cliente pessoa)
    {
        this.listaCliente.add(pessoa);
    }
}