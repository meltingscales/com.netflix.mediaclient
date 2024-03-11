package o;

import android.app.Activity;
import android.content.Intent;
import com.netflix.cl.model.secondscreen.ConnectionSource;
import javax.inject.Inject;

/* loaded from: classes4.dex */
public final class bNJ implements InterfaceC3861bNj {
    public static final e c = new e(null);
    private final InterfaceC6704ciN e;

    @Inject
    public bNJ(InterfaceC6704ciN interfaceC6704ciN) {
        C8632dsu.c((Object) interfaceC6704ciN, "");
        this.e = interfaceC6704ciN;
    }

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("GameControllerMagicPathOutboundNavigation");
        }
    }

    @Override // o.InterfaceC3861bNj
    public void e(Activity activity, String str) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) str, "");
        Intent d = this.e.d(activity, str, ConnectionSource.pushNotification);
        d.addFlags(131072);
        activity.finish();
        activity.startActivity(d);
    }

    @Override // o.InterfaceC3861bNj
    public void b(Activity activity) {
        C8632dsu.c((Object) activity, "");
        activity.finish();
    }
}
