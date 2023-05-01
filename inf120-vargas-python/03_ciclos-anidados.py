
#  I. TABLA DE MULTIPLICAR CON DOS FACTORES  A x B = C (dos ciclos anidados)
def tabla(n):
    i = 1
    while (i<=n):
        j = 1
        while(j<=n):
            # print(i, "*", j,"=", (i * j))
            print(str(i)+ "*" + str(j) + "=" + str(i * j))
            j=j+1
        print("\n")    
        i = i + 1
    print('fuera del ciclo')
        
# tabla(10)        




#II. TABLA DE MULTIPLICAR CON TRES FACTORES  A x B x C = D (tres ciclos anidados)

def tabla3(n):
    i = 1
    while (i<=n):
        j = 1
        while(j<=n):
            k = 1
            while(k<=n):
                print(str(i)+ "*" + str(j) + "*" + str(k) + "=" + str(i * j * k))            
                k = k + 1
            j=j+1
        print("\n")    
        i = i + 1
    print('fuera del ciclo')
    
    
# tabla3(10)


def es_primo(n):
    i = 2
    lim = n / 2
    while(i <= lim):
        if (n % i == 0):
            return False 
        i += 1
    return True

print(es_primo(11))


def tablaFactoresPrimos(n):
    i = 1
    while (i<=n):
        j = 1
        while(j<=n):
            if (es_primo(i) and es_primo(j)):
                print(str(i)+ "*" + str(j) + "=" + str(i * j))
            j=j+1
        print("\n")    
        i = i + 1

tablaFactoresPrimos(10)          