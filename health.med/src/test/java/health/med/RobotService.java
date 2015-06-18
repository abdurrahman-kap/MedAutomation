package health.med;
import java.awt.AWTException;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotService {
	private static RobotService instance = null;
	private Robot robot = null;
	private int defaultGuiDelay = 1000;

	public RobotService(){
		try {
			this.robot = new Robot();
			this.robot.setAutoDelay(1000);
			this.robot.setAutoWaitForIdle(true);
			
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	/**
	 * TODO Put here a description of what this method does.
	 *
	 * @return
	 */
	public static RobotService getInstance(){	
		if(instance == null){
			instance = new RobotService();
			instance.setAutoDelay(40);
			instance.setAutoWaitForIdle(true);
		}
		return instance;
	}
	
	public void setAutoDelay(int ms){
		robot.setAutoDelay(ms);
	}
	public int getAutoDelay(){
		return robot.getAutoDelay();
	}
	
	public void setAutoWaitForIdle(boolean wait){
		robot.setAutoWaitForIdle(wait);
	}
	
	public int getDefaultGuiDelay() {
		return defaultGuiDelay;
	}
	public void setDefaultGuiDelay(int defaultGuiDelay) {
		this.defaultGuiDelay = defaultGuiDelay;
	}
	
	public void mouseMove(Point point){
		try {
			robot.mouseMove(point.x, point.y);
			robot.delay(defaultGuiDelay);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click(Point point){
		try {
			mouseMove(point);
			robot.mousePress(MouseModifiers.MOUSE_LEFT);
			robot.delay(getDefaultGuiDelay());
			robot.mouseRelease(MouseModifiers.MOUSE_LEFT);
			robot.delay(getDefaultGuiDelay());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void click(Point point, int mouseModifiers){
		try {
			mouseMove(point);
			robot.mousePress(mouseModifiers);
			robot.delay(getDefaultGuiDelay());
			robot.mouseRelease(mouseModifiers);
			robot.delay(getDefaultGuiDelay());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void rightClick(Point point){
		try {
			mouseMove(point);
			robot.mousePress(MouseModifiers.MOUSE_RIGHT);
			robot.delay(getDefaultGuiDelay());
			robot.mouseRelease(MouseModifiers.MOUSE_RIGHT);
			robot.delay(getDefaultGuiDelay());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void doubleClick(Point point){
		try {
			mouseMove(point);
			robot.mousePress(MouseModifiers.MOUSE_LEFT);
			robot.delay(50);
			robot.mouseRelease(MouseModifiers.MOUSE_LEFT);
			robot.delay(50);
			robot.mousePress(MouseModifiers.MOUSE_LEFT);
			robot.delay(50);
			robot.mouseRelease(MouseModifiers.MOUSE_LEFT);
			robot.delay(getDefaultGuiDelay());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void type(int keycode) {
		robot.delay(40);
		robot.keyPress(keycode);
		robot.keyRelease(keycode);
	}

	public void type(String s) {
		byte[] bytes = s.getBytes();
		for (byte b : bytes) {
			int code = b;
			// keycode only handles [A-Z] (which is ASCII decimal [65-90])
			//if (code > 96 && code < 123)
			//	code = code - 32;
			//robot.delay(40);
			//robot.keyPress(code);
			//robot.keyRelease(code);
			sendKey(code);
		}
	}
	/**
	 * Generates key events to type the character given.
	 * @param ascii The ascii value of the character to be typed
	 */
	 public void sendKey(int ascii) {
	 	if (needsShift(ascii)) {
	 		robot.keyPress(KeyEvent.VK_SHIFT);
	 		robot.delay(40);
    		robot.keyPress(ascii2VK(ascii));
    		robot.delay(20);
			robot.keyRelease(ascii2VK(ascii));
			robot.delay(20);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		else {
			robot.delay(40);
			robot.keyPress(ascii2VK(ascii));
			robot.delay(20);
			robot.keyRelease(ascii2VK(ascii));
		}
	}
	public int ascii2VK(int ascii) {
		int keyCode = -1;
		if((ascii >= 48 && ascii <=57) || (ascii >= 65 && ascii <=90)) {
			keyCode = ascii;
		} 
		else if(ascii >= 97 && ascii <= 122) {
			keyCode = ascii - 32;
		}
		else if(ascii == 9) {
			keyCode = KeyEvent.VK_TAB;
		}
		else if(ascii == 10) {
			keyCode = KeyEvent.VK_ENTER;
		}
		else if(ascii == 32) {
			keyCode = KeyEvent.VK_SPACE;
		}
		else if(ascii == 33) {
			keyCode = 49;
		}
		else if(ascii == 34) {
			keyCode = KeyEvent.VK_QUOTE;
		}
		else if(ascii == 35) {
			keyCode = 51;
		}
		else if(ascii == 36) {
			keyCode = 52;
		}
		else if(ascii == 37) {
			keyCode = 53;
		}
		else if(ascii == 38) {
			keyCode = 55;
		}
		else if(ascii == 39) {
			keyCode = KeyEvent.VK_QUOTE;
		}
		else if(ascii == 40) {
			keyCode = 57;
		}
		else if(ascii == 41) {
			keyCode = 48;
		}
		else if(ascii == 42) {
			keyCode = 56;
		}
		// i <3 the creator of ascii/vk codes :]
		else if(ascii == 43) {
			keyCode = KeyEvent.VK_EQUALS;
		}
		else if(ascii == 44) {
			keyCode = KeyEvent.VK_COMMA;
		}
		else if(ascii == 44) {
			keyCode = KeyEvent.VK_COMMA;
		}
		else if(ascii == 45) {
			keyCode = KeyEvent.VK_MINUS;
		}
		else if(ascii == 46) {
			keyCode = KeyEvent.VK_PERIOD;
		}
		else if(ascii == 47) {
			keyCode = KeyEvent.VK_SLASH;
		}
		else if(ascii == 58) {
			keyCode = KeyEvent.VK_SEMICOLON;
		}
		else if(ascii == 59) {
			keyCode = KeyEvent.VK_SEMICOLON;
		}
		else if(ascii == 60) {
			keyCode = KeyEvent.VK_COMMA;
		}
		else if(ascii == 61) {
			keyCode = KeyEvent.VK_EQUALS;
		}
		else if(ascii == 62) {
			keyCode = KeyEvent.VK_PERIOD;
		}
		else if(ascii == 63) {
			keyCode = KeyEvent.VK_SLASH;
		}
		else if(ascii == 64) {
			keyCode = 50;
		}
		else if(ascii == 64) {
			keyCode = 50;
		}
		else if(ascii == 91) {
			keyCode = KeyEvent.VK_OPEN_BRACKET;
		}
		else if(ascii == 92) {
			keyCode = KeyEvent.VK_BACK_SLASH;
		}
		else if(ascii == 93) {
			keyCode = KeyEvent.VK_CLOSE_BRACKET;
		}
		else if(ascii == 94) {
			keyCode = 54;
		}
		else if(ascii == 95) {
			keyCode = KeyEvent.VK_MINUS;
		}
		else if(ascii == 123) {
			keyCode = KeyEvent.VK_OPEN_BRACKET;
		}
		else if(ascii == 124) {
			keyCode = KeyEvent.VK_BACK_SLASH;
		}
		else if(ascii == 125) {
			keyCode = KeyEvent.VK_CLOSE_BRACKET;
		}
		else {
			System.out.println("this key code has not been implemented");
		}
		return keyCode;
	}
	/**
	 * Checks to see if the key needs shift held down
	 * @param ascii The ascii value of the key
	 * @return Returns true if shift needs to be held to type key
	 */
	public boolean needsShift(int ascii) {
		boolean ret = false;
		if (ascii >= 65 && ascii <=90)
			ret = true;
		else if (ascii >= 33 && ascii <= 38)
			ret = true;
		else if (ascii >= 40 && ascii <= 43)
			ret = true;
		else if (ascii >= 40 && ascii <= 43)
			ret = true;
		else if (ascii == 58)
			ret = true;
		else if (ascii == 60)
			ret = true;
		else if (ascii >= 62 && ascii <= 64)
			ret = true;
		else if (ascii == 94)
			ret = true;
		else if (ascii == 95)
			ret = true;
		else if (ascii >= 123 && ascii <= 125)
			ret = true;
		return ret;
	}
	
	public static void main(String[]  args) throws InterruptedException{
		
		/*RobotService robot = RobotService.getInstance();
		robot.rightClick(new Point(207,181));
		Thread.sleep(10000);
		robot.click(new Point(225,295));
		robot.type("8")*/;
		//RobotService robot = RobotService.getInstance();
		RobotService.getInstance().rightClick(new Point(207,181));
		Thread.sleep(10000);
		RobotService.getInstance().click(new Point(225,295));
		RobotService.getInstance().type("8");
	}
}
