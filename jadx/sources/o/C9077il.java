package o;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: o.il  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9077il implements InterfaceC9069id {
    private final Map<String, InterfaceC9001hO> c;
    private final InterfaceC9069id d;

    public final Map<String, InterfaceC9001hO> f() {
        return this.c;
    }

    public C9077il(InterfaceC9069id interfaceC9069id) {
        C8632dsu.c((Object) interfaceC9069id, "");
        this.d = interfaceC9069id;
        this.c = new LinkedHashMap();
    }

    @Override // o.InterfaceC9069id
    /* renamed from: b */
    public C9077il c() {
        this.d.c();
        return this;
    }

    @Override // o.InterfaceC9069id
    /* renamed from: h */
    public C9077il a() {
        this.d.a();
        return this;
    }

    @Override // o.InterfaceC9069id
    /* renamed from: g */
    public C9077il e() {
        this.d.e();
        return this;
    }

    @Override // o.InterfaceC9069id
    /* renamed from: l */
    public C9077il d() {
        this.d.d();
        return this;
    }

    @Override // o.InterfaceC9069id
    /* renamed from: a */
    public C9077il e(String str) {
        C8632dsu.c((Object) str, "");
        this.d.e(str);
        return this;
    }

    @Override // o.InterfaceC9069id
    /* renamed from: c */
    public C9077il d(String str) {
        C8632dsu.c((Object) str, "");
        this.d.d(str);
        return this;
    }

    @Override // o.InterfaceC9069id
    /* renamed from: b */
    public C9077il d(boolean z) {
        this.d.d(z);
        return this;
    }

    @Override // o.InterfaceC9069id
    /* renamed from: d */
    public C9077il a(double d) {
        this.d.a(d);
        return this;
    }

    @Override // o.InterfaceC9069id
    /* renamed from: a */
    public C9077il e(int i) {
        this.d.e(i);
        return this;
    }

    @Override // o.InterfaceC9069id
    /* renamed from: c */
    public C9077il d(long j) {
        this.d.d(j);
        return this;
    }

    @Override // o.InterfaceC9069id
    /* renamed from: d */
    public C9077il a(C9071if c9071if) {
        C8632dsu.c((Object) c9071if, "");
        this.d.a(c9071if);
        return this;
    }

    @Override // o.InterfaceC9069id
    /* renamed from: c */
    public C9077il b(InterfaceC9001hO interfaceC9001hO) {
        C8632dsu.c((Object) interfaceC9001hO, "");
        this.c.put(this.d.i(), interfaceC9001hO);
        this.d.j();
        return this;
    }

    @Override // o.InterfaceC9069id
    /* renamed from: m */
    public C9077il j() {
        this.d.j();
        return this;
    }

    @Override // o.InterfaceC9069id
    public String i() {
        return this.d.i();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.d.close();
    }
}
