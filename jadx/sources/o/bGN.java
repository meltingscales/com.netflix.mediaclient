package o;

import android.view.View;
import android.widget.CompoundButton;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.offline.WatchState;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import o.bGK;

/* loaded from: classes4.dex */
public interface bGN {
    bGN a(CompoundButton.OnCheckedChangeListener onCheckedChangeListener);

    bGN a(WatchState watchState);

    bGN a(boolean z);

    bGN b(int i);

    bGN b(TrackingInfoHolder trackingInfoHolder);

    bGN b(CharSequence charSequence);

    bGN b(String str);

    bGN b(boolean z);

    bGN c(int i);

    bGN c(DownloadButton.ButtonState buttonState);

    bGN c(CharSequence charSequence);

    bGN c(InterfaceC4732bk<bGJ, bGK.b> interfaceC4732bk);

    bGN c(drO<? extends TrackingInfo> dro);

    bGN c(boolean z);

    bGN d(int i);

    bGN d(View.OnClickListener onClickListener);

    bGN d(CharSequence charSequence);

    bGN d(String str);

    bGN d(bIN bin);

    bGN d(boolean z);

    bGN e(int i);

    bGN e(AppView appView);

    bGN e(CharSequence charSequence);

    bGN e(String str);

    bGN e(C9935zP c9935zP);

    bGN e(boolean z);

    bGN h(CharSequence charSequence);
}
