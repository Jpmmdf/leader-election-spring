FROM openjdk:17

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia o arquivo JAR da aplicação para o diretório de trabalho no container
COPY target/*.jar app.jar

# Define o comando de execução da aplicação quando o container for iniciado
CMD ["java", "-jar", "app.jar"]