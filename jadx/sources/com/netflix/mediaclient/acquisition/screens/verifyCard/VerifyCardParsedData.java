package com.netflix.mediaclient.acquisition.screens.verifyCard;

import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.StringField;
import java.util.Map;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class VerifyCardParsedData {
    public static final int $stable = 8;
    private final Map<String, String> acsPostParams;
    private final String acsUrl;
    private final boolean is3DSCharge;
    private final StringField md;
    private final ActionField nextAction;
    private final StringField paRes;
    private final ActionField prevAction;

    public static /* synthetic */ VerifyCardParsedData copy$default(VerifyCardParsedData verifyCardParsedData, ActionField actionField, ActionField actionField2, StringField stringField, StringField stringField2, boolean z, Map map, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            actionField = verifyCardParsedData.nextAction;
        }
        if ((i & 2) != 0) {
            actionField2 = verifyCardParsedData.prevAction;
        }
        ActionField actionField3 = actionField2;
        if ((i & 4) != 0) {
            stringField = verifyCardParsedData.md;
        }
        StringField stringField3 = stringField;
        if ((i & 8) != 0) {
            stringField2 = verifyCardParsedData.paRes;
        }
        StringField stringField4 = stringField2;
        if ((i & 16) != 0) {
            z = verifyCardParsedData.is3DSCharge;
        }
        boolean z2 = z;
        Map<String, String> map2 = map;
        if ((i & 32) != 0) {
            map2 = verifyCardParsedData.acsPostParams;
        }
        Map map3 = map2;
        if ((i & 64) != 0) {
            str = verifyCardParsedData.acsUrl;
        }
        return verifyCardParsedData.copy(actionField, actionField3, stringField3, stringField4, z2, map3, str);
    }

    public final ActionField component1() {
        return this.nextAction;
    }

    public final ActionField component2() {
        return this.prevAction;
    }

    public final StringField component3() {
        return this.md;
    }

    public final StringField component4() {
        return this.paRes;
    }

    public final boolean component5() {
        return this.is3DSCharge;
    }

    public final Map<String, String> component6() {
        return this.acsPostParams;
    }

    public final String component7() {
        return this.acsUrl;
    }

    public final VerifyCardParsedData copy(ActionField actionField, ActionField actionField2, StringField stringField, StringField stringField2, boolean z, Map<String, String> map, String str) {
        C8632dsu.c((Object) map, "");
        return new VerifyCardParsedData(actionField, actionField2, stringField, stringField2, z, map, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VerifyCardParsedData) {
            VerifyCardParsedData verifyCardParsedData = (VerifyCardParsedData) obj;
            return C8632dsu.c(this.nextAction, verifyCardParsedData.nextAction) && C8632dsu.c(this.prevAction, verifyCardParsedData.prevAction) && C8632dsu.c(this.md, verifyCardParsedData.md) && C8632dsu.c(this.paRes, verifyCardParsedData.paRes) && this.is3DSCharge == verifyCardParsedData.is3DSCharge && C8632dsu.c(this.acsPostParams, verifyCardParsedData.acsPostParams) && C8632dsu.c((Object) this.acsUrl, (Object) verifyCardParsedData.acsUrl);
        }
        return false;
    }

    public final Map<String, String> getAcsPostParams() {
        return this.acsPostParams;
    }

    public final String getAcsUrl() {
        return this.acsUrl;
    }

    public final StringField getMd() {
        return this.md;
    }

    public final ActionField getNextAction() {
        return this.nextAction;
    }

    public final StringField getPaRes() {
        return this.paRes;
    }

    public final ActionField getPrevAction() {
        return this.prevAction;
    }

    public int hashCode() {
        ActionField actionField = this.nextAction;
        int hashCode = actionField == null ? 0 : actionField.hashCode();
        ActionField actionField2 = this.prevAction;
        int hashCode2 = actionField2 == null ? 0 : actionField2.hashCode();
        StringField stringField = this.md;
        int hashCode3 = stringField == null ? 0 : stringField.hashCode();
        StringField stringField2 = this.paRes;
        int hashCode4 = stringField2 == null ? 0 : stringField2.hashCode();
        int hashCode5 = Boolean.hashCode(this.is3DSCharge);
        int hashCode6 = this.acsPostParams.hashCode();
        String str = this.acsUrl;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean is3DSCharge() {
        return this.is3DSCharge;
    }

    public String toString() {
        ActionField actionField = this.nextAction;
        ActionField actionField2 = this.prevAction;
        StringField stringField = this.md;
        StringField stringField2 = this.paRes;
        boolean z = this.is3DSCharge;
        Map<String, String> map = this.acsPostParams;
        String str = this.acsUrl;
        return "VerifyCardParsedData(nextAction=" + actionField + ", prevAction=" + actionField2 + ", md=" + stringField + ", paRes=" + stringField2 + ", is3DSCharge=" + z + ", acsPostParams=" + map + ", acsUrl=" + str + ")";
    }

    public VerifyCardParsedData(ActionField actionField, ActionField actionField2, StringField stringField, StringField stringField2, boolean z, Map<String, String> map, String str) {
        C8632dsu.c((Object) map, "");
        this.nextAction = actionField;
        this.prevAction = actionField2;
        this.md = stringField;
        this.paRes = stringField2;
        this.is3DSCharge = z;
        this.acsPostParams = map;
        this.acsUrl = str;
    }
}
