# 1. Serializacion JSON/XML 

Proyecto ejemplo para una introducción a las posibilidades del framework Jackson para externalizar el servicio de serialización JSON de objetos de negocio.

El proyecto presenta una evolucion formativa desde unas primeras pruebas funcionales para obtener la serializacion/deserializacion JSON de un objeto,
a la amplicación del servicio para que cubra al resto de entitades del negocio, en este caso a través de sus DTO's.

Una vez probada la funcionalidad a través de un servicio genérico se desarrollan diversas funcionalidades adicionales:

* Servicios de serialización JSON específicos (ejemplificado a través de un simple servicio de traducción)

* Servicios de serialización a otros formatos, en este caso se proporciona serializacion XML pero puede ser fácilmente extensible a YAML

Por último, una vez probadas las funcionalidades requeridas, se procede al desacoplamiento con los objetos específicos y el framework que implementa el servicio.

Para ello se crea:

* Una interfaz de servicio
* Una enumeración de servicios para poder solicitarlos de forma inequívoca
* Un catálogo de objetos que implementan el servicio específico que los sirve a través de una peticion especifica

Documentación asociada: 
https://drive.google.com/file/d/1ykTdWPEb5QdKVaAdJyqZoNfLAc53EUXU/view?usp=sharing
