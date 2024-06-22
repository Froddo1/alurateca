- Alurateca

- Descripción:
Alurateca es una aplicación de consola desarrollada en Java utilizando Spring. Esta aplicación permite a los usuarios buscar y gestionar información sobre libros y autores consumiendo la API Guntendex. 

- Funcionalidades

- Menu:
- ![image](https://github.com/Froddo1/alurateca/assets/128931096/14fb5e76-6b3d-4550-99b5-1512f34876cc)
1. Buscar libros por título: Realiza una consulta a la API ingresando el nombre del libro. Si se encuentra, se registra en la base de datos y muestra información como el nombre, el autor, el año de publicación y el número de descargas.
   ![image](https://github.com/Froddo1/alurateca/assets/128931096/9fe9c972-7f5b-4349-8218-efde6ddfb838)
2. Mostrar libros registrados: Muestra todos los libros que han sido registrados en la base de datos tras ser encontrados mediante la búsqueda.
- ![image](https://github.com/Froddo1/alurateca/assets/128931096/25aeb72b-c66e-4425-acc5-3cae9db59005)
4. Mostrar autores registrados: Muestra los autores registrados en la base de datos, incluyendo su nombre, fecha de nacimiento y otros detalles.
- ![image](https://github.com/Froddo1/alurateca/assets/128931096/cdbf1eb8-d3e8-4a06-8ded-96bc7f560d62)
5. Mostrar autores vivos en determinado año: Permite al usuario ingresar un año y muestra todos los autores que estarán vivos en ese año.
- ![image](https://github.com/Froddo1/alurateca/assets/128931096/62a6cafa-3e74-4109-a7f4-fb880302d2e8)
6. Mostrar libros por idioma: Permite al usuario seleccionar un idioma (español, inglés, portugués, alemán) y muestra los libros registrados en ese idioma.
- ![image](https://github.com/Froddo1/alurateca/assets/128931096/dee111a0-69b7-491f-a4a6-26035d45424a)

- Instalación
Para instalar y ejecutar **Alurateca**, sigue estos pasos:

1. Clona el repositorio: `git clone https://github.com/tu_usuario/Alurateca.git`
2. Navega al directorio del proyecto: `cd Alurateca`
3. Asegúrate de tener Java y Spring instalados.
4. Compila y ejecuta la aplicación: `./mvnw spring-boot:run`
