#Author: thiago.serra@e2etreinamentos.com.br


Feature: pesquisar passagens areas 


  Scenario: eu como cliente quero preeencher os campos de pesquisas com informacoes invalidas
  
  Given eu esteja no site da kayak 
  When  eu preencher os campos de pesquisa com informacoes invalidas
  And   realizar a pesquisa
  Then  site apresentar uma caixa de dialogo solicitando informacoes validas
    
