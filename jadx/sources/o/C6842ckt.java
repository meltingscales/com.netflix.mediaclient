package o;

import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModel;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import javax.inject.Inject;

/* renamed from: o.ckt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6842ckt extends ErrorMessageViewModel {
    private final String c;

    @Override // com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModel
    public String getText() {
        return this.c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public C6842ckt(StringProvider stringProvider, ErrorMessageViewModelInitializer errorMessageViewModelInitializer) {
        super(stringProvider, ErrorMessageViewModelInitializer.extractErrorMessageData$default(errorMessageViewModelInitializer, null, 1, null));
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) errorMessageViewModelInitializer, "");
        this.c = "";
    }
}
