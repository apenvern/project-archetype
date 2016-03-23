# Archetype-pom

Root pom module for all project. It contains the global configuration for : 

- organization informations
- ciManagement informations
- Team informations
- Java basic configuration
- Properties versions for maven dependency, plugin. Some commande line for check/update dep version. I use the [versions-maven-plugin](http://www.mojohaus.org/versions-maven-plugin/)
```sh
# Display dependency which have newer versions available.
mvn versions:display-dependency-updates
mvn versions:display-plugin-updates
mvn versions:display-property-updates
# updates properties defined in a project
mvn versions:update-properties
```
- Site and reporting information. For generate the site plugin 
```
mvn site:site
```


