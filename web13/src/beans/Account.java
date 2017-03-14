package beans;

public class Account {
	String accountIdentifier, parentAccountIdentifier, status;

	public String getAccountIdentifier() {
		return accountIdentifier;
	}

	public void setAccountIdentifier(String accountIdentifier) {
		this.accountIdentifier = accountIdentifier;
	}

	public String getParentAccountIdentifier() {
		return parentAccountIdentifier;
	}

	public void setParentAccountIdentifier(String parentAccountIdentifier) {
		this.parentAccountIdentifier = parentAccountIdentifier;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
