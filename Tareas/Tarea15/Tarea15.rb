=begin 
Nombre: Axel Ramon Ortiz Flores  Matr.1819000  Hora:V6
Tarea 14:Busqueda en Matriz
=end
puts("\nTomando en cuenta que para sumar matrices las longitudes deben ser las mismas, ingrese: ")
print("# De filas: ")
n=gets().to_i
print("# De columnas: ")
m=gets().to_i
a = Array.new(n){Array.new(m)}

b = Array.new(n){Array.new(m)}

c= Array.new(n){Array.new(m)}


            puts("\nLlenar Arreglo A")
            for i in (0...n)
                for j in (0...m)
                    print("A[#{i+1}][#{j+1}]: ")
                    a[i][j]= gets().to_i
                end
            end
    
            puts("\nLlenar Arreglo B")
            for i in (0...n)
                for j in (0...m)
                    print("B[#{i+1}][#{j+1}]: ")
                    b[i][j]= gets().to_i
                end
            end
    
            for i in (0...n)
                for j in (0...m)
                    c[i][j]= a[i][j] + b[i][j]
                end
            end

            puts("\nArreglo Resultante")
            print("C= ")
            for i in (0...n)
                for j in (0...m)
                    print(c[i][j].to_s+ " ")
                end
                print("\n   ")
            end