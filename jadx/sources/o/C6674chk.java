package o;

import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.StringField;
import com.netflix.mediaclient.acquisition.components.paymentInfo.PaymentInfoViewModel;

/* renamed from: o.chk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6674chk {
    private final StringField a;
    private final String b;
    private StringField c;
    private final String d;
    private final PaymentInfoViewModel e;
    private final StringField f;
    private final ActionField h;
    private final boolean i;
    private final C6670chg j;

    public final PaymentInfoViewModel a() {
        return this.e;
    }

    public final StringField b() {
        return this.f;
    }

    public final C6670chg c() {
        return this.j;
    }

    public final StringField d() {
        return this.a;
    }

    public final StringField e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6674chk) {
            C6674chk c6674chk = (C6674chk) obj;
            return C8632dsu.c((Object) this.b, (Object) c6674chk.b) && C8632dsu.c((Object) this.d, (Object) c6674chk.d) && C8632dsu.c(this.f, c6674chk.f) && C8632dsu.c(this.j, c6674chk.j) && C8632dsu.c(this.e, c6674chk.e) && C8632dsu.c(this.h, c6674chk.h) && C8632dsu.c(this.c, c6674chk.c) && C8632dsu.c(this.a, c6674chk.a) && this.i == c6674chk.i;
        }
        return false;
    }

    public final ActionField h() {
        return this.h;
    }

    public int hashCode() {
        String str = this.b;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.d;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        StringField stringField = this.f;
        int hashCode3 = stringField == null ? 0 : stringField.hashCode();
        C6670chg c6670chg = this.j;
        int hashCode4 = c6670chg == null ? 0 : c6670chg.hashCode();
        int hashCode5 = this.e.hashCode();
        ActionField actionField = this.h;
        int hashCode6 = actionField == null ? 0 : actionField.hashCode();
        StringField stringField2 = this.c;
        int hashCode7 = stringField2 == null ? 0 : stringField2.hashCode();
        StringField stringField3 = this.a;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (stringField3 != null ? stringField3.hashCode() : 0)) * 31) + Boolean.hashCode(this.i);
    }

    public final boolean i() {
        return this.i;
    }

    public String toString() {
        String str = this.b;
        String str2 = this.d;
        StringField stringField = this.f;
        C6670chg c6670chg = this.j;
        PaymentInfoViewModel paymentInfoViewModel = this.e;
        ActionField actionField = this.h;
        StringField stringField2 = this.c;
        StringField stringField3 = this.a;
        boolean z = this.i;
        return "PlanSelectionAndConfirmParsedData(firstName=" + str + ", lastName=" + str2 + ", securityCode=" + stringField + ", selectedPlan=" + c6670chg + ", paymentInfoViewModel=" + paymentInfoViewModel + ", startMembershipAction=" + actionField + ", emvco3dsAuthenticationWindowSize=" + stringField2 + ", emvco3dsDeviceDataResponseFallback=" + stringField3 + ", showCvvTrustMessage=" + z + ")";
    }

    public C6674chk(String str, String str2, StringField stringField, C6670chg c6670chg, PaymentInfoViewModel paymentInfoViewModel, ActionField actionField, StringField stringField2, StringField stringField3, boolean z) {
        C8632dsu.c((Object) paymentInfoViewModel, "");
        this.b = str;
        this.d = str2;
        this.f = stringField;
        this.j = c6670chg;
        this.e = paymentInfoViewModel;
        this.h = actionField;
        this.c = stringField2;
        this.a = stringField3;
        this.i = z;
    }
}
