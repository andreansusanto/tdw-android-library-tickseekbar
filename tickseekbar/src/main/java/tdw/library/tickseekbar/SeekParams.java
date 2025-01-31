package tdw.library.tickseekbar;

/**
 * created by andreansusanto on 2020/06/08
 * <p>
 * save the params when the seek bar is seeking.
 */
public class SeekParams {

    //for continuous series seek bar
    // The SeekBar whose progress has changed
    public TickSeekBar seekBar;
    //The current progress level.The default value for min is 0, max is 100.
    public int progress;
    //The current progress level.The default value for min is 0.0, max is 100.0.
    public float progressFloat;
    //True if the progress change was initiated by the user, otherwise by setProgress() programmatically.
    public boolean fromUser;
    //for discrete series seek bar
    //the thumb location on tick when the section changed, continuous series will be zero.
    public int thumbPosition;
    //the text below tick&thumb when the section changed.
    public String tickText;
    SeekParams(TickSeekBar seekBar) {
        this.seekBar = seekBar;
    }
}
