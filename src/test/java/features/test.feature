Feature: categoria comics
  como usuario quiero ver algun comic para poder visualizarlo

  Scenario: ingresar a la categoria comics desde Home
    Given el usuario se encuentra en la página home de imalittletester
    When el usuario clickea el botón the little tester comics
    Then Se debe redirigir a la pantalla comics