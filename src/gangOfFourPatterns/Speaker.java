package gangOfFourPatterns;

public class Speaker {
	 private String name;
   public Speaker(String name){
	      this.name  = name;
	   }

	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }

	
	   public void speak(String message){
	      Conversation.showConvo(this,message);
	   }
}
