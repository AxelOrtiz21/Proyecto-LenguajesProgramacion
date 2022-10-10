=begin 
Nombre: Axel Ramon Ortiz Flores  Matr.1819000  Hora:V6
Tarea 14:Busqueda en Matriz
=end

print("# De filas: ")
n=gets().to_i
print("# De columnas: ")
m=gets().to_i
a = Array.new(n){Array.new(m)}
c=0

    for i in (0...n)
        for j in (0...m)
            print("A[#{i+1}][#{j+1}]: ")
            a[i][j]= gets().to_i
        end
    end

    print("\nIngrese el numero a buscar: ")
    x=gets().to_i

    for i in (0...n)
        for j in (0...m)
            if (a[i][j]==x)then
            c=c+1  
        end
        end
    end

    print("\nEl numero #{x} aparece #{c} veces en la matriz:\n")
    print("A= ")
    for i in (0...n)
        for j in (0...m)
            print(a[i][j].to_s+ " ")
        end
        print("\n   ")
    end