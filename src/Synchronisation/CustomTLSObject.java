package Synchronisation;

public class CustomTLSObject {

	public String mName;
	public int mId;

	public CustomTLSObject(String name, int id) {
		mName = name;
		mId = id;
	}

	@Override
	public String toString() {
		return "CustomTLSObject [mName=" + mName + ", mId=" + mId + "]";
	}

}
