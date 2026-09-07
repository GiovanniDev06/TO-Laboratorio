# Laboratorio 01
# Algoritmo de Conteo de Cambio (Coin Change Problem)

Este proyecto presenta una implementación puramente funcional en **Scala 3** para resolver el clásico problema combinatorio de conteo de cambio. El objetivo es determinar de cuántas maneras diferentes se puede dar el vuelto para una cantidad de dinero específica, dado un conjunto finito de denominaciones de monedas.

## 📌 Descripción del Problema

Dada una cantidad entera `money` y una lista de valores enteros `coins` que representan las denominaciones disponibles, el algoritmo calcula el número total de combinaciones posibles que suman exactamente la cantidad requerida. Se asume que hay un suministro infinito de cada denominación de moneda.

## ⚙️ Lógica de Implementación (Enfoque Recursivo)

La solución se implementa mediante la función `countChange`, la cual utiliza el paradigma de programación funcional y divide el problema en subproblemas más pequeños aplicando recursividad de árbol. 

El algoritmo se rige por las siguientes reglas:

### Casos Base
1. **Éxito (`money == 0`):** Retorna `1`. Si la cantidad restante a cambiar es exactamente cero, se ha encontrado una combinación válida.
2. **Fallo por exceso (`money < 0`):** Retorna `0`. La combinación actual ha superado el monto requerido y es inválida.
3. **Fallo por falta de opciones (`coins.isEmpty`):** Retorna `0`. Aún queda dinero por cambiar, pero ya no hay denominaciones de monedas disponibles.

### Paso Recursivo
Si no se cumple ningún caso base, el problema se bifurca en dos ramas mutuamente excluyentes que se suman:
1. **No usar la moneda actual:** `countChange(money, coins.tail)` (Intenta llegar al monto usando solo el resto de denominaciones).
2. **Usar la moneda actual al menos una vez:** `countChange(money - coins.head, coins)` (Resta el valor de la moneda al monto total y mantiene la moneda disponible para usos futuros).

## 🚀 Requisitos y Ejecución

* **Lenguaje:** Scala 3.
* **Herramienta:** El código puede ejecutarse directamente como un script utilizando el [Runner estándar de Scala](https://docs.scala-lang.org/getting-started/install-scala.html). 

Para ejecutar el código, abre tu terminal en el directorio donde se encuentra el proyecto, asegúrate de que el archivo se llame `vuelto.scala` y ejecuta el siguiente comando:

bash
scala vuelto.scala


## 📊 Salida de Ejemplo

Para el caso de prueba incluido en el método `@main`, donde se busca cambiar una cantidad de `4` usando monedas de `1` y `2`, el programa evalúa las combinaciones (1+1+1+1, 1+1+2, 2+2) y genera la siguiente salida:

text
Formas de dar cambio para 4 con List(1, 2): 3