
public class HelloGit {
	public static void main(String[] args) {
		System.out.println("m2");
//<<<<<<< HEAD
		System.out.println("m3!");
		System.out.println("m4");
//=======
		System.out.println("branch1 @ m2 commit");
		System.out.println("branch1 @ m2 commit2");
//>>>>>>> refs/heads/branch1@m2
	}
}
