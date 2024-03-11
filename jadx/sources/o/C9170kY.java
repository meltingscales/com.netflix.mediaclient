package o;

import com.bugsnag.android.ErrorType;
import java.util.Collection;
import java.util.List;
import o.C9246lv;

/* renamed from: o.kY  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9170kY implements C9246lv.a {
    private final InterfaceC9200lB a;
    private final C9225la e;

    public C9170kY(C9225la c9225la, InterfaceC9200lB interfaceC9200lB) {
        this.e = c9225la;
        this.a = interfaceC9200lB;
    }

    private void a(String str) {
        InterfaceC9200lB interfaceC9200lB = this.a;
        interfaceC9200lB.c("Invalid null value supplied to error." + str + ", ignoring");
    }

    public void e(String str) {
        if (str != null) {
            this.e.b(str);
        } else {
            a("errorClass");
        }
    }

    public String e() {
        return this.e.b();
    }

    public void d(String str) {
        this.e.a(str);
    }

    public String d() {
        return this.e.c();
    }

    public void a(ErrorType errorType) {
        if (errorType != null) {
            this.e.d(errorType);
        } else {
            a("type");
        }
    }

    public ErrorType b() {
        return this.e.a();
    }

    public List<C9279mb> a() {
        return this.e.d();
    }

    @Override // o.C9246lv.a
    public void toStream(C9246lv c9246lv) {
        this.e.toStream(c9246lv);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<C9170kY> b(Throwable th, Collection<String> collection, InterfaceC9200lB interfaceC9200lB) {
        return C9225la.e.d(th, collection, interfaceC9200lB);
    }
}
