
LABEL maintainer="app@pruebaUsuario"
LABEL version=1.0.0
LABEL description="Micro Servicio Usuario"

# 
RUN mkdir -p /exports/modulos/apibdp/UsuarioMS
RUN mkdir -p /microservice
RUN groupadd -r arqapp && useradd -r -s /bin/false -g arqapp arqapp

#RUN yum update -y && yum -y install net-tools iputils inetutils-ping telnet traceroute
RUN chown -R arqapp:arqapp /microservice
RUN chown -R arqapp:arqapp /exports

WORKDIR /microservice
COPY target/UsuarioMS-1.0.0.war /microservice
USER arqapp
CMD java -jar /microservice/UsuarioMS-1.0.0.war
EXPOSE 8080