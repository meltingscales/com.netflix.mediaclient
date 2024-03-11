package o;

import android.content.Context;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_ABPerformanceTraceSampling;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_QoE_Metrics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/* loaded from: classes3.dex */
public final class aJK {
    private static Boolean b;
    public static final aJK d = new aJK();
    private static final cQF e = new cQF();
    private static boolean c = true;

    private aJK() {
    }

    public final boolean e(Context context) {
        C8632dsu.c((Object) context, "");
        if (C8153dex.p()) {
            return C8157dfA.b(context, "preference_force_sample_perftrace", false);
        }
        return false;
    }

    public final boolean b(Context context) {
        C8632dsu.c((Object) context, "");
        if (c) {
            if (Config_FastProperty_QoE_Metrics.Companion.c() || e.d()) {
                return true;
            }
            return (Config_FastProperty_ABPerformanceTraceSampling.Companion.a() && a()) || e(context);
        }
        return false;
    }

    private final boolean a() {
        Boolean bool = b;
        if (bool != null) {
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
        C1332Xp c1332Xp = C1332Xp.b;
        Context context = (Context) C1332Xp.b(Context.class);
        Collection<aRM> e2 = C1818aPj.e();
        C8632dsu.a(e2, "");
        ArrayList<aRM> arrayList = new ArrayList();
        for (Object obj : e2) {
            aRM arm = (aRM) obj;
            if (arm.p() > 0 && arm.d(context, arm.c(context))) {
                arrayList.add(obj);
            }
        }
        int i = 0;
        for (aRM arm2 : arrayList) {
            if (arm2.p() > i) {
                i = arm2.p();
            }
        }
        if (i > 0) {
            return d(i);
        }
        return false;
    }

    private final boolean d(int i) {
        if (b == null) {
            b = Boolean.valueOf(new Random().nextInt(100) < i);
        }
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
