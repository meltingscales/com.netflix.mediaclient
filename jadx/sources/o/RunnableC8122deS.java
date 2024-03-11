package o;

import android.content.Context;
import android.net.Uri;
import com.netflix.mediaclient.api.logging.error.ErrorType;

/* renamed from: o.deS  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class RunnableC8122deS implements Runnable {
    private Uri a;
    private Context d;

    public RunnableC8122deS(Context context, String str) {
        if (str == null) {
            throw new IllegalArgumentException("Uri can not be null");
        }
        if (context == null) {
            throw new IllegalArgumentException("Context can not be null");
        }
        this.a = C8139dej.b.a(AbstractApplicationC1040Mh.d(), str);
        this.d = context;
    }

    public void a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Uri can not be null");
        }
        this.a = C8139dej.b.a(AbstractApplicationC1040Mh.d(), str);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.d.getApplicationContext().startActivity(C8069ddS.c(this.a));
        } catch (Throwable th) {
            b(th);
        }
    }

    private void b(Throwable th) {
        C1044Mm.b("launchBrowser", th, "Failed to launch browser", new Object[0]);
        InterfaceC1598aHf.a(new C1596aHd("SPY-36966: Unable to launch browser").b(true).b(ErrorType.f).d(th));
    }
}
