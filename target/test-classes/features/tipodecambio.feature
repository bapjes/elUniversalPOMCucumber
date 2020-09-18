Feature:Tipo de Cambio
  Scenario: Validar el tipo de cambio del peso y sus porcentajes : positivo en verde y negativo en rojo
    Given Estoy en la pagina de El Universal
    When Elijo la opcion "ENGLISH"
    Then Valido que este en la página de "English"
     And valido que el tipo de cambio y los porcentajes sean desplegados
     And y que el porcentaje negativo aparezca en rojo y el porcentaje positivo aparezca en verde
