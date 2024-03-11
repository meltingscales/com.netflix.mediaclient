package o;

import com.bugsnag.android.internal.TaskType;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.lA  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9199lA {
    private final AtomicBoolean d = new AtomicBoolean();
    private boolean b = false;

    public boolean a() {
        return this.b;
    }

    public boolean d(final String str, final C9191kt c9191kt, final InterfaceC9218lT interfaceC9218lT) {
        try {
            c9191kt.d.e(TaskType.IO, new Runnable() { // from class: o.lA.4
                @Override // java.lang.Runnable
                public void run() {
                    C9199lA.this.a(str, c9191kt, interfaceC9218lT);
                }
            }).get();
            return this.b;
        } catch (Throwable unused) {
            return false;
        }
    }

    void a(String str, C9191kt c9191kt, InterfaceC9218lT interfaceC9218lT) {
        if (this.d.getAndSet(true)) {
            return;
        }
        try {
            System.loadLibrary(str);
            this.b = true;
        } catch (UnsatisfiedLinkError e) {
            c9191kt.a(e, interfaceC9218lT);
        }
    }
}
