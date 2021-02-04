class WhatsApp{  
	private int phoneNumber;    
	private String name;   
	private String message;       
	WhatsApp(int phone, String n, String msg){  
		phoneNumber = phone;        
		name = n;        message = msg; 
		}   
	public void setPhoneNumber(int phone){ 
		phoneNumber = phone;   
		}    
	public void setName(String n){ 
		name = n;   
		}    
	public void setMessage(String msg){      
		message = msg;    
		}    public int getPhoneNumber(){ 
			return phoneNumber;   
			}   
		public String getName(){ 
				return name;   
				}    
		public String getMessage(){
			return message;    }
		}

public class Main{ 
	public static void main(String[] args) { 
		WhatsApp w = new WhatsApp(0555, "Ali", "Hello World");  
		System.out.println(w.getMessage());   
		}  
	}