import java.util.ArrayList;

class Individuo implements Comparable<Individuo> {
	public Integer minimo;
	public ArrayList<Integer> list;

	public Individuo() {
		this.minimo = 0;
		this.list = new ArrayList<Integer>();
	}
	
	public Individuo(Individuo ind) {
		this.minimo = ind.minimo;
		this.list = ind.list;
	}

	public Individuo(Integer minimo, ArrayList<Integer> list) {
		this.minimo = minimo;
		this.list = list;
	}

	@Override
	public int compareTo(Individuo ind) {
		if (minimo < ind.minimo) {
			return -1;
		}
		if (minimo > ind.minimo) {
			return 1;
		}
		return 0;
	}

}