personasEstrato1 = 0
ceroHijos1 = 0
total0Hijos1 = 0
unoDosHijos1 = 0
totalDosHijos1 = 0
tresHijosOmas1 = 0
totalTresHijos1 = 0

personasEstrato2 = 0
ceroHijos2 = 0
total0Hijos2 = 0
unoDosHijos2 = 0
totalDosHijos2 = 0
tresHijosOmas2 = 0
totalTresHijos2 = 0


for i in range(11):
    estrato = input(f"""
            Seleccione estrato
            1. Estrato 1
            2. Estrato 2""")

    nroHijos = input("cuantos hijos tienes")

    if estrato == "1":
        personasEstrato1 +=1

        if nroHijos == "0":
            ceroHijos1 +=1
            dinero0Hijos1 = 20000
            total0Hijos1 += dinero0Hijos1

        elif nroHijos == "2" or nroHijos == "1":
            unoDosHijos1 +=1
            dineroDosHijos1 = 25000
            totalDosHijos1 += dineroDosHijos1

        elif nroHijos > "3":
            tresHijosOmas1 += 1
            dineroTresHijos1 = 30000
            totalTresHijos1 += dineroTresHijos1

    elif estrato == "2":
        personasEstrato2 += 1
        if nroHijos == "0":
            ceroHijos2 +=1
            dinero0Hijos2 = 16500
            total0Hijos2 += dinero0Hijos2

        elif nroHijos == "2" or nroHijos == "1":
            unoDosHijos2 +=1
            dineroDosHijos2 = 21500
            totalDosHijos2 += dineroDosHijos2

        elif nroHijos > "3":
            tresHijosOmas2 += 1
            dineroTresHijos2 = 26500
            totalTresHijos2 += dineroTresHijos2

        else:
            print("opcion no valida, no se tomara en cuenta")





totalDinero1 = total0Hijos1 + totalDosHijos1 + totalTresHijos1
totalDinero2 = total0Hijos2 + totalDosHijos2 + totalTresHijos2

totalDinero = totalDinero2 + totalDinero1


print(f""" cantidad de personas en estrato 1 es {personasEstrato1} cantidad de personas en estrato 2 es {personasEstrato2}  total dinero entregado en estrato 1 es {totalDinero1} total dinero entregado en estrato 2 es {totalDinero2} el total personas con 0 hijos es {ceroHijos1 + ceroHijos2} el total personas con 1 0 2 hijos es {unoDosHijos1 + unoDosHijos2}
        el total de personas con 3 hijos o mas es {tresHijosOmas1 + tresHijosOmas2} el total dinero entregado a personas con 0 hijos es {total0Hijos1 + total0Hijos2} el total dinero entregado a personas  con 1 0 2 hijos es {totalDosHijos1 + totalDosHijos2}
        el total dinero entregado a personas  con 3 hijos o mas es {totalTresHijos1 + totalTresHijos2} total pagado por los bonos {totalDinero} """)
