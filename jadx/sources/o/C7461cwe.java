package o;

import com.netflix.mediaclient.ui.offline.OfflineAdapterData;
import o.InterfaceC5222bug;

/* renamed from: o.cwe  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7461cwe implements InterfaceC5222bug<InterfaceC5223buh> {
    private final OfflineAdapterData a;
    private final int b;
    private final InterfaceC5149btM c;
    private final InterfaceC5223buh e;

    public final OfflineAdapterData c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7461cwe) {
            C7461cwe c7461cwe = (C7461cwe) obj;
            return C8632dsu.c(this.e, c7461cwe.e) && C8632dsu.c(this.c, c7461cwe.c) && this.b == c7461cwe.b && C8632dsu.c(this.a, c7461cwe.a);
        }
        return false;
    }

    @Override // o.InterfaceC5222bug
    public InterfaceC5149btM getEvidence() {
        return this.c;
    }

    @Override // o.InterfaceC5222bug
    public int getPosition() {
        return this.b;
    }

    @Override // o.InterfaceC5222bug
    public InterfaceC5223buh getVideo() {
        return this.e;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        InterfaceC5149btM interfaceC5149btM = this.c;
        return (((((hashCode * 31) + (interfaceC5149btM == null ? 0 : interfaceC5149btM.hashCode())) * 31) + Integer.hashCode(this.b)) * 31) + this.a.hashCode();
    }

    public String toString() {
        InterfaceC5223buh interfaceC5223buh = this.e;
        InterfaceC5149btM interfaceC5149btM = this.c;
        int i = this.b;
        OfflineAdapterData offlineAdapterData = this.a;
        return "MyDownloadsVideo(video=" + interfaceC5223buh + ", evidence=" + interfaceC5149btM + ", position=" + i + ", adapterData=" + offlineAdapterData + ")";
    }

    public C7461cwe(InterfaceC5223buh interfaceC5223buh, InterfaceC5149btM interfaceC5149btM, int i, OfflineAdapterData offlineAdapterData) {
        C8632dsu.c((Object) interfaceC5223buh, "");
        C8632dsu.c((Object) offlineAdapterData, "");
        this.e = interfaceC5223buh;
        this.c = interfaceC5149btM;
        this.b = i;
        this.a = offlineAdapterData;
    }

    @Override // o.InterfaceC5222bug
    /* renamed from: getCursor */
    public String mo3080getCursor() {
        return InterfaceC5222bug.a.b(this);
    }

    @Override // o.InterfaceC5222bug
    /* renamed from: getEntity */
    public InterfaceC5223buh mo3081getEntity() {
        return InterfaceC5222bug.a.d(this);
    }
}
