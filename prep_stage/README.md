I have the chance to do my internship in a good company : Thales DIS.
I thank my internship supervisor who allows me to do this 
first internship which I think will be very enriching.

The expected missions are : 

In an international environment at Thales DIS:

Operational maintenance of a secure file exchange platform using multiple protocols (FTP, FTPS, HTTP, SMTP, Connect:Direct, and PESIT), based on the Axway B2Bi solution.

Responsibilities included administration of the management interface (IHM), Level 2 incident handling, implementation of changes, optimization of existing solutions, as well as infrastructure server monitoring and patch management.

Additionally, involved in the industrialization of virtual machine deployments using GitLab.

Since I want the internship to go as smoothly as possible, I want to get ahead of some concepts.

Firstly I want to know the osi model (Open System Interconnection):

The key principle is Encapsulation. When you send a piece of data, it goes down the 7 layers of your computer, it travels on the cable, then it goes up the 7 layers on the destination computer

-- Hight Layer --
Layer 7 : Application - It's the point of contact with us.
Layer 6 : Presentation - It tells us if the file is legible. She Manage encoding, the compression, and to encrypt. (SSL/TLS)
Layer 5 : Session - She open, maintain, and close the connection.
------------------
-- Low Layer --
Layer 4 : Transport - cut the file on some segments. (TCP/UDP)
Layer 3 : Network - Take the segments and add the IP src/dst. It becomes a Package.  
Layer 2 : Data Link - The package is put in a plot
Layer 1 : Physical -the plot is transformed in electric signals (RJ45), light (Fiber optics) or in radio waves (WIFI).
------------------

Next I want to know each port of each protocol :

FTP (File Transfer Protocol) - port 21
SMTP (Simple Mail Transfer Protocol) - port 25
HTTP (Hypertext Transfer Protocol) - port 80
HTTPS (Hypertext Transfer Protocol Secure) - port 443
FTPS (File Transfer Secure Protocol) - port 990

this command netcat shows if the port 80 (HTTP) is open on the ip 192.168.50.12 :

nc -zv 192.168.50.12 80