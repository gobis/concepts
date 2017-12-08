package HashFunction;

public class KeyClass {
	
	int key_id;
	int key_value;
	
	
	
	@Override
	public int hashCode() {
		// System.out.println("Key calss hascode");
		
		
		final int prime = 31;
		int result = 1;
		result = prime * result + key_id;
		result = prime * result + key_value;
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KeyClass other = (KeyClass) obj;
		if (key_id != other.key_id)
			return false;
		if (key_value != other.key_value)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "KeyClass [key_id=" + key_id + "]";
	}
	
	

}
