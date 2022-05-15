# Graficador-De-Grafos

## Usando un String[] para los vertices y un TemplateAristas[] para las aristas.
```java
  String[] vertices = {"A", "B", "C", "D"};
  TemplateArista[] aristas = {
    new TemplateArista("A", "B"),
    new TemplateArista("A", "C"),
    new TemplateArista("A", "D"),
    new TemplateArista("B", "D"),
    new TemplateArista("C", "D"),
  };
  
  new Graph(vertices, aristas);
```
