package o;

import com.apollographql.apollo3.exception.CacheMissException;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC9034hv;

/* loaded from: classes3.dex */
public final class aCX extends aCU implements InterfaceC9042iC {
    private final InterfaceC1270Vf i;
    private final aCL j;
    public static final b a = new b(null);
    private static final String h = C2937apW.b.c().b();
    private static final String b = C2979aqL.c.b().b();
    private static final String f = C3378axp.e.d().b();
    private static final String c = C2869aoH.e.c().b();
    private static final String e = C2942apb.d.c().b();
    private static final String d = C2943apc.e.b().b();

    @Inject
    public aCX(aCL acl, InterfaceC1270Vf interfaceC1270Vf) {
        C8632dsu.c((Object) acl, "");
        C8632dsu.c((Object) interfaceC1270Vf, "");
        this.j = acl;
        this.i = interfaceC1270Vf;
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final String c() {
            return aCX.h;
        }
    }

    @Override // o.aCU, o.InterfaceC9046iG
    public Object d(C9018hf c9018hf, InterfaceC9034hv.c cVar, Map<String, ? extends Object> map, String str) {
        Map k;
        Map k2;
        Map k3;
        C8632dsu.c((Object) c9018hf, "");
        C8632dsu.c((Object) cVar, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) str, "");
        if (this.j.a(map, this.i.e())) {
            throw new CacheMissException("expired_data", c9018hf.d(), true);
        }
        if (C8632dsu.c((Object) c9018hf.d(), (Object) "newLolomo")) {
            Map<String, Object> b2 = cVar.b();
            Object c2 = c9018hf.c("context", cVar);
            Map map2 = c2 instanceof Map ? (Map) c2 : null;
            Object obj = map2 != null ? map2.get("mapAnnotations") : null;
            Map map3 = obj instanceof Map ? (Map) obj : null;
            if (map3 != null && map3.containsKey("renoMessageId")) {
                k = dqE.k(map3);
                k.remove("renoMessageId");
                k2 = dqE.k(map2);
                k2.put("mapAnnotations", k);
                k3 = dqE.k(b2);
                k3.put("context", k2);
                return super.d(c9018hf, new InterfaceC9034hv.c(k3), map, str);
            }
        }
        return super.d(c9018hf, cVar, map, str);
    }

    @Override // o.InterfaceC9042iC
    public C9043iD d(Map<String, ? extends Object> map, C9048iI c9048iI) {
        boolean b2;
        Map d2;
        Map k;
        Throwable th;
        boolean g;
        Map d3;
        Map k2;
        Throwable th2;
        Map d4;
        Map k3;
        Throwable th3;
        Map d5;
        Map k4;
        Throwable th4;
        Map d6;
        Map k5;
        Throwable th5;
        Map d7;
        Map k6;
        Throwable th6;
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) c9048iI, "");
        if (map.size() > 1 && map.containsKey("__typename")) {
            Object obj = map.get("__typename");
            if (C8632dsu.c(C2937apW.b.c().b(), obj)) {
                Object obj2 = map.get("lolomoId");
                String str = obj2 instanceof String ? (String) obj2 : null;
                if (str != null && str.length() != 0) {
                    return new C9043iD(h + "." + str);
                }
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                ErrorType errorType = ErrorType.l;
                d7 = dqE.d();
                k6 = dqE.k(d7);
                C1596aHd c1596aHd = new C1596aHd("Normalization Failed: Fetched lolomo data without lolomoId", null, errorType, true, k6, false, false, 96, null);
                ErrorType errorType2 = c1596aHd.a;
                if (errorType2 != null) {
                    c1596aHd.e.put("errorType", errorType2.c());
                    String b3 = c1596aHd.b();
                    if (b3 != null) {
                        c1596aHd.a(errorType2.c() + " " + b3);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th6 = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th6 = new Throwable(c1596aHd.b());
                } else {
                    th6 = c1596aHd.i;
                    if (th6 == null) {
                        th6 = new Throwable("Handled exception with no message");
                    } else if (th6 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar.a();
                if (a2 != null) {
                    a2.e(c1596aHd, th6);
                } else {
                    dVar.e().b(c1596aHd, th6);
                }
            } else if (C8632dsu.c(C2979aqL.c.b().b(), obj)) {
                Object obj3 = map.get("lolomoId");
                String str2 = obj3 instanceof String ? (String) obj3 : null;
                Object obj4 = map.get("index");
                Integer num = obj4 instanceof Integer ? (Integer) obj4 : null;
                if (str2 != null && str2.length() != 0 && num != null && num.intValue() >= 0) {
                    String str3 = str2 + "." + num;
                    return new C9043iD(b + "." + str3);
                }
                InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                ErrorType errorType3 = ErrorType.l;
                d6 = dqE.d();
                k5 = dqE.k(d6);
                C1596aHd c1596aHd2 = new C1596aHd("Normalization Failed: Fetched list data without outer lolomoId or index", null, errorType3, true, k5, false, false, 96, null);
                ErrorType errorType4 = c1596aHd2.a;
                if (errorType4 != null) {
                    c1596aHd2.e.put("errorType", errorType4.c());
                    String b4 = c1596aHd2.b();
                    if (b4 != null) {
                        c1596aHd2.a(errorType4.c() + " " + b4);
                    }
                }
                if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                    th5 = new Throwable(c1596aHd2.b(), c1596aHd2.i);
                } else if (c1596aHd2.b() != null) {
                    th5 = new Throwable(c1596aHd2.b());
                } else {
                    th5 = c1596aHd2.i;
                    if (th5 == null) {
                        th5 = new Throwable("Handled exception with no message");
                    } else if (th5 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                InterfaceC1598aHf a3 = dVar2.a();
                if (a3 != null) {
                    a3.e(c1596aHd2, th5);
                } else {
                    dVar2.e().b(c1596aHd2, th5);
                }
            } else {
                b2 = C8576dqs.b((Iterable<? extends Object>) aCM.e.a(), obj);
                if (b2) {
                    Object obj5 = map.get(SignupConstants.Field.VIDEO_ID);
                    Integer num2 = obj5 instanceof Integer ? (Integer) obj5 : null;
                    if (num2 != null) {
                        return new C9043iD(f + "." + num2);
                    }
                    InterfaceC1598aHf.c cVar3 = InterfaceC1598aHf.a;
                    ErrorType errorType5 = ErrorType.l;
                    d5 = dqE.d();
                    k4 = dqE.k(d5);
                    C1596aHd c1596aHd3 = new C1596aHd("Video normalization Failed: Fetched video data without videoId", null, errorType5, true, k4, false, false, 96, null);
                    ErrorType errorType6 = c1596aHd3.a;
                    if (errorType6 != null) {
                        c1596aHd3.e.put("errorType", errorType6.c());
                        String b5 = c1596aHd3.b();
                        if (b5 != null) {
                            c1596aHd3.a(errorType6.c() + " " + b5);
                        }
                    }
                    if (c1596aHd3.b() != null && c1596aHd3.i != null) {
                        th4 = new Throwable(c1596aHd3.b(), c1596aHd3.i);
                    } else if (c1596aHd3.b() != null) {
                        th4 = new Throwable(c1596aHd3.b());
                    } else {
                        th4 = c1596aHd3.i;
                        if (th4 == null) {
                            th4 = new Throwable("Handled exception with no message");
                        } else if (th4 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar3 = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a4 = dVar3.a();
                    if (a4 != null) {
                        a4.e(c1596aHd3, th4);
                    } else {
                        dVar3.e().b(c1596aHd3, th4);
                    }
                } else if (C8632dsu.c(C2869aoH.e.c().b(), obj)) {
                    Object obj6 = map.get("characterId");
                    Integer num3 = obj6 instanceof Integer ? (Integer) obj6 : null;
                    if (num3 != null) {
                        return new C9043iD(c + "." + num3);
                    }
                    InterfaceC1598aHf.c cVar4 = InterfaceC1598aHf.a;
                    ErrorType errorType7 = ErrorType.l;
                    d4 = dqE.d();
                    k3 = dqE.k(d4);
                    C1596aHd c1596aHd4 = new C1596aHd("Character normalization Failed: Fetched character data without characterId", null, errorType7, true, k3, false, false, 96, null);
                    ErrorType errorType8 = c1596aHd4.a;
                    if (errorType8 != null) {
                        c1596aHd4.e.put("errorType", errorType8.c());
                        String b6 = c1596aHd4.b();
                        if (b6 != null) {
                            c1596aHd4.a(errorType8.c() + " " + b6);
                        }
                    }
                    if (c1596aHd4.b() != null && c1596aHd4.i != null) {
                        th3 = new Throwable(c1596aHd4.b(), c1596aHd4.i);
                    } else if (c1596aHd4.b() != null) {
                        th3 = new Throwable(c1596aHd4.b());
                    } else {
                        th3 = c1596aHd4.i;
                        if (th3 == null) {
                            th3 = new Throwable("Handled exception with no message");
                        } else if (th3 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar4 = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a5 = dVar4.a();
                    if (a5 != null) {
                        a5.e(c1596aHd4, th3);
                    } else {
                        dVar4.e().b(c1596aHd4, th3);
                    }
                } else if (C8632dsu.c(C2942apb.d.c().b(), obj)) {
                    Object obj7 = map.get("gameId");
                    Integer num4 = obj7 instanceof Integer ? (Integer) obj7 : null;
                    if (num4 != null) {
                        return new C9043iD(e + "." + num4);
                    }
                    InterfaceC1598aHf.c cVar5 = InterfaceC1598aHf.a;
                    ErrorType errorType9 = ErrorType.l;
                    d3 = dqE.d();
                    k2 = dqE.k(d3);
                    C1596aHd c1596aHd5 = new C1596aHd("Normalization Failed: Fetched game data without gameId", null, errorType9, true, k2, false, false, 96, null);
                    ErrorType errorType10 = c1596aHd5.a;
                    if (errorType10 != null) {
                        c1596aHd5.e.put("errorType", errorType10.c());
                        String b7 = c1596aHd5.b();
                        if (b7 != null) {
                            c1596aHd5.a(errorType10.c() + " " + b7);
                        }
                    }
                    if (c1596aHd5.b() != null && c1596aHd5.i != null) {
                        th2 = new Throwable(c1596aHd5.b(), c1596aHd5.i);
                    } else if (c1596aHd5.b() != null) {
                        th2 = new Throwable(c1596aHd5.b());
                    } else {
                        th2 = c1596aHd5.i;
                        if (th2 == null) {
                            th2 = new Throwable("Handled exception with no message");
                        } else if (th2 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar5 = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a6 = dVar5.a();
                    if (a6 != null) {
                        a6.e(c1596aHd5, th2);
                    } else {
                        dVar5.e().b(c1596aHd5, th2);
                    }
                } else if (C8632dsu.c(C2943apc.e.b().b(), obj)) {
                    Object obj8 = map.get(SignupConstants.Field.LANG_ID);
                    String str4 = obj8 instanceof String ? (String) obj8 : null;
                    if (str4 != null) {
                        g = C8691duz.g(str4);
                        if (!g) {
                            return new C9043iD(d + "." + str4);
                        }
                    }
                    InterfaceC1598aHf.c cVar6 = InterfaceC1598aHf.a;
                    ErrorType errorType11 = ErrorType.l;
                    d2 = dqE.d();
                    k = dqE.k(d2);
                    C1596aHd c1596aHd6 = new C1596aHd("Normalization Failed: Fetched generic container data without id", null, errorType11, true, k, false, false, 96, null);
                    ErrorType errorType12 = c1596aHd6.a;
                    if (errorType12 != null) {
                        c1596aHd6.e.put("errorType", errorType12.c());
                        String b8 = c1596aHd6.b();
                        if (b8 != null) {
                            c1596aHd6.a(errorType12.c() + " " + b8);
                        }
                    }
                    if (c1596aHd6.b() != null && c1596aHd6.i != null) {
                        th = new Throwable(c1596aHd6.b(), c1596aHd6.i);
                    } else if (c1596aHd6.b() != null) {
                        th = new Throwable(c1596aHd6.b());
                    } else {
                        th = c1596aHd6.i;
                        if (th == null) {
                            th = new Throwable("Handled exception with no message");
                        } else if (th == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar6 = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a7 = dVar6.a();
                    if (a7 != null) {
                        a7.e(c1596aHd6, th);
                    } else {
                        dVar6.e().b(c1596aHd6, th);
                    }
                }
            }
        }
        return null;
    }

    @Override // o.aCU
    public C9043iD d(C9018hf c9018hf, InterfaceC9034hv.c cVar) {
        Map d2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) c9018hf, "");
        C8632dsu.c((Object) cVar, "");
        String d3 = c9018hf.d();
        if (C8632dsu.c((Object) d3, (Object) "lolomoById")) {
            Object c2 = c9018hf.c("lolomoId", cVar);
            String str = c2 instanceof String ? (String) c2 : null;
            if (str != null && str.length() != 0) {
                return new C9043iD(h + "." + str);
            }
            InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
            ErrorType errorType = ErrorType.l;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("Cache lookup failed: lolomo data fetched without lolomoId", null, errorType, true, k, false, false, 96, null);
            ErrorType errorType2 = c1596aHd.a;
            if (errorType2 != null) {
                c1596aHd.e.put("errorType", errorType2.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    c1596aHd.a(errorType2.c() + " " + b2);
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
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
                return null;
            }
            dVar.e().b(c1596aHd, th);
            return null;
        } else if (C8632dsu.c((Object) d3, (Object) "lolomoRowByIndex")) {
            Object c3 = c9018hf.c("lolomoId", cVar);
            String str2 = c3 instanceof String ? (String) c3 : null;
            if (str2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Object c4 = c9018hf.c("index", cVar);
            Integer num = c4 instanceof Integer ? (Integer) c4 : null;
            if (num == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            String str3 = str2 + "." + num.intValue();
            return new C9043iD(b + "." + str3);
        } else {
            return null;
        }
    }

    @Override // o.aCU
    public List<C9043iD> a(C9018hf c9018hf, InterfaceC9034hv.c cVar) {
        C8632dsu.c((Object) c9018hf, "");
        C8632dsu.c((Object) cVar, "");
        String d2 = c9018hf.d();
        int hashCode = d2.hashCode();
        if (hashCode != -816678056) {
            if (hashCode != 98120385) {
                if (hashCode == 1245424234 && d2.equals("characters")) {
                    return e(c9018hf, cVar);
                }
            } else if (d2.equals("games")) {
                return c(c9018hf, cVar);
            }
        } else if (d2.equals(SignupConstants.Field.VIDEOS)) {
            return b(c9018hf, cVar);
        }
        return null;
    }

    private final List<C9043iD> b(C9018hf c9018hf, InterfaceC9034hv.c cVar) {
        int d2;
        Object c2 = c9018hf.c("videoIds", cVar);
        List list = c2 instanceof List ? (List) c2 : null;
        if (list != null) {
            d2 = C8572dqo.d(list, 10);
            ArrayList arrayList = new ArrayList(d2);
            for (Object obj : list) {
                arrayList.add((obj == null || !(obj instanceof Integer)) ? null : new C9043iD(f + "." + obj));
            }
            return arrayList;
        }
        return null;
    }

    private final List<C9043iD> e(C9018hf c9018hf, InterfaceC9034hv.c cVar) {
        int d2;
        Object c2 = c9018hf.c("characterIds", cVar);
        List list = c2 instanceof List ? (List) c2 : null;
        if (list != null) {
            d2 = C8572dqo.d(list, 10);
            ArrayList arrayList = new ArrayList(d2);
            for (Object obj : list) {
                arrayList.add((obj == null || !(obj instanceof Integer)) ? null : new C9043iD(c + "." + obj));
            }
            return arrayList;
        }
        return null;
    }

    private final List<C9043iD> c(C9018hf c9018hf, InterfaceC9034hv.c cVar) {
        int d2;
        Object c2 = c9018hf.c("gameIds", cVar);
        List list = c2 instanceof List ? (List) c2 : null;
        if (list != null) {
            d2 = C8572dqo.d(list, 10);
            ArrayList arrayList = new ArrayList(d2);
            for (Object obj : list) {
                arrayList.add((obj == null || !(obj instanceof Integer)) ? null : new C9043iD(e + "." + obj));
            }
            return arrayList;
        }
        return null;
    }
}
