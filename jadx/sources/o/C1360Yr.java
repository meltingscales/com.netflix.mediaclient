package o;

import com.netflix.mediaclient.graphql.models.type.EditProfileErrorCode;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2157aau;
import o.C9018hf;
import o.InterfaceC8990hD;

/* renamed from: o.Yr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1360Yr implements InterfaceC8990hD<a> {
    public static final b d = new b(null);
    private final C2880aoS c;
    private final boolean e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "6c6baeca-dc52-43e9-b71b-4a8f8c297447";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1360Yr) && C8632dsu.c(this.c, ((C1360Yr) obj).c);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "EditProfileMutation";
    }

    public final C2880aoS h() {
        return this.c;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        C2880aoS c2880aoS = this.c;
        return "EditProfileMutation(input=" + c2880aoS + ")";
    }

    public C1360Yr(C2880aoS c2880aoS) {
        C8632dsu.c((Object) c2880aoS, "");
        this.c = c2880aoS;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2158aav.e.c(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<a> e() {
        return C8953gT.c(C2157aau.d.a, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2771amP.a.e()).d();
    }

    /* renamed from: o.Yr$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8990hD.b {
        private final c e;

        public final c a() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.e, ((a) obj).e);
        }

        public int hashCode() {
            c cVar = this.e;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public String toString() {
            c cVar = this.e;
            return "Data(editProfile=" + cVar + ")";
        }

        public a(c cVar) {
            this.e = cVar;
        }
    }

    /* renamed from: o.Yr$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final List<d> a;
        private final e b;
        private final String e;

        public final List<d> a() {
            return this.a;
        }

        public final e b() {
            return this.b;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.e, (Object) cVar.e) && C8632dsu.c(this.b, cVar.b) && C8632dsu.c(this.a, cVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            e eVar = this.b;
            int hashCode2 = eVar == null ? 0 : eVar.hashCode();
            List<d> list = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            e eVar = this.b;
            List<d> list = this.a;
            return "EditProfile(__typename=" + str + ", account=" + eVar + ", errors=" + list + ")";
        }

        public c(String str, e eVar, List<d> list) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.b = eVar;
            this.a = list;
        }
    }

    /* renamed from: o.Yr$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final List<j> b;
        private final String c;

        public final String d() {
            return this.c;
        }

        public final List<j> e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c(this.b, eVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.c;
            List<j> list = this.b;
            return "Account(__typename=" + str + ", profiles=" + list + ")";
        }

        public e(String str, List<j> list) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) list, "");
            this.c = str;
            this.b = list;
        }
    }

    /* renamed from: o.Yr$j */
    /* loaded from: classes3.dex */
    public static final class j {
        private final C2567aiX d;
        private final String e;

        public final C2567aiX b() {
            return this.d;
        }

        public final String c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return C8632dsu.c((Object) this.e, (Object) jVar.e) && C8632dsu.c(this.d, jVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.e;
            C2567aiX c2567aiX = this.d;
            return "Profile(__typename=" + str + ", userProfile=" + c2567aiX + ")";
        }

        public j(String str, C2567aiX c2567aiX) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2567aiX, "");
            this.e = str;
            this.d = c2567aiX;
        }
    }

    /* renamed from: o.Yr$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String b;
        private final i e;

        public final String a() {
            return this.b;
        }

        public final i c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && C8632dsu.c(this.e, dVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            i iVar = this.e;
            return (hashCode * 31) + (iVar == null ? 0 : iVar.hashCode());
        }

        public String toString() {
            String str = this.b;
            i iVar = this.e;
            return "Error(__typename=" + str + ", onEditProfileError=" + iVar + ")";
        }

        public d(String str, i iVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.e = iVar;
        }
    }

    /* renamed from: o.Yr$i */
    /* loaded from: classes3.dex */
    public static final class i {
        private final EditProfileErrorCode a;

        public final EditProfileErrorCode a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.a == ((i) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            EditProfileErrorCode editProfileErrorCode = this.a;
            return "OnEditProfileError(code=" + editProfileErrorCode + ")";
        }

        public i(EditProfileErrorCode editProfileErrorCode) {
            C8632dsu.c((Object) editProfileErrorCode, "");
            this.a = editProfileErrorCode;
        }
    }

    /* renamed from: o.Yr$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }
}
