package o;

import android.content.Context;

/* renamed from: o.dfO  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8171dfO extends C1045Mp {
    public static final C8171dfO a = new C8171dfO();

    public static final boolean b() {
        return false;
    }

    private final boolean h() {
        return false;
    }

    private C8171dfO() {
        super("UIProductMode");
    }

    public final boolean a() {
        return C8120deQ.a();
    }

    public static final boolean c() {
        if (C8151dev.f()) {
            return false;
        }
        C8171dfO c8171dfO = a;
        if (c8171dfO.h()) {
            C1332Xp c1332Xp = C1332Xp.b;
            if (C8157dfA.b((Context) C1332Xp.b(Context.class), "prefs_debug_force_quick_draw_dp_enabled", false)) {
                return true;
            }
        }
        return c8171dfO.a();
    }

    public static final boolean d() {
        if (C8151dev.f()) {
            return false;
        }
        return a.a();
    }

    public static final boolean e() {
        if (C8151dev.f()) {
            return false;
        }
        C8171dfO c8171dfO = a;
        if (c8171dfO.h()) {
            C1332Xp c1332Xp = C1332Xp.b;
            if (C8157dfA.b((Context) C1332Xp.b(Context.class), "prefs_debug_force_lolomo_lite_enabled", false)) {
                return true;
            }
        }
        return c8171dfO.a();
    }
}
