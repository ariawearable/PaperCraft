package cordproject.lol.papercraft.util;


public class GestureEvents {
	public final static int ARIA_GESTURE_ENTER = 1;
	public final static int ARIA_GESTURE_UP = 3;
	public final static int ARIA_GESTURE_DOWN = 4;

	public static class EnterGesture{}

	public static class MoveGesture {
		public final int gesture;

		public MoveGesture(Integer gesture) {
			this.gesture = gesture;
		}
	}
}
