# Modularizacion
Programa en Java que implementa 10 ejercicios diferentes a través de un menú interactivo.
## Funcionalidades
### 1. Calculadora Básica
- Suma, resta, multiplicación y división
- Validación de división por cero
- **Métodos:** `menúCalculadora()`, `suma()`, `resta()`, `multiplicacion()`, `division()`

### 2. Validación de Contraseña
- Sistema con 3 intentos máximos
- Contraseña: 1234
- **Métodos:** `validarContrasena()`

### 3. Números Primos
- Verifica si un número es primo
- **Métodos:** `esPrimo(int numero)`

### 4. Suma de Números Pares
- Suma números pares hasta ingresar 0
- **Métodos:** `sumaPares()`

### 5. Conversión de Temperatura
- Celsius ↔ Fahrenheit
- **Métodos:** `conversionTemperatura()`, `celsiusFahrenheit()`, `fahrenheitCelsius()`

### 6. Contador de Vocales
- Cuenta vocales en una frase
- **Métodos:** `contarVocales(String texto)`

### 7. Cálculo Factorial
- Calcula factorial con validación de negativos
- **Métodos:** `factorial()`, `calcularFactorial(int numero)`

### 8. Juego de Adivinanza
- Adivina un número aleatorio entre 1-100
- **Métodos:** `juegoAdivinanza()`

### 9. Paso por Referencia
- Intercambia dos números usando arrays
- **Métodos:** `pasoPorReferencia()`, `intercambiar(int[] numeros)`

### 10. Tabla de Multiplicar
- Genera tabla del 1 al 10
- **Métodos:** `tablaMultiplicar()`, `generarTabla(int numero)`

## Métodos Auxiliares
- `leerEntero(String mensaje)`: Valida entrada de enteros con try-catch
- `leerDouble(String mensaje)`: Valida entrada de decimales con try-catch
- `mostrarMenú()`: Muestra el menú principal
