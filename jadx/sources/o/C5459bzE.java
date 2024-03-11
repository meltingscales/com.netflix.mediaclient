package o;

import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.BooleanField;
import com.netflix.android.moneyball.fields.ChoiceField;
import com.netflix.android.moneyball.fields.NumberField;
import java.util.List;

/* renamed from: o.bzE  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5459bzE {
    private final ChoiceField a;
    private final NumberField b;
    private final List<C5466bzL> c;
    private final NumberField d;
    private final NumberField e;
    private final BooleanField f;
    private final int g;
    private final ActionField h;
    private final BooleanField i;
    private final Long j;
    private final Integer m;

    public final List<C5466bzL> a() {
        return this.c;
    }

    public final NumberField b() {
        return this.e;
    }

    public final NumberField c() {
        return this.b;
    }

    public final NumberField d() {
        return this.d;
    }

    public final ChoiceField e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5459bzE) {
            C5459bzE c5459bzE = (C5459bzE) obj;
            return C8632dsu.c(this.a, c5459bzE.a) && C8632dsu.c(this.d, c5459bzE.d) && C8632dsu.c(this.e, c5459bzE.e) && C8632dsu.c(this.b, c5459bzE.b) && C8632dsu.c(this.h, c5459bzE.h) && C8632dsu.c(this.f, c5459bzE.f) && C8632dsu.c(this.i, c5459bzE.i) && C8632dsu.c(this.m, c5459bzE.m) && C8632dsu.c(this.j, c5459bzE.j) && this.g == c5459bzE.g && C8632dsu.c(this.c, c5459bzE.c);
        }
        return false;
    }

    public final BooleanField f() {
        return this.i;
    }

    public final BooleanField g() {
        return this.f;
    }

    public final Long h() {
        return this.j;
    }

    public int hashCode() {
        ChoiceField choiceField = this.a;
        int hashCode = choiceField == null ? 0 : choiceField.hashCode();
        NumberField numberField = this.d;
        int hashCode2 = numberField == null ? 0 : numberField.hashCode();
        NumberField numberField2 = this.e;
        int hashCode3 = numberField2 == null ? 0 : numberField2.hashCode();
        NumberField numberField3 = this.b;
        int hashCode4 = numberField3 == null ? 0 : numberField3.hashCode();
        ActionField actionField = this.h;
        int hashCode5 = actionField == null ? 0 : actionField.hashCode();
        BooleanField booleanField = this.f;
        int hashCode6 = booleanField == null ? 0 : booleanField.hashCode();
        BooleanField booleanField2 = this.i;
        int hashCode7 = booleanField2 == null ? 0 : booleanField2.hashCode();
        Integer num = this.m;
        int hashCode8 = num == null ? 0 : num.hashCode();
        Long l = this.j;
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (l != null ? l.hashCode() : 0)) * 31) + Integer.hashCode(this.g)) * 31) + this.c.hashCode();
    }

    public final ActionField i() {
        return this.h;
    }

    public final int j() {
        return this.g;
    }

    public final Integer o() {
        return this.m;
    }

    public String toString() {
        ChoiceField choiceField = this.a;
        NumberField numberField = this.d;
        NumberField numberField2 = this.e;
        NumberField numberField3 = this.b;
        ActionField actionField = this.h;
        BooleanField booleanField = this.f;
        BooleanField booleanField2 = this.i;
        Integer num = this.m;
        Long l = this.j;
        int i = this.g;
        List<C5466bzL> list = this.c;
        return "DemographicInterstitialLandingParsedData(gender=" + choiceField + ", birthDay=" + numberField + ", birthMonth=" + numberField2 + ", birthYear=" + numberField3 + ", saveAction=" + actionField + ", hasConsentedToDemographicInfoCollection=" + booleanField + ", hasAcceptedTermsOfUse=" + booleanField2 + ", termsOfUseMinimumVerificationAge=" + num + ", serverCurrentTimeStamp=" + l + ", minAge=" + i + ", genderList=" + list + ")";
    }

    public C5459bzE(ChoiceField choiceField, NumberField numberField, NumberField numberField2, NumberField numberField3, ActionField actionField, BooleanField booleanField, BooleanField booleanField2, Integer num, Long l, int i, List<C5466bzL> list) {
        C8632dsu.c((Object) list, "");
        this.a = choiceField;
        this.d = numberField;
        this.e = numberField2;
        this.b = numberField3;
        this.h = actionField;
        this.f = booleanField;
        this.i = booleanField2;
        this.m = num;
        this.j = l;
        this.g = i;
        this.c = list;
    }
}
