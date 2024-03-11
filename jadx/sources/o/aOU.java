package o;

import android.content.Context;
import android.content.SharedPreferences;
import com.netflix.cl.model.ABTest;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfigData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class aOU implements aOY {
    public static final c b = new c(null);
    private ABTestConfigData a;
    private final Context d;

    @Override // o.aOY
    public ABTestConfigData c() {
        return this.a;
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    public aOU(Context context) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) context, "");
        this.d = context;
        try {
            this.a = ABTestConfigData.fromJsonString(C8157dfA.e(context, "abTestConfig", (String) null));
        } catch (JSONException e) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("Error loading ab config", e, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b2);
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
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }

    @Override // o.aOY
    public void d() {
        C8157dfA.a(this.d, "abTestConfig", (String) null);
        this.a = null;
    }

    @Override // o.aOY
    public void b(ABTestConfigData aBTestConfigData) {
        if (aBTestConfigData == null) {
            return;
        }
        C8157dfA.a(this.d, "abTestConfig", aBTestConfigData.toJsonString(false));
        if (this.a == null) {
            this.a = aBTestConfigData;
            return;
        }
        SharedPreferences.Editor edit = ((Context) C1332Xp.b(Context.class)).getSharedPreferences("nfxpref", 0).edit();
        for (String str : aBTestConfigData.keySet()) {
            aRM d = C1818aPj.d(str);
            if (d != null) {
                C8632dsu.d(edit);
                d.c(edit, aBTestConfigData, C1818aPj.d());
                if (d.O_()) {
                    ABTestConfigData aBTestConfigData2 = this.a;
                    C8632dsu.d(aBTestConfigData2);
                    aBTestConfigData2.put(str, aBTestConfigData.get(str));
                }
            }
        }
        edit.apply();
    }

    @Override // o.InterfaceC1280Vp
    public List<ABTest> e() {
        Map d;
        Map k;
        Throwable th;
        Map d2;
        Map k2;
        Throwable th2;
        ArrayList arrayList = new ArrayList();
        ABTestConfigData aBTestConfigData = this.a;
        if (aBTestConfigData != null) {
            Set<String> keySet = aBTestConfigData.keySet();
            C8632dsu.a(keySet, "");
            for (String str : keySet) {
                ABTestConfig configForId = aBTestConfigData.getConfigForId(str);
                if (configForId != null && configForId.getCell() != null && configForId.isExplicit()) {
                    ABTestConfig.Cell cell = configForId.getCell();
                    C8632dsu.d(cell);
                    arrayList.add(new ABTest(str, cell.getCellId()));
                } else if (configForId == null) {
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    String str2 = "AB test is null for ID: " + str;
                    d = dqE.d();
                    k = dqE.k(d);
                    C1596aHd c1596aHd = new C1596aHd(str2, null, null, true, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b2 = c1596aHd.b();
                        if (b2 != null) {
                            c1596aHd.a(errorType.c() + " " + b2);
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
                    InterfaceC1598aHf a = dVar.a();
                    if (a != null) {
                        a.e(c1596aHd, th);
                    } else {
                        dVar.e().b(c1596aHd, th);
                    }
                } else if (configForId.getCell() == null) {
                    InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                    String str3 = "AB test cell is null for ID: " + str;
                    d2 = dqE.d();
                    k2 = dqE.k(d2);
                    C1596aHd c1596aHd2 = new C1596aHd(str3, null, null, true, k2, false, false, 96, null);
                    ErrorType errorType2 = c1596aHd2.a;
                    if (errorType2 != null) {
                        c1596aHd2.e.put("errorType", errorType2.c());
                        String b3 = c1596aHd2.b();
                        if (b3 != null) {
                            c1596aHd2.a(errorType2.c() + " " + b3);
                        }
                    }
                    if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                        th2 = new Throwable(c1596aHd2.b(), c1596aHd2.i);
                    } else if (c1596aHd2.b() != null) {
                        th2 = new Throwable(c1596aHd2.b());
                    } else {
                        th2 = c1596aHd2.i;
                        if (th2 == null) {
                            th2 = new Throwable("Handled exception with no message");
                        } else if (th2 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a2 = dVar2.a();
                    if (a2 != null) {
                        a2.e(c1596aHd2, th2);
                    } else {
                        dVar2.e().b(c1596aHd2, th2);
                    }
                } else {
                    continue;
                }
            }
        }
        List<ABTest> b4 = aRP.b();
        C8632dsu.a(b4, "");
        arrayList.addAll(b4);
        return arrayList;
    }
}
