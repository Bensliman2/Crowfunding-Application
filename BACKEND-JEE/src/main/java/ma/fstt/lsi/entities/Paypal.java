package ma.fstt.lsi.entities;



import javax.persistence.DiscriminatorValue;
import javax.persistence.Table;

@Table(name="Paypal")
@DiscriminatorValue(value="PP")
public class Paypal extends Donation  {

	private static final long serialVersionUID = 1L;

	public Paypal() {
		super();
		// TODO Auto-generated constructor stub
	}
}
