# hasura-springboot
Example spring boot project that integrates with Hasura's graphql using Manifold java library. Handling graphql client side with Manifold library is beautiful with Java.

1. mvn clean install
2. docker-compose up
3. `curl localhost:8000/` to query all
4. `curl -X POST --data "name=boczek" localhost:8000/` to add new