package o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonWriter;
import java.io.StringWriter;

/* renamed from: o.Il  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0940Il implements InterfaceC0937Ii<String> {
    private final StringWriter a;
    private final Gson d;
    private final JsonWriter e;

    public C0940Il(Gson gson, boolean z, int i) {
        C8632dsu.c((Object) gson, "");
        this.d = gson;
        StringWriter stringWriter = new StringWriter(4096);
        this.a = stringWriter;
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        this.e = jsonWriter;
        jsonWriter.setSerializeNulls(z);
    }

    public /* synthetic */ C0940Il(Gson gson, boolean z, int i, int i2, C8627dsp c8627dsp) {
        this(gson, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? 4096 : i);
    }

    @Override // o.InterfaceC0937Ii
    /* renamed from: d */
    public C0940Il c() {
        this.e.beginObject();
        return this;
    }

    @Override // o.InterfaceC0937Ii
    /* renamed from: h */
    public C0940Il g() {
        this.e.endObject();
        return this;
    }

    @Override // o.InterfaceC0937Ii
    /* renamed from: b */
    public C0940Il a() {
        this.e.beginArray();
        return this;
    }

    @Override // o.InterfaceC0937Ii
    /* renamed from: e */
    public C0940Il j() {
        this.e.endArray();
        return this;
    }

    @Override // o.InterfaceC0937Ii
    /* renamed from: c */
    public C0940Il b(String str) {
        C8632dsu.c((Object) str, "");
        this.e.name(str);
        return this;
    }

    @Override // o.InterfaceC0937Ii
    /* renamed from: d */
    public C0940Il a(String str) {
        C8632dsu.c((Object) str, "");
        this.e.value(str);
        return this;
    }

    @Override // o.InterfaceC0937Ii
    /* renamed from: b */
    public C0940Il e(boolean z) {
        this.e.value(z);
        return this;
    }

    @Override // o.InterfaceC0937Ii
    /* renamed from: e */
    public C0940Il a(Number number) {
        C8632dsu.c((Object) number, "");
        this.e.value(number);
        return this;
    }

    @Override // o.InterfaceC0937Ii
    /* renamed from: d */
    public C0940Il e(long j) {
        this.e.value(j);
        return this;
    }

    @Override // o.InterfaceC0937Ii
    /* renamed from: c */
    public C0940Il d(JsonElement jsonElement) {
        C8632dsu.c((Object) jsonElement, "");
        this.d.toJson(jsonElement, this.e);
        return this;
    }

    @Override // o.InterfaceC0937Ii
    /* renamed from: o */
    public C0940Il k() {
        this.e.nullValue();
        return this;
    }

    @Override // o.InterfaceC0937Ii
    /* renamed from: i */
    public String f() {
        this.e.close();
        String stringWriter = this.a.toString();
        C8632dsu.a(stringWriter, "");
        return stringWriter;
    }
}
