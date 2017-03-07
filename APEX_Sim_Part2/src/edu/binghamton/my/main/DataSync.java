package edu.binghamton.my.main;

import java.util.ArrayList;
import java.util.List;

import edu.binghamton.my.model.Instruction;

public class DataSync {

	public static void main(String[] args) {
		List<Instruction> myList1 = new ArrayList<>();
		List<Instruction> myList2 = new ArrayList<>();

		Instruction inst = new Instruction();
		inst.setRobSlotId(1);
		myList1.add(inst);
		myList2.add(inst);

		Instruction inst2 = myList1.get(0);
		inst2.setRobSlotId(2);
		myList1.add(inst2);

		System.out.println(myList2.get(0).getRobSlotId());
	}

}
