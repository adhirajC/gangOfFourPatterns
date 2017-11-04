package gangOfFourPatterns;

public class deletePost implements Action{
	  private Post comment;

	   public deletePost(Post comment){
	      this.comment = comment;
	   }
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		 comment.delete();
	}
}
