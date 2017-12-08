package general;

public class eventocdemapper {

	
	String eventString;
	String eventType;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eventString == null) ? 0 : eventString.hashCode());
		result = prime * result + ((eventType == null) ? 0 : eventType.hashCode());
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
		eventocdemapper other = (eventocdemapper) obj;
		if (eventString == null) {
			if (other.eventString != null)
				return false;
		} else if (!eventString.equals(other.eventString))
			return false;
		if (eventType == null) {
			if (other.eventType != null)
				return false;
		} else if (!eventType.equals(other.eventType))
			return false;
		return true;
	}
	
	
	
	
}
