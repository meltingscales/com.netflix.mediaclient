package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* loaded from: classes.dex */
public final class aRN extends aRQ {
    public static final a e = new a(null);

    @Override // o.aRQ
    public String e() {
        return "31697";
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final boolean e() {
            return i() != ABTestConfig.Cell.CELL_1;
        }

        private final ABTestConfig.Cell i() {
            ABTestConfig.Cell d = aRQ.d("31697");
            C8632dsu.a(d, "");
            return d;
        }

        public final boolean c() {
            return e() && (i() == ABTestConfig.Cell.CELL_2 || i() == ABTestConfig.Cell.CELL_3);
        }

        public final boolean j() {
            return e() && i() == ABTestConfig.Cell.CELL_3;
        }

        public final boolean b() {
            return e() && i() == ABTestConfig.Cell.CELL_5;
        }

        public final boolean d() {
            return e() && i() == ABTestConfig.Cell.CELL_6;
        }

        public final boolean a() {
            return e() && i() == ABTestConfig.Cell.CELL_7;
        }
    }
}
