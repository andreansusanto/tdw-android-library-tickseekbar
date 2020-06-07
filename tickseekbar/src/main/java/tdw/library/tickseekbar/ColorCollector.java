package tdw.library.tickseekbar;


import androidx.annotation.ColorInt;

/**
 * created by andreansusanto on 2020/06/08
 * <p>
 * for collecting each section track color
 */
public interface ColorCollector {
    boolean collectSectionTrackColor(@ColorInt int[] colorIntArr);
}