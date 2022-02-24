# Examen Final - Programación III
### Ing. y Lic. en Sistemas (Turno Feb-Mar 2021 - 1° llamado)


### Objetivos
- Desarrollar endpoints que permitan el registro y consulta de la entidad Computadora
### Tiempo
- 2 horas reloj
### Evaluacion
- Se evaluará la versión del proyecto en el repositorio correspondiente a la hora de finalización del examen, estimada para el día 11/02/2022 11:00
- El proyecto debe compilar sin errores en cualquier entorno de programacion en el que se abra
- Todos los test unitarios deben pasar en verde
- El proyecto contempla nivel Core y Adapter (BD y API Rest)

## Consigna
#### Módulo Computadora
_Se desea implementar un backend para un microservicio que permita registrar y consultar computadoras._

![image](https://user-images.githubusercontent.com/31078412/153335183-2d36e489-cbd7-44ff-9349-762a727c7a95.png)


#### Restricciones:
- No puede existir dos computadoras con el mismo codigo
- Todos los atributos de computadora son obligatorios
- La memoria ram de la computadora debe ser potencia de 2. Ejemplo: 8, 16, 32, 64, etc.
- El disco duro de la computadora debe ser potencia de 2. Ejemplo: 256, 512, 1024, etc.  

#### Funcionalidad
- Gestionar computadora (Crear)
  - Endpoint: POST http://localhost:8080/computadoras
  - RequestBody:
    ```json
    {
      "id": null,
      "codigo": "I9-11_32GB_1TB",
      "procesador":"Core I9 11va Generacion",
      "ram": "32",
      "disco": 1024
    }
    ```

- Buscar computadoras (todas, y por tamaño de memoria ram)
  - Endpoint: GET http://localhost:8080/computadoras
  - Endpoint: GET http://localhost:8080/computadoras/ram/{ram}


#### Buenas prácticas y conceptos a considerar
- La nomenclatura de paquetes será en minúsculas
- La nomenclatura de clases será en UpperCamelCase
- La nomenclatura de métodos será en lowerCamelCase
- La organización de paquetes será por modelo->aspecto, tanto a nivel src/main como a nivel src/test. Ejemplo:
  ```
  computadoras
  └─ excepciones
  └─ modelo
  └─ repositorio
  └─ casodeuso
  ```
- Se deben crear pruebas unitarias en Core. No es requerido en adapter, pero se contemplará el valor agregado si se incorporan
- Usar Excepciones personalizadas
- Se debe usar método factory/instancia para crear objetos
- Nomenclatura representativa de clases, métodos, etc.
# practicaprogramacion
