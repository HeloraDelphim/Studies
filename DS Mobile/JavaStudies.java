                        /*INTRODUÇÃO AO JAVA
        O QUE É O JAVA: uma linguagem de programação orientada a objetos (OOP), popular por ser multiplatafroma (funciona em
qualquer dispositivo com a máquina virtual JAVA, ou JVM)
        JVM, JDK e JRE: 
        JVM (Java Virtual Machine): Interpreta e executa os programas JAVA
        JDK (Java Development Kit): Conjunto de ferramentas para programadores JAVA (inclui o JRE e ferramentas de desenvolvimento)
        JRE (Java Runtime Environment): Ambiente necessário para executar aplicações JAVA (contém a JVM)
----------------------------------------------------------------------------
                        ESTRUTURA BÁSICA DE UM PROGRAMA JAVA
        Classes: Um programa Java é formado por classes, que são os "blocos de construção" do código.
        Métodos: Funções dentro das classes. O método main()é o ponto de entrada do programa
        Sintaxe Básica: É a estrutura básica de QUALQUER programa Java:*/

                public class Main {
                        public static void main(String[] args) {
                        System.out.println("Olá Mundo!");
                
/*----------------------------------------------------------------------------
                        TIPOS DE DADOS 
        PRIMITIVOS:
        int, long, short, byte (números inteiros)
        float, double (números de ponto flutuante [com vírgula])
        boolean (condições de verdadeiro ou falso)
        char (caracteres)

        COMPOSTOS:
        Strings (sequência de caracteres)
        Arrays (lstas de dados do mesmo tipo)
----------------------------------------------------------------------------
                        CONTROLE DE FLUXO
        CONDICIONAIS: if, else, else if, switch
        LAÇOS DE REPETIÇÃO: for, while, do-while
        CONTROLE DE FLUXO: break e continue
----------------------------------------------------------------------------
                        ORIENTAÇÃO A OBJETOS (OOP)
        CLASSE E OBJETO:
        ENCAPSULAMENTO:
        HEFANÇA: 
        POLIMORFISMO:
        ABSTRAÇÃO:   
----------------------------------------------------------------------------      
                        EXCEÇÕES
        TRATAMENTO DE EXCEÇÕES: 
----------------------------------------------------------------------------
                        COLEÇÕES
        LISTAS:
        CONJUNTOS:
        MAPAS:
----------------------------------------------------------------------------
                        MANIPULAÇÃO DE ARQUIVOS
        THREADS:
        CLASSE THREAD:
----------------------------------------------------------------------------

                        
                        */
                        /*IMPRIMIR MENSAGENS
        System.out.println("Isso é um texto"); Imprime algo pulando uma linha
        System.out.print("Isso também é um texto, porém sem pular linha");
        só se pode usar um metodo no codigo todo, ou print ou println
-----------------------------------------------------------------------------
                        IMPRIMIR VALORES NUMÉRICOS*/
        System.out.println(956); /*tudo q envolve numeros se imprime sem aspas,
        de numeros unicos à calculos
-----------------------------------------------------------------------------
                        VARIÁVEIS BÁSICAS
        Pra criar variáveis, especifique o tipo e atribua um nome a ela*/
        String name = "Rex"; //String = variável de texto
        System.out.println(name);

        int num = 16; //int = variável de numeros INTEIROS
        int num2;
        num2 = 16; //pode atribuir o valor da variável dps, mas ocupa espaço
        System.out.println(num);
        System.out.println(num2);
/*-----------------------------------------------------------------------------
                        VARIÁVEIS DE IMPRESSÃO*/
        String name2 = "Rex";
        System.out.println("Hello " + name2);

        String firstName = "Rex ";
        String lastName = "Delphim";
        String fullName = firstName + lastName;
        System.out.println(fullName); //junta 2 var pra criar e imprimir uma só

        int x = 5;
        int y = 5;
        System.out.println(x + y ); /*soma as duas var
----------------------------------------------------------------------------
                        MÚLTIPLAS VARIÁVEIS*/
        int a = 5, b = 5;
        System.out.println(a + b );/*msm resultado mas com as variáveis
        declaradas em uma única linha*/

        String word1 = "Rex ", word2 = "Delphim";
        System.out.println(word1 + word2); /*junta um texto ao outro, (usar
        espaço para não fundir as palavras)
-----------------------------------------------------------------------------
                        TODOS OS TIPOS DE  VARIÁVEIS
        String palavra = "Palavra"; Strings são variáveis de texto
        int numero = 1; ints são variáveis de número
        double fracional = 55.55f; o certo para números fracionados seria float,
        mas double tbm serve
        float fracao = 55.55f;
        char letra = 'A'; 'char' serve para imprimir um único caractere, que deve
        ser escrito entre ''
        boolean sla = true; /*boolean serve para questões de verdadeiro ou falso
----------------------------------------------------------------------------
                        EXEMPLOS DA VIDA REAL: Dados de um aluno*/
        String studentName = "Rex Delphim";
        String studentCourse = "Desenvolvimento de Sistemas";
        String studentSerie = "2º ano Ensino Médio";
        int studentRM = 240353;
        int studentAge = 16;
        double studentFreq = 100.00f;
        char studentGrade = 'A';

        System.out.println("Nome do aluno " + studentName);
        System.out.println("Curso " + studentCourse);
        System.out.println("Série " + studentSerie);
        System.out.println("RM (Registro de Matrícula) " + studentRM);
        System.out.println("Idade " + studentAge);
        System.out.println("Frequência " + studentFreq);
        System.out.println("Média do aluno " + studentGrade);
/*----------------------------------------------------------------------------
                        EXEMPLOS DA VIDA REAL:Calcular um volume*/
        int  altura = 57;
        int largura = 68;
        int  comprimento = 23;
        int volume;
        volume = altura * largura * comprimento;

        System.out.println("O comprimento do objeto é: "+ comprimento + "cm");
        System.out.println("A largura do objeto é: " + largura + "cm");
        System.out.println("A altura do objeto é: " + altura + "cm");
        System.out.println("O volume do objeto é: " + volume + "cm");
/*---------------------------------------------------------------------------*/
    }
}
