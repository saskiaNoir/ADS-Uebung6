package aufg1;

/**
 * Simple Element
 * 
 * @author Saskia Schwartz, Christian Zekovic, Paul Schade
 *
 */
public class Element {

	int key;
	String content;

	public Element(String content) {
		this.content = content;
		key = content.length();
	}

	public int getKey() {
		return key;
	}

}
