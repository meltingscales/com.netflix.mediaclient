package o;

import android.content.Context;
import android.os.Build;
import android.os.storage.StorageManager;
import com.bugsnag.android.internal.TaskType;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import o.AbstractC9245lu;

/* renamed from: o.lr  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9242lr implements AbstractC9245lu.d {
    final C9184km a;
    final C9301mx b;
    final Context c;
    final C9160kO d;
    final C9258mG e;
    final C9281md f;
    final InterfaceC9200lB g;
    final C9209lK h;
    final StorageManager j;

    public C9242lr(Context context, InterfaceC9200lB interfaceC9200lB, C9258mG c9258mG, StorageManager storageManager, C9184km c9184km, C9160kO c9160kO, C9281md c9281md, C9209lK c9209lK, C9301mx c9301mx) {
        this.g = interfaceC9200lB;
        this.e = c9258mG;
        this.j = storageManager;
        this.a = c9184km;
        this.d = c9160kO;
        this.c = context;
        this.f = c9281md;
        this.h = c9209lK;
        this.b = c9301mx;
    }

    @Override // o.AbstractC9245lu.d
    public void a(Exception exc, File file, String str) {
        C9229le c9229le = new C9229le(exc, this.e, C9280mc.a("unhandledException"), this.g);
        c9229le.a(str);
        c9229le.a("BugsnagDiagnostics", "canRead", Boolean.valueOf(file.canRead()));
        c9229le.a("BugsnagDiagnostics", "canWrite", Boolean.valueOf(file.canWrite()));
        c9229le.a("BugsnagDiagnostics", "exists", Boolean.valueOf(file.exists()));
        c9229le.a("BugsnagDiagnostics", "usableSpace", Long.valueOf(this.c.getCacheDir().getUsableSpace()));
        c9229le.a("BugsnagDiagnostics", "filename", file.getName());
        c9229le.a("BugsnagDiagnostics", "fileLength", Long.valueOf(file.length()));
        b(c9229le);
        e(c9229le);
    }

    void b(C9229le c9229le) {
        boolean isCacheBehaviorTombstone;
        boolean isCacheBehaviorGroup;
        if (this.j == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        File file = new File(this.c.getCacheDir(), "bugsnag/errors");
        try {
            isCacheBehaviorTombstone = this.j.isCacheBehaviorTombstone(file);
            isCacheBehaviorGroup = this.j.isCacheBehaviorGroup(file);
            c9229le.a("BugsnagDiagnostics", "cacheTombstone", Boolean.valueOf(isCacheBehaviorTombstone));
            c9229le.a("BugsnagDiagnostics", "cacheGroup", Boolean.valueOf(isCacheBehaviorGroup));
        } catch (IOException e) {
            this.g.e("Failed to record cache behaviour, skipping diagnostics", e);
        }
    }

    void e(C9229le c9229le) {
        c9229le.b(this.a.a());
        c9229le.a(this.d.a(new Date().getTime()));
        c9229le.a("BugsnagDiagnostics", "notifierName", this.h.a());
        c9229le.a("BugsnagDiagnostics", "notifierVersion", this.h.b());
        c9229le.a("BugsnagDiagnostics", "apiKey", this.e.b());
        final C9230lf c9230lf = new C9230lf(null, c9229le, this.h, this.e);
        try {
            this.b.e(TaskType.INTERNAL_REPORT, new Runnable() { // from class: o.lr.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C9242lr.this.g.b("InternalReportDelegate - sending internal event");
                        InterfaceC9157kL f = C9242lr.this.e.f();
                        C9155kJ c = C9242lr.this.e.c(c9230lf);
                        if (f instanceof C9156kK) {
                            Map<String, String> a = c.a();
                            a.put("Bugsnag-Internal-Error", "bugsnag-android");
                            a.remove("Bugsnag-Api-Key");
                            ((C9156kK) f).b(c.b(), C9264mM.b.d(c9230lf), a);
                        }
                    } catch (Exception e) {
                        C9242lr.this.g.e("Failed to report internal event to Bugsnag", e);
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }
}
