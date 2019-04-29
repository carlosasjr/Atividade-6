<%
  //João nasceu em 30/04/1980 e possui o CPF 999.888.777-66.  
    
    String nome = request.getParameter("nome");
    String data = request.getParameter("dataNasc");
    String telefone = request.getParameter("telefone");
    String cpf = request.getParameter("cpf");

 %>   
 
 <h1><%= nome %> nasceu em <%= data %> e possui o CPF <%= cpf %></h1> 
