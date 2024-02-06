producto = "computador"
cantidad = 3
precio = 5000

subtotal = precio * cantidad
descuento = 0.25 * subtotal
iva = 0.19 * subtotal

total = (subtotal - descuento) + iva

factura = print(f"""producto{producto}
                    cantidad{cantidad}
                    precio{precio}
                    descuento 25%{descuento}
                    iva 19%{iva}
                    total{total}""")