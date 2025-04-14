package exercicio1oo;

class TestaAluno {
    public static void main(String[] args) {
        Aluno herculano = new Aluno();
        herculano.nome = "Herculano De Biasi";
        herculano.idade = 50;
        herculano.nota1 = 8;
        herculano.nota2 = 7;
        herculano.nota3 = 6;
        herculano.nota4 = 5;
        System.out.println("Nome..: " + herculano.nome);
        System.out.println("Idade.: " + herculano.idade);
        System.out.println("Nota 1: " + herculano.nota1);
        System.out.println("Nota 2: " + herculano.nota2);
        System.out.println("Nota 3: " + herculano.nota3);
        System.out.println("Nota 4: " + herculano.nota4);
    }
}
