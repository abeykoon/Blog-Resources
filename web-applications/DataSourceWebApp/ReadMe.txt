1. Create a database called jndi_test
2. Create a table under that DB called users with following columns

      >>  userID (INT)
	  >>  userName (varchar)

3. Copy my SQL Driver to <AS_HOME>/repository/components/lib directory and start AS Server. 

3. Create a datasource out of above schema in Application server following the steps at https://docs.wso2.com/display/AS521/Exposing+Datasources+as+JNDI+Resources

4. Deploy this war file to Application server.

5. Go to list of web applications. Click on "Go To URL" of the web app (/datsourcetest). Insert an ID (interger) and a name and click submit. 

6. You will observe that data is inserted into the table. 
 	  
