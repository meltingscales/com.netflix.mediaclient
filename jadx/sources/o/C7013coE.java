package o;

import java.util.List;

/* renamed from: o.coE  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7013coE {
    private final String a;
    private final boolean b;
    private final String c;
    private final List<C7053cou> d;
    private final String e;
    private final int h;

    public final String a() {
        return this.e;
    }

    public final List<C7053cou> b() {
        return this.d;
    }

    public final boolean c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final boolean e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7013coE) {
            C7013coE c7013coE = (C7013coE) obj;
            return this.b == c7013coE.b && C8632dsu.c(this.d, c7013coE.d) && this.h == c7013coE.h && C8632dsu.c((Object) this.a, (Object) c7013coE.a) && C8632dsu.c((Object) this.e, (Object) c7013coE.e) && C8632dsu.c((Object) this.c, (Object) c7013coE.c);
        }
        return false;
    }

    public final int f() {
        return this.h;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.b);
        int hashCode2 = this.d.hashCode();
        int hashCode3 = Integer.hashCode(this.h);
        int hashCode4 = this.a.hashCode();
        int hashCode5 = this.e.hashCode();
        String str = this.c;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String i() {
        return this.a;
    }

    public String toString() {
        boolean z = this.b;
        List<C7053cou> list = this.d;
        int i = this.h;
        String str = this.a;
        String str2 = this.e;
        String str3 = this.c;
        return "MyListVideos(hasMoreItemsInList=" + z + ", entities=" + list + ", trackId=" + i + ", requestId=" + str + ", id=" + str2 + ", cursor=" + str3 + ")";
    }

    public C7013coE(boolean z, List<C7053cou> list, int i, String str, String str2, String str3) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.b = z;
        this.d = list;
        this.h = i;
        this.a = str;
        this.e = str2;
        this.c = str3;
    }

    /* renamed from: o.coE$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC5281bvm {
        public Void a() {
            return null;
        }

        public Void b() {
            return null;
        }

        public Void d() {
            return null;
        }

        @Override // o.InterfaceC5281bvm
        public int getListPos() {
            return 0;
        }

        b() {
        }

        @Override // o.InterfaceC5281bvm
        public /* synthetic */ String getImpressionToken() {
            return (String) a();
        }

        @Override // o.InterfaceC5281bvm
        public /* synthetic */ String getListContext() {
            return (String) d();
        }

        @Override // o.InterfaceC5281bvm
        public /* synthetic */ String getSectionUid() {
            return (String) b();
        }

        @Override // o.InterfaceC5281bvm
        public int getTrackId() {
            return C7013coE.this.f();
        }

        @Override // o.InterfaceC5281bvm
        public String getRequestId() {
            return C7013coE.this.i();
        }

        @Override // o.InterfaceC5281bvm
        public String getListId() {
            return C7013coE.this.a();
        }
    }

    public final InterfaceC5281bvm h() {
        return new b();
    }

    public final boolean j() {
        return this.d.isEmpty();
    }
}
