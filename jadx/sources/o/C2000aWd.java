package o;

import android.os.Handler;

/* renamed from: o.aWd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2000aWd {
    private final Handler a;
    private final Runnable b = new Runnable() { // from class: o.aWd.1
        @Override // java.lang.Runnable
        public void run() {
            if (System.currentTimeMillis() - Long.valueOf(C2000aWd.this.e.q()).longValue() > 300000) {
                C1044Mm.e("nf_mdxSessionWatchDog", "MdxSessionWatchDog:  expired");
                C2000aWd.this.e.x();
                return;
            }
            C1044Mm.e("nf_mdxSessionWatchDog", "MdxSessionWatchDog: check if session still alive");
            C2000aWd.this.a.postDelayed(C2000aWd.this.b, 300000L);
        }
    };
    private final b e;

    /* renamed from: o.aWd$b */
    /* loaded from: classes.dex */
    public interface b {
        long q();

        void x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2000aWd(b bVar, Handler handler) {
        this.e = bVar;
        this.a = handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        C1044Mm.e("nf_mdxSessionWatchDog", "MdxSessionWatchDog: start");
        this.a.removeCallbacks(this.b);
        this.a.postDelayed(this.b, 300000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        C1044Mm.e("nf_mdxSessionWatchDog", "MdxSessionWatchDog: stop");
        this.a.removeCallbacks(this.b);
    }
}
