# Shellsort

Este directorio contiene la implementación, pruebas y análisis de rendimiento del algoritmo **Shellsort**.

---

## Descripción del Algoritmo

**Shellsort** es una extensión optimizada del ordenamiento por inserción directa que rompe la limitación de mover elementos de uno en uno. Funciona comparando e intercambiando elementos que se encuentran separados por un espacio o distancia (gap) que decrece gradualmente en cada pasada. Al ordenar primero subarreglos de elementos distantes, el algoritmo permite que los valores fuera de lugar avancen rápidamente hacia sus posiciones finales, logrando que el arreglo esté "casi ordenado" cuando el gap se reduce a 1, lo que maximiza la eficiencia final.

---

## Recursos y Documentación

En la siguiente tabla encontrarás el acceso directo a los recursos de análisis teórico y empírico diseñados para este algoritmo:

| Recurso | Descripción | Enlace de Descarga / Acceso |
| :--- | :--- | :--- |
| **Documento Técnico (PDF)** | Análisis detallado, demostración de complejidad en el peor, mejor caso y caso promedio, respuesta a las preguntas. | [Descargar Guía Teórica (PDF)](https://github.com/tu-usuario/tu-repositorio/docs/quicksort_analysis.pdf) |
| **Tabla de Tiempos (Excel)** | Hoja de cálculo con gráficas de rendimiento empírico, comparativa de tiempos de ejecución según el tamaño del arreglo ($N$). | [Descargar Tablero de Métricas (XLSX)](https://github.com/tu-usuario/tu-repositorio/sheets/quicksort_metrics.xlsx) |
