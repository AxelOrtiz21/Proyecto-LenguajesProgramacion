=begin 
Nombre: Axel Ramon Ortiz Flores  Matr.1819000  Hora:V6
Tarea 8: Conversión de Temperatura
=end

print("\t\t .: Menu :.\n\n\t\t1. °C -> °F\n\t\t2. °F -> °C\n")
print("\nEn base al menu anterior ingrese el numero de la conversion que desea: ")
n= gets().to_i

	if(n==1) then
		print("\nIngrese la temperatura en grados Centigrados a convertir: ")
        x= gets().to_f
        F=(x* 1.8)+ 32
        puts("\nLa temperatura de #{x} °C es igual a #{F}°F")
	else
		if(n==2) then
			print("\nIngrese la temperatura en  grados Farenheit a convertir: ")
        	x= gets().to_f 
        	C=(x-32)*1.8 
            puts("\nLa temperatura de #{x} °F es igual a #{C} °C")
        else
        	puts("\nDebe ingresar un numero del menu dado anteriormente")
        end
	end