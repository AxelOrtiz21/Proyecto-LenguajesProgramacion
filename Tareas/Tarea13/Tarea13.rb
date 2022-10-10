=begin 
Nombre: Axel Ramon Ortiz Flores  Matr.1819000  Hora:V6
Tarea 13:Busqueda en vector
=end

print("Ingresa un numero total de datos: ")
n=gets().to_i
a = Array.new(n)
c=0

    for i in (0...n)
        print("Ingresa a[#{i+1}]: ")
        a[i] = gets().to_i
    end

    print("\nIngrese el numero a buscar: ")
    x=gets().to_i

    for i in (0...n)
        if (a[i]==x)then
            c=c+1  
        end
    end

    print("\nEl numero #{x} aparece #{c} veces en el vector:\n")
    print("A=[")
    for i in (0...n)
        print(a[i].to_s+ ", ")
    end
    puts("]")