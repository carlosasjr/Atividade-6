<!--
Crie uma aplicação Web em JSP. A aplicação deve ter uma página de formulário com os seguintes campos: 
Nome (deve ter pelo menos 1 espaço), 
Data de Nascimento (deve ser uma data válida), 
Telefone (com máscara (99)9999-9999), 
CPF (deve ser válido).

O formulário deve ser validado com JavaScript e deve ser formatado com o framework Bootstrap 4.

Quando o formulário for enviado, a seguinte mensagem deve ser exibida:

[Nome] nasceu em [data de nascimento] e possui o CPF [CPF].

Exemplo: João nasceu em 30/04/1980 e possui o CPF 999.888.777-66.
Para entregar a atividade, crie um repositório no GitHub ou Bitbucket e commite o código-fonte do site.
-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Formulário</title>		
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />

        <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script src="js/jquery.validate.min.js" type="text/javascript"></script>
        <script src="js/additional-methods.js" type="text/javascript"></script>
        <script src="js/localization/messages_pt_BR.min.js" type="text/javascript"></script> 
        <script src="js/jquery.mask.min.js" type="text/javascript"></script>
        
        <script src="js/script.js" type="text/javascript"></script>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>     
    </head>
    <body>
        <div class="container">
            <!--TOPO A E -->
            <header class="row no-gutters" id="topo">
                <div class="col-12 col-md-6">
                    <nav class="navbar navbar-expand-sm navbar-dark bg-dark">
                        <a class="navbar-brand" href="http://www.fatecguaratingueta.edu.br/">Fatec</a>
                    </nav>
                </div> 

                <div class="col-12 col-md-6">
                    <nav class="navbar navbar-expand-sm navbar-dark bg-dark"> 

                        <button class="navbar-toggler" data-toggle="collapse" data-target="#navbarMenu">
                            <span class="navbar-toggler-icon"></span>
                        </button>

                        <div class="navbar-collapse collapse" id="navbarMenu">
                            <div class="navbar-nav">
                                <a href="index.jsp" class="nav-item nav-link">Formulário</a>                               
                            </div>
                        </div>
                    </nav>
                </div>
            </header>


            <!--CORPO B -->
            <section class="row">
                <div class="col-12 col-md-12">

                    <div class="card">
                        <div class="card-header bg-dark text-white">
                            Cadastro
                        </div>

                        <div class="card-body">
                            <form name="formCadastro" id="formCadastro" method="post">
                                <div class="form-row">
                                    <div class="col-12 col-md-6 offset-md-3">
                                        <label for="nome">Nome</label>
                                        <input type="text" name="nome" id="nome" class="form-control" />
                                    </div>
                                </div>
                                
                                <div class="form-row">
                                    <div class="col-6 col-md-3 offset-md-3">
                                        <label for="dataNasc">Data de Nascimento</label>
                                        <input type="text" name="dataNasc" id="dataNasc" class="form-control" />
                                    </div>
                                </div>
                                
                                <div class="form-row">
                                    <div class="col-12 col-md-6 offset-md-3">
                                        <label for="cpf">Telefone</label>
                                        <input type="text" name="telefone" id="telefone" class="form-control" />
                                    </div>
                                </div>                                
                                


                                <div class="form-row">
                                    <div class="col-12 col-md-6 offset-md-3">
                                        <label for="cpf">CPF</label>
                                        <input type="text" name="cpf" id="cpf" class="form-control" />
                                    </div>
                                </div>


                                <br>    
                                <br>    
                                <div class="form-row">
                                    <div class="col-6 offset-md-3">
                                        <input type="submit" name="enviar" id="enviar" value="Enviar" class="btn btn-dark form-control" />
                                    </div>
                                </div>
                            </form>
                        </div> 
                        
                        <div id="resultado" class="text-center"></div>

                    </div>
                </div>
            </section>

            <br>
            <br>

             

        </div>   

    </body>
</html>