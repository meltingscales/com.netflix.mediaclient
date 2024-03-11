package o;

import android.content.Context;
import android.content.SharedPreferences;
import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfigData;
import o.C1818aPj;

/* loaded from: classes.dex */
public abstract class aRM {
    public static final d j = new d(null);
    private volatile ABTestConfig.Cell b;
    private boolean c;
    private final int e;
    private final CharSequence f;
    private final Object d = new Object();
    private ABTestConfig.Cell a = ABTestConfig.Cell.CELL_1;

    public boolean L_() {
        return false;
    }

    public boolean M_() {
        return false;
    }

    public boolean N_() {
        return false;
    }

    public boolean O_() {
        return false;
    }

    public CharSequence a() {
        return this.f;
    }

    public boolean b() {
        return false;
    }

    public abstract String d();

    public int p() {
        return 0;
    }

    public boolean q() {
        return false;
    }

    public boolean r() {
        return false;
    }

    public aRM() {
        String simpleName = getClass().getSimpleName();
        C8632dsu.a(simpleName, "");
        this.f = simpleName;
        this.e = ABTestConfig.Cell.values().length;
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("PersistentConfigurable");
        }
    }

    public final void a(Context context, boolean z) {
        C8632dsu.c((Object) context, "");
        int d2 = C8157dfA.d(context, t(), -1);
        if (d2 == -1 || !a(z) || ABTestConfig.Cell.fromInt(d2) == this.a) {
            return;
        }
        j.getLogTag();
        b(context);
    }

    public String t() {
        String d2 = d();
        return "persistent_" + d2;
    }

    private final ABTestConfig b(ABTestConfigData aBTestConfigData) {
        if (aBTestConfigData != null) {
            return aBTestConfigData.getConfigForId(d());
        }
        return null;
    }

    public final ABTestConfig.Cell c(Context context) {
        C8632dsu.c((Object) context, "");
        return b(context, this.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r0.isKidsProfile() == true) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig.Cell b(android.content.Context r6, com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig.Cell r7) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r6, r0)
            java.lang.String r0 = ""
            o.C8632dsu.c(r7, r0)
            o.Mh r0 = o.AbstractApplicationC1040Mh.getInstance()
            o.Mw r0 = r0.i()
            com.netflix.mediaclient.service.user.UserAgent r0 = r0.k()
            r1 = 0
            if (r0 == 0) goto L27
            o.bvo r0 = r0.j()
            if (r0 == 0) goto L27
            boolean r0 = r0.isKidsProfile()
            r2 = 1
            if (r0 != r2) goto L27
            goto L28
        L27:
            r2 = r1
        L28:
            boolean r0 = r5.M_()
            if (r0 == 0) goto L30
            if (r2 != 0) goto L38
        L30:
            boolean r0 = r5.q()
            if (r0 == 0) goto L39
            if (r2 != 0) goto L39
        L38:
            return r7
        L39:
            com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig$Cell r0 = r5.b
            if (r0 != 0) goto L8d
            java.lang.Object r0 = r5.d
            monitor-enter(r0)
            com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig$Cell r2 = r5.b     // Catch: java.lang.Throwable -> L8a
            if (r2 != 0) goto L77
            java.lang.String r2 = r5.t()     // Catch: java.lang.Throwable -> L8a
            int r3 = r7.getCellId()     // Catch: java.lang.Throwable -> L8a
            int r2 = o.C8157dfA.d(r6, r2, r3)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r3 = r5.t()     // Catch: java.lang.Throwable -> L8a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8a
            r4.<init>()     // Catch: java.lang.Throwable -> L8a
            r4.append(r3)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r3 = ".explicit"
            r4.append(r3)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L8a
            boolean r6 = o.C8157dfA.b(r6, r3, r1)     // Catch: java.lang.Throwable -> L8a
            r5.c = r6     // Catch: java.lang.Throwable -> L8a
            com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig$Cell r6 = com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig.Cell.fromInt(r2)     // Catch: java.lang.Throwable -> L8a
            r5.b = r6     // Catch: java.lang.Throwable -> L8a
            com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig$Cell r6 = r5.b     // Catch: java.lang.Throwable -> L8a
            if (r6 != 0) goto L77
            r5.b = r7     // Catch: java.lang.Throwable -> L8a
        L77:
            com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig$Cell r6 = r5.b     // Catch: java.lang.Throwable -> L8a
            if (r6 == 0) goto L7e
            monitor-exit(r0)
            r0 = r6
            goto L8d
        L7e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L8a
            java.lang.String r7 = "Required value was null."
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L8a
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L8a
            throw r6     // Catch: java.lang.Throwable -> L8a
        L8a:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aRM.b(android.content.Context, com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig$Cell):com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig$Cell");
    }

    public final boolean d(Context context, ABTestConfig.Cell cell) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) cell, "");
        if (this.b == null) {
            b(context, cell);
        }
        return this.c;
    }

    public final boolean a(Context context) {
        C8632dsu.c((Object) context, "");
        if (this.b == null) {
            String t = t();
            return C8157dfA.b(context, t + ".explicit", false);
        }
        return this.c;
    }

    public final boolean a(boolean z) {
        return (N_() && z) || (r() && !z);
    }

    public boolean c(SharedPreferences.Editor editor, ABTestConfigData aBTestConfigData, C1818aPj.c cVar) {
        boolean z;
        C8632dsu.c((Object) editor, "");
        ABTestConfig.Cell cell = this.a;
        ABTestConfig b = b(aBTestConfigData);
        if (b != null) {
            cell = b.isExplicit() ? b.getCell() : this.a;
            if (cell != null) {
                editor.putInt(t(), cell.getCellId());
                String t = t();
                editor.putBoolean(t + ".explicit", b.isExplicit());
            }
            if (cVar != null) {
                cVar.a(b, this);
            }
            z = b.isExplicit();
        } else if (cell == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else {
            editor.putInt(t(), cell.getCellId());
            String t2 = t();
            editor.putBoolean(t2 + ".explicit", false);
            z = false;
        }
        if (O_()) {
            synchronized (this.d) {
                this.b = cell;
                dpR dpr = dpR.c;
            }
        }
        return z;
    }

    public final void b(Context context) {
        C8632dsu.c((Object) context, "");
        synchronized (this.d) {
            this.b = null;
            dpR dpr = dpR.c;
        }
        C8157dfA.e(context, t());
        String t = t();
        C8157dfA.e(context, t + ".explicit");
    }
}
