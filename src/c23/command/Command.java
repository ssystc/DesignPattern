package c23.command;

public abstract class Command {
	
	protected Barbecuer receiver;
	
	public Command(Barbecuer receiver) {
		this.receiver = receiver;
	}
	
	public abstract void ExcuteCommand();

}
