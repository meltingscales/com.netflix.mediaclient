package o;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class HZ {
    public /* synthetic */ HZ(C8627dsp c8627dsp) {
        this();
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public boolean s_() {
        return false;
    }

    public boolean t_() {
        return false;
    }

    public boolean u_() {
        return false;
    }

    public boolean v_() {
        return false;
    }

    private HZ() {
    }

    public final HZ b(String... strArr) {
        C8632dsu.c((Object) strArr, "");
        return c(GV.c((String[]) Arrays.copyOf(strArr, strArr.length)));
    }

    public final HZ c(AbstractC0935Ig<? extends GW> abstractC0935Ig) {
        HZ hz;
        C8632dsu.c((Object) abstractC0935Ig, "");
        if (abstractC0935Ig.c()) {
            return this;
        }
        String b = abstractC0935Ig.d().b();
        AbstractC0935Ig<? extends GW> g = abstractC0935Ig.g();
        if (!(this instanceof HL) || (hz = (HZ) ((HL) this).get(b)) == null) {
            return null;
        }
        return hz.c(g);
    }

    public final HL l() {
        C8632dsu.d(this);
        return (HL) this;
    }

    public final HJ o() {
        C8632dsu.d(this);
        return (HJ) this;
    }

    public final HX m() {
        C8632dsu.d(this);
        return (HX) this;
    }

    public final HH k() {
        C8632dsu.d(this);
        return (HH) this;
    }
}
