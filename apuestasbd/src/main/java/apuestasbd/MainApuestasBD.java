package apuestasbd;

import apuestasbd.dao.UsuarioDao;

public class MainApuestasBD {

	public static void main(String[] args) {

		/**
		 * System.out.println("(1) Acceso. "); System.out.println("(2) Registro");
		 * System.out.println("(3) Salir. ");
		 */
		boolean salir = false;
		do {

			int opcionInicio = Pantalla.menuPantallaInicio();
			switch (opcionInicio) {
			case 1: // ACCESO
				System.out.println("Quiere Acceder");
				login();
				break;
			case 2: // REGISTRO
				System.out.println("Quiere Registrarse");
				registroUsuario();
				break;
			case 3: // SALIR
				System.out.println("HASTA PRONTO! Saliendo...");
				salir = true;
				break;
			default:
				System.out.println("OPCIÓN INCORRECTA");
			}
		} while (!salir);
	}

	public static void registroUsuario() {

		Usuario usuarioNuevo = Pantalla.pedirUsuarioNuevo();

		UsuarioDao usuarioDao = new UsuarioDao();
		boolean insertado = usuarioDao.insertarUsuario(usuarioNuevo);

		if (insertado) {
			System.out.println("SE HA REGISTRADO CON ÉXITO");
			login();
		} else {
			System.out.println("REGISTRO FALLIDO. VUELVA A INTENTARLO");
			// NO HAGO NADA, MUESTRA EL MENÚ PRINCIPAL OTRA VEZ
		}

	}

	public static void login() {
	

	int numeroIntentos = 0;
	boolean encontrado = false;
	
	do{

		Usuario usuarioLogin = Pantalla.pedirCredenciales(); // DESDE LA CLASE PANTALLA LLAMA A PEDIR CREDENCIALES
		UsuarioDao usuarioDAO = new UsuarioDao();
		Usuario usuariodeBD = usuarioDAO.buscarExiste(usuarioLogin.getEmail(), usuarioLogin.getPassword());
		numeroIntentos++;
		if (usuariodeBD != null) {
			System.out.println("BIENVENIDO");

			encontrado = true;
		} else {
			System.out.println(" USUARIO NO EXISTE VERIFICA DATOS");
		}
	}while((!encontrado)&&(numeroIntentos<3));

	if(encontrado)
	{
		Pantalla.menuPantallaPrincipal();
	}else
	{
		System.out.println("NÚMERO DE INTENTOS SUPERADO");
		System.exit(0);// finalizo el programa
		}
	}
}
