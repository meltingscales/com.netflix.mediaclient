package o;

import android.app.Activity;
import android.content.Context;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import java.util.concurrent.TimeUnit;

/* renamed from: o.bxA  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5349bxA extends C1045Mp implements InterfaceC5350bxB {
    private static InterfaceC5350bxB e;
    private final Context a;
    private final String d;
    public static final b c = new b(null);
    public static final int b = 8;

    private final String b(boolean z) {
        return z ? "flexible" : "immediate";
    }

    @Override // o.InterfaceC5350bxB
    public void b(NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
    }

    @Override // o.InterfaceC5350bxB
    public void e(NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5349bxA(String str) {
        super(str);
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.a = AbstractApplicationC1040Mh.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(Activity activity) {
        C8632dsu.c((Object) activity, "");
        activity.startActivity(ActivityC4183bZh.d(activity, (AppView) null));
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(Context context) {
        C8632dsu.c((Object) context, "");
        C8157dfA.a(context, "nflx_update_skipped", e());
        C8157dfA.e(context, "nflx_update_skipped_time", System.currentTimeMillis());
    }

    private final int j() {
        return C8157dfA.d(this.a, "nflx_update_skipped", 0);
    }

    private final int e() {
        aOV d = AbstractApplicationC1040Mh.getInstance().i().d();
        if (d != null) {
            return d.g();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(String str, boolean z) {
        InterfaceC5090bsG e2;
        C8632dsu.c((Object) str, "");
        IClientLogging f = AbstractApplicationC1040Mh.getInstance().i().f();
        if (f == null || (e2 = f.e()) == null) {
            return;
        }
        e2.a(new aSO(str, b(z)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(String str, boolean z, Throwable th) {
        InterfaceC5090bsG e2;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) th, "");
        IClientLogging f = AbstractApplicationC1040Mh.getInstance().i().f();
        if (f == null || (e2 = f.e()) == null) {
            return;
        }
        String b2 = C1044Mm.b(th);
        C8632dsu.a(b2, "");
        e2.a(new aSO(str, b(z), b2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean d() {
        aOV d;
        if (!C8153dex.j() && (d = AbstractApplicationC1040Mh.getInstance().i().d()) != null) {
            if (C8055ddE.d(this.a, d.z())) {
                if (TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - C8157dfA.b(this.a, "nflx_update_skipped_time", 0L)) > d.i()) {
                    return true;
                }
            }
            if (j() != e()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a() {
        e = null;
        C8157dfA.d(this.a, "nflx_inapp_update_failed", true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        C8157dfA.a(this.a, "nflx_update_skipped", 0);
    }

    /* renamed from: o.bxA$b */
    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final boolean e(Context context) {
            C8632dsu.c((Object) context, "");
            return C8157dfA.b(context, "nflx_inapp_update_failed", false);
        }

        public final InterfaceC5350bxB c(Context context) {
            C8632dsu.c((Object) context, "");
            if (AbstractC5349bxA.e == null) {
                synchronized (AbstractC5349bxA.class) {
                    if (AbstractC5349bxA.e == null) {
                        b bVar = AbstractC5349bxA.c;
                        AbstractC5349bxA.e = C5399bxy.c(context);
                    }
                    dpR dpr = dpR.c;
                }
            }
            InterfaceC5350bxB interfaceC5350bxB = AbstractC5349bxA.e;
            C8632dsu.d(interfaceC5350bxB);
            return interfaceC5350bxB;
        }
    }
}
