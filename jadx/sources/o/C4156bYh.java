package o;

import java.util.List;

/* renamed from: o.bYh  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4156bYh implements InterfaceC8962gc {
    private final String a;
    private final InterfaceC5223buh b;
    private final AbstractC8918fl<InterfaceC5230buo> c;
    private final List<InterfaceC5223buh> e;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4156bYh copy$default(C4156bYh c4156bYh, String str, AbstractC8918fl abstractC8918fl, InterfaceC5223buh interfaceC5223buh, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4156bYh.a;
        }
        if ((i & 2) != 0) {
            abstractC8918fl = c4156bYh.c;
        }
        if ((i & 4) != 0) {
            interfaceC5223buh = c4156bYh.b;
        }
        if ((i & 8) != 0) {
            list = c4156bYh.e;
        }
        return c4156bYh.d(str, abstractC8918fl, interfaceC5223buh, list);
    }

    public final String b() {
        return this.a;
    }

    public final InterfaceC5223buh c() {
        return this.b;
    }

    public final String component1() {
        return this.a;
    }

    public final AbstractC8918fl<InterfaceC5230buo> component2() {
        return this.c;
    }

    public final InterfaceC5223buh component3() {
        return this.b;
    }

    public final List<InterfaceC5223buh> component4() {
        return this.e;
    }

    public final C4156bYh d(String str, AbstractC8918fl<? extends InterfaceC5230buo> abstractC8918fl, InterfaceC5223buh interfaceC5223buh, List<? extends InterfaceC5223buh> list) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) abstractC8918fl, "");
        return new C4156bYh(str, abstractC8918fl, interfaceC5223buh, list);
    }

    public final AbstractC8918fl<InterfaceC5230buo> d() {
        return this.c;
    }

    public final List<InterfaceC5223buh> e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4156bYh) {
            C4156bYh c4156bYh = (C4156bYh) obj;
            return C8632dsu.c((Object) this.a, (Object) c4156bYh.a) && C8632dsu.c(this.c, c4156bYh.c) && C8632dsu.c(this.b, c4156bYh.b) && C8632dsu.c(this.e, c4156bYh.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.c.hashCode();
        InterfaceC5223buh interfaceC5223buh = this.b;
        int hashCode3 = interfaceC5223buh == null ? 0 : interfaceC5223buh.hashCode();
        List<InterfaceC5223buh> list = this.e;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.a;
        AbstractC8918fl<InterfaceC5230buo> abstractC8918fl = this.c;
        InterfaceC5223buh interfaceC5223buh = this.b;
        List<InterfaceC5223buh> list = this.e;
        return "CharacterState(characterId=" + str + ", characterRequest=" + abstractC8918fl + ", watchNextVideo=" + interfaceC5223buh + ", relatedVideos=" + list + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4156bYh(String str, AbstractC8918fl<? extends InterfaceC5230buo> abstractC8918fl, InterfaceC5223buh interfaceC5223buh, List<? extends InterfaceC5223buh> list) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) abstractC8918fl, "");
        this.a = str;
        this.c = abstractC8918fl;
        this.b = interfaceC5223buh;
        this.e = list;
    }

    public /* synthetic */ C4156bYh(String str, AbstractC8918fl abstractC8918fl, InterfaceC5223buh interfaceC5223buh, List list, int i, C8627dsp c8627dsp) {
        this(str, (i & 2) != 0 ? C8974go.e : abstractC8918fl, (i & 4) != 0 ? null : interfaceC5223buh, (i & 8) != 0 ? null : list);
    }

    public final boolean i() {
        return this.c instanceof InterfaceC8881fA;
    }

    public final boolean a() {
        AbstractC8918fl<InterfaceC5230buo> abstractC8918fl = this.c;
        return (abstractC8918fl instanceof C8927fu) && abstractC8918fl.c() == null;
    }
}
