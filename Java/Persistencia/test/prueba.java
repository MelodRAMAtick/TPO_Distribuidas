package test;

import modelo.Paciente;
import modelo.Rol;
import modelo.Turno;
import modelo.Usuario;
import views.TurnoView;
import views.UsuarioView;

import java.sql.Timestamp;
import java.util.List;
import controlador.Controlador;
import daos.PacienteDAO;
import daos.RolDAO;
import daos.TurnoDAO;
import daos.UsuarioDAO;

public class prueba {

	public static void main(String[] args) {

//		// INSERTAR USUARIO
//		Usuario usr = new Usuario(0, "delfina@ejemplo.com.ar", "444444", "Delfina", "Martinez", "1993-11-03", 37222715, 'F');
//		UsuarioDAO ud = new UsuarioDAO();
//		ud.save(usr);

//		// SELECT DE USUARIOS
//		Usuario usr = new UsuarioDAO().getUsuarioByUsername("alejandra@ejemplo.com.ar");
//		System.out.println(usr.toString());

//		// VERIFICAR EL LOGIN DE UN USUARIO
//		Usuario usr = new UsuarioDAO().getUsuarioByUsername("alejandra@ejemplo.com.ar");
//		boolean respuestaLogin = usr.verificarLogin("alejandra@ejemplo.com.ar", "asdasd");
//		System.out.println(respuestaLogin);
		
//		// AGREGAR ROL A USUARIO
//		Rol r = new Rol(12, "Paciente");
//		Usuario usr = new UsuarioDAO().getUsuarioByUsername("delfina@ejemplo.com.ar");
//		usr.agregarRol(r);

//		// AGREGAR PACIENTE
//		Paciente p = new Paciente(12, false);
//		p.guardar();

//		// OBTENER LOS ROLES DE UN USR 
//		List<Rol> lr = new RolDAO().getRolesByIdUsr(9);
//		for(Rol r : lr)
//			System.out.println(r.toString());

//		// INSERTAR TURNO
//		Turno turno = new Turno("2020-07-21", "10:30", "Infectologia", "Reservado", 3, 4);
//		turno.guardar();

//		// SELECT DE LOS TURNOS DE UN PACIENTE
//		List<Turno> lt = new Paciente(4).misTurnos();
//		for (Turno t : lt)
//			System.out.println(t.toString());
		
//		// SELECT de estado de pagos
//		Paciente p = new Paciente(6);
//		boolean pagosAlDia = p.alDia();
//		System.out.println(pagosAlDia);
		
		// -------------------------------------- M�todos del Controlador --------------------------------------
		
//		// Verificar login de usr desde Controlador
//		boolean respuesta = Controlador.getInstancia().verficarLogin("miguel@ejemplo.com.ar", "asd5555asd");
//		System.out.println(respuesta);
		
//		// Obtenci�n de un turno
//		TurnoView tv = Controlador.getInstancia().buscarTurnoIndividual(3, "2020-07-30", "12:15");
//		System.out.println(tv.toString());
		
//		UsuarioView uv = Controlador.getInstancia().obtenerUsuario("pedro@ejemplo.com.ar");
//		System.out.println(uv.toString());
		
//		// RESERVA DE TURNO - Update en tabla
//		String reserva = Controlador.getInstancia().reservarTurno(7, 3, "Neumonologia", "2020-07-30", "12:45");
//		System.out.println(reserva);
		
//		// CANCELAR UN TURNO
//		String cancelacion = Controlador.getInstancia().cancelarTurno(5, "2020-09-30", "20:00");
//		System.out.println(cancelacion);
		
//		// CONFIRMAR ASISTENCIA
//		String respuesta = Controlador.getInstancia().confirmarAsistencia(4, "2020-06-01", "21:00");
//		System.out.println(respuesta);
		
		// -------------------------------------- FIN M�todos del Controlador --------------------------------------

		// ------------------------------------------------------------------------------------------------------------
		// ---------------------------------------- ARRIBA DE ESTA L�NEA EST� PROBADO -------------------------------------------------
		// ------------------------------------------------------------------------------------------------------------

//		// SELECT DE LOS TURNOS DE UN M�DICO
//		List<Turno> lt = new MedicoDAO().getTurnosByIdUsrMed(9);
//		for(Turno t : lt)
//			System.out.println(t.toString());

//		//SELECT DE LAS ESPECIALIDADES DE UN M�DICO
//		List<String> le = new MedicoDAO().getEspecialidadesByMedico(4);
//		for(String e : le)
//			System.out.println(e);


	}

}
