package o;

import com.google.gson.Gson;
import com.google.gson.JsonNull;
import com.netflix.falcor.impl.parser.JsonGraphFormat;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: o.Ih  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0936Ih {

    /* renamed from: o.Ih$c */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[JsonGraphFormat.values().length];
            try {
                iArr[JsonGraphFormat.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JsonGraphFormat.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            b = iArr;
        }
    }

    public static /* synthetic */ String a(HZ hz, Gson gson, boolean z, boolean z2, JsonGraphFormat jsonGraphFormat, boolean z3, int i, Object obj) {
        boolean z4 = (i & 2) != 0 ? true : z;
        boolean z5 = (i & 4) != 0 ? true : z2;
        if ((i & 8) != 0) {
            jsonGraphFormat = JsonGraphFormat.e;
        }
        JsonGraphFormat jsonGraphFormat2 = jsonGraphFormat;
        if ((i & 16) != 0) {
            z3 = false;
        }
        return d(hz, gson, z4, z5, jsonGraphFormat2, z3);
    }

    public static final String d(HZ hz, Gson gson, boolean z, boolean z2, JsonGraphFormat jsonGraphFormat, boolean z3) {
        InterfaceC0937Ii c0940Il;
        InterfaceC0937Ii e;
        C8632dsu.c((Object) hz, "");
        C8632dsu.c((Object) gson, "");
        C8632dsu.c((Object) jsonGraphFormat, "");
        if (z3) {
            c0940Il = new C0929Ia(gson, 0, 0, z, 0, 22, null);
        } else {
            c0940Il = new C0940Il(gson, z2, 0, 4, null);
        }
        int i = c.b[jsonGraphFormat.ordinal()];
        if (i == 1) {
            e = e(hz, c0940Il, !z2);
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            e = a(hz, c0940Il, !z2);
        }
        return (String) e.f();
    }

    private static final <T> InterfaceC0937Ii<T> e(HZ hz, InterfaceC0937Ii<T> interfaceC0937Ii, boolean z) {
        if (hz instanceof HL) {
            interfaceC0937Ii.c();
            for (Map.Entry entry : ((Map) hz).entrySet()) {
                String str = (String) entry.getKey();
                HZ hz2 = (HZ) entry.getValue();
                if (!z || !(hz2 instanceof HQ)) {
                    interfaceC0937Ii.b(str);
                    e(hz2, interfaceC0937Ii, z);
                }
            }
            return interfaceC0937Ii.g();
        } else if (hz instanceof HJ) {
            interfaceC0937Ii.a();
            for (HZ hz3 : (Iterable) hz) {
                e(hz3, interfaceC0937Ii, z);
            }
            return interfaceC0937Ii.j();
        } else if (hz instanceof HW) {
            return interfaceC0937Ii.a(((HW) hz).i());
        } else {
            if (hz instanceof HT) {
                return interfaceC0937Ii.a(((HT) hz).i());
            }
            if (hz instanceof HN) {
                return interfaceC0937Ii.e(((HN) hz).d());
            }
            if (hz instanceof HQ) {
                return interfaceC0937Ii.k();
            }
            if (hz instanceof HH) {
                HH hh = (HH) hz;
                if (hh.d() == null && z) {
                    return interfaceC0937Ii;
                }
                c(interfaceC0937Ii.c().b("$type").a("atom"), (HO) hz).b("value");
                if (C8632dsu.c(JsonNull.INSTANCE, hh.d())) {
                    interfaceC0937Ii.k();
                } else {
                    interfaceC0937Ii.d(hh.d());
                }
                if (hh.j()) {
                    interfaceC0937Ii.b("_sentinel").e(true);
                }
                return interfaceC0937Ii.g();
            } else if (hz instanceof HV) {
                return c(interfaceC0937Ii.c().b("$type").a("atom"), (HO) hz).g();
            } else {
                if (hz instanceof HM) {
                    return c(interfaceC0937Ii.c().b("$type").a(UmaAlert.ICON_ERROR), (HO) hz).b("value").a(((HM) hz).d()).g();
                }
                if (hz instanceof HX) {
                    return b(c(interfaceC0937Ii.c().b("$type").a("ref"), (HO) hz).b("value"), ((HX) hz).i()).g();
                }
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private static final <T> InterfaceC0937Ii<T> a(HZ hz, InterfaceC0937Ii<T> interfaceC0937Ii, boolean z) {
        if (hz instanceof HL) {
            interfaceC0937Ii.c();
            for (Map.Entry entry : ((Map) hz).entrySet()) {
                String str = (String) entry.getKey();
                HZ hz2 = (HZ) entry.getValue();
                if (!z || !(hz2 instanceof HQ)) {
                    interfaceC0937Ii.b(str);
                    a(hz2, interfaceC0937Ii, z);
                }
            }
            return interfaceC0937Ii.g();
        } else if (hz instanceof HJ) {
            interfaceC0937Ii.a();
            for (HZ hz3 : (Iterable) hz) {
                a(hz3, interfaceC0937Ii, z);
            }
            return interfaceC0937Ii.j();
        } else if (hz instanceof HW) {
            return interfaceC0937Ii.a(((HW) hz).i());
        } else {
            if (hz instanceof HT) {
                return interfaceC0937Ii.a(((HT) hz).i());
            }
            if (hz instanceof HN) {
                return interfaceC0937Ii.e(((HN) hz).d());
            }
            if (hz instanceof HQ) {
                return interfaceC0937Ii.k();
            }
            if (hz instanceof HH) {
                HH hh = (HH) hz;
                if (hh.j()) {
                    c(interfaceC0937Ii.c().b("$type").a("atom"), (HO) hz).b("value").d(hh.d());
                    return interfaceC0937Ii.g();
                }
                return interfaceC0937Ii.d(hh.d());
            } else if (hz instanceof HX) {
                interfaceC0937Ii.a();
                for (GW gw : ((HX) hz).i()) {
                    interfaceC0937Ii.a(gw.b());
                }
                return interfaceC0937Ii.j();
            } else if (hz instanceof HV) {
                return interfaceC0937Ii.c().b("_sentinel").e(true).g();
            } else {
                if (hz instanceof HM) {
                    throw new UnsupportedOperationException("legacy format does not support error");
                }
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private static final <T> InterfaceC0937Ii<T> c(InterfaceC0937Ii<T> interfaceC0937Ii, HO ho) {
        Long a = ho.a();
        if (a != null) {
            interfaceC0937Ii.b("$expires").e(a.longValue());
        }
        Long e = ho.e();
        if (e != null) {
            interfaceC0937Ii.b("$timestamp").e(e.longValue());
        }
        Integer c2 = ho.c();
        if (c2 != null) {
            interfaceC0937Ii.b("$size").a(Integer.valueOf(c2.intValue()));
        }
        return interfaceC0937Ii;
    }

    private static final <T> InterfaceC0937Ii<T> b(InterfaceC0937Ii<T> interfaceC0937Ii, AbstractC0935Ig<? extends GW> abstractC0935Ig) {
        interfaceC0937Ii.a();
        for (GW gw : abstractC0935Ig) {
            if (gw instanceof GS) {
                interfaceC0937Ii.a(((GS) gw).a());
            } else if (gw instanceof GT) {
                interfaceC0937Ii.e(((GT) gw).c());
            } else if (gw instanceof GN) {
                interfaceC0937Ii.e(((GN) gw).d());
            } else if (gw instanceof GQ) {
                interfaceC0937Ii.k();
            }
        }
        interfaceC0937Ii.j();
        return interfaceC0937Ii;
    }
}
