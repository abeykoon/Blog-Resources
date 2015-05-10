package org.wso2.carbon.sample;

import org.wso2.carbon.sample.util.HazelcastCache;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class HazelcastInitServlet extends HttpServlet {

    public void init() throws ServletException
    {
        HazelcastCache.init();
    }

    public void destroy()
    {

    }
}
