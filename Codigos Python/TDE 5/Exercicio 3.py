ano = int(input('digite um ano'))
if(ano % 4 == 0) or (ano % 100 == 0 and ano % 400 == 0 ):
    print (' Este é um ano bissexto')
else:
    print('Este ano não é bissexto')