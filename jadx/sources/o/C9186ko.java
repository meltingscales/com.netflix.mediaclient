package o;

/* renamed from: o.ko  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9186ko extends C9181kj {
    private Number a;
    private Boolean b;
    private Boolean c;
    private Number d;

    public final Number f() {
        return this.d;
    }

    public final Number g() {
        return this.a;
    }

    public final Boolean h() {
        return this.b;
    }

    public final Boolean n() {
        return this.c;
    }

    public C9186ko(String str, String str2, String str3, String str4, String str5, String str6, String str7, Number number, Number number2, Number number3, Boolean bool, Boolean bool2) {
        super(str, str2, str3, str4, str5, str6, str7, number);
        this.a = number2;
        this.d = number3;
        this.b = bool;
        this.c = bool2;
    }

    public C9186ko(C9258mG c9258mG, String str, String str2, String str3, String str4, String str5, Number number, Number number2, Boolean bool, Boolean bool2) {
        this(str, str2, str3, str4, str5, c9258mG.h(), c9258mG.d(), c9258mG.A(), number, number2, bool, bool2);
    }

    @Override // o.C9181kj
    public void e(C9246lv c9246lv) {
        super.e(c9246lv);
        c9246lv.c("duration").a(this.a);
        c9246lv.c("durationInForeground").a(this.d);
        c9246lv.c("inForeground").b(this.b);
        c9246lv.c("isLaunching").b(this.c);
    }
}
