# demo-springboot

This is a sample spring boot application with API's and mysql database 

This gives you a basic example for the github workflows to deploy the workflow using the yaml file.

The app is also dockerized with docker-compose . 

# Setup 

To setup the spring boot application on your local you just need to run 

```
# To build the jar
./gradlew build 

# To bring the setup up with sql database
 docker-compose up
```

The resource is deployed on azure App Service 
you can access the api's with host : https://my-webapp-java.azurewebsites.net


