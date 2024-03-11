package o;

import android.app.Activity;
import com.netflix.mediaclient.service.user.UserAgent;

/* renamed from: o.aSv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1911aSv extends AbstractRunnableC1906aSq {
    private UserAgent c;
    private Activity d;

    public C1911aSv(Activity activity, UserAgent userAgent) {
        super(activity);
        this.d = activity;
        this.c = userAgent;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.d != null) {
            C1044Mm.d("ErrorManager", "Exit current activity, going to signup");
            this.c.b((InterfaceC5018bqo) null);
            this.d.finish();
        }
    }
}
