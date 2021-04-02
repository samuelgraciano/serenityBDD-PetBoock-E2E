# language: es
Característica: pagina Pet-Book
  Como persona con mascotas
  Quiero usar Pet-Book
  Para ver todos los gatos, todos los perros o todos los animales

  Escenario: Buscar todas las fotos de las mascotas
    Cuando la persona presione el boton All para ver todas las mascotas
    Entonces debe encontrar todas las mascotas

  Escenario: Buscar todas las fotos de perros
    Cuando la persona presione el boton perro
    Entonces debe encontrar todos los perros

  Escenario: Buscar todas las fotos de gatos
    Cuando la persona presione el boton Gato
    Entonces debe encontrar todos los gatos
