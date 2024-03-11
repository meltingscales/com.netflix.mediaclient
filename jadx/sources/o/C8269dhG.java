package o;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.ui.launch.LaunchActivity;
import com.netflix.mediaclient.util.log.clv2.AccessibilityLoggingManager$activityLifecycleAdapter$1$onActivityCreated$1;
import java.util.List;

/* renamed from: o.dhG  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8269dhG extends C1045Mp {
    private static final b a;
    private static final List<InterfaceC8277dhO> b;
    public static final int c;
    public static final C8269dhG d = new C8269dhG();
    private static boolean e;

    private C8269dhG() {
        super("A11yLoggingManager");
    }

    static {
        List<InterfaceC8277dhO> j;
        j = C8569dql.j(new C8278dhP(), new C8283dhU(), new C8280dhR(), new C8275dhM(), new C8281dhS(), new C8274dhL(), new C8273dhK(), new C8276dhN());
        b = j;
        a = new b();
        c = 8;
    }

    /* renamed from: o.dhG$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC8058ddH {
        b() {
        }

        @Override // o.AbstractC8058ddH, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C8632dsu.c((Object) activity, "");
            super.onActivityCreated(activity, bundle);
            if (activity instanceof LaunchActivity) {
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) activity);
                GF gf = GF.e;
                Context baseContext = ((LaunchActivity) activity).getBaseContext();
                C8632dsu.a(baseContext, "");
                C8737dwr.c(lifecycleScope, gf.a(baseContext), null, new AccessibilityLoggingManager$activityLifecycleAdapter$1$onActivityCreated$1(null), 2, null);
            }
            NetflixApplication.getInstance().unregisterActivityLifecycleCallbacks(this);
        }
    }

    public static final void d(Context context) {
        synchronized (C8269dhG.class) {
            C8632dsu.c((Object) context, "");
            if (!e) {
                e = true;
                d.getLogTag();
                NetflixApplication.getInstance().registerActivityLifecycleCallbacks(a);
            }
            for (InterfaceC8277dhO interfaceC8277dhO : b) {
                interfaceC8277dhO.b(context);
            }
        }
    }

    public static final void a(Context context) {
        synchronized (C8269dhG.class) {
            C8632dsu.c((Object) context, "");
            d.getLogTag();
            for (InterfaceC8277dhO interfaceC8277dhO : b) {
                interfaceC8277dhO.e(context);
            }
            e = false;
        }
    }
}
