package o;

import android.os.StrictMode;
import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.lo  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9239lo implements Thread.UncaughtExceptionHandler {
    private final InterfaceC9200lB a;
    private final C9191kt b;
    private final C9284mg c = new C9284mg();
    private final Thread.UncaughtExceptionHandler d = Thread.getDefaultUncaughtExceptionHandler();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9239lo(C9191kt c9191kt, InterfaceC9200lB interfaceC9200lB) {
        this.b = c9191kt;
        this.a = interfaceC9200lB;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        Thread.setDefaultUncaughtExceptionHandler(this.d);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        String str;
        if (!this.b.e().b(th)) {
            boolean b = this.c.b(th);
            C9206lH c9206lH = new C9206lH();
            if (b) {
                String c = this.c.c(th.getMessage());
                C9206lH c9206lH2 = new C9206lH();
                c9206lH2.a("StrictMode", "Violation", c);
                str = c;
                c9206lH = c9206lH2;
            } else {
                str = null;
            }
            String str2 = b ? "strictMode" : "unhandledException";
            if (b) {
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
                this.b.e(th, c9206lH, str2, str);
                StrictMode.setThreadPolicy(threadPolicy);
            } else {
                this.b.e(th, c9206lH, str2, null);
            }
            e(thread, th);
            return;
        }
        e(thread, th);
    }

    private void e(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        System.err.printf("Exception in thread \"%s\" ", thread.getName());
        this.a.e("Exception", th);
    }
}
