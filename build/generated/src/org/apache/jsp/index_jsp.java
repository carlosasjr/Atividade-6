package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!--\n");
      out.write("Crie uma aplicação Web em JSP. A aplicação deve ter uma página de formulário com os seguintes campos: \n");
      out.write("Nome (deve ter pelo menos 1 espaço), \n");
      out.write("Data de Nascimento (deve ser uma data válida), \n");
      out.write("Telefone (com máscara (99)9999-9999), \n");
      out.write("CPF (deve ser válido).\n");
      out.write("\n");
      out.write("O formulário deve ser validado com JavaScript e deve ser formatado com o framework Bootstrap 4.\n");
      out.write("\n");
      out.write("Quando o formulário for enviado, a seguinte mensagem deve ser exibida:\n");
      out.write("\n");
      out.write("[Nome] nasceu em [data de nascimento] e possui o CPF [CPF].\n");
      out.write("\n");
      out.write("Exemplo: João nasceu em 30/04/1980 e possui o CPF 999.888.777-66.\n");
      out.write("Para entregar a atividade, crie um repositório no GitHub ou Bitbucket e commite o código-fonte do site.\n");
      out.write("-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <title>Formulário</title>\t\t\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.validate.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/additional-methods.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/localization/messages_pt_BR.min.js\" type=\"text/javascript\"></script> \n");
      out.write("        <script src=\"js/jquery.mask.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("        <script src=\"js/script.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>     \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!--TOPO A E -->\n");
      out.write("            <header class=\"row no-gutters\" id=\"topo\">\n");
      out.write("                <div class=\"col-12 col-md-6\">\n");
      out.write("                    <nav class=\"navbar navbar-expand-sm navbar-dark bg-dark\">\n");
      out.write("                        <a class=\"navbar-brand\" href=\"http://www.fatecguaratingueta.edu.br/\">Fatec</a>\n");
      out.write("                    </nav>\n");
      out.write("                </div> \n");
      out.write("\n");
      out.write("                <div class=\"col-12 col-md-6\">\n");
      out.write("                    <nav class=\"navbar navbar-expand-sm navbar-dark bg-dark\"> \n");
      out.write("\n");
      out.write("                        <button class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#navbarMenu\">\n");
      out.write("                            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("                        <div class=\"navbar-collapse collapse\" id=\"navbarMenu\">\n");
      out.write("                            <div class=\"navbar-nav\">\n");
      out.write("                                <a href=\"index.jsp\" class=\"nav-item nav-link\">Formulário</a>                               \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!--CORPO B -->\n");
      out.write("            <section class=\"row\">\n");
      out.write("                <div class=\"col-12 col-md-12\">\n");
      out.write("\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-header bg-dark text-white\">\n");
      out.write("                            Cadastro\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <form name=\"formCadastro\" id=\"formCadastro\" method=\"post\">\n");
      out.write("                                <div class=\"form-row\">\n");
      out.write("                                    <div class=\"col-12 col-md-6 offset-md-3\">\n");
      out.write("                                        <label for=\"nome\">Nome</label>\n");
      out.write("                                        <input type=\"text\" name=\"nome\" id=\"nome\" class=\"form-control\" />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"form-row\">\n");
      out.write("                                    <div class=\"col-6 col-md-3 offset-md-3\">\n");
      out.write("                                        <label for=\"dataNasc\">Data de Nascimento</label>\n");
      out.write("                                        <input type=\"text\" name=\"dataNasc\" id=\"dataNasc\" class=\"form-control\" />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"form-row\">\n");
      out.write("                                    <div class=\"col-12 col-md-6 offset-md-3\">\n");
      out.write("                                        <label for=\"cpf\">Telefone</label>\n");
      out.write("                                        <input type=\"text\" name=\"telefone\" id=\"telefone\" class=\"form-control\" />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>                                \n");
      out.write("                                \n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"form-row\">\n");
      out.write("                                    <div class=\"col-12 col-md-6 offset-md-3\">\n");
      out.write("                                        <label for=\"cpf\">CPF</label>\n");
      out.write("                                        <input type=\"text\" name=\"cpf\" id=\"cpf\" class=\"form-control\" />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <br>    \n");
      out.write("                                <br>    \n");
      out.write("                                <div class=\"form-row\">\n");
      out.write("                                    <div class=\"col-6 offset-md-3\">\n");
      out.write("                                        <input type=\"submit\" name=\"enviar\" id=\"enviar\" value=\"Enviar\" class=\"btn btn-dark form-control\" />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div> \n");
      out.write("                        \n");
      out.write("                        <div id=\"resultado\" class=\"text-center\"></div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("             \n");
      out.write("\n");
      out.write("        </div>   \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
