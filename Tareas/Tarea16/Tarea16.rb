=begin 
Nombre: Axel Ramon Ortiz Flores  Matr.1819000  Hora:V6
Tarea 14:Busqueda en Matriz
=end
print("# De filas: ")
k=gets().to_i
print("# De columnas: ")
m=gets().to_i

puts("\nLas filas de B se autodefinen por regla!!")
print("# De columnas: ")
n=gets().to_i

a = Array.new(k){Array.new(m)}

b = Array.new(m){Array.new(n)}

c= Array.new(k){Array.new(n)}


            puts("\nLlenar Arreglo A")
            for i in (0...k)
                for j in (0...m)
                    print("A[#{i+1}][#{j+1}]: ")
                    a[i][j]= gets().to_i
                end
            end
    
            puts("\nLlenar Arreglo B")
            for i in (0...m)
                for j in (0...n)
                    print("B[#{i+1}][#{j+1}]: ")
                    b[i][j]= gets().to_i
                end
            end
    
            for i in (0...k)
                for j in (0...n)
                    c[i][j]= 0
                end
            end

            for i in (0...k)
                for j in (0...n)
                    for z in(0...m)
                    c[i][j] += a[i][z] * b[z][j]
                    end
                end
            end



            puts("\nArreglo Resultante")
            print("C= ")
            for i in (0..n)
                for j in (0..m)
                    print(c[i][j].to_s+ " ")
                end
                print("\n   ")
            end