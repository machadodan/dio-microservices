# dio-microservices

Santander Bootcamp | Full Stack Developer

Arquitetura de Microserviçõs com Spring Cloud 

A implementação  da arquitetura teve como objetivo integrar aplicações rest de seguimentos e datasources diferentes ao gerenciador de serviços Eureka Server utilizado pela NetFlix.
Com a implementação é possível gerenciar as aplicações, escalar de forma rapida e facil e subir varios microserviços diferentes.

A arquitetura baseada em microserviços com Spring Cloud contem:

Service Discovery – conhecido com Eureka Server é onde todos o microserviços são registrados

Config Server – Ele é um gerenciador de configurações de cada microserviço, ou seja nele eu centralizo os arquivos de configuração de porta, host, banco podendo utilizar na nuvem ou local.

Gateway – Ele é responsavel por fazer o load Balance ele se encarrega de traduzir a uri de cada microserviço rest e devolve para o browser via http, android...

First Serviço: primeiro serviço implementado com dado mokado somente retorna uma string no browser e se autentica no Eureka.
Second Serviço: segundo serviço implementado com dado mokado somente retorna uma string no browser e se autentica no Eureka.
Product-Catalog: CRUD completo com cadastro, alteração, exclusão, consulta se autentica no Eureka.
Shopping-Cart: CRUD cadastro de Cart e consulta de item  autentica no Eureka.

Desafios: implementar o config server para pegar as configurações da nuvem e implentar elastic sesarch por limitações de versão do S.O

Foram utilizadas as seguintes tecnologias para desenvolvimento da aplicação:

- JAVA 11
- IntelliJ IDE
- Maven (gerenciamento dependencias)
- Postgresql (CRUD Shopping Cart)
- H2(Product-Catalog)
- Spring Boot 

Por: Daniel Machado



