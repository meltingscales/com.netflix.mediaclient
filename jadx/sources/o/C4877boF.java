package o;

import com.netflix.mediaclient.media.PreferredLanguageData;
import com.netflix.mediaclient.servicemgr.PlayerPrefetchSource;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.boF  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4877boF {
    public boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final PreferredLanguageData f;
    private final Map<Long, C4884boM> g;
    public final String h;
    public final boolean i;
    public final boolean j;

    public void c() {
        this.a = true;
    }

    public C4877boF(boolean z, boolean z2, boolean z3, String str, PreferredLanguageData preferredLanguageData, String str2, boolean z4) {
        this(z, z2, z3, str, preferredLanguageData, str2, z4, true);
    }

    public C4877boF(boolean z, boolean z2, boolean z3, String str, PreferredLanguageData preferredLanguageData, String str2, boolean z4, boolean z5) {
        this.g = new HashMap();
        this.e = z;
        this.j = z2;
        this.i = z3;
        this.c = str;
        this.f = preferredLanguageData;
        this.h = str2;
        this.d = z4;
        this.b = z5;
    }

    public void b(Long l, C4884boM c4884boM) {
        this.g.put(l, c4884boM);
    }

    public C4884boM b(Long l) {
        return this.g.get(l);
    }

    public static C4877boF e(C5102bsS c5102bsS) {
        return new C4877boF(c5102bsS.c(), c5102bsS.b().a(), c5102bsS.b().h(), null, null, null, c5102bsS.a(), c5102bsS.b() == PlayerPrefetchSource.PlayByUser);
    }
}
