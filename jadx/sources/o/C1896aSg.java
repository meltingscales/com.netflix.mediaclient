package o;

import android.content.Context;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.Status;
import java.util.Arrays;
import java.util.List;

/* renamed from: o.aSg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1896aSg extends aRV<String> {
    private final String a;
    private final InterfaceC1813aPe d;

    @Override // o.AbstractC5042brL
    public boolean O() {
        return false;
    }

    @Override // o.AbstractC5042brL
    public boolean X() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1896aSg(Context context, InterfaceC1813aPe interfaceC1813aPe) {
        super(context);
        this.d = interfaceC1813aPe;
        this.a = "[\"dummy\"]";
    }

    @Override // o.AbstractC5039brI
    public List<String> L() {
        return Arrays.asList(this.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC5039brI
    /* renamed from: c */
    public String e(String str, String str2) {
        return Integer.toString(StatusCode.OK.getValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC5042brL
    /* renamed from: h */
    public void a(String str) {
        InterfaceC1813aPe interfaceC1813aPe = this.d;
        if (interfaceC1813aPe != null) {
            interfaceC1813aPe.c(InterfaceC1078Nw.aJ);
        }
    }

    @Override // o.AbstractC5042brL
    public void d(Status status) {
        InterfaceC1813aPe interfaceC1813aPe = this.d;
        if (interfaceC1813aPe != null) {
            interfaceC1813aPe.c(status);
        }
    }
}
