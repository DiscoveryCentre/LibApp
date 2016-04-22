package cu.libapp;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

/**
 * Created by earleestrella on 4/4/2016.
 */
public class SchedulePage extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.schedule_page, container, false);


        WebView schedule = (WebView)view.findViewById(R.id.schedule);
        WebSettings scheduleSettings = schedule.getSettings();

        scheduleSettings.setJavaScriptEnabled(true);

        schedule.setWebViewClient(new WebViewClient());
        schedule.loadUrl("http://booking.carleton.ca/");

        return view;
    }

}