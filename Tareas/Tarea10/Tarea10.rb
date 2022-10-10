=begin 
Nombre: Axel Ramon Ortiz Flores  Matr.1819000  Hora:V6
Tarea 10:Serie A
=end

print("Ingresa el numero total de datos: ")
n=gets().to_i
x=1
i=1
j=1
	while i<n

		x=i
		x=x**j
		print("#{x}, ")
		j=j+2
		i=i+1	
	end

	x=i
	x=x**j