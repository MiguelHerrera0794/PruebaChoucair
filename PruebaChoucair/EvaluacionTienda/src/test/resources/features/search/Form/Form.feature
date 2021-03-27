# language: es
  Característica: Se debe realizar el  registro
                  de aspirantes para los empleos disponibles

    Escenario: Aplicar a un empleo
      Dado Juan nuevo aspirante accede a la web de Empleados
      Cuando el selecciona un empleo
      Entonces el agrega datos personales al formulario y los envia
