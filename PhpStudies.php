<!DOCTYPE html>
    <html>
        <body>
            <h1>PHP STUDIES</h1>
            <pre>
                                <!--SINTAXE BÁSICA-->
                <?php //Um script PHP pode ser colocado em qualquer lugar do documento.

                    echo "Isso é um texto <br>";//echo escreve coisas na tela
                    ECHO "Isso também é um texto <br>";
                    EcHo "Isso também é um texto <br>";
                    eChO "Isso também é um texto <br>";

    //Palavras-chave como if, else, while, echo, classes, funções e funções definidas pelo usuário não diferenciam maiúsculas de minúsculas.        
    //No entanto, nomes de variáveis ​​diferenciam maiúsculas de minúsculas

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

                                //COMENTÁRIOS
        //Comentários de uma linha
        # Comentários de uma linha
        /*Comentários de mais
        de uma linha */            
        //Comentários multilinha podem servir pra ocultar partes específicas de um código, ou mesmo para adicionar comentários no meio do código e não apenas  no final da linha

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

                                //VARIÁVEIS
    //Variáveis começam com o sinal $, seguido pelo nome da variável.
                    
      /*Exemplo: */ $name = "Rex";
                    $age = 16;
                
    //PHP não tem comando para declarar variáveis. Ela é criada no momento em que se é atribudo um valor a ela pela primeira vez
    
                                /*REGRAS DAS VARIÁVEIS PHP:
    -Um nome de variável deve começar com uma letra ou com um underline 
    -Um nome de variável não pode COMEÇAR com um número, mas pode CONTER um número
    -Um nome de variável pode conter apenas caracteres alfanuméricos e underlines (Az, 0-9 e _), nada de caracteres especiais
    -Os nomes das variáveis ​​diferenciam maiúsculas de minúsculas ( $age e $AGE são duas variáveis ​​diferentes)
    */
             
    //Um texto e  uma variável podem ser unidos de duas formas:

                    $texto = "ler";
                    echo "Eu amo $texto!";
                            //OU
                    $texto = "ler";
                    echo "Eu amo" . $texto . "!";
    
    //Obs: A 1º opção é mais prática, rápida e preferível
    
    //Aqui eu somo 2 variáveis de número

                    $num1 = 5;
                    $num2 = 6;
                    echo $num1 + $num2;

    //Aqui eu somo duas variáveis de texto

                    $word1 = "Rex ";
                    $word2 = "Delphim";
                    echo $word1 + $word2;

    /*PHP suporta os seguintes tipos de dados:
    -String
    -Int
    -Float
    -Boolean
    -Array
    -Object
    -NULL
    -Resource */
    
    //Para saber qual tipo de dado é pedido por cada variável usamos var_dump(valor da variável)

    /*Exemplos:*/   var_dump(5);//Irá retornar: int(5)
                    var_dump("Rex");//Irá retornar: string "Rex"
                    var_dump(3.14);//Irá retornar: float (3.14)
                    var_dump(true);//Irá retornar: bool(true)
                    var_dump([2, 3, 56]);/*Irá retornar: array {[0] = >int(2)  [1] = >int(3)  [2] = >int(56)}*/
                    var_dump(NULL);//Irá retornar: NULL
    
    



















                ?>
            </pre>
        </body>
    </html>