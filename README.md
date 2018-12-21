# Restful-with-Jersey-app

It's a simple Restful WS with Jersey implementation for beginners.

Important Steps:

In web.xml you have to mention you jersey Resources package For Jersey Servlet.
 
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

3) Hit url 
	
	http://localhost:port/restful-jersey-app/myresource
	
