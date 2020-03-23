#enconding:utf-8
#language:pt


Funcionalidade: Login Zé Delivery

  @login @all @web
  Esquema do Cenario: Login utilizando o email
    Dado que estou na home da aplicacao Zé Delivery
    Quando clico em entrar com email
    E informo um usuário e senha '<type>'
    Então valido o status do login '<status>'

    Exemplos:
      | type     | status         |
      | valido   | successfully   |
      | invalido | unsuccessfully |

