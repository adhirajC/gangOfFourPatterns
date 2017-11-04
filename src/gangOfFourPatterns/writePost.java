package gangOfFourPatterns;

public class writePost implements Action{
	
		  private Post comment;

		   public writePost(Post comment){
		      this.comment = comment;
		   }

		@Override
		public void perform() {
			// TODO Auto-generated method stub
			 comment.write();
		}

}
