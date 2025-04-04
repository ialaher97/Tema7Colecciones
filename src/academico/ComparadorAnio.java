package academico;

import java.util.Comparator;

public class ComparadorAnio implements Comparator<Academico> {

	@Override
	public int compare(Academico arg0, Academico arg1) {
		// TODO Auto-generated method stub
		return arg0.getAnioIngreso()-arg1.getAnioIngreso();
	}

}
