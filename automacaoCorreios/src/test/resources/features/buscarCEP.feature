#Author: ThiagoNSerra@outlook.com
@teste
Feature: Eu como usuario quero pesquisar CEP e endereco

  @tag1
  Scenario: buscar CEP com dados validos
    Given Eu esteja no site do correios 
    When informar dados de CEP validos 
    And clickar no botao de busca
    Then site informa endereco completo
    
    
    @tag2
     Scenario: buscar CEP com dados invalidos
    Given Eu esteja no site da correios 
    When informar dados de CEP invalidos 
    And clickar no botao de buscar
    Then site informa dados nao encontrados

 
