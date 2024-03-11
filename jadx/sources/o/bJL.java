package o;

import android.widget.Space;
import com.netflix.mediaclient.rowconfig.layoutmanager.FillerGridLayoutManager;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C9834xU;

/* loaded from: classes4.dex */
public abstract class bJL extends AbstractC3336ax<e> {
    public static final d b = new d(null);
    public static final int c = 8;
    private static final int d = FillerGridLayoutManager.a.c();
    private Float i;

    @Override // o.AbstractC3073as
    public int a() {
        return C9834xU.i.l;
    }

    public final void a(Float f) {
        this.i = f;
    }

    @Override // o.AbstractC3073as
    public int b(int i, int i2, int i3) {
        return i;
    }

    public final Float o() {
        return this.i;
    }

    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final int b() {
            return bJL.d;
        }
    }

    @Override // o.AbstractC3336ax
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        eVar.e().setTag(FillerGridLayoutManager.a.e(), this.i);
    }

    /* loaded from: classes4.dex */
    public static final class e extends bIG {
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(e.class, "space", "getSpace()Landroid/widget/Space;", 0))};
        public static final int e = 8;
        private final dsZ b = bIF.d(this, bJL.b.b(), false, 2, null);

        public final Space e() {
            return (Space) this.b.getValue(this, c[0]);
        }
    }
}
