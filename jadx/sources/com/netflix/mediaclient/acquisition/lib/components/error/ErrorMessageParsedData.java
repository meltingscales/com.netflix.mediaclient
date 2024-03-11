package com.netflix.mediaclient.acquisition.lib.components.error;

import java.util.Map;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class ErrorMessageParsedData {
    private final String errorCodeKey;
    private final boolean isPaymentPickerError;
    private final String mode;
    private final Map<String, String> translationData;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ErrorMessageParsedData copy$default(ErrorMessageParsedData errorMessageParsedData, String str, Map map, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = errorMessageParsedData.errorCodeKey;
        }
        if ((i & 2) != 0) {
            map = errorMessageParsedData.translationData;
        }
        if ((i & 4) != 0) {
            z = errorMessageParsedData.isPaymentPickerError;
        }
        if ((i & 8) != 0) {
            str2 = errorMessageParsedData.mode;
        }
        return errorMessageParsedData.copy(str, map, z, str2);
    }

    public final String component1() {
        return this.errorCodeKey;
    }

    public final Map<String, String> component2() {
        return this.translationData;
    }

    public final boolean component3() {
        return this.isPaymentPickerError;
    }

    public final String component4() {
        return this.mode;
    }

    public final ErrorMessageParsedData copy(String str, Map<String, String> map, boolean z, String str2) {
        C8632dsu.c((Object) str2, "");
        return new ErrorMessageParsedData(str, map, z, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ErrorMessageParsedData) {
            ErrorMessageParsedData errorMessageParsedData = (ErrorMessageParsedData) obj;
            return C8632dsu.c((Object) this.errorCodeKey, (Object) errorMessageParsedData.errorCodeKey) && C8632dsu.c(this.translationData, errorMessageParsedData.translationData) && this.isPaymentPickerError == errorMessageParsedData.isPaymentPickerError && C8632dsu.c((Object) this.mode, (Object) errorMessageParsedData.mode);
        }
        return false;
    }

    public final String getErrorCodeKey() {
        return this.errorCodeKey;
    }

    public final String getMode() {
        return this.mode;
    }

    public final Map<String, String> getTranslationData() {
        return this.translationData;
    }

    public int hashCode() {
        String str = this.errorCodeKey;
        int hashCode = str == null ? 0 : str.hashCode();
        Map<String, String> map = this.translationData;
        return (((((hashCode * 31) + (map != null ? map.hashCode() : 0)) * 31) + Boolean.hashCode(this.isPaymentPickerError)) * 31) + this.mode.hashCode();
    }

    public final boolean isPaymentPickerError() {
        return this.isPaymentPickerError;
    }

    public String toString() {
        String str = this.errorCodeKey;
        Map<String, String> map = this.translationData;
        boolean z = this.isPaymentPickerError;
        String str2 = this.mode;
        return "ErrorMessageParsedData(errorCodeKey=" + str + ", translationData=" + map + ", isPaymentPickerError=" + z + ", mode=" + str2 + ")";
    }

    public ErrorMessageParsedData(String str, Map<String, String> map, boolean z, String str2) {
        C8632dsu.c((Object) str2, "");
        this.errorCodeKey = str;
        this.translationData = map;
        this.isPaymentPickerError = z;
        this.mode = str2;
    }

    public /* synthetic */ ErrorMessageParsedData(String str, Map map, boolean z, String str2, int i, C8627dsp c8627dsp) {
        this(str, map, (i & 4) != 0 ? false : z, str2);
    }
}
