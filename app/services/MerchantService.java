
public interface MerchantService{
    public Merchant getById(int id);
    public List<Merchant> list(MerchantCrit merchantCrit);
    public int create(Merchant merchant);
    public int update(Merchant merchant);
    public int remove(Merchant merchant);
}