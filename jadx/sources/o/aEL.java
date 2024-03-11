package o;

import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.graphql.models.type.SubtitleColor;
import com.netflix.mediaclient.graphql.models.type.SubtitleEdgeAttribute;
import com.netflix.mediaclient.graphql.models.type.SubtitleFontStyle;
import com.netflix.mediaclient.graphql.models.type.SubtitleOpacity;
import com.netflix.mediaclient.graphql.models.type.SubtitleSize;
import java.util.Locale;
import o.C2567aiX;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aEL implements InterfaceC5284bvp {
    public static final e c = new e(null);
    private final C2567aiX.i a;

    public aEL(C2567aiX.i iVar) {
        C8632dsu.c((Object) iVar, "");
        this.a = iVar;
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final C2567aiX.i a(String str) {
            boolean g;
            SubtitleFontStyle subtitleFontStyle = null;
            if (str != null) {
                g = C8691duz.g(str);
                if (!g) {
                    JSONObject jSONObject = new JSONObject(str);
                    String b = C3227auw.c.b().b();
                    SubtitleColor e = e(jSONObject, "backgroundColor");
                    SubtitleOpacity d = d(jSONObject, "backgroundOpacity");
                    SubtitleColor e2 = e(jSONObject, "charColor");
                    String a = C8123deT.a(jSONObject, "charEdgeAttrs", (String) null);
                    SubtitleEdgeAttribute e3 = a != null ? SubtitleEdgeAttribute.a.e(a) : null;
                    SubtitleColor e4 = e(jSONObject, "charEdgeColor");
                    SubtitleOpacity d2 = d(jSONObject, "charOpacity");
                    String a2 = C8123deT.a(jSONObject, "charSize", (String) null);
                    SubtitleSize c = a2 != null ? SubtitleSize.e.c(a2) : null;
                    String a3 = C8123deT.a(jSONObject, "charStyle", (String) null);
                    if (a3 != null) {
                        SubtitleFontStyle.d dVar = SubtitleFontStyle.d;
                        Locale locale = Locale.ENGLISH;
                        C8632dsu.a(locale, "");
                        String upperCase = a3.toUpperCase(locale);
                        C8632dsu.a(upperCase, "");
                        subtitleFontStyle = dVar.d(upperCase);
                    }
                    return new C2567aiX.i(b, e, d, e2, e3, e4, d2, c, subtitleFontStyle, e(jSONObject, "windowColor"), d(jSONObject, "windowOpacity"));
                }
            }
            return null;
        }

        private final SubtitleColor e(JSONObject jSONObject, String str) {
            return d(C8123deT.a(jSONObject, str, (String) null));
        }

        private final SubtitleOpacity d(JSONObject jSONObject, String str) {
            String a = C8123deT.a(jSONObject, str, (String) null);
            if (a != null) {
                return SubtitleOpacity.a.a(a);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(SubtitleColor subtitleColor) {
            String e;
            if (subtitleColor == null || (e = subtitleColor.e()) == null) {
                return null;
            }
            Locale locale = Locale.ENGLISH;
            C8632dsu.a(locale, "");
            String lowerCase = e.toLowerCase(locale);
            C8632dsu.a(lowerCase, "");
            return lowerCase;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final SubtitleColor d(String str) {
            if (str == null || C8632dsu.c((Object) str, (Object) "null")) {
                return null;
            }
            SubtitleColor.d dVar = SubtitleColor.d;
            Locale locale = Locale.ENGLISH;
            C8632dsu.a(locale, "");
            String upperCase = str.toUpperCase(locale);
            C8632dsu.a(upperCase, "");
            return dVar.d(upperCase);
        }
    }

    @Override // o.InterfaceC5284bvp
    public String getBackgroundColor() {
        return c.b(this.a.c());
    }

    @Override // o.InterfaceC5284bvp
    public InterfaceC5284bvp setBackgroundColor(String str) {
        C2567aiX.i e2;
        e2 = r0.e((r24 & 1) != 0 ? r0.e : null, (r24 & 2) != 0 ? r0.c : c.d(str), (r24 & 4) != 0 ? r0.a : null, (r24 & 8) != 0 ? r0.b : null, (r24 & 16) != 0 ? r0.d : null, (r24 & 32) != 0 ? r0.g : null, (r24 & 64) != 0 ? r0.i : null, (r24 & 128) != 0 ? r0.h : null, (r24 & JSONzip.end) != 0 ? r0.f : null, (r24 & 512) != 0 ? r0.j : null, (r24 & 1024) != 0 ? this.a.k : null);
        return new aEL(e2);
    }

    @Override // o.InterfaceC5284bvp
    public String getBackgroundOpacity() {
        SubtitleOpacity a = this.a.a();
        if (a != null) {
            return a.c();
        }
        return null;
    }

    @Override // o.InterfaceC5284bvp
    public InterfaceC5284bvp setBackgroundOpacity(String str) {
        C2567aiX.i e2;
        C8632dsu.c((Object) str, "");
        e2 = r2.e((r24 & 1) != 0 ? r2.e : null, (r24 & 2) != 0 ? r2.c : null, (r24 & 4) != 0 ? r2.a : SubtitleOpacity.a.a(str), (r24 & 8) != 0 ? r2.b : null, (r24 & 16) != 0 ? r2.d : null, (r24 & 32) != 0 ? r2.g : null, (r24 & 64) != 0 ? r2.i : null, (r24 & 128) != 0 ? r2.h : null, (r24 & JSONzip.end) != 0 ? r2.f : null, (r24 & 512) != 0 ? r2.j : null, (r24 & 1024) != 0 ? this.a.k : null);
        return new aEL(e2);
    }

    @Override // o.InterfaceC5284bvp
    public String getCharColor() {
        return c.b(this.a.d());
    }

    @Override // o.InterfaceC5284bvp
    public InterfaceC5284bvp setCharColor(String str) {
        C2567aiX.i e2;
        C8632dsu.c((Object) str, "");
        C2567aiX.i iVar = this.a;
        SubtitleColor.d dVar = SubtitleColor.d;
        Locale locale = Locale.ENGLISH;
        C8632dsu.a(locale, "");
        String upperCase = str.toUpperCase(locale);
        C8632dsu.a(upperCase, "");
        e2 = iVar.e((r24 & 1) != 0 ? iVar.e : null, (r24 & 2) != 0 ? iVar.c : null, (r24 & 4) != 0 ? iVar.a : null, (r24 & 8) != 0 ? iVar.b : dVar.d(upperCase), (r24 & 16) != 0 ? iVar.d : null, (r24 & 32) != 0 ? iVar.g : null, (r24 & 64) != 0 ? iVar.i : null, (r24 & 128) != 0 ? iVar.h : null, (r24 & JSONzip.end) != 0 ? iVar.f : null, (r24 & 512) != 0 ? iVar.j : null, (r24 & 1024) != 0 ? iVar.k : null);
        return new aEL(e2);
    }

    @Override // o.InterfaceC5284bvp
    public String getCharEdgeAttrs() {
        SubtitleEdgeAttribute b = this.a.b();
        if (b != null) {
            return b.c();
        }
        return null;
    }

    @Override // o.InterfaceC5284bvp
    public InterfaceC5284bvp setCharEdgeAttrs(String str) {
        C2567aiX.i e2;
        C8632dsu.c((Object) str, "");
        e2 = r2.e((r24 & 1) != 0 ? r2.e : null, (r24 & 2) != 0 ? r2.c : null, (r24 & 4) != 0 ? r2.a : null, (r24 & 8) != 0 ? r2.b : null, (r24 & 16) != 0 ? r2.d : SubtitleEdgeAttribute.a.e(str), (r24 & 32) != 0 ? r2.g : null, (r24 & 64) != 0 ? r2.i : null, (r24 & 128) != 0 ? r2.h : null, (r24 & JSONzip.end) != 0 ? r2.f : null, (r24 & 512) != 0 ? r2.j : null, (r24 & 1024) != 0 ? this.a.k : null);
        return new aEL(e2);
    }

    @Override // o.InterfaceC5284bvp
    public String getCharEdgeColor() {
        return c.b(this.a.e());
    }

    @Override // o.InterfaceC5284bvp
    public InterfaceC5284bvp setCharEdgeColor(String str) {
        C2567aiX.i e2;
        C8632dsu.c((Object) str, "");
        e2 = r2.e((r24 & 1) != 0 ? r2.e : null, (r24 & 2) != 0 ? r2.c : null, (r24 & 4) != 0 ? r2.a : null, (r24 & 8) != 0 ? r2.b : null, (r24 & 16) != 0 ? r2.d : null, (r24 & 32) != 0 ? r2.g : c.d(str), (r24 & 64) != 0 ? r2.i : null, (r24 & 128) != 0 ? r2.h : null, (r24 & JSONzip.end) != 0 ? r2.f : null, (r24 & 512) != 0 ? r2.j : null, (r24 & 1024) != 0 ? this.a.k : null);
        return new aEL(e2);
    }

    @Override // o.InterfaceC5284bvp
    public String getCharOpacity() {
        SubtitleOpacity h = this.a.h();
        if (h != null) {
            return h.c();
        }
        return null;
    }

    @Override // o.InterfaceC5284bvp
    public String getCharSize() {
        SubtitleSize j = this.a.j();
        if (j != null) {
            return j.b();
        }
        return null;
    }

    @Override // o.InterfaceC5284bvp
    public InterfaceC5284bvp setCharSize(String str) {
        C2567aiX.i e2;
        C8632dsu.c((Object) str, "");
        e2 = r2.e((r24 & 1) != 0 ? r2.e : null, (r24 & 2) != 0 ? r2.c : null, (r24 & 4) != 0 ? r2.a : null, (r24 & 8) != 0 ? r2.b : null, (r24 & 16) != 0 ? r2.d : null, (r24 & 32) != 0 ? r2.g : null, (r24 & 64) != 0 ? r2.i : null, (r24 & 128) != 0 ? r2.h : SubtitleSize.e.c(str), (r24 & JSONzip.end) != 0 ? r2.f : null, (r24 & 512) != 0 ? r2.j : null, (r24 & 1024) != 0 ? this.a.k : null);
        return new aEL(e2);
    }

    @Override // o.InterfaceC5284bvp
    public String getCharStyle() {
        String b;
        SubtitleFontStyle g = this.a.g();
        if (g == null || (b = g.b()) == null) {
            return null;
        }
        Locale locale = Locale.ENGLISH;
        C8632dsu.a(locale, "");
        String lowerCase = b.toLowerCase(locale);
        C8632dsu.a(lowerCase, "");
        return lowerCase;
    }

    @Override // o.InterfaceC5284bvp
    public String getWindowColor() {
        return c.b(this.a.i());
    }

    @Override // o.InterfaceC5284bvp
    public InterfaceC5284bvp setWindowColor(String str) {
        C2567aiX.i e2;
        e2 = r0.e((r24 & 1) != 0 ? r0.e : null, (r24 & 2) != 0 ? r0.c : null, (r24 & 4) != 0 ? r0.a : null, (r24 & 8) != 0 ? r0.b : null, (r24 & 16) != 0 ? r0.d : null, (r24 & 32) != 0 ? r0.g : null, (r24 & 64) != 0 ? r0.i : null, (r24 & 128) != 0 ? r0.h : null, (r24 & JSONzip.end) != 0 ? r0.f : null, (r24 & 512) != 0 ? r0.j : c.d(str), (r24 & 1024) != 0 ? this.a.k : null);
        return new aEL(e2);
    }

    @Override // o.InterfaceC5284bvp
    public String getWindowOpacity() {
        SubtitleOpacity f = this.a.f();
        if (f != null) {
            return f.c();
        }
        return null;
    }

    @Override // o.InterfaceC5284bvp
    public InterfaceC5284bvp setWindowOpacity(String str) {
        C2567aiX.i e2;
        C8632dsu.c((Object) str, "");
        e2 = r2.e((r24 & 1) != 0 ? r2.e : null, (r24 & 2) != 0 ? r2.c : null, (r24 & 4) != 0 ? r2.a : null, (r24 & 8) != 0 ? r2.b : null, (r24 & 16) != 0 ? r2.d : null, (r24 & 32) != 0 ? r2.g : null, (r24 & 64) != 0 ? r2.i : null, (r24 & 128) != 0 ? r2.h : null, (r24 & JSONzip.end) != 0 ? r2.f : null, (r24 & 512) != 0 ? r2.j : null, (r24 & 1024) != 0 ? this.a.k : SubtitleOpacity.a.a(str));
        return new aEL(e2);
    }

    @Override // o.InterfaceC5284bvp
    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("charOpacity", getCharOpacity());
        jSONObject.put("backgroundOpacity", getBackgroundOpacity());
        jSONObject.put("windowOpacity", getWindowOpacity());
        jSONObject.put("charColor", getCharColor());
        jSONObject.put("backgroundColor", getBackgroundColor());
        jSONObject.put("windowColor", getWindowColor());
        jSONObject.put("charEdgeColor", getCharEdgeColor());
        jSONObject.put("charEdgeAttrs", getCharEdgeAttrs());
        jSONObject.put("charSize", getCharSize());
        jSONObject.put("charStyle", getCharStyle());
        return jSONObject;
    }

    public String toString() {
        String jSONObject = toJsonObject().toString();
        C8632dsu.a(jSONObject, "");
        return jSONObject;
    }
}
