/*
NAME: ARIF AMIRUDDIN BIN SADIRAN
MATRIC ID: A19EC0022
SECTION: 05
QUESTION: 5
*/

class MailMessage { 
	private Header header;
	private Body body;
	private Attachment attachment;
	public MailMessage(Header header, Body body, Attachment attachment) {
		this.header=header;
		this.body=body;
		this.attachment=attachment;
	}
	public void print() { 
		System.out.println("Header: "+header.getTitle()); 
		System.out.println("Body: "+body.getMessage()); 
		System.out.println("Attachment: "+attachment.getFilename()); 
	}

}
public class MailMessageTest {
	public static void main(String[] args) {
		Header H1 = new Header("Object-Oriented Programming");
		Body B1 = new Body("Lab Exercise for Aggregation");
		Attachment A1 = new Attachment("Lab8.java");
		
		MailMessage M1 = new MailMessage(H1,B1,A1);
		M1.print();
	}
}

class Header {
	private String title;
	
	public Header(String title) { 
		this.title = title;
	}
	public String getTitle() { 
		return title; 
	}
}
class Body {
	private String message;
	
	public Body(String message) { 
		this.message = message;
	}
	public String getMessage() { 
		return message; 
	}
}
class Attachment {
	private String filename;
	
	public Attachment(String filename) { 
		this.filename = filename;
	}
	public String getFilename() { 
		return filename; 
	}
}

