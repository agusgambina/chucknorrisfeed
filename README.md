# Chuck Norris Feed

This is an small practice understand how to work with springboot, docker and mongodb

To run the application

Start the docker-compose to run `mongodb` and `mongo-express`

```$xslt
$ docker-compose up -d
```

and then run the application

```$xslt
$ ./gradlew bootRun
```

Then you can start bringing Chuck Norris [jokes](http://localhost:8082/jokes)

and the will be saved on the [database](http://localhost:8080)