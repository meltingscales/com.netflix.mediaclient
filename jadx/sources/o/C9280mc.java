package o;

import com.bugsnag.android.Severity;
import o.C9246lv;

/* renamed from: o.mc  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9280mc implements C9246lv.a {
    final boolean a;
    private final String b;
    private final Severity c;
    private final String d;
    private Severity e;
    private final String f;
    private boolean j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Severity d() {
        return this.e;
    }

    String e() {
        return this.c == this.e ? this.f : "userCallbackSetSeverity";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j() {
        return this.j != this.a;
    }

    public static C9280mc a(String str) {
        return d(str, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C9280mc d(String str, Severity severity, String str2) {
        char c;
        if (str.equals("strictMode") && C9249ly.e(str2)) {
            throw new IllegalArgumentException("No reason supplied for strictmode");
        }
        if (str.equals("strictMode") || str.equals("log") || C9249ly.e(str2)) {
            switch (str.hashCode()) {
                case -1876197364:
                    if (str.equals("strictMode")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1773746641:
                    if (str.equals("userCallbackSetSeverity")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1591166708:
                    if (str.equals("unhandledException")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1107031998:
                    if (str.equals("userSpecifiedSeverity")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -902467928:
                    if (str.equals("signal")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -845696980:
                    if (str.equals("handledError")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -573976797:
                    if (str.equals("anrError")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 107332:
                    if (str.equals("log")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 87505361:
                    if (str.equals("unhandledPromiseRejection")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 561970291:
                    if (str.equals("handledException")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return new C9280mc(str, Severity.WARNING, true, true, str2, "violationType");
                case 1:
                case 3:
                    return new C9280mc(str, severity, false, false, null, null);
                case 2:
                case 4:
                case 6:
                case '\b':
                    return new C9280mc(str, Severity.ERROR, true, true, null, null);
                case 5:
                case '\t':
                    return new C9280mc(str, Severity.WARNING, false, false, null, null);
                case 7:
                    return new C9280mc(str, severity, false, false, str2, "level");
                default:
                    throw new IllegalArgumentException("Invalid argument for severityReason: '" + str + '\'');
            }
        }
        throw new IllegalArgumentException("attributeValue should not be supplied");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9280mc(String str, Severity severity, boolean z, boolean z2, String str2, String str3) {
        this.f = str;
        this.j = z;
        this.a = z2;
        this.c = severity;
        this.e = severity;
        this.b = str2;
        this.d = str3;
    }

    @Override // o.C9246lv.a
    public void toStream(C9246lv c9246lv) {
        c9246lv.e().c("type").e(e()).c("unhandledOverridden").b(j());
        if (this.d != null && this.b != null) {
            c9246lv.c("attributes").e().c(this.d).e(this.b).d();
        }
        c9246lv.d();
    }
}
