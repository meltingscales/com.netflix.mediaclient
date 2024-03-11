package o;

import com.bugsnag.android.Breadcrumb;
import com.bugsnag.android.Severity;
import com.bugsnag.android.Thread;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import o.C9246lv;

/* renamed from: o.le  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9229le implements C9246lv.a {
    private final C9227lc c;
    private final InterfaceC9200lB e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9227lc e() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9229le(Throwable th, C9258mG c9258mG, C9280mc c9280mc, InterfaceC9200lB interfaceC9200lB) {
        this(th, c9258mG, c9280mc, new C9206lH(), new C9236ll(), interfaceC9200lB);
    }

    public C9229le(Throwable th, C9258mG c9258mG, C9280mc c9280mc, C9206lH c9206lH, C9236ll c9236ll, InterfaceC9200lB interfaceC9200lB) {
        this(new C9227lc(th, c9258mG, c9280mc, c9206lH, c9236ll), interfaceC9200lB);
    }

    public C9229le(C9227lc c9227lc, InterfaceC9200lB interfaceC9200lB) {
        this.c = c9227lc;
        this.e = interfaceC9200lB;
    }

    private void e(String str) {
        InterfaceC9200lB interfaceC9200lB = this.e;
        interfaceC9200lB.c("Invalid null value supplied to config." + str + ", ignoring");
    }

    public List<C9170kY> c() {
        return this.c.j();
    }

    public List<Thread> f() {
        return this.c.o();
    }

    public C9186ko b() {
        return this.c.b();
    }

    public String a() {
        return this.c.d();
    }

    public Severity i() {
        return this.c.h();
    }

    public void a(String str) {
        this.c.a(str);
    }

    public void e(String str, String str2, String str3) {
        this.c.b(str, str2, str3);
    }

    public void a(String str, Map<String, ?> map) {
        if (str != null && map != null) {
            this.c.e(str, map);
        } else {
            e("addMetadata");
        }
    }

    public void a(String str, String str2, Object obj) {
        if (str != null && str2 != null) {
            this.c.e(str, str2, obj);
        } else {
            e("addMetadata");
        }
    }

    @Override // o.C9246lv.a
    public void toStream(C9246lv c9246lv) {
        this.c.toStream(c9246lv);
    }

    public boolean g() {
        return this.c.m();
    }

    public void d(Severity severity) {
        this.c.a(severity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(C9186ko c9186ko) {
        this.c.b(c9186ko);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(C9171kZ c9171kZ) {
        this.c.b(c9171kZ);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(List<Breadcrumb> list) {
        this.c.a(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9220lV d() {
        return this.c.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(C9220lV c9220lV) {
        this.c.c = c9220lV;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Collection<Pattern> collection) {
        this.c.d(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(InterfaceC9257mF interfaceC9257mF) {
        this.c.b(interfaceC9257mF);
    }
}
