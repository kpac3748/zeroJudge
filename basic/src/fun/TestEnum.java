package fun;

public enum TestEnum {
	SUCCESS("SUCCESS"),
	PENDDING("PENDDING"),
	FAIL("FAIL");
	
	private String executedStatus;
	
	private TestEnum(String executedStatus) {
		this.executedStatus = executedStatus;
	}
	
	public String getExecutedStatus() {
		return executedStatus;
	}

}
