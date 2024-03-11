package o;

import com.fasterxml.jackson.core.JsonFactory;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.netflix.android.org.json.zip.JSONzip;
import java.util.Iterator;

/* renamed from: o.Ia  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0929Ia implements InterfaceC0937Ii<String> {
    private final int a;
    private final boolean[] b;
    private boolean c;
    private final boolean d;
    private final Gson e;
    private int g;
    private final boolean[] h;
    private final StringBuilder i;
    private boolean j;

    private final void n() {
        this.c = true;
    }

    public C0929Ia(Gson gson, int i, int i2, boolean z, int i3) {
        C8632dsu.c((Object) gson, "");
        this.e = gson;
        this.a = i2;
        this.d = z;
        this.i = new StringBuilder(i);
        this.b = new boolean[i3];
        this.h = new boolean[i3];
    }

    public /* synthetic */ C0929Ia(Gson gson, int i, int i2, boolean z, int i3, int i4, C8627dsp c8627dsp) {
        this(gson, (i4 & 2) != 0 ? 4096 : i, (i4 & 4) != 0 ? 2 : i2, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? JSONzip.end : i3);
    }

    private final C0929Ia m() {
        if (this.c) {
            this.i.append(',');
            this.c = false;
        } else if (!this.d) {
            this.i.append(' ');
        }
        return this;
    }

    private final C0929Ia r() {
        C8654dtp g;
        if (!this.d) {
            this.i.append('\n');
            int i = this.a;
            if (i > 0) {
                g = C8657dts.g(0, i * this.g);
                Iterator<Integer> it = g.iterator();
                while (it.hasNext()) {
                    ((dqB) it).nextInt();
                    this.i.append(' ');
                }
            }
        }
        return this;
    }

    private final void d(boolean z) {
        boolean[] zArr = this.b;
        int i = this.g;
        zArr[i] = this.c;
        this.h[i] = z;
        this.g = i + 1;
        m();
        this.j = z;
    }

    private final void l() {
        int i = this.g - 1;
        this.g = i;
        this.c = this.b[i];
        this.j = this.h[i];
        n();
    }

    @Override // o.InterfaceC0937Ii
    /* renamed from: b */
    public C0929Ia c() {
        d(true);
        this.i.append('{');
        return this;
    }

    @Override // o.InterfaceC0937Ii
    /* renamed from: i */
    public C0929Ia g() {
        l();
        r();
        this.i.append('}');
        return this;
    }

    @Override // o.InterfaceC0937Ii
    /* renamed from: e */
    public C0929Ia a() {
        d(false);
        this.i.append('[');
        return this;
    }

    @Override // o.InterfaceC0937Ii
    /* renamed from: d */
    public C0929Ia j() {
        l();
        if (!this.d) {
            this.i.append(' ');
        }
        this.i.append(']');
        return this;
    }

    @Override // o.InterfaceC0937Ii
    /* renamed from: d */
    public C0929Ia b(String str) {
        C8632dsu.c((Object) str, "");
        m();
        r();
        StringBuilder sb = this.i;
        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        sb.append(str);
        sb.append("\":");
        return this;
    }

    @Override // o.InterfaceC0937Ii
    /* renamed from: e */
    public C0929Ia a(String str) {
        String b;
        C8632dsu.c((Object) str, "");
        m();
        n();
        b = C8691duz.b(str, "\"", "\\\"", false, 4, (Object) null);
        StringBuilder sb = this.i;
        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        sb.append(b);
        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        return this;
    }

    @Override // o.InterfaceC0937Ii
    /* renamed from: c */
    public C0929Ia e(boolean z) {
        m();
        n();
        this.i.append(z);
        return this;
    }

    @Override // o.InterfaceC0937Ii
    /* renamed from: b */
    public C0929Ia a(Number number) {
        C8632dsu.c((Object) number, "");
        m();
        n();
        this.i.append(number);
        return this;
    }

    @Override // o.InterfaceC0937Ii
    /* renamed from: d */
    public C0929Ia e(long j) {
        m();
        n();
        this.i.append(j);
        return this;
    }

    @Override // o.InterfaceC0937Ii
    /* renamed from: c */
    public C0929Ia d(JsonElement jsonElement) {
        C8632dsu.c((Object) jsonElement, "");
        String json = this.e.toJson(jsonElement);
        m();
        n();
        this.i.append(json);
        return this;
    }

    @Override // o.InterfaceC0937Ii
    /* renamed from: o */
    public C0929Ia k() {
        m();
        n();
        this.i.append("null");
        return this;
    }

    @Override // o.InterfaceC0937Ii
    /* renamed from: h */
    public String f() {
        String sb = this.i.toString();
        C8632dsu.a(sb, "");
        return sb;
    }
}
