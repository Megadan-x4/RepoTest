package com.megadanx4.anidamiento;

import java.util.HashMap;
import java.util.List;


import com.megadanx4.anidamiento.dto.CheckListDTO;
import com.megadanx4.anidamiento.dto.CheckListRow;
import com.megadanx4.anidamiento.dto.CheckedRow;
import com.megadanx4.anidamiento.dto.CriterioDTO;
import com.megadanx4.anidamiento.dto.NaturalezaDTO;
import com.megadanx4.anidamiento.dto.TipificacionDTO;
import com.megadanx4.anidamiento.util.DummyDB;

public class Main {

	public static void main(String... strings) {

		//Recuperamos la estructura del checklist...
		List<CheckListRow> rows = DummyDB.getChecklistRows();

		//Creamos nuestro checklist con un mapa de naturalezas vacío
		CheckListDTO checklist = new CheckListDTO("ProgramaFinanciero", new HashMap<>());

		//Iteramos los registros que conforman el checklist
		for (CheckListRow row : rows) {
			String idNat = row.getIdNaturaleza();


			NaturalezaDTO naturaleza = checklist.getNaturalezas().get(idNat);
			// Si es una naturaleza nueva, la añadimos al checklist
			if (naturaleza == null) {
				naturaleza = new NaturalezaDTO(idNat, row.getNaturaleza(), new HashMap<>());
				checklist.getNaturalezas().put(idNat, naturaleza);
			}

			CriterioDTO criterio = naturaleza.getCriterios().get(row.getIdCriterio());
			//Si es un criterio nuevo, lo añadimos a la naturaleza
			if (criterio == null) {
				criterio = new CriterioDTO(row.getIdCriterio(), row.getCriterio(), new HashMap<>());
				naturaleza.getCriterios().put(row.getIdCriterio(), criterio);
			}
			
			TipificacionDTO tipificacion = criterio.getTipificaciones().get(row.getIdTipificacion());
			//Si es una tipificación nueva, la agregamos al checklist
			if(tipificacion == null){
				tipificacion = new TipificacionDTO(row.getIdTipificacion(), row.getTipificacion(), false);
				criterio.getTipificaciones().put(row.getIdTipificacion(), tipificacion);	
			}

		}
		
		//Recuperamos las tipificaciones marcadas
		List<CheckedRow> checkedRows = DummyDB.getCheckedRows();
		
		//las iteramos
		for(CheckedRow row : checkedRows){
			NaturalezaDTO naturaleza = checklist.getNaturalezas().get(row.getIdNaturaleza());
			//Si viene una naturaleza, criterio o tipificacion que no está en el checklist, ignoramos el registro
			if(naturaleza == null)
				continue;
			CriterioDTO criterio = naturaleza.getCriterios().get(row.getIdCriterio());
			if(criterio == null)
				continue;
			TipificacionDTO tipificacion = criterio.getTipificaciones().get(row.getIdTipificacion());
			if(tipificacion == null)
				continue;
			//ponemos el valor "seleccionado"
			
			tipificacion.setSeleccionado(row.isSeleccionado());
		}
		
		System.out.println(checklist);

	}

}
