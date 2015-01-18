package hr.lakiki.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloWorldServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static final Logger logger = LoggerFactory.getLogger(HelloWorldServlet.class);


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException {

        logger.debug("Just saying hello through logger!");
        resp.getOutputStream().write("Hello Lucijan.".getBytes());
    }
}
