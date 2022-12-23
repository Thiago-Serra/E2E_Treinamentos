#Author: thiago.serra@e2etreinamentos.com.br

@Tag1
Feature: pesquisar passagens aereas
  
  
 Scenario: eu como cliente quero pesquisar viagens com origem e destino

Given eu esteja no site 
When eu pesquisar origem e destino
And clickar no botão de busca
Then apresentar voos com a origem e destino selecionados
