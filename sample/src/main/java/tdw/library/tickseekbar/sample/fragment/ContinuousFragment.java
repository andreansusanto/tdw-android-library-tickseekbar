package tdw.library.tickseekbar.sample.fragment;

import android.view.View;
import android.widget.TextView;

import tdw.library.tickseekbar.OnSeekChangeListener;
import tdw.library.tickseekbar.SeekParams;
import tdw.library.tickseekbar.TickSeekBar;
import tdw.library.tickseekbar.sample.R;

/**
 * created by andreansusanto on 2020/06/08
 */

public class ContinuousFragment extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.continuous;
    }


    @Override
    protected void initView(View root) {
        //scale
        TickSeekBar scale = root.findViewById(R.id.scale);
        scale.setDecimalScale(4);
        //set listener
        TickSeekBar listenerSeekBar = root.findViewById(R.id.listener);
        final TextView states = root.findViewById(R.id.states);
        states.setText("states: ");
        final TextView progress = root.findViewById(R.id.progress);
        progress.setText("progress: " + listenerSeekBar.getProgress());
        final TextView progress_float = root.findViewById(R.id.progress_float);
        progress_float.setText("progress_float: " + listenerSeekBar.getProgressFloat());
        final TextView from_user = root.findViewById(R.id.from_user);
        from_user.setText("from_user: ");
        listenerSeekBar.setOnSeekChangeListener(new OnSeekChangeListener() {
            @Override
            public void onSeeking(SeekParams seekParams) {
                states.setText("states: onSeeking");
                progress.setText("progress: " + seekParams.progress);
                progress_float.setText("progress_float: " + seekParams.progressFloat);
                from_user.setText("from_user: " + seekParams.fromUser);
            }

            @Override
            public void onStartTrackingTouch(TickSeekBar seekBar) {
                states.setText("states: onStart");
                progress.setText("progress: " + seekBar.getProgress());
                progress_float.setText("progress_float: " + seekBar.getProgressFloat());
                from_user.setText("from_user: true");
            }

            @Override
            public void onStopTrackingTouch(TickSeekBar seekBar) {
                states.setText("states: onStop");
                progress.setText("progress: " + seekBar.getProgress());
                progress_float.setText("progress_float: " + seekBar.getProgressFloat());
                from_user.setText("from_user: false");
            }

        });
    }
}
