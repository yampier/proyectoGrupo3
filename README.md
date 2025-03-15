Se tiene el servicio desarrollado con spring-boot “pfinal-product-service”:<br>
![image](https://github.com/user-attachments/assets/9aa375f8-2085-482a-936d-8ad65fc0eba9)
 
Se genera el ejecutable a través de gradle:<br>
![image](https://github.com/user-attachments/assets/b3dd13cb-ea01-4db5-a5bb-1e7b90c7f444)
 
Se verificar el jar generado:<br>
![image](https://github.com/user-attachments/assets/c4c91bf2-f1f2-413c-b477-c521672c6af1)
 

Se crea el archivo Dockerfile indicando la version de java, el programa jar generado y el puerto por donde se expondrá la aplicacion:<br>
![image](https://github.com/user-attachments/assets/e8603070-85f4-45b0-b470-e3c905f6a486)
 

Se ejecuta el comando docker para la creación de una imagen a partir del jar.<br>
![image](https://github.com/user-attachments/assets/6031ee24-21ef-4e39-b699-7b199f209ff9)
 
Se verifica la imagen creada:<br>
![image](https://github.com/user-attachments/assets/24ec7806-ec04-4e23-a87b-e247a7c25cf7)
 

Desplegar un contenedor basado en la imagen:<br>
docker run -d -p 8095:9095 --name pfinal-product-service pfinal-product-service:v1
<br>
![image](https://github.com/user-attachments/assets/9d1816e0-849a-4c34-98bc-45ce7fe456db)

 
Verificar el estado del contenedor:<br>
![image](https://github.com/user-attachments/assets/f187c1fe-8faa-4c40-bd5d-d3a76fe11173)

 
Verificar que el contenedor esté en ejecución a través de su log:<br>
![image](https://github.com/user-attachments/assets/1b038863-2c09-4246-804d-8fe6d2339aa1)

 
Probamos el servicio en postman pero a través del puerto del Contenedor:<br>
![image](https://github.com/user-attachments/assets/1b2d67af-b730-4f9f-815f-f23a4452b7b1)
<br>
![image](https://github.com/user-attachments/assets/b964e221-1f6b-411d-93c5-7ee154e6c920)



<b>Subiendo imagen a docker hub</b><br>
Selecciono la imagen a subir:<br>
![image](https://github.com/user-attachments/assets/daa6eba5-218a-45cc-94a7-764e1bd1d37f)

 
Tagleo de imagen:<br>
![image](https://github.com/user-attachments/assets/fb3e0825-2c83-4851-89ee-21b012b4cf6e)
 

Push de imagen:<br>
![image](https://github.com/user-attachments/assets/22158b30-f123-4343-a8d4-3edd50042dc4)
 

Se visualiza la imagen subida al dockerhub:<br>
![image](https://github.com/user-attachments/assets/aee10f17-4148-4cb4-889a-d5deaa878407)

 
Se usa la imagen de Docker Hub para generar un 2do Contenedor:<br>
![image](https://github.com/user-attachments/assets/ffb78ca2-8958-4748-a7a5-dee78ed7362d)
 

Se verifica el contenedor generado:<br>
![image](https://github.com/user-attachments/assets/615dcbde-7d68-4f46-8aba-84584737497a)

 




