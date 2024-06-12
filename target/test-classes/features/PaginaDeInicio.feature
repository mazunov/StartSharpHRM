# author: Freddy Mendoza
# date: 02/04/2024
# language: es
  Característica: Acceder a Pagina

    @CredencialesValidas
    Escenario: Iniciar sesion con credenciales validas
      Dado El usuario esta en la pagina de inicio
      Cuando El usuario introduce el nombre de usuario admin
      Y El usuario introduce contrasena como serenity
      Entonces El usuario deberia poder iniciar sesion correctamente

    @CredencialesInvalidas
    Esquema del escenario: Inicio de sesion con credenciales no validas
      Dado El usuario esta en la pagina de inicio
      Cuando El usuario introduce el nombre de usuario <nombredeusuario>
      Y El usuario introduce contrasena como <contrasena>
      Entonces El usuario debe poder ver el mensaje de error <mensajeerror>
      Ejemplos:
        | nombredeusuario | contrasena | mensajeerror |
        |admin            |admin       |Error de validación: ¡Nombre de usuario o contraseña inválidos!         |
        |abc              |admin123    |Error de validación: ¡Nombre de usuario o contraseña inválidos!         |
        |abc              |abc123      |Error de validación: ¡Nombre de usuario o contraseña inválidos!         |
        |1#$"             |45'#%       |Error de validación: ¡Nombre de usuario o contraseña inválidos!         |

    @OlvidoContrasena
    Escenario: Verificar la funcionalidad de olvido de contrasena
      Dado El usuario esta en la pagina de inicio
      Cuando El usuario hace click en el enlace olvido su contrasena
      Entonces El usuario debe poder ver una nueva pagina que contenga el boton de restablecer contrasena
