@echo off
cd test_server/
java -DIReallyKnowWhatIAmDoingISwear -Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005 -Xms512M -Xmx1024M -jar spigot-1.16.5.jar nogui
pause