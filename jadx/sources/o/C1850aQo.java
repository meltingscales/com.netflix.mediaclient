package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* renamed from: o.aQo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1850aQo extends aRM {
    public static final b a = new b(null);
    private final String b = "14518";
    private final int c = 3;
    private final String e = "InApp Update Test";

    public static final boolean c() {
        return a.e();
    }

    @Override // o.aRM
    public boolean b() {
        return true;
    }

    @Override // o.aRM
    public String d() {
        return this.b;
    }

    @Override // o.aRM
    /* renamed from: e */
    public String a() {
        return this.e;
    }

    /* renamed from: o.aQo$b */
    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("ConfigAb14518InAppUpdate");
        }

        public final boolean e() {
            return d() != ABTestConfig.Cell.CELL_1;
        }

        private final ABTestConfig.Cell d() {
            return C1818aPj.e(C1850aQo.class);
        }
    }
}
