package o;

import com.netflix.mediaclient.graphql.models.type.UpdateSubtitleAppearanceErrorCode;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2107aaC;
import o.C9018hf;
import o.InterfaceC8990hD;

/* renamed from: o.Yo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1357Yo implements InterfaceC8990hD<e> {
    public static final a d = new a(null);
    private final C3374axl b;
    private final boolean e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "d79c2547-40c4-4d33-a718-ef2644e5e41e";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1357Yo) && C8632dsu.c(this.b, ((C1357Yo) obj).b);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "EditProfileSubtitlesMutation";
    }

    public final C3374axl g() {
        return this.b;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        C3374axl c3374axl = this.b;
        return "EditProfileSubtitlesMutation(input=" + c3374axl + ")";
    }

    public C1357Yo(C3374axl c3374axl) {
        C8632dsu.c((Object) c3374axl, "");
        this.b = c3374axl;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2106aaB.d.e(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<e> e() {
        return C8953gT.c(C2107aaC.d.a, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2773amR.d.a()).d();
    }

    /* renamed from: o.Yo$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8990hD.b {
        private final f d;

        public final f c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.d, ((e) obj).d);
        }

        public int hashCode() {
            f fVar = this.d;
            if (fVar == null) {
                return 0;
            }
            return fVar.hashCode();
        }

        public String toString() {
            f fVar = this.d;
            return "Data(updateSubtitleAppearance=" + fVar + ")";
        }

        public e(f fVar) {
            this.d = fVar;
        }
    }

    /* renamed from: o.Yo$f */
    /* loaded from: classes3.dex */
    public static final class f {
        private final List<b> a;
        private final String b;
        private final d d;

        public final d a() {
            return this.d;
        }

        public final String d() {
            return this.b;
        }

        public final List<b> e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return C8632dsu.c((Object) this.b, (Object) fVar.b) && C8632dsu.c(this.d, fVar.d) && C8632dsu.c(this.a, fVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            d dVar = this.d;
            int hashCode2 = dVar == null ? 0 : dVar.hashCode();
            List<b> list = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            d dVar = this.d;
            List<b> list = this.a;
            return "UpdateSubtitleAppearance(__typename=" + str + ", account=" + dVar + ", errors=" + list + ")";
        }

        public f(String str, d dVar, List<b> list) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.d = dVar;
            this.a = list;
        }
    }

    /* renamed from: o.Yo$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String a;
        private final List<j> b;

        public final String a() {
            return this.a;
        }

        public final List<j> b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && C8632dsu.c(this.b, dVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            List<j> list = this.b;
            return "Account(__typename=" + str + ", profiles=" + list + ")";
        }

        public d(String str, List<j> list) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) list, "");
            this.a = str;
            this.b = list;
        }
    }

    /* renamed from: o.Yo$j */
    /* loaded from: classes3.dex */
    public static final class j {
        private final String d;
        private final C2567aiX e;

        public final String d() {
            return this.d;
        }

        public final C2567aiX e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return C8632dsu.c((Object) this.d, (Object) jVar.d) && C8632dsu.c(this.e, jVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.d;
            C2567aiX c2567aiX = this.e;
            return "Profile(__typename=" + str + ", userProfile=" + c2567aiX + ")";
        }

        public j(String str, C2567aiX c2567aiX) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2567aiX, "");
            this.d = str;
            this.e = c2567aiX;
        }
    }

    /* renamed from: o.Yo$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String a;
        private final c d;

        public final String b() {
            return this.a;
        }

        public final c e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c(this.d, bVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            c cVar = this.d;
            return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.a;
            c cVar = this.d;
            return "Error(__typename=" + str + ", onUpdateSubtitleAppearanceError=" + cVar + ")";
        }

        public b(String str, c cVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.d = cVar;
        }
    }

    /* renamed from: o.Yo$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final UpdateSubtitleAppearanceErrorCode e;

        public final UpdateSubtitleAppearanceErrorCode e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.e == ((c) obj).e;
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            UpdateSubtitleAppearanceErrorCode updateSubtitleAppearanceErrorCode = this.e;
            return "OnUpdateSubtitleAppearanceError(code=" + updateSubtitleAppearanceErrorCode + ")";
        }

        public c(UpdateSubtitleAppearanceErrorCode updateSubtitleAppearanceErrorCode) {
            C8632dsu.c((Object) updateSubtitleAppearanceErrorCode, "");
            this.e = updateSubtitleAppearanceErrorCode;
        }
    }

    /* renamed from: o.Yo$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }
}
