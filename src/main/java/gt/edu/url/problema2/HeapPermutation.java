package gt.edu.url.problema2;

public class HeapPermutation<E>
{
		private void swap(E[] v, int i, int j) {
			E t = v[i];
			v[i] = v[j]; 
			v[j] = t;
		}

		public void permute(E[] array, int n) {
			if (n == 1) {
				System.out.println(array.toString());
			} else {
				for (int i = 0; i < n; i++) {
					permute(array, n-1);
					if (n % 2 == 1) {
						swap(array, 0, n-1);
					} else {
						swap(array, i, n-1);
					}
				}
			}
		}
}