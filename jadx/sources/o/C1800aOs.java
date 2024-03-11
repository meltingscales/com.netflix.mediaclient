package o;

import android.content.Context;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.AbstractC1804aOw;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.aOs  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1800aOs {
    private static final d a = new d(null);
    private final Map<String, Map<String, C1801aOt>> d = new LinkedHashMap();
    private final Map<String, aOE> e = new LinkedHashMap();
    private final Map<String, Boolean> b = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aOs$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("nf_cdx_pairing_history");
        }
    }

    public final void c(Context context) {
        synchronized (this) {
            C8632dsu.c((Object) context, "");
            Map<String, Map<String, C1801aOt>> b = C1807aOz.a.b(context);
            a.getLogTag();
            for (Map.Entry<String, Map<String, C1801aOt>> entry : b.entrySet()) {
                a.getLogTag();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                this.d.put(entry.getKey(), linkedHashMap);
                for (Map.Entry<String, C1801aOt> entry2 : entry.getValue().entrySet()) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
            d dVar = a;
            dVar.getLogTag();
            this.e.putAll(C1807aOz.a.e(context));
            dVar.getLogTag();
        }
    }

    public final void b(Context context) {
        synchronized (this) {
            C8632dsu.c((Object) context, "");
            C8157dfA.e(context, "pref_cdx_pairing_history");
            C8157dfA.e(context, "pref_cdx_prompted_pairing_prompts");
            this.d.clear();
            this.e.clear();
            this.b.clear();
        }
    }

    private final Map<String, C1801aOt> a(String str) {
        Map<String, C1801aOt> map = this.d.get(str);
        if (map == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.d.put(str, linkedHashMap);
            return linkedHashMap;
        }
        return map;
    }

    public final void d(Context context, String str, C1255Uq c1255Uq, C1255Uq c1255Uq2) {
        synchronized (this) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c1255Uq2, "");
            Map<String, C1801aOt> a2 = a(str);
            C1801aOt c1801aOt = a2.get(c1255Uq2.a());
            if (c1801aOt == null) {
                a.getLogTag();
                a2.put(c1255Uq2.a(), new C1801aOt(c1255Uq2.a(), c1255Uq2.e(), c1255Uq2.b(), System.currentTimeMillis(), (c1255Uq == null || (r11 = c1255Uq.b()) == null) ? "" : ""));
            } else {
                a.getLogTag();
                c1801aOt.c(c1255Uq2.e());
                c1801aOt.a(c1255Uq2.b());
                c1801aOt.d(System.currentTimeMillis());
                c1801aOt.e((c1255Uq == null || (r10 = c1255Uq.b()) == null) ? "" : "");
            }
            C1807aOz.a.e(context, this.d);
        }
    }

    private final boolean c(String str) {
        Boolean bool = this.b.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final AbstractC1804aOw a(Context context, String str, String str2, C1255Uq c1255Uq, List<C1255Uq> list) {
        AbstractC1804aOw c;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c1255Uq, "");
        C8632dsu.c((Object) list, "");
        if (str2 == null) {
            return AbstractC1804aOw.b.b;
        }
        if (!c(str2)) {
            Map<String, C1801aOt> a2 = a(str2);
            d dVar = a;
            dVar.getLogTag();
            if (list.size() == 1) {
                c = C1803aOv.d.a(str2, c1255Uq, list.get(0), a2);
            } else {
                c = C1803aOv.d.c(str2, c1255Uq, list, a2);
            }
            if (c instanceof AbstractC1804aOw.a) {
                aOE b = b(str2);
                if (b != null) {
                    if (b.a() >= 5) {
                        a(context, str, b, str2, c1255Uq);
                        return AbstractC1804aOw.b.b;
                    }
                    dVar.getLogTag();
                    d(context, str2);
                } else {
                    dVar.getLogTag();
                    d(context, str2);
                }
            }
            if (!(c instanceof AbstractC1804aOw.b)) {
                dVar.getLogTag();
                this.b.put(str2, Boolean.TRUE);
            }
            return c;
        }
        a.getLogTag();
        return AbstractC1804aOw.b.b;
    }

    private final void a(Context context, String str, aOE aoe, String str2, C1255Uq c1255Uq) {
        Throwable th;
        d dVar = a;
        if (!aoe.b()) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            C1596aHd c1596aHd = new C1596aHd("CompanionMobile: Failed to report reaching prompted cap", null, null, false, null, false, false, 126, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar2.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
            } else {
                dVar2.e().b(c1596aHd, th);
            }
            aoe.a(true);
            C1807aOz.a.c(context, this.e);
            C1798aOq.a.a(str);
            return;
        }
        dVar.getLogTag();
    }

    private final void d(Context context, String str) {
        aOE aoe = this.e.get(str);
        if (aoe != null) {
            aoe.b(aoe.a() + 1);
        } else {
            this.e.put(str, new aOE(1, false));
        }
        C1807aOz.a.c(context, this.e);
    }

    private final aOE b(String str) {
        return this.e.get(str);
    }

    public final void c(Context context, String str) {
        C8632dsu.c((Object) context, "");
        if (str != null) {
            this.e.remove(str);
            C1807aOz.a.c(context, this.e);
            dpR dpr = dpR.c;
        }
    }

    public final void b(Context context, String str, String str2) {
        Throwable th;
        C8632dsu.c((Object) context, "");
        d dVar = a;
        dVar.getLogTag();
        if (str2 != null) {
            aOE b = b(str2);
            if (b != null) {
                if (b.a() < 5 || b.b()) {
                    return;
                }
                dVar.getLogTag();
                C1798aOq.a.a(str);
                b.a(true);
                C1807aOz.a.c(context, this.e);
                return;
            }
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            C1596aHd b2 = new C1596aHd("userDeclinedPromptedPairing:: Session is not found. This should NOT happen, report", null, null, false, null, false, false, 126, null).b(ErrorType.a).b(false);
            ErrorType errorType = b2.a;
            if (errorType != null) {
                b2.e.put("errorType", errorType.c());
                String b3 = b2.b();
                if (b3 != null) {
                    String c = errorType.c();
                    b2.a(c + " " + b3);
                }
            }
            if (b2.b() != null && b2.i != null) {
                th = new Throwable(b2.b(), b2.i);
            } else if (b2.b() != null) {
                th = new Throwable(b2.b());
            } else {
                th = b2.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar2.a();
            if (a2 != null) {
                a2.e(b2, th);
            } else {
                dVar2.e().b(b2, th);
            }
        }
    }
}
