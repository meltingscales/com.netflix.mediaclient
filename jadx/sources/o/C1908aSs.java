package o;

import android.app.Activity;

/* renamed from: o.aSs  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1908aSs extends AbstractRunnableC1906aSq {
    private Activity c;

    public C1908aSs(Activity activity) {
        super(activity);
        this.c = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.c != null) {
            C1044Mm.d("ErrorManager", "Exit");
            this.c.finish();
        }
    }
}
