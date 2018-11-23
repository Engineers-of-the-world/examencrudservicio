package com.malu.service;

import java.util.List;
import java.util.Optional;

import com.malu.modell.Servicio;

public interface ServicioService {
	
	Servicio findById(long id);
	
	Servicio findByName_servicio(String name_servicio);
	
	void saveSer(Servicio ser);
	
	void updateSer(Servicio ser);
	
	void deleteSerById(long id);
	
	List<Servicio> findAllSers();
	
	void deleteAllSers();
	
	public boolean isSerExist(Servicio ser);
}
