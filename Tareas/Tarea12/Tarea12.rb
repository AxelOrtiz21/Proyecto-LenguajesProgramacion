=begin 
Nombre: Axel Ramon Ortiz Flores  Matr.1819000  Hora:V6
Tarea 12:Serie C
=end

print("Ingresa un numero total de datos: ")
n=gets().to_i
a=0
j=1
y=1
m=1
b=1
i=1

	while i<=n
        if(y==1) then
            for j in (1..m).step 1
                if(i<=n)then
                    a=a+2
                if(y==1) then
                    print(" #{a},")
                else
                    print("#{a}, ")
                end
                i=i+1
                end
            end
            y=0
            m=m+1
        else
            for k in (1..3).step 1
                if(i<=n)then
                    b=b+2
                    r=b*-1
                if(y==0)then
                    print(" #{r}, ")
                else
                    print(" #{r}, ")
                end
                i=i+1
                end
                y=1
            end
        end

    end


