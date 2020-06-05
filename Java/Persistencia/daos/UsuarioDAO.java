package daos;

import org.hibernate.Session;
import entities.UsuarioEntity;
import hibernate.HibernateUtil;
import modelo.Usuario;

public class UsuarioDAO {
	
	public Usuario getUsuarioByUsername(String username) {
		Usuario usr = null;
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		UsuarioEntity seleccion = (UsuarioEntity) s.createQuery("from UsuarioEntity u where u.username = ?0").setString(0, username).uniqueResult();
		s.getTransaction().commit();
		s.close();
		usr = toNegocio(seleccion);
		return usr;
	}
	
	public void save(Usuario usr) {
		UsuarioEntity nuevo = toEntity(usr);
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		s.save(nuevo);
		s.getTransaction().commit();
		s.close();
	}
	
	/*
	
	public void update (Usuario usr) {
		UsuarioEntity actualizacion= toEntity(usr);
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		s.update(actualizacion);
		s.getTransaction().commit();
		s.close();
	}

	public void delete(Usuario usr) {
		UsuarioEntity eliminar = toEntity(usr);
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		s.delete(eliminar);
		s.getTransaction().commit();
		s.close();
	}
	
	*/
	
	UsuarioEntity toEntity(Usuario usr) {
		return new UsuarioEntity(usr.getId(), usr.getUsername(), usr.getPassword(), usr.getNombre(), usr.getApellido(), usr.getFechaDeNacimiento(), usr.getDni(), usr.getSexo());
	}

	Usuario toNegocio(UsuarioEntity usr) {
		return new Usuario(usr.getId(), usr.getUsername(), usr.getPassword(), usr.getNombre(), usr.getApellido(), usr.getFechaDeNacimiento(), usr.getDni(), usr.getSexo());
	}
	

}
