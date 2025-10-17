user = str(input('Digite o usuario'))
senha = str(input('Digite a senha'))

if user == 'admin' and senha == 'password':
    print ('acesso permitido')
else:
    print('acesso negado')

