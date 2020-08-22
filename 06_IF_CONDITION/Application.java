public class Application {
	public static void main(String[] args) {
		int loop = 0;

		while(true) {
			if(loop == 5) {
				break;
			}
			loop++;
			System.out.println("Running");
		}
	}
}

/*
* NOTE(if condition): if both condition true, happens mutual exclusion
* that situation first contion run and forget next's all condition
*/
