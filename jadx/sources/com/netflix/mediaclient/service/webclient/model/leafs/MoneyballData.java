package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.annotations.SerializedName;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.Field;

/* loaded from: classes4.dex */
public class MoneyballData {
    public static final String FIELD_AUI_CONTEXT = "aui_context";
    static final String FIELD_ERROR_CODE = "errorCode";
    public static final String FIELD_FLOW = "flow";
    public static final String FIELD_FLOWMODE = "flowmode";
    public static final String FIELD_FLWSSN = "flwssn";
    public static final String FIELD_MODE = "mode";
    static final String FIELD_PHONE_CODES = "phoneCodes";
    static final String FIELD_TERMS_OF_USE = "termsOfUse";
    public static final String TAG = "nf_moneyball";
    @SerializedName(FIELD_AUI_CONTEXT)
    protected AUIContextData contextData;
    @SerializedName("flow")
    protected String flow;
    @SerializedName(FIELD_FLOWMODE)
    protected FlowMode flowMode;
    @SerializedName("flwssn")
    public String flwssn;
    @SerializedName("mode")
    protected String mode;
    @SerializedName("phoneCodes")
    protected PhoneCodesData phoneCodesData;
    @SerializedName("termsOfUse")
    protected TermsOfUseData termsOfUseData;

    public AUIContextData getContextData() {
        return this.contextData;
    }

    public String getFlow() {
        return this.flow;
    }

    public FlowMode getFlowMode() {
        return this.flowMode;
    }

    public String getMode() {
        return this.mode;
    }

    public PhoneCodesData getPhoneCodesData() {
        return this.phoneCodesData;
    }

    public TermsOfUseData getTermsOfUseData() {
        return this.termsOfUseData;
    }

    public void setContextData(AUIContextData aUIContextData) {
        if (aUIContextData != null) {
            this.contextData = aUIContextData;
        }
    }

    public void setFlwssn(String str) {
        this.flwssn = str;
    }

    public void setPhoneCodesData(PhoneCodesData phoneCodesData) {
        this.phoneCodesData = phoneCodesData;
    }

    public void setTermsOfUseData(TermsOfUseData termsOfUseData) {
        this.termsOfUseData = termsOfUseData;
    }

    public String toString() {
        return "MoneyballData{mode='" + this.mode + "', flow='" + this.flow + "'}";
    }

    public void setFlowMode(FlowMode flowMode) {
        if (flowMode != null) {
            this.flowMode = flowMode;
            this.flow = flowMode.getFlow();
            this.mode = flowMode.getMode();
        }
    }

    public String getErrorCode() {
        Field field;
        FlowMode flowMode = this.flowMode;
        if (flowMode == null || (field = flowMode.getField("errorCode")) == null || field.getValue() == null) {
            return null;
        }
        return field.getValue().toString();
    }

    public boolean isValid() {
        return this.flowMode.getFlow() != null;
    }
}
