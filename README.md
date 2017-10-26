# SeleniumGrid
Example showing how to run testcases on multiple browsers by hub and node (GRID) concept

Download the project.
Go to "Resources" folder of your project.

you will find 4 batch files.

1.) Double click grid-startup-hub.bat to start the hub.   
2.) If you want to run on Chrome, double click grid-start-up-chromenode.bat to run a node.   
3.) If you want to run on Firefox after step 1, double click grid-startup-firefoxnode.bat to run a node.     
4.) If you want to run on IE after step 1, double click grid-startup-IEnode.bat to run a node.   

Note:
Please change the path to your project resource folder inside batch files.

Now you are ready to run any of the under src/test/java
namely

1.) gridchrome    
2.) gridfirefox   
3.) gridIE


If you want to make node on another machine, copy the resource folder to other machines and edit the path in batch file. 
Then run any node after registering hub to other machines by double clicking grid-startup-hub.bat to start the hub.
