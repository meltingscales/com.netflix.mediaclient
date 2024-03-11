package o;

import android.os.Bundle;

/* renamed from: o.ss  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9607ss implements InterfaceC9606sr {
    private final boolean a;
    private final int b;
    private final boolean c;
    private final Bundle d;
    private final int[] e;
    private final C9614sz g;
    private final C9611sw h;
    private final String i;
    private final String j;

    @Override // o.InterfaceC9606sr
    public Bundle a() {
        return this.d;
    }

    @Override // o.InterfaceC9606sr
    public String b() {
        return this.j;
    }

    @Override // o.InterfaceC9606sr
    public String c() {
        return this.i;
    }

    private C9607ss(e eVar) {
        this.j = eVar.h;
        this.i = eVar.g;
        this.h = eVar.f;
        this.g = eVar.j;
        this.a = eVar.e;
        this.b = eVar.d;
        this.e = eVar.c;
        this.d = eVar.a;
        this.c = eVar.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.ss$e */
    /* loaded from: classes5.dex */
    public static final class e {
        private final Bundle a = new Bundle();
        private boolean b;
        private int[] c;
        private int d;
        private boolean e;
        private C9611sw f;
        private String g;
        private String h;
        private C9614sz j;

        public e a(int i) {
            this.d = i;
            return this;
        }

        public e a(String str) {
            this.g = str;
            return this;
        }

        public e b(String str) {
            this.h = str;
            return this;
        }

        public e c(C9611sw c9611sw) {
            this.f = c9611sw;
            return this;
        }

        public e c(int[] iArr) {
            this.c = iArr;
            return this;
        }

        public e d(C9614sz c9614sz) {
            this.j = c9614sz;
            return this;
        }

        public e d(boolean z) {
            this.e = z;
            return this;
        }

        public e e(boolean z) {
            this.b = z;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C9607ss c() {
            if (this.h == null || this.g == null || this.f == null) {
                throw new IllegalArgumentException("Required fields were not populated.");
            }
            return new C9607ss(this);
        }

        public e c(Bundle bundle) {
            if (bundle != null) {
                this.a.putAll(bundle);
            }
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C9607ss.class.equals(obj.getClass())) {
            return false;
        }
        C9607ss c9607ss = (C9607ss) obj;
        return this.j.equals(c9607ss.j) && this.i.equals(c9607ss.i) && this.h.equals(c9607ss.h);
    }

    public int hashCode() {
        int hashCode = this.j.hashCode();
        return (((hashCode * 31) + this.i.hashCode()) * 31) + this.h.hashCode();
    }
}
