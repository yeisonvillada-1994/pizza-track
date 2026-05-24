# 🍕 Pizza-Track

## Descripción del proyecto

Pizza-Track es un programa realizado en Java que permite gestionar pedidos de pizza usando una estructura de datos tipo **Pila** implementada manualmente mediante una **lista ligada**, sin usar `java.util.Stack`.

El sistema permite registrar pedidos, deshacer pedidos eliminados temporalmente, rehacer pedidos recuperados y mostrar el pedido actual.

---

## 🎯 Objetivo del proyecto

El objetivo de este proyecto es implementar un sistema de gestión de pedidos de pizzas usando una **pila manual**, aplicando conceptos como:

- Clases y objetos
- Arreglos
- Listas ligadas
- Pilas
- Métodos
- Constructores
- Encapsulamiento
- Manejo de datos en consola

Además, el proyecto busca comprender el funcionamiento de las operaciones:

- **Push** → Agregar un pedido
- **Pop** → Eliminar un pedido
- **Peek** → Ver el pedido actual
- **Undo** → Deshacer pedido
- **Redo** → Rehacer pedido

---

## ⚙️ Funcionalidades del sistema

El programa cuenta con las siguientes opciones:

### 1. Registrar Pizza
Permite ingresar el nombre de una pizza y sus 3 ingredientes para guardar el pedido.

### 2. Deshacer (Undo)
Elimina temporalmente el último pedido realizado.

### 3. Rehacer (Redo)
Recupera un pedido que fue deshecho anteriormente.

### 4. Mostrar Pedido Actual
Muestra el pedido que se encuentra en el tope de la pila.

### 0. Salir
Cierra el sistema.

---

## 🛠️ Tecnologías utilizadas

- **Java**
- **Programación Orientada a Objetos (POO)**
- **Lista Ligada**
- **Pila Manual**
- **Visual Studio Code**

---

## 📂 Estructura del proyecto

El proyecto está compuesto por las siguientes clases:

### `Main.java`
Clase principal del sistema. Contiene el menú interactivo y permite ejecutar las funciones del programa.

### `Pizza.java`
Representa una pizza con nombre e ingredientes.

### `Nodo.java`
Representa un nodo de la lista ligada.

### `PilaManual.java`
Implementa una pila manual usando nodos enlazados.

### `GestionPedidos.java`
Gestiona los pedidos y controla las acciones de deshacer y rehacer.

---

## ▶️ Instrucciones de ejecución

### 1. Clonar el repositorio

```bash
git clone URL_DEL_REPOSITORIO
```

### 2. Abrir el proyecto

Abrir la carpeta del proyecto en **Visual Studio Code** o cualquier IDE compatible con Java.

### 3. Compilar el programa

Desde la terminal ejecutar:

```bash
javac *.java
```

### 4. Ejecutar el programa

Ejecutar el archivo principal con el siguiente comando:

```bash
java Main
```

---

## 📸 Capturas de pantalla

### Menú principal

_Agregar captura aquí_

![Captura menú](ruta-imagen)

---

### Registro de pizza

_Agregar captura aquí_

![Captura registro](ruta-imagen)

---

### Función deshacer (Undo)

_Agregar captura aquí_

![Captura undo](ruta-imagen)

---

### Función rehacer (Redo)

_Agregar captura aquí_

![Captura redo](ruta-imagen)

---

### Mostrar pedido actual

_Agregar captura aquí_

![Captura pedido](ruta-imagen)

---

## 🎥 Video de sustentación

Enlace al video de explicación del proyecto:

**Link del video:**  
_Pegar enlace aquí_

---

## 👨‍💻 Autor

**Nombre:** Yeison Villada Sánchez
