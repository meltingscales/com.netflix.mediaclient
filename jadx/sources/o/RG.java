package o;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.netflix.mediaclient.util.ViewUtils;
import o.C1180Rt;

/* loaded from: classes3.dex */
public class RG extends C1180Rt {
    protected static final long j;
    private final Runnable b;
    private final Runnable e;
    protected final View f;
    protected final Handler h;

    static {
        j = C8141del.a() ? 0L : 150L;
    }

    public RG(View view, C1180Rt.d dVar) {
        this(view, dVar, com.netflix.mediaclient.ui.R.g.dk);
        a(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public RG(View view, C1180Rt.d dVar, int i) {
        super(view, dVar);
        this.e = new Runnable() { // from class: o.RG.3
            @Override // java.lang.Runnable
            public void run() {
                C8166dfJ.d();
                if (ViewUtils.e(RG.this.f)) {
                    return;
                }
                C1044Mm.b("LoadingAndErrorWrapper", "Showing loading view without animation (via runnable)");
                C8254dgs.d(RG.this.f, false);
            }
        };
        this.b = new Runnable() { // from class: o.RG.5
            @Override // java.lang.Runnable
            public void run() {
                C8166dfJ.d();
                if (ViewUtils.e(RG.this.f)) {
                    return;
                }
                C1044Mm.b("LoadingAndErrorWrapper", "Showing loading view with animation (via runnable)");
                C8254dgs.d(RG.this.f, true);
            }
        };
        this.h = new Handler(Looper.getMainLooper());
        View findViewById = view.findViewById(i);
        this.f = findViewById;
        findViewById.setVisibility(8);
    }

    @Override // o.C1180Rt
    public void b(boolean z) {
        d();
        super.b(z);
        C8254dgs.a(this.f, z);
    }

    @Override // o.C1180Rt
    public void c(boolean z) {
        d();
        super.c(z);
        C8254dgs.a(this.f, z);
    }

    public void a(boolean z) {
        d();
        super.b(z);
        if (this.f.getVisibility() == 0) {
            C1044Mm.b("LoadingAndErrorWrapper", "Loading view is already visible - skipping");
            return;
        }
        C1044Mm.b("LoadingAndErrorWrapper", "Showing loading view after delay");
        this.h.postDelayed(z ? this.b : this.e, j);
    }

    protected void d() {
        this.h.removeCallbacks(this.e);
        this.h.removeCallbacks(this.b);
    }
}
