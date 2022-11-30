/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.wknd.components.herocomponent;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class herocomponent__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_templates = null;
Object _dynamic_properties = bindings.get("properties");
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.HeroComponent.class.getName(), obj());
_global_templates = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
out.write("<div class=\"cmp-homepagehero\">\r\n\r\n    ");
{
    boolean var_testvariable0 = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_model, "empty")));
    if (var_testvariable0) {
        out.write("\r\n\r\n    <img");
        {
            Object var_attrvalue1 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "hbgfileReference");
            {
                Object var_attrcontent2 = renderContext.call("xss", var_attrvalue1, "uri");
                {
                    boolean var_shoulddisplayattr4 = (((null != var_attrcontent2) && (!"".equals(var_attrcontent2))) && ((!"".equals(var_attrvalue1)) && (!((Object)false).equals(var_attrvalue1))));
                    if (var_shoulddisplayattr4) {
                        out.write(" src");
                        {
                            boolean var_istrueattr3 = (var_attrvalue1.equals(true));
                            if (!var_istrueattr3) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent2));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write(" class=\"cmp-homepagehero__image\" alt=\"FNL_Hero Image.png\"/>\r\n\r\n    <div");
        {
            String var_attrcontent5 = ("cmp-homepagehero__card" + renderContext.getObjectModel().toString(renderContext.call("xss", (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "position")) ? "-right" : ""), "attribute")));
            out.write(" class=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent5));
            out.write("\"");
        }
        out.write(">\r\n\r\n            <div class=\"cmp-homepagehero__card-body\"");
        {
            String var_attrcontent6 = (("background-color: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "color"), "styleToken"))) + ";");
            out.write(" style=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent6));
            out.write("\"");
        }
        out.write(">\r\n\r\n                    <h1 class=\"cmp-homepagehero__card-title\"><a");
        {
            Object var_attrvalue7 = renderContext.getObjectModel().resolveProperty(_global_model, "link");
            {
                Object var_attrcontent8 = renderContext.call("xss", var_attrvalue7, "uri");
                {
                    boolean var_shoulddisplayattr10 = (((null != var_attrcontent8) && (!"".equals(var_attrcontent8))) && ((!"".equals(var_attrvalue7)) && (!((Object)false).equals(var_attrvalue7))));
                    if (var_shoulddisplayattr10) {
                        out.write(" href");
                        {
                            boolean var_istrueattr9 = (var_attrvalue7.equals(true));
                            if (!var_istrueattr9) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent8));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write(" class=\"cmp-homepagehero__card-title-link\">");
        {
            Object var_11 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "title"), "text");
            out.write(renderContext.getObjectModel().toString(var_11));
        }
        out.write("</a></h1>\r\n\r\n                <div class=\"cmp-homepagehero__card-description\">");
        {
            String var_12 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "description"), "html")) + "\r\n\r\n                ");
            out.write(renderContext.getObjectModel().toString(var_12));
        }
        out.write("</div>\r\n\r\n                <div class=\"cmp-homepagehero__card-button-wrapper\">\r\n\r\n                  <a");
        {
            String var_attrcontent13 = (("http://localhost:4502/" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "link"), "uri"))) + ".html");
            out.write(" href=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent13));
            out.write("\"");
        }
        out.write(" class=\"cmp-homepagehero__card-button\">Read More</a>\r\n\r\n                </div>\r\n\r\n            </div>\r\n\r\n    </div> \r\n\r\n    ");
    }
}
out.write("\r\n\r\n    ");
{
    Object var_templatevar14 = renderContext.getObjectModel().resolveProperty(_global_templates, "placeholder");
    {
        Object var_templateoptions15_field$_isempty = renderContext.getObjectModel().resolveProperty(_global_model, "empty");
        {
            java.util.Map var_templateoptions15 = obj().with("isEmpty", var_templateoptions15_field$_isempty);
            callUnit(out, renderContext, var_templatevar14, var_templateoptions15);
        }
    }
}
out.write("\r\n\r\n   \r\n\r\n  </div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

