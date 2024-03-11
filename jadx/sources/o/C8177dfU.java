package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.ArrayList;
import java.util.Map;
import o.InterfaceC1597aHe;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.dfU  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8177dfU {
    public static final C8177dfU b = new C8177dfU();

    private C8177dfU() {
    }

    public static final void a(InterfaceC5283bvo interfaceC5283bvo, int i, String str) {
        Map d;
        Map k;
        Throwable th;
        Throwable th2;
        Throwable th3;
        C8632dsu.c((Object) str, "");
        if (interfaceC5283bvo == null) {
            InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
            C1596aHd c1596aHd = new C1596aHd("SPY-35474 - user profile is null " + i + " " + str, null, null, false, null, false, false, 126, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    c1596aHd.a(errorType.c() + " " + b2);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th3 = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th3 = new Throwable(c1596aHd.b());
            } else {
                th3 = c1596aHd.i;
                if (th3 == null) {
                    th3 = new Throwable("Handled exception with no message");
                } else if (th3 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1597aHe c = dVar2.c();
            if (c != null) {
                c.d(c1596aHd, th3);
            } else {
                dVar2.e().b(c1596aHd, th3);
            }
        } else if (!interfaceC5283bvo.isProfileValid()) {
            C1596aHd e = b.e(interfaceC5283bvo, i, str);
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            ErrorType errorType2 = e.a;
            if (errorType2 != null) {
                e.e.put("errorType", errorType2.c());
                String b3 = e.b();
                if (b3 != null) {
                    e.a(errorType2.c() + " " + b3);
                }
            }
            if (e.b() != null && e.i != null) {
                th2 = new Throwable(e.b(), e.i);
            } else if (e.b() != null) {
                th2 = new Throwable(e.b());
            } else {
                th2 = e.i;
                if (th2 == null) {
                    th2 = new Throwable("Handled exception with no message");
                } else if (th2 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar3 = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar3.a();
            if (a != null) {
                a.e(e, th2);
            } else {
                dVar3.e().b(e, th2);
            }
        } else {
            String languagesInCsv = interfaceC5283bvo.getLanguagesInCsv();
            if (languagesInCsv == null || languagesInCsv.length() <= 20) {
                return;
            }
            InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd2 = new C1596aHd("SPY-38167 Languages.length>20 " + i + " " + str, null, null, true, k, false, false, 96, null);
            ErrorType errorType3 = c1596aHd2.a;
            if (errorType3 != null) {
                c1596aHd2.e.put("errorType", errorType3.c());
                String b4 = c1596aHd2.b();
                if (b4 != null) {
                    c1596aHd2.a(errorType3.c() + " " + b4);
                }
            }
            if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                th = new Throwable(c1596aHd2.b(), c1596aHd2.i);
            } else if (c1596aHd2.b() != null) {
                th = new Throwable(c1596aHd2.b());
            } else {
                th = c1596aHd2.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar4 = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar4.a();
            if (a2 != null) {
                a2.e(c1596aHd2, th);
            } else {
                dVar4.e().b(c1596aHd2, th);
            }
        }
    }

    private final C1596aHd e(InterfaceC5283bvo interfaceC5283bvo, int i, String str) {
        boolean g;
        String d;
        ArrayList arrayList = new ArrayList();
        if (!interfaceC5283bvo.isProfileGuidValid()) {
            arrayList.add("guid: invalid");
        }
        String profileName = interfaceC5283bvo.getProfileName();
        C8632dsu.a(profileName, "");
        g = C8691duz.g(profileName);
        if (g) {
            arrayList.add("name: blank");
        }
        String languagesInCsv = interfaceC5283bvo.getLanguagesInCsv();
        arrayList.add("lang: " + languagesInCsv);
        String avatarUrl = interfaceC5283bvo.getAvatarUrl();
        if (avatarUrl == null) {
            arrayList.add("url: null");
        } else if (avatarUrl.hashCode() == 0 && avatarUrl.equals("")) {
            arrayList.add("url: blank");
        }
        int maturityValue = interfaceC5283bvo.getMaturityValue();
        arrayList.add("maturity: " + maturityValue);
        C1596aHd b2 = new C1596aHd("SPY-35474 - user profile is invalid: " + i + " " + str, null, null, false, null, false, false, 126, null).b(false);
        d = C8576dqs.d(arrayList, ", ", null, null, 0, null, null, 62, null);
        return b2.e("profileValidation", i + " (from " + str + ") " + d);
    }
}
