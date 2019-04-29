
$(document).ready(function () {
    $("#cpf").mask("000.000.000-00");
    $("#dataNasc").mask("00/00/0000");
    $("#telefone").mask("(00)0000-0000");


    $("#formCadastro").validate({
        rules: {
            nome: {
                required: true,
                minWords: 2
            },
            cpf: {
                required: true,
                cpfBR: true

            },
            dataNasc: {
                required: true,
                dateITA: true
            }

        },
        submitHandler: function (form) {
            
            var dados = $(form).serialize();

            $.ajax({
                type: 'POST',
                url: 'ajax.jsp',
                data: dados,
                //funcao para pegar o retorno
                success: function (resposta) {
                    $('#resultado').html(resposta)
                },
                
                error: function () {
                    alert('Ocorreu um erro na requisição Ajax');
                }
            })
            
            return false;

          
        }
    })
})