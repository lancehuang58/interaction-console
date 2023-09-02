package idv.lance;

public class Module {

	private static final String RECTANGLE_SELECTION = "RECTANGLE_SELECTED";
	private static final String RECTANGLE_SELECTION_INPUT_A_SELECTION = "RECTANGLE_INPUT_A";
	private static final String INITIAL = "INIT";

	private String status = INITIAL;

	public String print() {
		switch (status) {
			case INITIAL:
				return "Shape:(C)ircle or (R)ectangle?";
			case RECTANGLE_SELECTION:
				return "Rectangle Side A length?";
			case RECTANGLE_SELECTION_INPUT_A_SELECTION:
				return "Rectangle Side B length?";
		}
		return null;
	}

	public void input(String r) {
		if (r.equals("R")) {
			this.status = RECTANGLE_SELECTION;
			return;
		}

		if (this.status.equals(RECTANGLE_SELECTION)) {
			this.status = RECTANGLE_SELECTION_INPUT_A_SELECTION;
		}

	}
}
