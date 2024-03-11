package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* renamed from: o.aQt  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1855aQt extends aRM {
    public static final d b = new d(null);
    private final String e = "42428";
    private final int a = 4;
    private final String c = "Update Manifest on Network Switch";

    public static final boolean c() {
        return b.e();
    }

    public static final boolean g() {
        return b.b();
    }

    @Override // o.aRM
    public String d() {
        return this.e;
    }

    @Override // o.aRM
    /* renamed from: f */
    public String a() {
        return this.c;
    }

    /* renamed from: o.aQt$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final boolean e() {
            return d() != ABTestConfig.Cell.CELL_1;
        }

        public final boolean b() {
            return d() == ABTestConfig.Cell.CELL_3 || d() == ABTestConfig.Cell.CELL_4;
        }

        private final ABTestConfig.Cell d() {
            ABTestConfig.Cell e = C1818aPj.e(C1855aQt.class);
            C8632dsu.a(e, "");
            return e;
        }
    }
}
