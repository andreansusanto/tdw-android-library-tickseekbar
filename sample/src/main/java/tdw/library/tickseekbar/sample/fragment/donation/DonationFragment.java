package tdw.library.tickseekbar.sample.fragment.donation;

import android.view.View;
import android.widget.Toast;

import tdw.library.tickseekbar.sample.R;
import tdw.library.tickseekbar.sample.fragment.BaseFragment;

/**
 * the Fragment for donation, no impact libs
 */

public class DonationFragment extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.buy_me_a_coffee;
    }

    @Override
    protected void initView(View root) {
        View alipay = root.findViewById(R.id.alipay_container);
        alipay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                donation();
            }
        });
    }

    private void donation() {
        if (AlipayUtil.hasInstalledAlipayClient(getContext())) {
            AlipayUtil.startAlipayClient(getActivity());
        } else {
            Toast.makeText(getContext(), "No Alipay APP found on your phone!", Toast.LENGTH_LONG).show();
        }
    }

}