

Aplicar correctamente get y set

**Escenario:**  
Estás creando un programa que guarda información de empleados. Cada empleado tiene un nombre, una edad y una profesión. No se deben guardar edades negativas ni dejar el nombre vacío.

**Lo que tienes que hacer:**
1. Crea una clase llamada `Persona`.  
2. Declara los atributos `nombre`, `edad` y `profesion` como privados.  
3. Crea los métodos `setNombre(String)`, `setEdad(int)`, `setProfesion(String)` y sus respectivos `get`.  
   - `setNombre` debe verificar que el nombre no esté vacío.  
   - `setEdad` solo acepta valores mayores que 0.  
4. En el `main`, crea un objeto `Persona`, prueba asignando valores correctos e incorrectos.  
5. Muestra los resultados con `System.out.println`.
<img width="576" height="226" alt="image" src="https://github.com/user-attachments/assets/b97ab320-93b2-4fff-bf25-4d03d374bf60" />


Corregir errores de encapsulamiento

**Escenario:**  
Un compañero hizo el siguiente código, pero olvidó aplicar correctamente el encapsulamiento.

**Lo que tienes que hacer:**
1. Cambia los atributos a privados.  
2. Corrige los nombres de los métodos a `getNombre()` y `setPrecio(double)`.  
3. Valida que el precio sea mayor a 0.  
4. Crea un método que muestre toda la información del producto.  
5. En el `main`, crea un objeto `Producto` y prueba con precios válidos e inválidos.

<img width="576" height="212" alt="image" src="https://github.com/user-attachments/assets/61be309f-9395-43e9-aaef-56d306a9d92c" />


**Escenario:**  
Trabajas en un sistema bancario. El cliente tiene una `CuentaBancaria` con saldo y titular. El saldo no se puede modificar directamente, solo mediante depósitos o retiros.

**Lo que tienes que hacer:**
1. En el `main`, intenta escribir `c.saldo = 500;` y observa el error.  
2. Crea los métodos:  
   - `depositar(double monto)` → suma al saldo si el monto es positivo.  
   - `retirar(double monto)` → resta del saldo solo si hay suficiente dinero.  
   - `getSaldo()` → muestra el saldo actual.  
3. Prueba diferentes casos: depósito válido, retiro válido, y retiro mayor al saldo.  
4. Muestra los resultados.

<img width="576" height="215" alt="image" src="https://github.com/user-attachments/assets/819e990a-d05f-42cc-a82e-f884a13d0796" />

Escenario combinado: públicos, privados, solo get y solo set

**Escenario:**  
En una aplicación de autos, necesitas crear la clase `Vehiculo`. No todos los datos deben tratarse igual: algunos pueden verse, otros cambiarse y otros deben ocultarse.

**Atributos del vehículo:**
- `marca` → pública (se puede ver directamente)  
- `modelo` → privada (requiere `get` y `set`)  
- `velocidadMaxima` → privada (solo lectura con `get`)  
- `codigoSeguridad` → privada (solo escritura con `set`)  
- `color` → privada (tiene `get` y `set`, solo acepta `'rojo'`, `'azul'` o `'blanco'`)

**Lo que tienes que hacer:**
1. Crea la clase `Vehiculo` con esos atributos.  
2. Define los métodos indicados (`get` o `set` según el caso).  
3. En el constructor asigna `velocidadMaxima`.  
4. En el `main`:  
   - Muestra qué atributos puedes ver directamente.  
   - Intenta leer `codigoSeguridad` (debe dar error).  
   - Intenta poner un color no permitido.  
   - Imprime los datos válidos del vehículo.

<img width="537" height="283" alt="image" src="https://github.com/user-attachments/assets/d3e867da-e7bd-4187-ab4a-f4808936a30f" />
