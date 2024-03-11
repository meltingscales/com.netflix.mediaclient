package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* loaded from: classes.dex */
public final class aRR extends aRQ {
    public static final b a = new b(null);

    @Override // o.aRQ
    public String e() {
        return "44926";
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final boolean b() {
            return c() != ABTestConfig.Cell.CELL_1;
        }

        public final boolean a() {
            return c() == ABTestConfig.Cell.CELL_3;
        }

        private final ABTestConfig.Cell c() {
            ABTestConfig.Cell d = aRQ.d("44926");
            C8632dsu.a(d, "");
            return d;
        }
    }
}
