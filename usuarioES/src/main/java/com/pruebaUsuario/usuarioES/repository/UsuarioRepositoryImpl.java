package com.pruebaUsuario.usuarioES.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.pruebaUsuario.usuarioES.model.UsuarioExterno;
import com.pruebaUsuario.usuarioES.model.UsuarioInterno;

@Repository
public class UsuarioRepositoryImpl implements UsuarioRepository{

	@Autowired
	private MongoTemplate mongoTemplate;
	
	
	@Override
	public UsuarioExterno getUserById(String id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("userId").is(id));
		return mongoTemplate.findOne(query, UsuarioExterno.class);
	}


	@Override
	public UsuarioInterno getUserById1(String id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("userId").is(id));
		return mongoTemplate.findOne(query, UsuarioInterno.class);
	}	

}
