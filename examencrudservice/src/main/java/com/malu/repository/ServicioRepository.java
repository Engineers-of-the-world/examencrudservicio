package com.malu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malu.modell.Servicio;
@Repository

public interface ServicioRepository extends JpaRepository<Servicio, Long>{
	Servicio findById(long id);
	
   Servicio findByNameServicio(String name_servicio);
    //Users findByName(String name); 

}
