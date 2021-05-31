# tinnova

Tem que se colocar na branch master, para isso no branch git tem que executar a sigente instrução
git checkout master

ai encontrara dois projetos
app-algorithm
app-backend

app-algorithm é um aplicação java onde se crio as clases e funcionalidades solicitadas
Executando a clase Main ubicado na package br.com.tinnova vai poder rodar o solicitado
Se crio so uma clase bean Votacao com as 3 funcionalidades solicitadas e o resto de funcionalidades
se encontra implementado na clase Main


app-backend, é uma aplicação no springboot onde se implemento os serviços rest solicitados, foi criado com um banco de dados criado em tempo de execução
JPA H2

POST http://localhost:8080/veiculos

{
    "veiculo":"Veiculo 1",
    "marca":"Fiat",
    "ano":2019,
    "descricao":"Carro suv",
    "vendido":true,
    "created":"2012-04-23T18:25:43.511Z",
    "updated":"2012-04-23T18:25:43.511Z"
}

GET http://localhost:8080/veiculos/4

