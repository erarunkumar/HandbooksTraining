- Create docker compose file to Orchestrate
    - Use mysql image created earlier via Dockerfile
    - Persist the data directory /var/log/mysql
    - Use tomcat image created earlier via Dockerfile
    - Link the tomcat container to database container
    - Make the app accessible on port 80 of host machine.