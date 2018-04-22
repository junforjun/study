
public class CDPlayer extends Player {

	void play(int currentPos) {

	}
	void stop() {

	}

	int currentTrack;

	void nextTrack() {
		currentTrack++;

	}

	void preTrack() {
		if(currentTrack > 1) {
			currentTrack--;
		}
	}
}
