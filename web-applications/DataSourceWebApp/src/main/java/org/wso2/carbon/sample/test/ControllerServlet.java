package org.wso2.carbon.sample.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Hashtable;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


public class ControllerServlet extends HttpServlet {

    private static final long serialVersionUID = -6161453398989741214L;
    private static final Log wso2Log = LogFactory.getLog(ControllerServlet.class);
    private DataSource datasource;

    public void init(ServletConfig servletConfig) throws ServletException {
        super.init(servletConfig);
        lookUpDataSource();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        String userID = request.getParameter("user_id");
        String userName = request.getParameter("user_name");

        try {

            Connection connection = datasource.getConnection();
            Statement stmt = connection.createStatement();
            stmt.execute("INSERT INTO users (userID, userName)"
                    + "VALUES ('" + userID + "','" + userName +"')");

            wso2Log.info("Successfully created the database record...");

        } catch (SQLException e) {
            e.printStackTrace();
            wso2Log.error("This is the caught error" ,e);
        }

    }

    private void lookUpDataSource() {
        try {
            Hashtable environment = new Hashtable();
            environment.put("java.naming.factory.initial", "org.wso2.carbon.tomcat.jndi.CarbonJavaURLContextFactory");
            Context initContext = new InitialContext(environment);
            wso2Log.info("Look up datasource...");
            datasource = (DataSource) initContext.lookup("jdbc/MyCarbonDataSource");
            if (datasource != null) {
                wso2Log.info("Datasource found");
            } else {
                wso2Log.error("Cannot find MyCarbonDataSource");
            }

        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
