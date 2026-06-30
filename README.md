# Radix Sort 

Este directorio contiene la implementación, pruebas y análisis de rendimiento del algoritmo **Radix Sort**.

---

## Descripción del Algoritmo

**Radix Sort** es un algoritmo de ordenamiento no comparativo que procesa los elementos de forma posicional. Funciona distribuyendo los números en "cubetas" (buckets) según sus dígitos individuales, avanzando de forma secuencial desde el dígito menos significativo (unidades) hasta el más significativo (decenas, centenas, etc.). Al apoyarse en un algoritmo de ordenamiento auxiliar estable (como Counting Sort), logra agrupar los elementos de manera sumamente eficiente sin realizar una sola comparación directa entre ellos, alcanzando una complejidad lineal de $O(n \cdot k)$ ideal para grandes volúmenes de claves numéricas o cadenas de texto.

---

## Recursos y Documentación

En la siguiente tabla encontrarás el acceso directo a los recursos de análisis teórico y empírico diseñados para este algoritmo:

| Recurso | Descripción | Enlace de Descarga / Acceso |
| :--- | :--- | :--- |
| **Documento Técnico (PDF)** | Análisis detallado, demostración de complejidad en el peor, mejor caso y caso promedio, respuesta a las preguntas. | [Descargar Guía Teórica (PDF)](https://github.com/tu-usuario/tu-repositorio/docs/quicksort_analysis.pdf) |
| **Tabla de Tiempos (Excel)** | Hoja de cálculo con gráficas de rendimiento empírico, comparativa de tiempos de ejecución según el tamaño del arreglo ($N$). | [Descargar Tablero de Métricas (XLSX)](https://github.com/JohanBermeo/Activity4_searching_algorithms/sheets/Radix.xlsx) |

