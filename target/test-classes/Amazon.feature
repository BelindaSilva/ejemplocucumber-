
   @AMAZON
    Feature: Validacion de busqueda de Amazon
    As un usuario comun
    I quiero validar la pagina de amazon
    So mostrar resultado de busqueda


    Background:
        Given Cargar la pagina de Amazon

    @AMAZON1
    Scenario Outline: Accediendo al home Amazon para validar busqueda
      When Escribir producto "<producto>"

        Examples:
            | producto|
            | zapato  |
