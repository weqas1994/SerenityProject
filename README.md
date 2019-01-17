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


Steps for people running on MAC operating Systems
1. Download the latest ChromeDriver https://sites.google.com/a/chromium.org/chromedriver/downloads download mac64
2. Once downloaded drag and drop chromedriver onto desktop and create a folder for Driver and place chromedriver in folder
3. Right click on Chromedriver location and copy location of the directory
4. Then go to eclipse expand project expand src/test/java 
4. Expand basePackage
5. Click double click BaseClass.java
6. Scroll until you see setUp() method, and within System.setProperty replace the path of existing path of driver to current path of driver
7. Make sure that you dont add the .exe for chromedriver "YourPathtoDriverFolder\chromedriver" 
8. Next go to your pom.xml located within your project level folder
9. scroll down close to the end where you'll see plugins for maven-compiler-plugin delete the path of my java
<fork>true</fork>
<executable>C:\Program Files\Java\jdk\bin\javac.exe</executable> 

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
