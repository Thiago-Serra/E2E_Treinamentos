#Author: ThiagoNSerra@outlook.com

@consulta
Feature: 
     Como usuario
     Quero buscar nome eleitoral
     Para  consultar nome dos candidatos

  
  Background: acessar api
    Given que eu acesse a api get para consultar nome dos candidatos
  
  
  Scenario: validar status code
    Then eu valido o status code "200" de retorno
    
     Scenario: validar body response estrutura lista nome eleitoral
    Then eu valido a lista de nome eleitoral
  