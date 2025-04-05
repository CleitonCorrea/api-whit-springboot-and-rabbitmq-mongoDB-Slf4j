
<img src="https://raw.githubusercontent.com/MicaelliMedeiros/micaellimedeiros/master/image/computer-illustration.png" min-width="400px" max-width="400px" width="400px" align="right" alt="Computador iuriCode">

<p align="left">
 Este projeto consome dados de uma fila criada no RabbitMQ e depois salva esses dados no MongoDB. Atravéz de requisições a API do projeto é possivel verificar os dados do pedido de um cliente, o total dos produtos comprados e a lista desses produtos. Para monitorar a sáude da nossa aplicação e observar alguns comportamentos dessa aplicação implementamos o Spring Actuator, Prometheus e o sistemas de dashboar do Grafana. É simples a execução do projeto. Todos os serviços do RabbitMQ, MongoDB, Phometheus e Grafana rodam dentro de um container Docker.

<br />


<p align="left">
  🦄 Linguagens: <strong></strong>
</p>

<p align="left">
  💼 Ferramentas: <strong></strong>
</p>

<p class="no-inline-html" style="aling: left">
  💌Canais para entrar em contato: ⤵️
</p>

<p align="left">
  <a href="#" alt="Gmail">
  <img src="https://img.shields.io/badge/-Gmail-FF0000?style=flat-square&labelColor=FF0000&logo=gmail&logoColor=white&link=cleitoncorreadeveloper@gmail.com" /></a>

  <a href="https://www.linkedin.com/in/cleitoncorrea/" alt="Linkedin" target="_blank" >
  <img src="https://img.shields.io/badge/-Linkedin-0e76a8?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/cleitoncorrea/" /></a>

  <a href="#" alt="WhatsApp">
  <img src="https://img.shields.io/badge/-WhatsApp-25d366?style=flat-square&labelColor=25d366&logo=whatsapp&logoColor=white&link=5514991712011"/></a>
</p>  

## 🤝 Colaboradores

Agradecemos às seguintes pessoas que contribuíram para este projeto:

<table>
  <tr>
    <td align="center">
      <a href="#">
        <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/79/Spring_Boot.svg/1200px-Spring_Boot.svg.png" width="100px" alt="Logo Spring Boot"/><br>
        <sub>
          <b>Spring Boot</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="#">
        <img src="https://herve.beraud.io/images/blog/rabbitmq.png" width="100px;" alt="Logo RabbitMQ"/><br>
        <sub>
          <b>RabbitMQ</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="#">
        <img src="https://infinapps.com/wp-content/uploads/2018/10/mongodb-logo.png" width="100px alt="logo mongoDB" /><br>
        <sub>
          <b>MongoDB</b>
        </sub>
      </a>
    </td>
   <td align="center">
      <a href="#">
        <img src="https://www.clipartmax.com/png/middle/450-4502990_prometheus-logo-logo-prometheus-monitoring.png"width="100px"/><br>
        <sub>
          <b>Prometheus</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

### Passo a Passo para executar a Aplicação

1°) - Dependencias
```
!° - Você precisa ter o Docker instalado em sua maquina
2° - Você precisa ter JVM do JAVA 21 instalado em sua maquina

```
2°) - Executar os serviços do RabbitMQ, MongoDB, Prometheus e Grafana
<p align="left">
  Acesse via terminal a pasta local do projeto aonde se encontra o arquivo docker-compose.yml e execute
</p>
```
docker-compose up
```

Exemplo de mensagem que deve ser consumida

```
   {
       "codigoPedido": 1001,
       "codigoCliente":1,
       "itens": [
           {
               "produto": "lápis",
               "quantidade": 100,
               "preco": 1.10
           },
           {
               "produto": "caderno",
               "quantidade": 10,
               "preco": 1.00
           }
       ]
   }
```
