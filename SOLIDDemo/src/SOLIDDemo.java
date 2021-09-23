
public class SOLIDDemo {

	public static void main(String[] args) {
		Student st = new PrimarySchoolStudent("ONE", "School1", null);
		
		System.out.println(st.getStudentName());
		
		Keyboard kb = new IBallKeyboard();
		Mouse mo = new IBallMouse();
		
		WindowsMachine wm = new WindowsMachine("11",kb,mo);
		

	}

}
