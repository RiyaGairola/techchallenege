package beans;

public class Payload
{
   private Order order;

   private AddOnInstance addonInstance;

   private Account account;

   private AddOnBinding addonBinding;

   private Configuration configuration;

   private Notice notice;
   
   private Company company;
   
   private User user;

  

public Order getOrder ()
   {
       return order;
   }

   public void setOrder (Order order)
   {
       this.order = order;
   }

  

   public Configuration getConfiguration ()
   {
       return configuration;
   }

   public void setConfiguration (Configuration configuration)
   {
       this.configuration = configuration;
   }

  

   public AddOnInstance getAddonInstance() {
	return addonInstance;
}

public void setAddonInstance(AddOnInstance addonInstance) {
	this.addonInstance = addonInstance;
}

public Account getAccount() {
	return account;
}

public void setAccount(Account account) {
	this.account = account;
}

public AddOnBinding getAddonBinding() {
	return addonBinding;
}

public void setAddonBinding(AddOnBinding addonBinding) {
	this.addonBinding = addonBinding;
}

public Notice getNotice() {
	return notice;
}

public void setNotice(Notice notice) {
	this.notice = notice;
}

public Company getCompany() {
	return company;
}

public void setCompany(Company company) {
	this.company = company;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

@Override
   public String toString()
   {
       return "ClassPojo [order = "+order+", addonInstance = "+addonInstance+", account = "+account+", addonBinding = "+addonBinding+", configuration = "+configuration+", notice = "+notice+", user = "+user+"]";
   }
}