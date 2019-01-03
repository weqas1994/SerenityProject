Installations Steps

1. Download  JDK java version 1.8.0_171 (as long as its java 8 i believe you should be fine)
2. Set your Environment for java
3. Download Apache-maven 3.6.0 (set your environment for maven)
4. Download Eclipse Java EE IDE for Web Developers
5. Go to market place in your eclipse under Help module
6. Type in Cucumber and install Cucumber Eclipse plugin
7. cd [where you want your project]
8. git clone https://github.com/tarkiksolutions/manifest-truck-trade-testing.git
7. Then load existing project into eclipse


How to run project through command line
1. make sure you ng serve --open Stevens project
2. go into project directory
3. then type mvn clean
4. then type mvn install
5. and type mvn test

How to run within Eclipse through POM.xml
1. click onto POM.xml
2. then within the tabs that will be avaliable click on pom.xml again
3. right click 
4. scroll to "Run As"
5. mvn clean
6. mvn install
7.mvn test


How to run off Class Level
1. Open Project
2. Expand src/test/java
3. Expand runnerPackage
4. click on Runner class
5. Right click and "Run As" Junit

FYI this is a mockup run not the actual project i will be automating Stevens work this sprint
