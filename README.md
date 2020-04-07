# qa-challenge
> Desafio de automação WEB e Rest.

Executa teste web utilizando SeleniumWebDriver + Cucumber e o teste de serviço utilizando RestAssured.

## Installation

OS X & Linux:

```
  git clone projeto
  Navegar até pasta raiz do projeto, procurar o arquivo "config.properties" e inserir a configuração inicial.
   - Alterar o  "USER" para um email valido, e "PASS" para respectiva senha do usuário.
   - Alterar o "Browser" para um navegador de sua escolha.
  ./gradlew build test -Dcucumber.options="--tags @all" --stacktrace
./
```


## Report

Após a execução será disponibilizado um report Html no diretório: target/report
![alt text](https://i.ibb.co/7CBMLQt/Captura-de-tela-de-2020-03-23-05-08-54.png) 


## Development setup

Necessário: 
 - Java8 
 - Gradle
 

```sh
sudo apt-get install java openjdk-8-jdk 
sudo apt-get install gradle 
```


## Meta

Anderson Viana – [@Nik_viana](https://twitter.com/Nik_viana) – andersonsilvav@gmail.com

Distributed under the AndersonViana ZeDelivery license. See ``LICENSE`` for more information.

[https://github.com/andersonviana/](https://github.com/dbader/)

## Contributing

1. Fork it (<https://github.com/andersonviana/qa-challenge/fork>)
2. Create your feature branch (`git checkout -b feature/fooBar`)
3. Commit your changes (`git commit -am 'Add some fooBar'`)
4. Push to the branch (`git push origin feature/fooBar`)
5. Create a new Pull Request

<!-- Markdown link & img dfn's -->
[npm-image]: https://img.shields.io/npm/v/datadog-metrics.svg?style=flat-square
[npm-url]: https://npmjs.org/package/datadog-metrics
[npm-downloads]: https://img.shields.io/npm/dm/datadog-metrics.svg?style=flat-square
[travis-image]: https://img.shields.io/travis/dbader/node-datadog-metrics/master.svg?style=flat-square
[travis-url]: https://travis-ci.org/dbader/node-datadog-metrics
[wiki]: https://github.com/yourname/yourproject/wiki
