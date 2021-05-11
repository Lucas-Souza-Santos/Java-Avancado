public class App 
{
    public static void main(String[] args)
    {
        // função lambda 1
        Funcao1 colocarPrefixoSenhorNaString = valor -> "Sr. " + valor;
        System.out.println(colocarPrefixoSenhorNaString.gerar("Lucas"));

        // função lambda 2
        Funcao2 somarDois = num -> num + 2;
        System.out.println(somarDois.somar(2));

        // função lambda 3
        Funcao3 printar = valor -> System.out.println(valor);
        printar.gerar("Lucas Santos");

        // quando a lambda possuir mais de dois parâmetros
        // é preciso usar chaves 
        // Função lambda 4
        Funcao3 printar2 = valor -> {
            System.out.println(valor);
            System.out.println(valor);
        };
        printar2.gerar("Santos");
    }
}

interface Funcao1
{
    String gerar(String valor);
}

interface Funcao2
{
    Integer somar(int valor);
}
interface Funcao3
{
    void gerar(String valor);
}