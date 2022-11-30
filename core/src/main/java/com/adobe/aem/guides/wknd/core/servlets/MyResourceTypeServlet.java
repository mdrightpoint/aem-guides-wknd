package com.adobe.aem.guides.wknd.core.servlets;

import com.adobe.aem.guides.wknd.core.services.OSGiConfig;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
// import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;

@Component(service = Servlet.class)
@SlingServletResourceTypes(resourceTypes = "wknd/components/page", selectors = "myservlet", extensions = "xml", methods = HttpConstants.METHOD_GET)
public class MyResourceTypeServlet extends SlingAllMethodsServlet {
    // private static final Logger LOG =
    // LoggerFactory.getLogger(MyResourceTypeServlet.class);
    /*
     * (non-Javadoc)
     * 
     * @see
     * org.apache.sling.api.servlets.SlingSafeMethodsServlet#doGet(org.apache.sling.
     * api.SlingHttpServletRequest, org.apache.sling.api.SlingHttpServletResponse)
     */
    @Reference
    OSGiConfig osGiConfig;

    @Override
    protected void doGet(final SlingHttpServletRequest req,
            final SlingHttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
         String str = osGiConfig.getServiceName();
        resp.getWriter().write(str);
    }
}