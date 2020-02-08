
public class Aplicação implements ValoresIF {

	int a[] = new int[10];

	public boolean ins(int v) {
		if (v > 0) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] == 0) {
					a[i] = v;
					return true;
				}
			}

		}
		return false;
	}

	public int del(int i) {
		int aux = 0;
		boolean flag = false;
		for (int j = 0; j < a.length; j++) {
			if (a[j] != 0) {
				flag = true;

			}
		}
		if (flag == true) {

			if (i >= 0 && i <= 9) {
				aux = a[i];
				a[i] = 0;

			} else {
				return -1;
			}

			return aux;

		} else {
			return -1;
		}

	}

	@Override
	public int size() {
		int cont = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				cont = cont + 1;
				
			}
		}
		return cont;
	}

}
