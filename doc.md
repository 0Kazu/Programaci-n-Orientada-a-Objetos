# Programación Orientada a Objetos
## Bases de POO
Luego de haber aprendido la programación estructural en fundamentos
de programación, es hora de explorar de las diferentes formas que disponemos
para resolver un problema, que no sea solo resolver el problema descomponiéndolo
y resolver pequeñas partes de ese problema.

Es aquí donde entra el paradigma (Forma de ver un problema) de la programación orientada
a objetos. En el paradigma de la programación orientada a objetos, no descomponemos 
el problema en problemas más pequeños, mas bien, lo descomponemos en objetos del mundo real.

### Objeto
Es la representación abstracta de una entidad o de un concepto. También se lo asocia 
con un elemento del problema.

Los objetos poseen *estados* y *comportamientos*:
- Estados: Valores de sus propiedades (atributos = propiedades).
- Comportamientos: Acciones que puede realizar el objeto (métodos).

### Clase
Una clase es un plano o mapa que define cuáles son los atributos y métodos
que un objeto tendrá. También se la conoce como *unidad básica* en POO.

- ![Clases Vs Objetos](./Img/clasesObjetos.jpg)

Entonces, cada clase define la plantilla de cómo se verá el objeto. El objeto, es, en realidad, la instancia de la plantilla o clase. De esta forma, cada objeto es independiente
y tiene su propio estado.

### Pilares fundamentales de la programación Orientada a Objetos
#### Abstracción
Consiste en aislar los elementos esenciales de un objeto para crear su "molde" (clase), 
ocultando los detalles que no son relevantes para el sistema (Pero sí para la clase).

 - Piensa en un automóvil. Para conducirlo, solo necesitas interactuar con el volante, los pedales y la palanca de cambios. No necesitas saber exactamente cómo calcula la computadora la inyección de combustible o cómo funciona internamente el motor.

#### Encapsulamiento
Es la acción de reunir los datos (atributos) y los comportamientos (métodos) dentro de una
misma estructura (la clase), y restringir el acceso directo a ellos desde el exterior
(Ésto se logra con las keyWords public, private, default, ...).

 - Piensa en una cápsula de medicina. Los compuestos químicos están guardados dentro para protegerlos y evitar que se alteren.

#### Herencia
Permite crear nuevas clases a partir de clases ya existentes. La nueva clase (clase hija) "hereda" los atributos y métodos de la clase original (clase padre), lo que evita tener que reescribir código y permite extender sus funciones.

 - Piensa en una clase padre llamada Vehiculo (con atributos como marca y modelo), puedes crear clases hijas como Auto, Moto o Camion. Todas ellas comparten las características de un vehículo, pero cada una puede tener sus propios detalles particulares (como numeroDePuertas en el auto).

#### Polimorfismo 
Es la capacidad de que un mismo método o instrucción se comporte de manera diferente según el objeto que lo esté ejecutando.

Ahora bien, necesitamos un lenguaje para poder aplicar este  paradigma. Por lo que
procederemos a aprender sobre Java.

## Introducción a Java
Java es un lenguaje de alto nivel, multiplataforma y orientado a objetos. 
Lo primero que estudiaremos serán los tipos de datos.

### Tipos de datos 
Un tipo de dato es la especificación de un dominio (rango de valores) de un conjunto válido. En Java existen 8 tipos de datos, llamados primitivos.

#### Datos primitivos

Tipos de datos *Numéricos*:
- Byte: valor entero que pertenece al intervalo [-128, 127].

- Short: valor entero que pertenece al intervalo [-32768, 32767].

- Int: valor entero que pertenece al intervalo [-2147483648, 2147483647].

- long: valor entero que pertenece al intervalo [-9223372036854775808, 9223372036854775807].

Tipos de datos *Numéricos flotantes*:
- Float: flotante que pertenece al intervalo de [1.4 x 10-45, 3.4 x 1038].

- Double: flotante que pertenece al intervalo de [4.9 x 10-324, 1.8 x 10308].

Tipos de datos *caracter*:
- Char: Almacena exactamente un caracter.

- Boolean: Valores de verdadero o falso (Lógica proposicional).

#### Datos no primitivos (Objetos)
- String: Conjunto de datos tipo Char (Cadenas de texto).

- Scanner: Leer entrada de datos por teclado.

- Arraylist: Creación de arreglos dinámicos.

### Operadores en Java
Existen 5 tipos de operadores en Java.

#### Operadores ariméticos
|Operador      |Símbolo       |
|--------------|--------------|
|     ++     |Operador de incremento, utilizado para incrementar el valor en 1.|
|     --     |Operador de decremento , usado para disminuir el valor en 1.|

- *Pre-(Incremento/Decremento)*: El valor se incrementa/decrementa primero
y luego se calcula el resultado.

- *Post-(Incremento/Decremento)*: el valor se usa por primera vez para calcular
el resultado y luego se incrementa /decrementa.

- Ejemplo de expresiones: ++a, a++, --a, --a.

#### Operadores Unarios
Los operadores Unarios sólo necesitan un operando.

|Operador      |Descripción       |
|--------------|--------------|
| ==             |    Es igual     |
| !=            |    Es distinto     |
| <   |    Menor     |
| <=         | Menor o igual        |
| >  | Mayor       |
| >= | Mayor o igual        |
| &&         |     Operador Conjunción   |
| Or (Dos barras verticales) | Operador disyunción inclusiva       |
| ! | Operador negación        |

### Comentarios en el código
#### Código de una sola línea
```Java
// Éste es un comentario de una sola línea
```

#### Código multilínea 
```Java
/* Ejemplo de comentarios
*Este es un comentario multilínea
*/
```

### Sobre escribir como en python (De la nada)
Primero que todo, en Java, *Nada puede existir fuera de una clase*. Todas las variables
(atributos) y funciones (métodos) deben de estar en una clase, de lo contrario, no existe
y el fichero no se podría compilar.

### Sobre cómo crear una plantilla (Clase)
La estructura para crear una clase siempre será la siguiente:
```Java
visibilidad class NombreDeClase{
  // code
}
```
El nombre de la clase siempre irá en *PascalCase*. Siempre y cuando exista una clase
con visibilidad pública, las demás deberán de ser del tipo default.

### Tipos de visibilidades
- Public: Lo ve todo el proyecto (Cualquier carpeta).
- Protected: Lo ven las clases de la misma carpeta y sus hijas (Herencia).
- Default: Solo lo ven las clases que comparten la misma carpeta.
- Private: Solo lo ve la misma clase que lo contiene entre sus llaves.

Aunque en la práctica no es "sólo ver" la clase sino mas bien instanciarla.

### Sobre clases privadas
Existen clases privadas tanto dentro de la clase pública como dentro de una clase con visibilidad por defecto. No existen clases privadas fuera de la clase pública (No tendría sentido ocultarse de nadie).

Con esto podemos escribir el siguiente código y note que, a priori, no daría error.
```Java
// Nombre archivo: carro.java 
// Así, no es necesario que tengan el mismo nombre de la clase
// Visibilidad por defecto

class Vehicle {
  String color;
  int power;
  int seats;
}
```

```Java
// Nombre archivo: Vehicle.java
// Si es public, debe llamarse como el fichero
public class Vehicle {
  String color;
  int power;
  int seats;
}
```

En ambos casos, si lo llegase a compilar y a ejectuar, le saldría el mensaje de que 
efectivamente existe la plantilla pero no tiene un método Main (Nada a ejecutar).

### Método Main
Podrías verlo como el botón de encendido de la clase. Es lo primero que Java busca
a toda velocidad en una clase. Éste indica desde dónde se iniciará el programa.

```Java
public static void main(String[] args)
```

Cabe aclarar que éste método *siempre* es público.

### Ejmplo práctico de una clase
```Java
// Nombre archivo: Main.java

class Estudiante {
  String nombre;
  static String universidad = "ESPOL";
}
 
public class Main {
  public static void main(String[] args) {
    Estudiante e1 = new Estudiante();
    Estudiante e2 = new Estudiante();

    e1.nombre = "Carlos";
    e2.nombre = "Ana";

    System.out.println(e1.nombre);
    System.out.println(e2.nombre);

  // ambos comparten universidad
    System.out.println(Estudiante.universidad);
  }
}
```

### Declaración de variables
La estructura para delcarar una variable es la siguiente:
```Java
// nombre archivo: Main.java
public class Main{
  modificadorTipo nombreVariable; // el nombre va en camelCase
}
```

#### Tipos de modificadores en variables
- Private: Sólo la misma clase puede acceder a ella (dentro de sus respectivos {}).
- Default: Sólo lo ven las clases que comparten la misma carpeta.
- Protected: Lo mismo que el default inclyendo a las subclases.
- Public: Vista general, todos pueden ver la variable y manipularla.

### 1. Packpage

### 2. Import
Luego, van todas las librerías que se desea importar al proyecto.
```Java
import java.util.Scanner; // Para importar la librería Scanner
}
```

### 3. La "Clase principal"
Podrán existir N clases pero sólo una de ellas tendrá la keyword *public*. 
Dicha clase es la principal de todo el programa. Dentro de esa clase



### Clase Scanner
Scanner es una clase de Java que define propiedades y métodos (obviamente). Usamos ésta clase para crear objetos de tipo entrada de datos (Pedir datos al usuario). Para crear
una instancia de la clase Scanner en Java (Es decir, un objeto):

```Java
Scanner sc = new Scanner(System.in);
sc.nextInt();
}
```



## Nociones de java
- Todo código en Java vive en una clase (No puede estar suelta como en python).

- La JVM siempre buscará la función principal Main dentro de la clase principal.

- Static indica que la función o la variable siempre será la misma para todas las
  instancias de ese objeto. Todo objeto instanciado siempre se definirá de sus 
  métodos estáticos.

- Cada vez que ejecutamos código en la terminal, la JVM instancia un objeto de 
  éste, pero sólo lee el Main del objeto además de sus variables estáticas.
