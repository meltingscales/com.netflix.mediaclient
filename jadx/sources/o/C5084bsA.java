package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.ServiceManager;

/* renamed from: o.bsA  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5084bsA implements ServiceManager.b {
    private final Status a;
    private final ServiceManager.InitializationState b;
    private final String e;

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager.b
    public ServiceManager.InitializationState e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5084bsA) {
            C5084bsA c5084bsA = (C5084bsA) obj;
            return this.b == c5084bsA.b && C8632dsu.c(this.a, c5084bsA.a) && C8632dsu.c((Object) this.e, (Object) c5084bsA.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.a.hashCode();
        String str = this.e;
        return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        ServiceManager.InitializationState initializationState = this.b;
        Status status = this.a;
        String str = this.e;
        return "InitializationResultImpl(state_=" + initializationState + ", status_=" + status + ", statusMessage_=" + str + ")";
    }

    public C5084bsA(ServiceManager.InitializationState initializationState, Status status, String str) {
        C8632dsu.c((Object) initializationState, "");
        C8632dsu.c((Object) status, "");
        this.b = initializationState;
        this.a = status;
        this.e = str;
    }
}
