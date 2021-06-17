
Feature: Validacion de busqueda de Ebay
  As un usuario comun
  I quiero validar la pagina de Ebay
  So mostrar resultado de busqueda

  Background:
    Given Cargar la pagina de Ebay


  @AMAZON2
  Scenario Outline: Accediendo al home Ebay para validar busqueda
    When Escribir producto "<producto>"
    And dar click en buscar
    And Click en marca "<marca>"

    Examples:
      | producto  |marca|
      | pantalones|Nike |