package c23.command;

public class BakeMuttonCommand extends Command {

	public BakeMuttonCommand(Barbecuer receiver) {
		super(receiver);
	}

	@Override
	public void ExcuteCommand() {
		receiver.BakeMutton();
	}
	
}
