#VARIÁVEIS
faturamento = 1200 #tipo: int -> numero inteiro
custo = 750.32 #tipo: float -> ponto flutuante/número com casa decimal

novas_vendas = 100
faturamento = faturamento + novas_vendas

imposto = faturamento * 0.1
lucro = faturamento - custo - imposto

margem_lucro = lucro / faturamento

print ('O faturamento foi de' ,faturamento)
print ('O custo foi de' ,custo)
print ('O lucro foi de',lucro)
print ('A margem de lucro foi de', round(margem_lucro, 3))

mensagem = 'O faturamento da loja foi de tanto' #tipo: string-> texto
email = 'teste01@gmail.com' #tipo: string-> texto

teve_lucro = False/True #ipo: boolean-> verdadeiro ou falso

#Mod -> % resto da divisão

print(10 % 3 )

tempo_contrato = 170 
tempo_anos = 170/12 
print('Tempo em anos', int(tempo_anos))
tempo_meses = 170 % 12
print('Tempo em meses', tempo_meses)

#STRINGS

faturamento = 1000
custo = 700 
lucro = faturamento - custo

print('Faturamento da empresa: {}, Custo: {}, Lucro: {}'.format(faturamento,custo,lucro))
#ou:
print(f'Faturamento da empresa: {faturamento}, Custo: {custo}, Lucro: {lucro}')

email_cliente = 'teste01@gmail.com'

#Maiúscula
email_cliente = email_cliente.upper()
print(email_cliente)
#Minúscula
email_cliente = email_cliente.lower()
print(email_cliente)

#encontrar elemento no(s) texto(s) (indica a posição do item procurado)

print(email_cliente.find('@')) #-1 = valor não encontrado

#tamanho texto
print(len(email_cliente))

#pegar caractere esq. para dir.
print(email_cliente[0])

#dir. para esq.
print(email_cliente[-1]) # -valor desejado

#pegar pedaço do texto
print(email_cliente[:4]) # : -> até o valor selecionado

print(email_cliente[1:4]) # x:x -> de um valor selecionado até outro valor selecionado

#trocar um pedaço do texto
novo_email = email_cliente.replace('gmail.com' , 'hotmail.com')
print(novo_email)

nome = 'alex delphim'

print(nome.capitalize()) #só a 1 letra fica maiúscula
print(nome.title())# a primeira letra de cada palavra fica maiúscula

#especiais

posiçao_arroba = (email_cliente.find('@')) +1 #se quiser excluir o arroba
servidor = email_cliente[posiçao_arroba:]
print(servidor)

#pegar o 1º nome
posiçao_espaço = nome.find(' ')
primeiro_nome = nome[posiçao_espaço]

#pegar o sobrenome
sobrenome = nome[posiçao_espaço +1:]
print(primeiro_nome)
print(sobrenome)

#casos especiais - formataçoes numericas em texto
margem_lucro = round(margem_lucro, 2)
print(f'Faturamento da empresa: R${faturamento:.2f}, Custo: R${custo:.2f}, Lucro: R${lucro:.2f}, Margem{margem_lucro : .0%} ')


#inputs
email = input('Digite seu e-mail: ')
nome = input('Digite seu nome: ')

print('Seja bem-vindo',nome'.' 'Seu e-mail é: ',email'.')


#listas
vendas = {100, 50, 14, 20, 30, 700}
#soma dos elementos
total_vendas = sum(vendas)
print (total_vendas)

#tamanho da lista
quant_vendas = len(vendas)
print (quant_vendas)

#max e min
print(max(vendas))
print(min(vendas))
