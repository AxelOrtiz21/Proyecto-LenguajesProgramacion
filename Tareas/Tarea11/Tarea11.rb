=begin 
Nombre: Axel Ramon Ortiz Flores  Matr.1819000  Hora:V6
Tarea 11:Serie B
=end

print("Ingresa el numero total de datos: ")
n=gets().to_i
b=1
m=2
s=2
o=-1
i=0
	while i<=n
		if(b==1)then
			for k in (1..1).step 1
				if(i<=n-1) then
					print("#{o}, ")
					o=o-2;
					i=i+1
				end
			end
			b=0;
		else
			for j in (1..m).step 1
				if(i<n) then
					print("#{s}, ")
					i=i+1
				end
			end
			m=m+1
			s=s+2
			b=1;
		end
	end