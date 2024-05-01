package daoInterface;

public interface UtenteDAO {

	/**
	 * @return
	 */
	boolean addUtente();

	/**
	 * @return
	 */
	boolean isEmailValid();

	/**
	 * 
	 */
	void getProfiloUtente();

	/**
	 * 
	 */
	void modificaProfiloUtente();

}