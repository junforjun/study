
public abstract class Player {
	boolean pause;
	int currentPos;

	Player(){
		pause = false;
		currentPos = 0;
	}
	abstract void play(int pos);
	abstract void stop();

	void play() {
		play(currentPos);
	}

	void pause() {
		if(pause) {
			pause = false;
			play(currentPos);
		}else {
			pause = true;
			stop();
		}
	}
}
