package o;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.In  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0942In implements InterfaceC0906Hd {
    private long c;
    private int i = 0;
    private int h = 0;
    private int b = 0;
    private int d = 0;
    private int a = 0;
    private int e = 0;
    private long j = 0;

    @Override // o.InterfaceC0906Hd
    public void a() {
        this.e++;
    }

    public boolean b() {
        return this.b > 0 || this.e > 0;
    }

    public void c(boolean z) {
        if (z) {
            this.d++;
        } else {
            this.a++;
        }
    }

    public void e() {
        this.i++;
    }

    public void i() {
        this.h++;
    }

    private long h() {
        return this.j / 1000;
    }

    public void c() {
        this.c = System.nanoTime();
    }

    public void d() {
        this.j += System.nanoTime() - this.c;
    }

    public JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("memCacheFound", this.i);
            jSONObject.put("memCacheMissed", this.h);
            jSONObject.put("memCacheExpired", this.b);
            jSONObject.put("diskCacheFound", this.d);
            jSONObject.put("diskCacheMissed", this.a);
            jSONObject.put("diskCacheExpired", this.e);
            if (this.j > 0) {
                jSONObject.put("diskCacheTimeSpent_µs", h());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
