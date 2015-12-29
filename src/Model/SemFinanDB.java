package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Semenyuk Andrey on 29.12.15.
 */
public class SemFinanDB implements Serializable {
	public ArrayList<CompTrans> cTrans;
	public ArrayList<SchedTrans> schedTranses;

	public SemFinanDB() {
		cTrans = new ArrayList<CompTrans>();
		schedTranses = new ArrayList<SchedTrans>();
	}

}
