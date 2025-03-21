public class Teste {
    public static void main(String[] args) throws Exception {
        

        System.out.println(Conc());
        verifyNum();
        sinais();
        condicao();
        operadoresRelacionais();
        operadoresLogicos();
    }

    public static String Conc() {
        String concText = "?";
        String concText2 = "?";
        concText = "1" + 1 + 1;
        concText2 = 1 + 1 + "1";

        return "ConcText: " + concText.concat(" ||||||||| ConcText2: ").concat(concText2);
    }

    public static void verifyNum() {
        System.out.println("Verify NUM !");
        int numero = 5;
        int numero2 = -10;

        numero = - numero;

        System.out.println("Numero 5 -numero: " + numero);

        numero = numero * -1;

        System.out.println("Numero -5... numero * -1 : " + numero);

        numero2 = - numero2;

        System.out.println("Numero -10 -numero: " + numero2);
    }

    public static void sinais() {
        int valor = 3;
        boolean check = true;

        System.out.println("Valor alterado em para sempre com ++valor: " + ++valor);

        System.out.println("Check alterado apenas em vizualizacao !check: " + !check);

        System.out.println("Check: " + check);
    }

    public static void condicao() {
        int a,b;
        String resultado;

        a = 5;
        b = 5;

        if(a == b)
            resultado = "Verdadeiro";
        else
            resultado = "falso";

        System.out.println("If longo: " + resultado);

        resultado = a != b ? "Verdadeiro" : "Falso";

        System.out.println("If ternario: " + resultado);
    }

    public static void operadoresRelacionais() {
        int numero1 = 1;
        int numero2 = 2;
        String nome1 = "Mateus";
        String nome2 = new String("Mateus");

        if(numero1 < numero2) 
            System.out.println("Eh menor");   

        System.out.println("Compara nome1 e nome2, nao vao ser iguais pq == nao serve para novo objeto.." + (nome1 == nome2));

        System.out.println("Comparar objeto se usa EQUALS: " + nome1.equals(nome2));
    }

    public static void operadoresLogicos() {
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2)
            System.out.println("As duas sao true");
        if(condicao1 || condicao2)
            System.out.println("Uma delas e true");
    }
}
