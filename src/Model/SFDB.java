package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Semenyuk Andrey on 29.12.15.
 */
public class SFDB implements Serializable {
	public ArrayList<CompTrans> compTranses;

	public SFDB() {
		this.compTranses = new ArrayList<>();
	}

}
