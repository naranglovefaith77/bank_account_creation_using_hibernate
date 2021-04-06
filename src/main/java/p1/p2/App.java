package p1.p2;

public class App {
	
	private int citizenId;
	private int accountNo;
	private String accountType;
	private String accountHolderName;
	private String bankName;
	private String branchName;
	private String branchCode;
		
	//default constructor
	public App()
	{
		
	}
	
	//parameterized constructor
	public App(int citizenId, int accountNo, String accountType, String accountHolderName, String bankName,
			String branchName, String branchCode) {
		super();
		this.citizenId = citizenId;
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.accountHolderName = accountHolderName;
		this.bankName = bankName;
		this.branchName = branchName;
		this.branchCode = branchCode;
	}

	//getters and setters
	
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getCitizenId() {
		return citizenId;
	}

	
	public void setCitizenId(int citizenId) {
		this.citizenId = citizenId;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	
}
