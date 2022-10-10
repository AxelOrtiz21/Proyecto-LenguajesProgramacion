=begin 
Nombre: Axel Ramon Ortiz Flores  Matr.1819000  Hora:V6
Tarea 9: Conversión de monedas
=end


print("\t .: Menu :.\n\nConversion de Pesos a:\n\t1.Dolar\n\t2.Euro\n\t3.Yen(Japones)\n\t4.Dolar de Hong Kong\n\n")
print("Del Menu anterior, ingrese la conversion que desea realizar: ")
n= gets().to_i

	case n
		when 1
			print("\nIngrese la cantidad de Dolares a convertir: ")
        	x= gets().to_f
        	P=x*23.12
        	puts("\n#{x} Dolares es igual a #{P} Pesos")
	
		when 2
			print("\nIngrese la cantidad de Euros a convertir: ")
        	x= gets().to_f
        	P=x*25.41
        	puts("\n#{x} Euros es igual a #{P} Pesos")
		when 3
			print("\nIngrese la cantidad de Yenes a convertir: ")
        	x= gets().to_f
        	P=x*0.22
          	puts("\n#{x} Yenes es igual a #{P} Pesos")
	
		when 4
			print("\nIngrese la cantidad de Dolares de Hong Kong a convertir: ")
        	x= gets().to_f
        	P=x*2.99
        	puts("\n#{x} HDK es igual a #{P} Pesos")

		else
			puts("\n\n Debe ingresar un numero de acuerdo al menu dado anteriormente!!")
	end