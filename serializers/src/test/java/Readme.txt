Los tests que se presentan a continuacion representan el proceso evolutivo de una breve introduccion al framework Jackson para la serialización de objetos

Breve descripción:

T1. Pruebas para serialización Json de un DTO. Comenzamos con un serializador específico por DTO

T2. Utilizamos las clases genéricas y el casting para tener una único servicio de serialización 

T3. Introducimos las anotaciones para poder presentar un servicio de serialización más flexible (en este caso una simple traduccion)

T4. Añadimos la serializacion a XML

T5. Una vez cubierto el aprendizaje de todas las funcionalidades necesarias, pasamos al desacoplamiento con el framework que nos ofrecer el servicio:

    1. Creamos una interfaz para el servicio que nos desacopla de los objetos
    2. Creamos una enumeracion con los nombres de los servicios de aplicacion
    3. Creamos un catálgo que crea y retorna el objeto que implementa cada uno de los servicios por su nombre (el patron Singleton puede sustituirse por Factory/Builder) 

Queda para otro proyecto mostrar como se integra el diseño definitivo dentro de una arquitectura limpia específica
