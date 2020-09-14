package ma.fstt.lsi.entities;



import javax.persistence.DiscriminatorValue;
import javax.persistence.Table;

@Table(name="CreditCart")
@DiscriminatorValue(value="CC")
public class CreditCart extends Donation  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CreditCart() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
