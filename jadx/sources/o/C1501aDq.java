package o;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: o.aDq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1501aDq implements InterfaceC9069id {
    private final InterfaceC9069id a;
    private final Map<String, InterfaceC9001hO> b;

    public final Map<String, InterfaceC9001hO> f() {
        return this.b;
    }

    public C1501aDq(InterfaceC9069id interfaceC9069id) {
        C8632dsu.c((Object) interfaceC9069id, "");
        this.a = interfaceC9069id;
        this.b = new LinkedHashMap();
    }

    @Override // o.InterfaceC9069id
    /* renamed from: b */
    public C1501aDq c() {
        this.a.c();
        return this;
    }

    @Override // o.InterfaceC9069id
    /* renamed from: h */
    public C1501aDq a() {
        this.a.a();
        return this;
    }

    @Override // o.InterfaceC9069id
    /* renamed from: g */
    public C1501aDq e() {
        this.a.e();
        return this;
    }

    @Override // o.InterfaceC9069id
    /* renamed from: o */
    public C1501aDq d() {
        this.a.d();
        return this;
    }

    @Override // o.InterfaceC9069id
    /* renamed from: a */
    public C1501aDq e(String str) {
        C8632dsu.c((Object) str, "");
        this.a.e(str);
        return this;
    }

    @Override // o.InterfaceC9069id
    /* renamed from: b */
    public C1501aDq d(String str) {
        C8632dsu.c((Object) str, "");
        this.a.d(str);
        return this;
    }

    @Override // o.InterfaceC9069id
    /* renamed from: c */
    public C1501aDq d(boolean z) {
        this.a.d(z);
        return this;
    }

    @Override // o.InterfaceC9069id
    /* renamed from: e */
    public C1501aDq a(double d) {
        this.a.a(d);
        return this;
    }

    @Override // o.InterfaceC9069id
    /* renamed from: d */
    public C1501aDq e(int i) {
        this.a.e(i);
        return this;
    }

    @Override // o.InterfaceC9069id
    /* renamed from: e */
    public C1501aDq d(long j) {
        this.a.d(j);
        return this;
    }

    @Override // o.InterfaceC9069id
    /* renamed from: e */
    public C1501aDq a(C9071if c9071if) {
        C8632dsu.c((Object) c9071if, "");
        this.a.a(c9071if);
        return this;
    }

    @Override // o.InterfaceC9069id
    /* renamed from: c */
    public C1501aDq b(InterfaceC9001hO interfaceC9001hO) {
        C8632dsu.c((Object) interfaceC9001hO, "");
        this.b.put(this.a.i(), interfaceC9001hO);
        this.a.j();
        return this;
    }

    @Override // o.InterfaceC9069id
    /* renamed from: l */
    public C1501aDq j() {
        this.a.j();
        return this;
    }

    @Override // o.InterfaceC9069id
    public String i() {
        return this.a.i();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }
}
