FROM jetty
ADD ./target/my-todos-back-0.0.1-SNAPSHOT.war /var/lib/jetty/webapps/root.war
EXPOSE 8080