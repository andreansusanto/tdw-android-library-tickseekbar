package tdw.library.tickseekbar;

/**
 * created by andreansusanto on 2020/06/08
 */

public interface TickMarkType {
    /**
     * don't show the tickMarks
     */
    int NONE = 0;
    /**
     * show tickMarks shape as regular oval
     */
    int OVAL = 1;
    /**
     * show tickMarks shape as regular square
     */
    int SQUARE = 2;
    /**
     * show tickMarks shape as vertical line , line'size is 2 dp.
     */
    int DIVIDER = 3;
}