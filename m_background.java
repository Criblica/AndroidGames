


public class MovableBackground {
	private Bitmap bitmap;
	private Rect viewport;
	private boolean viewportEndRight;
	private int screenX;
	private int screenY;

	public MovableBackground(Context context){
		screenX = context.getWidth();//get screen width and height
		screenY = context.getHeight();
		bitmap = context.getResources().getDrawable(R.drawable.background);
		viewport = new Rect(0, 0, screenX, screenY); 
	}

	public void update(Sprite sprite){
		Boy boy = (Boy) sprite;
		if (boy.directionX == Constants.RIGHT){
			if (!viewportEndRight && boy.x >= screenX/2){
				boy.xSpeed = 0;
			}
		}
		if (boy.directionX == Constants.LEFT){

		}
	}
}