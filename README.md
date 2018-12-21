# Restful-with-Jersey-app

It's a simple Restful WS with Jersey implementation for beginners.

Important Steps:

1) In web.xml you have to mention you jersey Resources package For Jersey Servlet.
 
	<servlet>
        <servlet-name>Jersey Web Application</servlet-name>
        <servlet-class>com.sun.jersey.spi.container.servlet.ServletContainer</servlet-class>
        <init-param>
            <param-name>com.sun.jersey.config.property.packages</param-name>
            <param-value>com.az.resource</param-value>
        </init-param>
        <load-on-startup>1</load-on-startup>
    </servlet>
    <servlet-mapping>
        <servlet-name>Jersey Web Application</servlet-name>
        <url-pattern>/*</url-pattern>
    </servlet-mapping>

2) Configure any Application server and run.

3) Please check these urls: (please set IP and port if different)
	
	http://localhost:port/restful-jersey-app/myresource	

For XML Producer 

	http://localhost:8080/restful-jersey-app/userResource/usetList

For JSON Producer
 	
	http://localhost:8080/restful-jersey-app/userResource/usetList_JSON

# Notes:
1) For xml return type/Producer we have to declare root element (Please check User class and getUserList method) and we have to use MediaType AS XML
	
	@XmlRootElement
	@Produces(MediaType.APPLICATION_XML)
	
2) For JSON return type/Producer use only 

	@Produces(MediaType.APPLICATION_JSON)	  
	
