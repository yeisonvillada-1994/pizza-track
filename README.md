# 🍕 Pizza-Track — Sistema de Gestión de Pedidos

Sistema de gestión de pedidos de pizzería implementado en Java como actividad académica.
Simula las operaciones **Registrar**, **Deshacer (Undo)** y **Rehacer (Redo)** usando
dos pilas manuales basadas en listas ligadas.

---

## 📋 Objetivo

Implementar un sistema en Java que gestione pedidos de pizza mediante:

- **Dos pilas manuales** (sin `java.util.Stack`) basadas en **listas ligadas con nodos**.
- Operaciones `push()`, `pop()`, `peek()` e `isEmpty()` implementadas desde cero.
- Un menú interactivo en consola con las operaciones Registrar, Undo, Redo y Mostrar.

---

## 🗂️ Estructura del Proyecto

```
java/
│
├── Pizza.java          → Modelo de datos: nombre + arreglo fijo de 3 ingredientes
├── Nodo.java           → Nodo de la lista ligada (puntero siguiente)
├── PilaManual.java     → Implementación de pila con lista ligada
├── GestionPedidos.java → Coordina las dos pilas (Undo/Redo)
└── Main.java           → Menú interactivo en consola (punto de entrada)
```

---

## ▶️ Instrucciones de Ejecución

### Requisitos
- Tener instalado [Java JDK](https://www.oracle.com/java/technologies/downloads/) (versión 8 o superior)
- Verificar instalación: `java -version` en la terminal

### Pasos

**1. Abrir la terminal en la carpeta del proyecto:**
```
cd "c:\Users\Usuario\Documents\trabajos U\java"
```

**2. Compilar todos los archivos Java:**
```bash
javac Pizza.java Nodo.java PilaManual.java GestionPedidos.java Main.java
```

**3. Ejecutar el programa:**
```bash
java Main
```

---

## 🎮 Opciones del Menú

| Opción | Acción | Operación interna |
|--------|--------|-------------------|
| `1` | Registrar Pizza | `push()` en pila principal |
| `2` | Deshacer (Undo) | `pop()` principal → `push()` secundaria |
| `3` | Rehacer (Redo) | `pop()` secundaria → `push()` principal |
| `4` | Mostrar Pedido Actual | `peek()` de pila principal |
| `0` | Salir | — |

---

## 🏗️ Arquitectura del Sistema (Dos Pilas)

```
REGISTRAR:    [Pizza] ──push()──▶ [PILA PRINCIPAL]

DESHACER:     [PILA PRINCIPAL] ──pop()──▶ [Pizza] ──push()──▶ [PILA SECUNDARIA]

REHACER:      [PILA SECUNDARIA] ──pop()──▶ [Pizza] ──push()──▶ [PILA PRINCIPAL]
```

---

## 📸 Capturas de consola

> *(Agregar capturas de pantalla aquí después de ejecutar el programa)*

---

## 🎥 Video de Sustentación

> *(Agregar enlace al video de YouTube / Drive / GitHub aquí)*
> 
> El video incluye:
> - Presentación formal del estudiante
> - Explicación de los métodos `push()` y `pop()` implementados manualmente
> - Demostración del ciclo: **Registro → Deshacer → Rehacer**

---

## 👨‍🎓 Autores

- Nombre del estudiante / grupo
