package com.megadanx4.anidamiento.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


import com.megadanx4.anidamiento.dto.CriterioDTO;
import com.megadanx4.anidamiento.dto.NaturalezaDTO;
import com.megadanx4.anidamiento.dto.TipificacionDTO;

public class DTOFactory {
	
	private Random rand;
	private static DTOFactory instance;
	
	
	
	private DTOFactory() {
		rand = new Random();
	}
	
	public static DTOFactory getInstance(){
		if(instance == null)
			instance = new DTOFactory();
		return instance;
	}

	public TipificacionDTO getTipificacion(){
		String id = Integer.toString(rand.nextInt(3) + 1);
		return new TipificacionDTO(id, "Tipificacion_" + id, rand.nextBoolean());
	}
	
	public CriterioDTO getCriterio(){
		int cantTipif = rand.nextInt(10) + 1;
		String id = Integer.toString(rand.nextInt(3) +1);
		
		Map<String, TipificacionDTO> tipificaciones = new HashMap<>();
		
		for(int i = 0 ; i < cantTipif ; i++){
			TipificacionDTO tip = getTipificacion();
			tipificaciones.put(tip.getDescripcion(), tip);
		}
		
		return new CriterioDTO(id, "Criterio_" + id, tipificaciones);
	}
	
	public NaturalezaDTO getNaturaleza(){
		int cantCrits = rand.nextInt(10) + 1;
		String id = Integer.toString(rand.nextInt(3) +1);
		
		Map<String, CriterioDTO> criterios = new HashMap<>();
		
		for(int i = 0 ; i < cantCrits ; i++){
			CriterioDTO crit = getCriterio();
			criterios.put(crit.getDescripcion(), crit);
		}
		
		return new NaturalezaDTO(id, "Naturaleza_" + id, criterios);
	}
	
	
	public NaturalezaDTO getNaturaleza(String id, String descripcion){
		return new NaturalezaDTO(id, descripcion, null);
	}
	
	public CriterioDTO getCriterio(String id, String descripcion){
		return new CriterioDTO(id, descripcion, null);
	}
	
	public TipificacionDTO getTipificacion(String id, String descripcion){
		return new TipificacionDTO(id, descripcion, rand.nextBoolean());
	}
	
	

}
