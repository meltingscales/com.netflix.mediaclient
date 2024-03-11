package o;

import android.app.Activity;
import com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedActivity;
import javax.inject.Singleton;

@Singleton
/* renamed from: o.daE  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7896daE implements InterfaceC6236cYx {
    private final Class<? extends MO> c = UpNextFeedActivity.class;

    @Override // o.InterfaceC6236cYx
    public boolean c(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return activity instanceof UpNextFeedActivity;
    }
}
