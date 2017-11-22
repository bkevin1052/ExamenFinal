package gt.edu.url.problema2;

public class ImplArrayManipulator<E> implements ArrayManipulator{

	HeapPermutation<Integer> permutaciones = new HeapPermutation<>();
	
	/*Metodo que permite contar la cantidad de permutaciones que se generan
	 *@param set
	 */
	@Override
	public int subsets(List<Integer> set) 
	{
		Integer[] array = (Integer[]) new Object[set.size()];
		for(int i = 0; i < set.size(); i++)
		{
			array[i] = set.get(i); 
		}
		permutaciones.permute(array, array.length);
		return 5;
	}

}
