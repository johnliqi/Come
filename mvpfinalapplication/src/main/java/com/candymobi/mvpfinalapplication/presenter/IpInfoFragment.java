package com.candymobi.mvpfinalapplication.presenter;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.candymobi.mvpfinalapplication.R;
import com.candymobi.mvpfinalapplication.model.IpData;
import com.candymobi.mvpfinalapplication.model.IpInfo;

public class IpInfoFragment extends Fragment implements IpInfoContract.View {
    private TextView tv_country;
    private TextView tv_area;
    private TextView tv_city;
    private Button bt_ipinfo;
    private Dialog mDialog;
    private IpInfoContract.Presenter mPresenter;

    public static IpInfoFragment newInstance() {
        return new IpInfoFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragmentipfo, container, false);
        tv_area = root.findViewById(R.id.tv_area);
        tv_city = root.findViewById(R.id.tv_city);
        tv_country = root.findViewById(R.id.tv_country);
        bt_ipinfo = root.findViewById(R.id.bt_ipinfo);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mDialog = new ProgressDialog(getActivity());
        mDialog.setTitle("获取数据中 ");

        bt_ipinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.getIpInfo("https://wanandroid.com/article/listproject/0/json");
            }
        });
    }

    @Override
    public void setIpInfo(IpData ipInfo) {
     //   IpData ipDataq = ipInfo.getIpData();
        if (ipInfo!=null&&ipInfo.getData()!=null){
            tv_country.setText(ipInfo.getData().getDatas().get(0).getTitle());
        }


//        if (ipInfo != null && ipInfo.getIpData() != null) {
//            IpData ipData = ipInfo.getIpData();
//            tv_country.setText(ipData.getData().getDatas().get(0).getChapterName());
//            tv_city.setText(ipData.getData().getDatas().get(0).getAuthor());
//            tv_area.setText(ipData.getData().getDatas().get(0).getDesc());
//        }
    }



    @Override
    public void showLoading() {
        mDialog.show();
    }

    @Override
    public void hideLoading() {
        mDialog.dismiss();
    }

    public void showError() {
        Toast.makeText(getActivity().getApplicationContext(), "网络出错", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void ShowError() {

    }

    @Override
    public boolean isActive() {
        return isAdded();
    }

    @Override
    public void setPresenter(IpInfoContract.Presenter presenter) {
        this.mPresenter = presenter;

    }
}
