package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* loaded from: classes.dex */
public final class aRS extends aRQ {
    public static final e e = new e(null);

    @Override // o.aRQ
    public String e() {
        return "55174";
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final boolean d() {
            return (b() == ABTestConfig.Cell.CELL_1 || b() == ABTestConfig.Cell.CELL_6) ? false : true;
        }

        private final ABTestConfig.Cell b() {
            ABTestConfig.Cell d = aRQ.d("55174");
            C8632dsu.a(d, "");
            return d;
        }
    }
}
