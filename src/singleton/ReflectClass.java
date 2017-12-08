package singleton;

public class ReflectClass {

	public void createinstance() {

		String cname = "singleton.MySingleton";

		try {
			Class c = this.getClass().getClassLoader().loadClass(cname);
			Object o = c.newInstance();
			if (o instanceof MySingleton) {
				System.out.println("singleton created another way");
			}
		} catch (Exception e) {
			System.out.println("singleton created another way" + e );
		}
	}

}
