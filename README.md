# multi-module-poc
A POC for a Gradle multi-module Java Spring project with an agnostic domain model.

This project breaks down what would be a mono Gradle project into multiple modules. 
These are modules are intended to be reused by clients and other projects and keep third-party integrations separate from the domain model.

Modules:
* `core`: interfaces and classes without dependencies on third-parties. 
  * POJOs are included here but could be split out into their own module.
  * Some implementations may also exist here if they are not dependent on third-parties.
* `infra`: `core` implementations and third-party integrations that can be reused in consumer apps for things like mockservers.
  * Uses Spring autoconfiguration to reduce mockserver setup.
This package can also be used to build mock endpoints in other projects and uses autoconfiguration for a configuration-less mock server.
* `server`: non-reusable third-party integrations and configuration.

Other useful modules not yet included:
* `metrics`: code needed for observability platforms (could also live in `server`).
* `test`: reusable test factories and generators.
* `client`: library for interacting with the API.
