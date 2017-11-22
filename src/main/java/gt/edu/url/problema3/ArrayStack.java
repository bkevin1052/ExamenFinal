package gt.edu.url.problema3;


public class ArrayStack<E> implements LeakyStack<E>
{
	public static final int CAPACITY=1000;
	private E[] data;
	private int t=-1;
	
	public ArrayStack() {
		this(CAPACITY);
	}

	public ArrayStack(int capacity) {
		data = (E[]) new Object[capacity];
	}

	public int size(){
		return t+1;
	}

	public boolean isEmpty() {
		return (t == -1);
	}

	public void push(E e) {
		data[++t] = e;
	}

	public E top() {
		if (isEmpty()) return null;
		return data[t];
	}

	public E pop() {
		if (isEmpty()) return null;
		E response = data[t];
		data[t] = null;
		t--;
		return response;
	}


	/*Metodo que permite retornar una pila con el historial
	 *@param E
	 */
	@Override
	public ArrayStack<E> saveHistory(E e) {
		ArrayStack<E> pila = new ArrayStack<>();
		pila.push(e);
		return pila;
	}


	/*Metodo que retornar el actual de todos los datos
	 *@param set
	 */
	@Override
	public E actual() {
		// TODO Auto-generated method stub
		return top();
	}

	/*Metodo que permite generar un nuevo espacio en la pila
	 *@param set
	 */
	@Override
	public E undo() {
		// TODO Auto-generated method stub
		return pop();
	}
	
	

}
