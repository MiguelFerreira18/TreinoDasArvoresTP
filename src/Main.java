public class Main
{
    static GererArvore ga = new GererArvore();
    public static void main(String [] args)
    {
        ga.adicionaNaArvore("coisa");
        ga.adicionaNaArvore("aoisa");
        ga.adicionaNaArvore("foisa");
        ga.adicionaNaArvore("doisa");
        ga.adicionaNaArvore("cpoisa");

        ga.printInordem();
        ga.search("coisa");
    }
}
