package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* loaded from: classes7.dex */
public final class dlO {
    @SerializedName("listImpressionCount")
    private int b;
    @SerializedName("video2InList")
    private String c;
    @SerializedName("video1InList")
    private String d;
    @SerializedName("presentedIds")
    private LinkedHashSet<String> e = new LinkedHashSet<>();
    @SerializedName("videoIndex")
    private int a = -1;

    public final void a() {
        this.b++;
    }

    public final void c() {
        this.b = 0;
    }

    public final int d() {
        return this.a;
    }

    public final int e() {
        return this.b;
    }

    public final void b() {
        this.e.clear();
        this.d = null;
        this.c = null;
        this.b = 0;
        this.a = -1;
    }

    public final void b(String str, int i) {
        Map d;
        Map k;
        Throwable th;
        j();
        if (C8168dfL.h(str)) {
            LinkedHashSet<String> linkedHashSet = this.e;
            C8632dsu.d((Object) str);
            linkedHashSet.add(str);
        } else {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("SPY-31911: markPresented:: videoId is null", null, null, true, k, false, false, 96, null);
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
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
        this.b = 1;
        this.a = i;
    }

    public final void a(List<String> list, int i) {
        C8632dsu.c((Object) list, "");
        this.e.clear();
        this.e.addAll(list);
        this.a = i;
    }

    public final int f() {
        return this.e.size();
    }

    public final void b(String str, String str2) {
        if (d(str, str2)) {
            this.d = str;
            this.c = str2;
            this.a = -1;
        }
    }

    private final boolean d(String str, String str2) {
        return (C8168dfL.d(str, this.d) && C8168dfL.d(str2, this.c)) ? false : true;
    }

    public final boolean b(String str) {
        C8632dsu.c((Object) str, "");
        return this.e.contains(str);
    }

    private final void j() {
        if (this.e.size() < dlR.a()) {
            return;
        }
        Iterator<String> it = this.e.iterator();
        C8632dsu.a(it, "");
        for (int i = 0; it.hasNext() && i < dlR.e(); i++) {
            it.next();
            it.remove();
        }
    }

    public String toString() {
        LinkedHashSet<String> linkedHashSet = this.e;
        int i = this.a;
        int i2 = this.b;
        String str = this.d;
        String str2 = this.c;
        return "CardAlgoListData(presentedIds=" + linkedHashSet + ", videoIndex=" + i + ", listImpressionCount=" + i2 + ", video1InList=" + str + ", video2InList=" + str2 + ")";
    }
}
