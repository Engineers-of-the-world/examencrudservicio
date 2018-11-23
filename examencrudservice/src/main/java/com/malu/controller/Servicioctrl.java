package com.malu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.malu.modell.Servicio;
import com.malu.service.ServicioService;

@RestController
@RequestMapping(value="/api/ser")

public class Servicioctrl {
@Autowired
	
ServicioService serService;
	
	@GetMapping(value="/all")
 protected List<Servicio> allSer(){
	 return serService.findAllSers();
 } 
	@PostMapping("/ifexist")
 protected boolean isExistSer(@RequestBody Servicio ser){
	 return serService.isSerExist(ser);
 }
	
	@PostMapping(value="/save")
 protected void save(@RequestBody Servicio ser){
		
		if(serService.isSerExist(ser)) {
			serService.updateSer(ser);
			System.out.println("El servicio ha sido actualizado");
			
		}else {
			serService.saveSer(ser);
			System.out.println("El servicio ha sido creado");
		}
		serService.saveSer(ser);
	 
 }
	@GetMapping(value="/update")
 protected String update(){
	 return "Welcome a spring boot";
 }	
	@GetMapping(value="/delete")
 protected String delete(){
	 return "Welcome a spring boot";
 }	

}
