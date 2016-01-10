package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Andrey Semenyuk
 */
public class SemFinanDB implements Serializable {
	public ArrayList<CompTrans> cTrans;
	public ArrayList<SchedTrans> schedTranses;

	public SemFinanDB() {
		cTrans = new ArrayList<>();
		schedTranses = new ArrayList<>();
	}

}
