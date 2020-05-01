Esse projeto tem como finalidade crirar uma estrutura padrão para os projetos.	Steps to run this project:
Ele realiza a criação das seguintes pastas:	

1. Clone this Git repository
- config
- controller
- domain
- facade
- repository
- service
- util

Além disso cria duas classes:

- StartController.java  -> Que configura uma API inicial da aplicação
- StartApplication.java -> Que cria a inicialização da aplicação padrão.

Por fim, possui um pom.xml com todas as dependências necessárias para um novo projeto 	
e um arquivo application.yml que configura a aplicação na porta 8080 com o nome Start Application e desabilita o service discovery do eureka.	

# Como utilizar	

Para utilizar é necessário baixar o projeto e executar o comando:	

mvn clean install	

Após isso é necessário criar o novo projeto com o seguinte comando:	

mvn archetype:generate -DarchetypeGroupId=br.com.archetype -DarchetypeArtifactId=custom-maven-archetype -DarchetypeVersion=1.0.0 -DgroupId=br.com.novoprojeto -DartifactId=novo-projeto -DinteractiveMode=false -DpackageAsDirectory=br/com/novoprojeto	

onde:	

- mvn archetype:generate -> Comando para geração do projeto	
- DarchetypeGroupId      -> Group ID do archetype	
- DarchetypeArtifactId   -> ArtifactoryID do archetype	
- DarchetypeVersion      -> versão do archetype	
- DgroupId               -> Group ID do novo projeto	
- DartifactId            -> Artifact ID do novo projeto	
- DinteractiveMode       -> Desabilita o modo de interação	
- DpackageAsDirectory    -> pasta do projeto separado por barras sem hifens
