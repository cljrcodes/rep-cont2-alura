public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.nome = "Interestelar";
        meuFilme.anoDeLancamento = 2014;
        meuFilme.avaliacao = 8.7;
        meuFilme.duracaoEmMinutos = 145;
        meuFilme.incluidoNoPlano = true;
        meuFilme.totalDeAvaliacoes = 8;

        System.out.println(meuFilme.anoDeLancamento);
        System.out.println(meuFilme.duracaoEmMinutos);
    }
}
