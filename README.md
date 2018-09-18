# spring-get-cached-bean-bug
Show performance degradation getting cached bean in Spring 5.1.0.RC3

Spring issue: https://jira.spring.io/browse/SPR-17282

The test just fetches the same bean 500.000 times.
In Spring 5.0.9 that takes no time at all, but in 5.1.0.RC3 it takes many seconds.
Something is very broken in the bean lookup cache.

Run test using Spring 5.0.9 first by executing
```
$ ./mvnw clean test
```

Now run test using Spring 5.1.0.RC3 instead by executing
```
$ ./mvnw clean test -Pshowcasebug
```

Compare the times for the test to execute
