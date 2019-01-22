public class Merchant extends Model {

	@Id
	public Long id;

	public String merchantName;

	public String merchantAddress;

	public String city;

	public String state;

	public String country;

	public String zipcode;

	public Double latitude;

	public Double longitude;

	public String website;

	public Boolean parking;

	public String attachment;
}