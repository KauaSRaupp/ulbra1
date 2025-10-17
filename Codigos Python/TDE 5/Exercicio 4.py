nota = float(input('Digite a nota:'))
Entregou = input('entregou dentro do prazo?').strip().lower()=='sim'
Trabalho = input('Apresentou o trabalho?').strip().lower()=='sim'

if nota > 6 and Entregou and Trabalho:
    print ('Aprovado')
else:
    print ('Reprovado')