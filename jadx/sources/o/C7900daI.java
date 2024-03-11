package o;

import android.app.Activity;
import android.content.Intent;
import com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedActivity;
import javax.inject.Inject;

/* renamed from: o.daI  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7900daI implements InterfaceC6235cYw {
    private final Activity b;

    @Inject
    public C7900daI(Activity activity) {
        C8632dsu.c((Object) activity, "");
        this.b = activity;
    }

    @Override // o.InterfaceC6235cYw
    public Intent d() {
        return UpNextFeedActivity.b.d(this.b);
    }

    @Override // o.InterfaceC6235cYw
    public Intent a() {
        Intent d = d();
        d.putExtra("initial_section_id_extra", "POPULAR_TITLES_SECTION_DESCRIPTOR");
        return d;
    }

    @Override // o.InterfaceC6235cYw
    public Intent c() {
        Intent d = d();
        d.putExtra("initial_section_id_extra", "COMING_SOON_SECTION_DESCRIPTOR");
        return d;
    }
}
