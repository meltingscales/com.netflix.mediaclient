package o;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aLH extends aLM {
    private aLT b;
    private JSONObject c;

    public aLH(InterfaceC1843aQh interfaceC1843aQh) {
        super(interfaceC1843aQh);
    }

    @Override // o.aLM
    protected void e() {
        this.b = aLQ.c(this.e);
        String a = a();
        if (C8168dfL.h(a)) {
            this.c = new JSONObject(a);
            return;
        }
        C1044Mm.e("nf_secure_store_android", "Secure store did NOT existed!");
        this.c = new JSONObject();
    }

    public void d() {
        synchronized (this) {
            this.b = aLQ.c(this.e);
            if (!b()) {
                c();
            }
        }
    }

    @Override // o.aLR
    public void b(String str, String str2) {
        String b;
        synchronized (this) {
            if (str == null || str2 == null) {
                return;
            }
            try {
                b = C8071ddU.b(str2.getBytes());
            } catch (Throwable th) {
                C1044Mm.e("nf_secure_store_android", th, "Fail to set property!", new Object[0]);
            }
            if (C8168dfL.d(b, (String) this.c.opt(str))) {
                C1044Mm.a("nf_secure_store_android", "Key %s value is not changed, do not save!", str);
                return;
            }
            this.c.put(str, b);
            c();
        }
    }

    @Override // o.aLR
    public String c(String str) {
        synchronized (this) {
            if (str == null) {
                return null;
            }
            String str2 = (String) this.c.opt(str);
            if (str2 == null) {
                return null;
            }
            return new String(C8071ddU.d(str2), "UTF-8");
        }
    }

    public boolean b() {
        return this.c.length() < 1;
    }

    @Override // o.aLM
    protected String a() {
        synchronized (this) {
            String e = C8157dfA.e(AbstractApplicationC1040Mh.d(), "pref_secure_store", (String) null);
            if (C8168dfL.g(e)) {
                return null;
            }
            return new String(this.b.a(C8071ddU.d(e)), "UTF8");
        }
    }

    @Override // o.aLM
    protected void c() {
        synchronized (this) {
            C8157dfA.a(AbstractApplicationC1040Mh.d(), "pref_secure_store", C8071ddU.b(this.b.c(this.c.toString().getBytes())));
        }
    }
}
