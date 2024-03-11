package o;

import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.Map;
import kotlin.Pair;
import kotlinx.serialization.UnknownFieldException;
import o.InterfaceC7736dDl;

@InterfaceC7700dCc
/* loaded from: classes3.dex */
public final class aFR {
    public static final c Companion = new c(null);
    private static final dBT<Object>[] e;
    private final Map<Integer, Integer> a;
    private final String b;
    private final String c;
    private final String d;

    public aFR() {
        this((String) null, (String) null, (Map) null, (String) null, 15, (C8627dsp) null);
    }

    public final String b() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aFR) {
            aFR afr = (aFR) obj;
            return C8632dsu.c((Object) this.c, (Object) afr.c) && C8632dsu.c((Object) this.d, (Object) afr.d) && C8632dsu.c(this.a, afr.a) && C8632dsu.c((Object) this.b, (Object) afr.b);
        }
        return false;
    }

    public int hashCode() {
        String str = this.c;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.d;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        Map<Integer, Integer> map = this.a;
        int hashCode3 = map == null ? 0 : map.hashCode();
        String str3 = this.b;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final Map<Integer, Integer> i() {
        return this.a;
    }

    public String toString() {
        String str = this.c;
        String str2 = this.d;
        Map<Integer, Integer> map = this.a;
        String str3 = this.b;
        return "ServerMetadata(rulesetVersion=" + str + ", requestId=" + str2 + ", testAllocations=" + map + ", profileGuid=" + str3 + ")";
    }

    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC7736dDl<aFR> {
        public static final a b;
        private static final /* synthetic */ dDS d;

        @Override // o.dBT, o.dBZ, o.dBP
        public InterfaceC7707dCj e() {
            return d;
        }

        static {
            a aVar = new a();
            b = aVar;
            dDS dds = new dDS("com.netflix.mediaclient.hendrixconfig.impl.ServerMetadata", aVar, 4);
            dds.b("rulesetVersion", true);
            dds.b(Payload.PARAM_RENO_REQUEST_ID, true);
            dds.b("testAllocations", true);
            dds.b("profileGuid", true);
            d = dds;
        }

        private a() {
        }

        @Override // o.dBZ
        /* renamed from: a */
        public void e(InterfaceC7721dCx interfaceC7721dCx, aFR afr) {
            C8632dsu.c((Object) interfaceC7721dCx, "");
            C8632dsu.c((Object) afr, "");
            InterfaceC7707dCj e = e();
            InterfaceC7719dCv e2 = interfaceC7721dCx.e(e);
            aFR.e(afr, e2, e);
            e2.d(e);
        }

        @Override // o.InterfaceC7736dDl
        public dBT<?>[] a() {
            dBT[] dbtArr = aFR.e;
            C7760dEi c7760dEi = C7760dEi.b;
            return new dBT[]{C7706dCi.a(c7760dEi), C7706dCi.a(c7760dEi), C7706dCi.a(dbtArr[2]), C7706dCi.a(c7760dEi)};
        }

        @Override // o.InterfaceC7736dDl
        public dBT<?>[] b() {
            return InterfaceC7736dDl.e.b(this);
        }

        @Override // o.dBP
        /* renamed from: d */
        public aFR b(InterfaceC7720dCw interfaceC7720dCw) {
            int i;
            Map map;
            String str;
            String str2;
            String str3;
            C8632dsu.c((Object) interfaceC7720dCw, "");
            InterfaceC7707dCj e = e();
            InterfaceC7717dCt c = interfaceC7720dCw.c(e);
            dBT[] dbtArr = aFR.e;
            Map map2 = null;
            if (c.h()) {
                C7760dEi c7760dEi = C7760dEi.b;
                map = (Map) c.e(e, 2, dbtArr[2], null);
                str = (String) c.e(e, 3, c7760dEi, null);
                i = 15;
                str3 = (String) c.e(e, 0, c7760dEi, null);
                str2 = (String) c.e(e, 1, c7760dEi, null);
            } else {
                int i2 = 0;
                boolean z = true;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                while (z) {
                    int h = c.h(e);
                    if (h == -1) {
                        z = false;
                    } else if (h == 0) {
                        str6 = (String) c.e(e, 0, C7760dEi.b, str6);
                        i2 |= 1;
                    } else if (h == 1) {
                        str5 = (String) c.e(e, 1, C7760dEi.b, str5);
                        i2 |= 2;
                    } else if (h == 2) {
                        map2 = (Map) c.e(e, 2, dbtArr[2], map2);
                        i2 |= 4;
                    } else if (h != 3) {
                        throw new UnknownFieldException(h);
                    } else {
                        str4 = (String) c.e(e, 3, C7760dEi.b, str4);
                        i2 |= 8;
                    }
                }
                i = i2;
                map = map2;
                str = str4;
                str2 = str5;
                str3 = str6;
            }
            c.e(e);
            return new aFR(i, str3, str2, map, str, (C7752dEa) null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final dBT<aFR> a() {
            return a.b;
        }
    }

    static {
        C7737dDm c7737dDm = C7737dDm.a;
        e = new dBT[]{null, null, new C7745dDu(c7737dDm, c7737dDm), null};
    }

    public /* synthetic */ aFR(int i, String str, String str2, Map map, String str3, C7752dEa c7752dEa) {
        if ((i & 1) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 2) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 4) == 0) {
            this.a = null;
        } else {
            this.a = map;
        }
        if ((i & 8) == 0) {
            this.b = null;
        } else {
            this.b = str3;
        }
    }

    public aFR(String str, String str2, Map<Integer, Integer> map, String str3) {
        this.c = str;
        this.d = str2;
        this.a = map;
        this.b = str3;
    }

    public static final /* synthetic */ void e(aFR afr, InterfaceC7719dCv interfaceC7719dCv, InterfaceC7707dCj interfaceC7707dCj) {
        dBT<Object>[] dbtArr = e;
        if (interfaceC7719dCv.c(interfaceC7707dCj, 0) || afr.c != null) {
            interfaceC7719dCv.d(interfaceC7707dCj, 0, C7760dEi.b, afr.c);
        }
        if (interfaceC7719dCv.c(interfaceC7707dCj, 1) || afr.d != null) {
            interfaceC7719dCv.d(interfaceC7707dCj, 1, C7760dEi.b, afr.d);
        }
        if (interfaceC7719dCv.c(interfaceC7707dCj, 2) || afr.a != null) {
            interfaceC7719dCv.d(interfaceC7707dCj, 2, dbtArr[2], afr.a);
        }
        if (!interfaceC7719dCv.c(interfaceC7707dCj, 3) && afr.b == null) {
            return;
        }
        interfaceC7719dCv.d(interfaceC7707dCj, 3, C7760dEi.b, afr.b);
    }

    public /* synthetic */ aFR(String str, String str2, Map map, String str3, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : map, (i & 8) != 0 ? null : str3);
    }

    public final Map<String, String> c() {
        Map<String, String> c2;
        Pair[] pairArr = new Pair[2];
        String str = this.d;
        if (str == null) {
            str = "null";
        }
        pairArr[0] = dpD.a(Payload.PARAM_RENO_REQUEST_ID, str);
        String str2 = this.c;
        pairArr[1] = dpD.a("rulesetVersion", str2 != null ? str2 : "null");
        c2 = dqE.c(pairArr);
        return c2;
    }
}
