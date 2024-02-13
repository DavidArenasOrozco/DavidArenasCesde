
personasGuajira = 0
totalAdultosGuajira = 0
totalNiñosGuajira = 0
subtotalGuajira = 0

personasCanon = 0
totalAdultosCanon = 0
totalNiñosCanon = 0
subtotalCanon = 0

personasLlanos = 0
totalAdultosLlanos = 0
totalNiñosLlanos = 0
subtotalLlanos = 0


for i in range(11):

    destino = input(f"""
            A DONDE QUIERE VIAJAR? digite la opción correspondiente
            1. La Guajira
            2. El Cañón del Chicamocha
            3. Los Llanos Orientales""")

    nombre = input("ingrese su nombre")
    adultos = int(input("cuantos adultos van a viajar"))
    niños = int(input("cuantos niños van a viajar?"))


    if destino == "1":
        personasGuajira += 1
        subtotalAdultosGuajira = adultos * 1450000
        subtotalNiñosGuajira = niños * 870000
        subtotalGuajira = subtotalAdultosGuajira + subtotalNiñosGuajira
        totalAdultosGuajira += adultos
        totalNiñosGuajira += niños
        print(f"""
                    nombre {nombre}
                    nombre del destino {destino}
                    numero de personas adultas {adultos}
                    numero de niños {niños}
                    subtotal {subtotalGuajira}""")

    elif destino == "2":
        personasCanon += 1
        subtotalAdultosCanon = adultos * 1450000
        subtotalNiñosCanon = niños * 870000
        subtotalCanon = subtotalAdultosCanon + subtotalNiñosCanon
        totalAdultosCanon += adultos
        totalNiñosCanon += niños
        print(f"""
                    nombre {nombre}
                    nombre del destino {destino}
                    numero de personas adultas {adultos}
                    numero de niños {niños}
                    subtotal {subtotalCanon}""")

    elif destino == "3":
        personasLlanos += 1
        subtotalAdultosLlanos = adultos * 1450000
        subtotalNiñosLlanos = niños * 870000
        subtotalLlanos = subtotalAdultosLlanos + subtotalNiñosLlanos
        totalAdultosLlanos += adultos
        totalNiñosLlanos += niños
        print(f"""
                    nombre {nombre}
                    nombre del destino {destino}
                    numero de personas adultas {adultos}
                    numero de niños {niños}
                    subtotal {subtotalLlanos}""")

    else :
        print("opcion no valida no se tendra en cuenta")


totalAdultos = totalAdultosCanon + totalAdultosLlanos+ totalAdultosGuajira
totalNiños = totalNiñosLlanos + totalNiñosCanon + totalNiñosGuajira
totalDinero = subtotalGuajira + subtotalLlanos + subtotalCanon

print(f"""
        cantidad de personas que viajan a la Guajira {personasGuajira} cantidad de personas que viajan para el cañón 
        de Chicamocha {personasCanon} cantidad de personas que viajan a los Llanos Orientales {personasLlanos} total 
        de dinero de los viajes para la Guajira {subtotalGuajira} total de dinero de los viajes para el cañón de 
        Chicamocha {subtotalCanon} total de dinero de los viajes para los Llanos {subtotalLlanos} total de personas 
        adultas {totalAdultos} total niños {totalNiños} total de dinero para todos los destinos {totalDinero}

        """)