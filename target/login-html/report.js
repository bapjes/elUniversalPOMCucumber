$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/Resources/features/tipodecambio.feature");
formatter.feature({
  "name": "Tipo de Cambio",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validar el tipo de cambio del peso y sus porcentajes : positivo en verde y negativo en rojo",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Estoy en la pagina de El Universal",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeSteps.Estoy_en_la_pagina_de_El_Universal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Elijo la opcion \"ENGLISH\"",
  "keyword": "When "
});
formatter.match({
  "location": "HomeSteps.elijoLaOpcion(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Valido que este en la página de \"English\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeSteps.validoQueEsteEnLaPáginaDe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido que el tipo de cambio y los porcentajes sean desplegados",
  "keyword": "And "
});
formatter.match({
  "location": "HomeSteps.validoQueElTipoDeCambioYLosPorcentajesSeanDesplegados()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "y que el porcentaje negativo aparezca en rojo y el porcentaje positivo aparezca en verde",
  "keyword": "And "
});
formatter.match({
  "location": "HomeSteps.yQueElPorcentajeNegativoAparezcaEnRojoYElPorcentajePositivoAparezcaEnEnVerde()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});