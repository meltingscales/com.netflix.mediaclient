package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.CohortType;
import com.netflix.cl.model.context.Cohort;
import com.netflix.mediaclient.util.ConnectivityUtils;
import javax.inject.Singleton;
import o.C8632dsu;
import o.aIH;

@Singleton
/* loaded from: classes3.dex */
public final class aIH implements aIE {
    public static final a e = new a(null);
    private Long d;

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("NetworkScoreImpl");
        }
    }

    @Override // o.aIE
    public void b(aID aid) {
        C8632dsu.c((Object) aid, "");
        ConnectivityUtils.NetType d = TN.a.d();
        if (d == null) {
            return;
        }
        e e2 = e();
        if ((e2 != null ? e2.b() : null) != d || e2.e() != aid.e()) {
            a aVar = e;
            aVar.getLogTag();
            aVar.getLogTag();
            String name = d.name();
            boolean e3 = aid.e();
            C8157dfA.a(AbstractApplicationC1040Mh.d(), "pref_cur_ses_nw_lite", name + ":" + e3);
        }
        a();
    }

    @Override // o.aIE
    public boolean b() {
        Boolean bool;
        if (C8120deQ.a() || (bool = (Boolean) C9726vo.d(e(), TN.a.d(), new drX<e, ConnectivityUtils.NetType, Boolean>() { // from class: com.netflix.mediaclient.networkscore.impl.NetworkScoreImpl$isNetworkLite$1
            @Override // o.drX
            /* renamed from: c */
            public final Boolean invoke(aIH.e eVar, ConnectivityUtils.NetType netType) {
                C8632dsu.c((Object) eVar, "");
                C8632dsu.c((Object) netType, "");
                return Boolean.valueOf(netType != eVar.b() ? false : eVar.e());
            }
        })) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // o.aIE
    public void a() {
        Long l;
        boolean b = b();
        if (b && this.d == null) {
            this.d = Long.valueOf(Logger.INSTANCE.addContext(new Cohort(CohortType.networkLite)));
            e.getLogTag();
        } else if (b || (l = this.d) == null) {
        } else {
            Logger.INSTANCE.removeContext(l);
            e.getLogTag();
            this.d = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        r0 = o.duD.d((java.lang.CharSequence) r3, new java.lang.String[]{":"}, false, 0, 6, (java.lang.Object) null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final o.aIH.e e() {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aIH.e():o.aIH$e");
    }

    /* loaded from: classes3.dex */
    public static final class e {
        private final ConnectivityUtils.NetType c;
        private final boolean d;

        public final ConnectivityUtils.NetType b() {
            return this.c;
        }

        public final boolean e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return this.c == eVar.c && this.d == eVar.d;
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + Boolean.hashCode(this.d);
        }

        public String toString() {
            ConnectivityUtils.NetType netType = this.c;
            boolean z = this.d;
            return "CachedNetworkScoreInfo(networkType=" + netType + ", isNetworkLite=" + z + ")";
        }

        public e(ConnectivityUtils.NetType netType, boolean z) {
            C8632dsu.c((Object) netType, "");
            this.c = netType;
            this.d = z;
        }
    }
}
