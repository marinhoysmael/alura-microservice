# Este repositório é o resultado de estudo do curso da Alura Microservices com Spring Cloud: Registry, Config Server e Distributed Tracing

Neste curso implementei dois microservices (loja e fornecedor). Os outros dois (config-server e eureka-server) fazem parte do ecosistema do spring cloud,
sendo o primeiro(config-server) responsável por resolver as configurações dos microservice (exemplo: configuração da JPA) e o eureka-server faz o registro
e resolve o endeço dos servidores.

O servidor fornecedor usa uma configuração de JPA disponibilizada no git: https://github.com/marinhoysmael/alura-microservice-repo/blob/main/fornecedor/fornecedor.yml
por padrão, o spring busca essa configuração no ramo master
