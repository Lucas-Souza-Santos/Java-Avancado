public class fatorial {
    public static void main(String[] args) {
        int valor = 0;

        valor = fatorial(5);
        System.out.println("O fatorial de 5 e :: " + valor);
        
    }

    public static int fatorial(int valor)
    {
        if(valor == 1 || valor == 0)
        {
            valor = 1;
            return valor;
        }
        else
        {
            return fatorial(valor - 1) * valor;
        }
    }
}


