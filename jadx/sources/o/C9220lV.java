package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o.C9246lv;

/* renamed from: o.lV  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9220lV implements C9246lv.a {
    final AtomicBoolean a;
    private final AtomicBoolean b;
    private String c;
    private C9162kQ d;
    private C9181kj e;
    private final C9209lK f;
    private final AtomicInteger g;
    private String h;
    private final File i;
    private final InterfaceC9200lB j;
    private Date k;
    private C9294mq l;
    private final AtomicBoolean m;
    private final AtomicInteger n;

    public Date a() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(C9181kj c9181kj) {
        this.e = c9181kj;
    }

    public String c() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(C9162kQ c9162kQ) {
        this.d = c9162kQ;
    }

    public String e() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AtomicBoolean g() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C9220lV a(C9220lV c9220lV) {
        C9220lV c9220lV2 = new C9220lV(c9220lV.h, c9220lV.k, c9220lV.l, c9220lV.n.get(), c9220lV.g.get(), c9220lV.f, c9220lV.j, c9220lV.c());
        c9220lV2.m.set(c9220lV.m.get());
        c9220lV2.b.set(c9220lV.i());
        return c9220lV2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9220lV(Map<String, Object> map, InterfaceC9200lB interfaceC9200lB, String str) {
        this(null, null, interfaceC9200lB, str);
        b((String) map.get(SignupConstants.Field.LANG_ID));
        b(C9302my.c((String) map.get("startedAt")));
        Map map2 = (Map) map.get("events");
        this.g.set(((Number) map2.get("handled")).intValue());
        this.n.set(((Number) map2.get("unhandled")).intValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9220lV(String str, Date date, C9294mq c9294mq, boolean z, C9209lK c9209lK, InterfaceC9200lB interfaceC9200lB, String str2) {
        this(null, c9209lK, interfaceC9200lB, str2);
        this.h = str;
        this.k = new Date(date.getTime());
        this.l = c9294mq;
        this.b.set(z);
        this.c = str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9220lV(String str, Date date, C9294mq c9294mq, int i, int i2, C9209lK c9209lK, InterfaceC9200lB interfaceC9200lB, String str2) {
        this(str, date, c9294mq, false, c9209lK, interfaceC9200lB, str2);
        this.n.set(i);
        this.g.set(i2);
        this.m.set(true);
        this.c = str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9220lV(File file, C9209lK c9209lK, InterfaceC9200lB interfaceC9200lB, String str) {
        this.b = new AtomicBoolean(false);
        this.n = new AtomicInteger();
        this.g = new AtomicInteger();
        this.m = new AtomicBoolean(false);
        this.a = new AtomicBoolean(false);
        this.i = file;
        this.j = interfaceC9200lB;
        this.c = C9222lX.e(file, str);
        if (c9209lK == null) {
            this.f = null;
            return;
        }
        C9209lK c9209lK2 = new C9209lK(c9209lK.a(), c9209lK.b(), c9209lK.e());
        c9209lK2.a(new ArrayList(c9209lK.d()));
        this.f = c9209lK2;
    }

    private void c(String str) {
        InterfaceC9200lB interfaceC9200lB = this.j;
        interfaceC9200lB.c("Invalid null value supplied to session." + str + ", ignoring");
    }

    public void b(String str) {
        if (str != null) {
            this.h = str;
        } else {
            c(SignupConstants.Field.LANG_ID);
        }
    }

    public void b(Date date) {
        if (date != null) {
            this.k = date;
        } else {
            c("startedAt");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.n.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.g.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9220lV f() {
        this.g.incrementAndGet();
        return a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9220lV h() {
        this.n.incrementAndGet();
        return a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        return this.b.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j() {
        File file = this.i;
        return file == null || !(file.getName().endsWith("_v2.json") || this.i.getName().endsWith("_v3.json"));
    }

    @Override // o.C9246lv.a
    public void toStream(C9246lv c9246lv) {
        if (this.i != null) {
            if (!j()) {
                a(c9246lv);
                return;
            } else {
                d(c9246lv);
                return;
            }
        }
        c9246lv.e();
        c9246lv.c("notifier").c(this.f);
        c9246lv.c("app").c(this.e);
        c9246lv.c("device").c(this.d);
        c9246lv.c("sessions").c();
        e(c9246lv);
        c9246lv.b();
        c9246lv.d();
    }

    private void a(C9246lv c9246lv) {
        c9246lv.c(this.i);
    }

    private void d(C9246lv c9246lv) {
        c9246lv.e();
        c9246lv.c("notifier").c(this.f);
        c9246lv.c("app").c(this.e);
        c9246lv.c("device").c(this.d);
        c9246lv.c("sessions").c();
        c9246lv.c(this.i);
        c9246lv.b();
        c9246lv.d();
    }

    void e(C9246lv c9246lv) {
        c9246lv.e();
        c9246lv.c(SignupConstants.Field.LANG_ID).e(this.h);
        c9246lv.c("startedAt").c(this.k);
        c9246lv.c("user").c(this.l);
        c9246lv.d();
    }
}
