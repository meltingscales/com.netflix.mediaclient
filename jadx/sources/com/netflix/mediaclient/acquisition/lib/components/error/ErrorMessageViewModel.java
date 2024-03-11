package com.netflix.mediaclient.acquisition.lib.components.error;

import com.netflix.mediaclient.acquisition.lib.R;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import java.util.Map;
import javax.inject.Inject;
import o.C1333Xq;
import o.C8632dsu;
import o.dqE;

/* loaded from: classes3.dex */
public class ErrorMessageViewModel {
    private final ErrorMessageParsedData parsedData;
    private final StringProvider stringProvider;

    public ErrorMessageViewModel(StringProvider stringProvider, ErrorMessageParsedData errorMessageParsedData) {
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) errorMessageParsedData, "");
        this.stringProvider = stringProvider;
        this.parsedData = errorMessageParsedData;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Inject
    public ErrorMessageViewModel(StringProvider stringProvider, ErrorMessageViewModelInitializer errorMessageViewModelInitializer) {
        this(stringProvider, ErrorMessageViewModelInitializer.extractErrorMessageData$default(errorMessageViewModelInitializer, null, 1, null));
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) errorMessageViewModelInitializer, "");
    }

    public String getText() {
        if (this.parsedData.getErrorCodeKey() == null) {
            return "";
        }
        if (this.parsedData.getTranslationData() != null) {
            return localizeErrorWithArgs(this.parsedData.getErrorCodeKey(), this.parsedData.getTranslationData());
        }
        return localizeError(this.parsedData.getErrorCodeKey());
    }

    private final String localizeError(String str) {
        String string = this.stringProvider.getString(str);
        return string == null ? localizedErrorFallback() : string;
    }

    private final String localizedErrorFallback() {
        return this.stringProvider.getString(R.string.generic_retryable_failure);
    }

    private final String localizeErrorWithArgs(String str, Map<String, String> map) {
        Object e;
        C1333Xq formatter = this.stringProvider.getFormatter(str);
        if (formatter != null && hasValidTranslationData(map)) {
            for (String str2 : map.keySet()) {
                e = dqE.e(map, str2);
                formatter.d(str2, e);
            }
            String c = formatter.c();
            C8632dsu.a(c, "");
            return c;
        }
        return localizedErrorFallback();
    }

    private final boolean hasValidTranslationData(Map<String, String> map) {
        Object e;
        while (true) {
            boolean z = true;
            for (String str : map.keySet()) {
                if (z) {
                    e = dqE.e(map, str);
                    CharSequence charSequence = (CharSequence) e;
                    if (charSequence != null && charSequence.length() != 0) {
                        break;
                    }
                }
                z = false;
            }
            return z;
        }
    }
}
