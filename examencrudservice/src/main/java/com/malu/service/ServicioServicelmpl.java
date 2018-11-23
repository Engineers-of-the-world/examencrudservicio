package com.malu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malu.modell.Servicio;
import com.malu.repository.ServicioRepository;
@Service

public class ServicioServicelmpl implements ServicioService{
	
	@Autowired
	ServicioRepository serRepository;

	@Override
	public Servicio findById(long id) {
		return serRepository.findById(id);
	}

	@Override
	public Servicio findByName_servicio(String name_servicio) {
		return serRepository.findByNameServicio(name_servicio);
	}

	@Override
	public void saveSer(Servicio ser) {
		serRepository.save(ser);
		
	}

	@Override
	public void updateSer(Servicio ser) {
		serRepository.save(ser);
		
	}

	@Override
	public void deleteSerById(long id) {
		serRepository.deleteById(id);
		
	}

	@Override
	public List<Servicio> findAllSers() {
		return serRepository.findAll();
	}

	@Override
	public void deleteAllSers() {
		serRepository.deleteAll();
		
	}

	@Override
	public boolean isSerExist(Servicio ser) {
		return findByName_servicio(ser.getNameServicio())!=null;
	}

}
