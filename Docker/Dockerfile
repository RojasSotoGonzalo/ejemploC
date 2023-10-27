# Usa una imagen base de MySQL
FROM mysql:latest

# Variables de entorno para configurar MySQL
ENV MYSQL_ROOT_PASSWORD=123456
ENV MYSQL_DATABASE=sistema

# Copia archivos SQL de inicialización al contenedor
COPY init.sql /docker-entrypoint-initdb.d/

