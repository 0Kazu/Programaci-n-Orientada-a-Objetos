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

Los objetos poseen **estados** y **comportamientos**:
- Estados: Valores de sus propiedades (atributos = propiedades).
- Comportamientos: Acciones que puede realizar el objeto (métodos).

### Clase
Una clase es un plano o mapa que define cuáles son los atributos y métodos
que un objeto tendrá. También se la conoce como **unidad básica** en POO.

- ![Clases Vs Objetos](./Img/clasesObjetos.jpg)

Entonces, cada clase define la plantilla de cómo se verá el objeto. El objeto, es, en realidad, la instancia de la plantilla o clase. De esta forma, cada objeto es independiente
y tiene su propio estado.

Antes de aprender POO, necesitamos un lenguaje para poder aplicar este 
paradigma. Por lo que procederemos a aprender sobre Java.

## Sintaxis de Java
### Sobre escribir como en python (De la nada)
Primero que todo, en Java, **Nada puede existir fuera de una clase**. Todas las variables
(atributos) y funciones (métodos) deben de estar en una clase, de lo contrario, no existe
y el fichero no se podría compilar. Esto es debido a que java es un lenguaje orientado a 
objetos (Todo existe solo con una clase y nada existe sin una).

### Sobre cómo crear una plantilla (Clase)
La estructura para crear una clase siempre será la siguiente:
```Java
visibilidad class NombreDeClase{
  // code
}
```
Por ejemplo:
```Java
public class Estudiante {
  // code
}
```

El nombre de la clase siempre irá en **PascalCase**. Siempre y cuando **exista una clase
con visibilidad pública, las demás deberán de ser del tipo default o privadas**.

#### Tipos de visibilidades
Cómo las demas clases ven a una clase.
- Public: Lo ve cualquier clase del proyecto (Cualquier carpeta).
- Protected: Lo ven las clases de la misma carpeta y sus subclases (Herencia).
- Default: Solo lo ven las clases que comparten la misma carpeta.
- Private: Solo lo ve la misma clase que lo contiene entre sus llaves.

Aunque en la práctica no es "sólo ver" la clase sino mas bien instanciarla.

### Sobre clases privadas
Existen clases privadas tanto dentro de la clase pública como dentro de una clase con visibilidad por defecto. No existen clases privadas fuera de la clase pública (No tendría sentido ocultarse de nadie).


### Cómo crear clases
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

Cabe aclarar que éste método **siempre** es público.

#### Ejemplo práctico de una clase
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
public class Main {
  modificadorTipo nombreVariable; // el nombre va en camelCase
}
```

#### Tipos de modificadores en variables (Igual que en las clases)
- Private: Sólo la misma clase puede acceder a ella (dentro de sus respectivos {}).
- Default: Sólo lo ven las clases que comparten la misma carpeta.
- Protected: Lo mismo que el default inclyendo a las subclases.
- Public: Vista general, todos pueden ver la variable y manipularla.

### Declaración de métodos
Los métodos son simplemente las funciones que existen dentro de una clase, que
pertenecen a un objeto en particular. Solemos decir que los métodos de un objeto
son las acciones que puede realizar.

La estructura para delcarar un método es la siguiente:
```Java
// nombre archivo: Main.java
public class Main {
  // code

  modificador tipo nombreMetodo(parameter-list) {
    // code

    return variableDeTipotipo;
  }
}
```

#### Firma de un método
La firma de un método es cómo Java ve al método al momento
de guardar espacio en la memoria. Por ejemplo:

```Java
public int acelerar(int velocidadInicial, String tipoTerreno) {
    // Lógica aquí...
    return 100;
}
```

Su firma es: acelerar(int, String)

#### Tipos de datos de un método 
Con el **tipo** nos referimos al dato que retornará la función. Por ejemplo,
si quisieramos sumar números, entonces la función tendría que retornar un número
(entero o decimal), también pueden retornar objetos. Pueden haber casos en los 
que queremos que una función no retorne nada, por lo que usamos la keyword **void**.

### Ubicación del proyecto Java en código (package)
Al momento de crear un archivo Java, con el propósito de desarrollar una solución, es recomendable
trabajar esa solución como un proyecto. Ahora bien, la sintaxis para indicarle a Java el
"proyecto" en el que "vive el fichero .java" es la siguiente:

```Java
package nombreDeLaCarpetaDelProyecto 

// nombre archivo: Main.java
public class Main {
  // code
}
```

Aunque más bien le estamos diciendo en que carpeta vive el fichero Java.

Si el fichero Java está dentro de la carpeta general, entonces:
```Java
package carpetaGeneral.carpetaHija
// "Oye, tú vives en la carpeta carpetaHija, que a su vez está dentro de la carpetaGeneral

// nombre archivo: Main.java
public class Main {
  // code
}
```

### Llamar a código externo (import)
Si queremos usar código que está en otra carpeta (diferente paquete), usamos
la keyword reservada **import**, de esta forma:

```Java
package ubicacionPaquete

import carpetaPadre.carpetaHija.ficheroJava

// nombre archivo: Main.java
public class Main {
  // code
}
```



### Creación de objetos en Java
Dado que ya tenemos el lugar para escribir código, veamos cómo podemos
crear objetos (instanciar clases). La sintaxis es la siguiente: 

```Java
package nombreDeLaCarpetaDelProyecto 

// nombre archivo: Main.java
public class Main {
  // CrearObjeto
  Type nombre_variable = new Type();
}
```

Así, hacemos uso de la keyword reservada **new**.

### Acceder a las propiedades y métodos de un objeto
Lo más común en el paradigma de la programación orientada a objetos es acceder a
éstos y modificar sus atributos o comportamientos. Nos valemos de la siguiente sintaxis ".":

```Java
package nombreDeLaCarpetaDelProyecto 

// nombre archivo: Main.java
public class Main {
  // CrearObjeto
  Type nombre_variable = new Type();

  nombre_variable.nombreMetodo();
  nombre_variable.nombreAtributo;
}
```

### Valor vs Referencia
Los tipos de datos que encontramos en Java son de 2 tipos: primitivos y de
referencia. 

- **Datos primitivos**: boolean, byte, char, short, int, long, float y double.

- **De referencia**: Todos aquellos que no son primitivos, de hecho, estos tipos 
de datos suelen estar compuestos de datos primitivos (Como Strings).

Java tiene diferentes formas de almacenar los datos dependiendo de su tipo. De hecho, 
las variables de **tipo primitivo almacenan el valor** mientras que las variables de
**tipo clase almacenan la referencia**.

Por ejemplo:

![Clases Vs Objetos](./Img/datosvsrferencia.png)

Podría verlo como que el dato solo existe en un lugar de la memoria. Por otro lado, un objeto
es más bien una referencia en la memoria, Java sólo ve hacia donde apunta ese objeto.

De hecho, sea a = 20 y b = a. Entonces, para java, la situación es la siguiente:

![Clases Vs Objetos](./Img/datosvsreferencia1.png)

En cambio, si creamos objetos, éstos no solamente existen. Los objetos al crarse
apuntan a un lugar de la memoria (Su referencia). Por ejemplo:

![Clases Vs Objetos](./Img/datovsreferencia2.png)

Note que si: Pokemon pk4 = pk1; pk4 apuntará a la referencia de un objeto ya creado:

![Clases Vs Objetos](./Img/datovsreferencia3.png)

Dado que ambos objetos tienen mismas referencias, al cambiar un atributo de pk4
o pk1, estamos afectando a ambos objetos. De hecho:

![Clases Vs Objetos](./Img/datovsreferencia4.png)

### Variables de Instancia vs Variables Locales
#### Variables locales
- Es una variable declarada dentro de la definición de un método o función.

- Deben ser inicializadas antes de ser utilizadas (No puede haber un int numeroSuerte; sino int numeroSuerte = 1;)

#### Variables de Instancia
- Es la variable definida para todas las intancias de una clase (Estado del objeto).

- Toman un valor predeterminado si no son inicializadas.

#### Valor predeterminado para variables de instancia
- **Objetos** -> null

- **int, byte, long** -> 0

- **double, float** -> 0.0

- **char** -> ''

- **boolean** -> false

### Tipo de dato null
Es un valor espacial que se puede asignar a cualquier tipo de referencia. Se usa
para indicar que una variable de referencia **no apunta a un objeto aún**.

Por lo tanto, no es posible int a = null; porque int no es un tipo de dato de referencia
sino primitivo.

Como en Unity con C#, si queremos validar que un objeto no es nulo, entonces se verifica
la proposición **objectName != null** o su equivalente sin negación **objectName == null**.

### Constructores
Los constructores son muy importantes al momento de llamar a un objeto. Cuando nosotros
usamos la keyword **new**: ```Pokemon pk1 = new Pokemon();```; la parte de ```Pokemon()```
hace referencia a su constructor.

Son tipos especiales de métodos de métodos que son responsables de crear e 
inicializar un objeto de esa clase.

Al declarar un constructor debemos de tener en cuenta que:
- Éste tiene el mismo nombre que la clase.

- El constructor no retorna ningún tipo de dato.

- No siempre son públicos.

Por ejemplo:
```Java
// Un fichero
package this

public class Rectangulo {
  String color;
  double ancho;
  double alto;

  //constructor de la clase rectangulo
  public Rectangulo(double w, double h){
  color = "negro";
  ancho = w;
  alto = h;
  }
}

// Otro fichero
package this.children

public class TestRectangulo {
  public static void main(String[] args){
  //crea un nuevo objeto de tipo rectangulo con ancho de 10, alto de 5 y de color negro
  Rectangulo r1 = new Rectangulo(10,5);
  //para acceder a las variables del objeto se usa la notacion de punto
  System.out.println("r1 {ancho:"+r1.ancho+" alto:"+r1.alto+"");

  //crea un nuevo objeto de tipo rectangulo con un ancho de 4 y un alto de 2 y de color negro
  Rectangulo r2 = new Rectangulo(4,2);
  System.out.println("r2 {ancho:"+r1.ancho+" alto:"+r1.alto+"");
  }
}
```

Una objeto no se limita sólo a un constructor, éste puede tener N constructores pero deben
de tener diferentes firmas. No puede haber ```public Cuadro(int alto)``` y ```public Cuadro(int altoN)``` en 
**Cuadro.Java**.

Por ejemplo:

```Java
public class Rectangulo {
  String color;
  double ancho;
  double alto;

  //constructor 1
  public Rectangulo(double w, double h, String colorp){
  color = colorp;
  ancho = w;
  alto = h;
  }

  //constructor 2
  public Rectangulo(double w, double h){
  color = "negro";
  ancho = w;
  alto = h;
  }
}
```

Es importante tomar en cuenta que:
- Toda clase necesita al menos un constructor.

- Si una clase no declara un constructor de forma explícita, 
Java creará el constructor predeterminado en tiempo de compilación.

- El constructor predeterminado es un constructor que no recibe
parámetros y tiene modificador de acceso público.

- Si ya existe un constructor entonces Java no considerará el predeterminado.z

### Keyword **this**
"this" es literalmente una referencia al objeto actual. Se usa esta palabra reservada
cada vez que tengamos que hacer referencia al objeto que invoca al método.

Por ejemplo:

```Java
public class Point {
  public int x = 0;
  public int y = 0;

  //Constructor 
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}
```
El operador this también es usado dentro de un constructor para llamar a otro constructor
dentro de la misma clase. 

Por ejemplo:

```Java
public class Rectangulo {
  String color;
  double ancho;
  double alto;
  //constructor 1
  public Rectangulo(double ancho, double alto, String color){
    this.ancho = ancho;
    this.alto = alto;
    this.color = color;
  }
  //constructor 2
  public Rectangulo(double ancho, double alto){
    this(ancho,alto,"negro");
  }
}
```

### Manejo de memoria en Java
Existen dos regiones de memoria, tal como se muestra a continuación:

![Clases Vs Objetos](./Img/stackHeap.png)

- **Stack**: Usada para almacenar las variables locales.

- **Heap**: Usada para almacenar los objetos (referencias).


## Pilares de POO aplicados a Java
### Encapsulamiento
Es el mecanismo que combina la data y al funcionalidad asociada a ella en una
sola unidad (clase). Ya que el propósito de la clase es encapsular la complejidad, en
Java existen mecanismos para ocultar la complejidad de los detalles de la implementación
dentro de la clase.

En resumen "sólo me importa lo que puede hacer la clase, no cómo lo hace".

La forma de ocultar esos detalles de implementación es a través de los modificadores
de acceso.

#### Modificadores de acceso
Los modificadores de accceso determinan a que atributos o métodos se pueden acceder
y a través de quien. La **clase debe** definir cuál es la data y métodos que **quiere exponer**
y cuál es la data y métodos que **quiere ocultar**.

Recordando los respectivos modificadores de acceso:

![Clases Vs Objetos](./Img/acceso.png)

- El modificador **default** permite el acceso siempre y cuando los solicitantes se 
encuentren en el mismo paquete.

- El modificador **protected** permite acceso siempre y cuando los solicitantes se encuentren
en el mismo paquete y a cualquier subclase incluso cuando no se encuentren en el mismo paquete.

### Getter and Setters

### Conversión automática de tipo

### == Vs object1.equals(object2) // instanceof

### Modificador final

### Modificador Static

#### Variables estáticas

#### Métodos estáticos

## Introducción al manejo de colecciones


### Clase Scanner
Scanner es una clase de Java que define propiedades y métodos (obviamente). Usamos ésta clase para crear objetos de tipo entrada de datos (Pedir datos al usuario). Para crear
una instancia de la clase Scanner en Java (Es decir, un objeto):

```Java
Scanner sc = new Scanner(System.in);
sc.nextInt();
}
```



- Static indica que la función o la variable siempre será la misma para todas las
  instancias de ese objeto. Todo objeto instanciado siempre se definirá de sus 
  métodos estáticos.

- Cada vez que ejecutamos código en la terminal, la JVM instancia un objeto de 
  éste, pero sólo lee el Main del objeto además de sus variables estáticas.