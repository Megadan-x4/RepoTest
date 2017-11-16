package com.megadanx4.anidamiento.util;

import java.util.ArrayList;
import java.util.List;

import com.megadanx4.anidamiento.dto.CheckListRow;
import com.megadanx4.anidamiento.dto.CheckedRow;

/**
 * Simula la BD
 * @author ADMINISTRADORCITO
 *
 */
public class DummyDB {
	
	private DummyDB(){}

	public static List<CheckListRow> getChecklistRows(){
		List<CheckListRow> rows = new ArrayList<>();
		
		rows.add(getCheckListRow("1","1","1"));
		rows.add(getCheckListRow("1","1","2"));
		rows.add(getCheckListRow("1","2","3"));
		rows.add(getCheckListRow("1","3","4"));
		rows.add(getCheckListRow("1","3","5"));
		
		rows.add(getCheckListRow("2","1","1"));
		rows.add(getCheckListRow("2","1","2"));
		rows.add(getCheckListRow("2","1","3"));
		rows.add(getCheckListRow("2","1","4"));
		rows.add(getCheckListRow("2","2","3"));
		rows.add(getCheckListRow("2","3","4"));
		rows.add(getCheckListRow("2","3","5"));
		rows.add(getCheckListRow("2","3","5"));
		rows.add(getCheckListRow("2","3","5"));
		rows.add(getCheckListRow("2","3","5"));
		rows.add(getCheckListRow("2","3","5"));
		rows.add(getCheckListRow("2","3","5"));
		rows.add(getCheckListRow("2","3","5"));
		rows.add(getCheckListRow("2","3","5"));
		rows.add(getCheckListRow("2","3","5"));
		rows.add(getCheckListRow("2","3","5"));
		rows.add(getCheckListRow("2","3","5"));
		
		return rows;
	}
	
	public static List<CheckedRow> getCheckedRows(){
		List<CheckedRow> rows = new ArrayList<>();
		
		rows.add(getCheckedRow("1","3","5", true));
		rows.add(getCheckedRow("2","1","1", true));
		rows.add(getCheckedRow("2","3","5", true));
		
		return rows;
	}
	
	private static CheckedRow getCheckedRow(String idNaturaleza, String idCriterio, String idTipificacion, boolean seleccionado) {
		return new CheckedRow(idNaturaleza, idCriterio, idTipificacion, seleccionado);
	}

	private static CheckListRow getCheckListRow(String idNat, String idCrit, String idTip){
		return new CheckListRow(idNat, "Nat_"+idNat,idCrit,"Crit_"+idCrit,idTip,"Tip_"+idTip);
	}
}
