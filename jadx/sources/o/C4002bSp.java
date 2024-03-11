package o;

/* renamed from: o.bSp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4002bSp {
    private final InterfaceC5222bug<? extends InterfaceC5223buh> c;

    public final InterfaceC5222bug<? extends InterfaceC5223buh> a() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4002bSp) && C8632dsu.c(this.c, ((C4002bSp) obj).c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug = this.c;
        return "FetchRowEntitiesResponse(data=" + interfaceC5222bug + ")";
    }

    public C4002bSp(InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug) {
        C8632dsu.c((Object) interfaceC5222bug, "");
        this.c = interfaceC5222bug;
    }
}
