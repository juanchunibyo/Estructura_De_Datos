# 🚀 Estructuras de Datos en Java

Este proyecto muestra de forma práctica la diferencia entre una estructura estática y una estructura dinámica en Java, utilizando ejemplos simples y claros dentro del paquete `estructura_de_datos`.

El objetivo es comprender cómo se almacenan y manipulan los datos, así como la diferencia entre trabajar con arreglos y con listas dinámicas.

---

## 📌 ¿Qué incluye este proyecto?

Este repositorio contiene implementaciones básicas para representar dos tipos de estructuras:

- `Estatico`: una lista basada en arreglos, con capacidad inicial limitada y operaciones como agregar, obtener, modificar, eliminar y buscar elementos.
- `Dinamico`: una lista dinámica que utiliza `ArrayList` para administrar elementos de forma más flexible.
- `Cliente_modelo`: una clase modelo para representar clientes con nombre y cédula.
- `ArreglosGeneral`: una clase principal que demuestra el uso de ambas estructuras.

---

## 🧠 Concepto general

### Estructuras estáticas
Las estructuras estáticas tienen un tamaño fijo al momento de crearse. Son útiles cuando se conoce de antemano cuántos datos se van a manejar.

### Estructuras dinámicas
Las estructuras dinámicas pueden crecer o reducirse durante la ejecución del programa, lo que las hace más flexibles cuando el número de elementos cambia con frecuencia.

---

## 📁 Estructura del proyecto

```text
src/
└── estructura_de_datos/
    ├── ArreglosGeneral.java
    ├── Cliente_modelo.java
    ├── Dinamico.java
    └── Estatico.java
```

---

## 🔧 Clases principales

### `Estatico`
Implementa una lista estática con operaciones básicas:
- `add(...)`
- `get(...)`
- `set(...)`
- `remove(...)`
- `contains(...)`
- `indexOf(...)`
- `clear()`
- `isEmpty()`

### `Dinamico`
Implementa una lista dinámica usando `ArrayList<Cliente_modelo>` con métodos equivalentes a los de la clase estática.

### `Cliente_modelo`
Representa un cliente con:
- `nombre`
- `cedula`

Y métodos para mostrar sus datos.

### `ArreglosGeneral`
Es la clase principal para ejecutar una demostración completa de ambas estructuras.

---

## ▶️ Cómo ejecutar el proyecto

### 1. Compilar

```bash
javac -d build src/estructura_de_datos/*.java
```

### 2. Ejecutar la demostración principal

```bash
java -cp build estructura_de_datos.ArreglosGeneral
```

También puedes ejecutar directamente las clases individuales:

```bash
java -cp build estructura_de_datos.Estatico
java -cp build estructura_de_datos.Dinamico
```

---

## ✅ Ejemplo de uso

La clase `ArreglosGeneral` muestra cómo trabajar con:
- una lista estática mediante `Estatico`
- una lista dinámica mediante `Dinamico`

Incluye operaciones como agregar, insertar, consultar, reemplazar, eliminar y verificar si la lista está vacía.

---

## 🎯 Conclusión

Este proyecto sirve como introducción práctica a las estructuras de datos en Java, permitiendo observar de forma sencilla cómo cambia el comportamiento cuando se trabaja con arreglos fijos frente a listas dinámicas.

