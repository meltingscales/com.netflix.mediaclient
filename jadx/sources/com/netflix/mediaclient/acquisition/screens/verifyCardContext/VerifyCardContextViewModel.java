package com.netflix.mediaclient.acquisition.screens.verifyCardContext;

import androidx.lifecycle.ViewModel;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import io.reactivex.Observable;
import java.util.List;
import javax.inject.Inject;
import o.C8566dqi;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1270Vf;
import o.InterfaceC8554dpx;
import o.dpB;
import o.dpR;

/* loaded from: classes3.dex */
public final class VerifyCardContextViewModel {
    public static final long AUTO_SUBMIT_TIMEOUT_MS = 20000;
    private final InterfaceC8554dpx autoSubmit$delegate;
    private final InterfaceC1270Vf clock;
    private final int contextIcon;
    private final String headingText;
    private final LifecycleData lifecycleData;
    private final VerifyCardContextParsedData parsedData;
    private final StringProvider stringProvider;
    private final String userMessage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public final int getContextIcon() {
        return this.contextIcon;
    }

    public final String getHeadingText() {
        return this.headingText;
    }

    public final StringProvider getStringProvider() {
        return this.stringProvider;
    }

    public final String getUserMessage() {
        return this.userMessage;
    }

    public VerifyCardContextViewModel(StringProvider stringProvider, InterfaceC1270Vf interfaceC1270Vf, VerifyCardContextParsedData verifyCardContextParsedData, LifecycleData lifecycleData) {
        InterfaceC8554dpx b;
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) interfaceC1270Vf, "");
        C8632dsu.c((Object) verifyCardContextParsedData, "");
        C8632dsu.c((Object) lifecycleData, "");
        this.stringProvider = stringProvider;
        this.clock = interfaceC1270Vf;
        this.parsedData = verifyCardContextParsedData;
        this.lifecycleData = lifecycleData;
        this.headingText = stringProvider.getString(R.string.title_verify_card_context);
        this.contextIcon = com.netflix.mediaclient.ui.R.e.aH;
        String userMessageKey = verifyCardContextParsedData.getUserMessageKey();
        this.userMessage = userMessageKey != null ? stringProvider.getString(userMessageKey) : null;
        b = dpB.b(new VerifyCardContextViewModel$autoSubmit$2(this));
        this.autoSubmit$delegate = b;
    }

    public final List<String> getSubheadingText() {
        List<String> e;
        e = C8566dqi.e(this.stringProvider.getString(this.parsedData.is3DSCharge() ? R.string.label_requires_verification : R.string.label_requires_verification_nocharge));
        return e;
    }

    public final Observable<dpR> getAutoSubmit() {
        return (Observable) this.autoSubmit$delegate.getValue();
    }

    public final long getElapsedTimeMillis() {
        return this.clock.c() - this.lifecycleData.getStartTimeMillis();
    }

    /* loaded from: classes3.dex */
    public static final class LifecycleData extends ViewModel {
        public static final int $stable = 0;
        private final long startTimeMillis;

        public final long getStartTimeMillis() {
            return this.startTimeMillis;
        }

        @Inject
        public LifecycleData(InterfaceC1270Vf interfaceC1270Vf) {
            C8632dsu.c((Object) interfaceC1270Vf, "");
            this.startTimeMillis = interfaceC1270Vf.c();
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        public static /* synthetic */ void getAUTO_SUBMIT_TIMEOUT_MS$annotations() {
        }

        private Companion() {
        }
    }
}
