package com.netflix.mediaclient.acquisition.components.faq;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.mediaclient.acquisition.components.faq.FaqFragment;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupLogger;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import o.C8632dsu;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class FaqLogger implements FaqFragment.FaqInteractionListener {
    public static final int $stable = 8;
    private final Map<String, Long> faqItemSessionMap;
    private Long faqSession;
    private final SignupLogger signupLogger;

    public final Long getFaqSession() {
        return this.faqSession;
    }

    public final SignupLogger getSignupLogger() {
        return this.signupLogger;
    }

    public final void setFaqSession(Long l) {
        this.faqSession = l;
    }

    @Inject
    public FaqLogger(SignupLogger signupLogger) {
        C8632dsu.c((Object) signupLogger, "");
        this.signupLogger = signupLogger;
        this.faqItemSessionMap = new LinkedHashMap();
    }

    @Override // com.netflix.mediaclient.acquisition.components.faq.FaqFragment.FaqInteractionListener
    public void logFaqTrayClosed() {
        Long l = this.faqSession;
        if (l != null) {
            this.signupLogger.endSession(l.longValue());
            this.faqSession = null;
        }
        for (Map.Entry<String, Long> entry : this.faqItemSessionMap.entrySet()) {
            String key = entry.getKey();
            Long value = entry.getValue();
            if (value != null) {
                this.signupLogger.endSession(value.longValue());
                this.faqItemSessionMap.put(key, null);
            }
        }
    }

    @Override // com.netflix.mediaclient.acquisition.components.faq.FaqFragment.FaqInteractionListener
    public void logFaqTrayOpened() {
        Long l = this.faqSession;
        if (l != null) {
            this.signupLogger.endSession(l.longValue());
        }
        this.faqSession = this.signupLogger.startSession(new Presentation(AppView.nonmemberFaq, null));
    }

    @Override // com.netflix.mediaclient.acquisition.components.faq.FaqFragment.FaqInteractionListener
    public void logFaqItemExpanded(final String str) {
        C8632dsu.c((Object) str, "");
        this.faqItemSessionMap.put(str, this.signupLogger.startSession(new Presentation(AppView.nonmemberFaqItem, new TrackingInfo() { // from class: com.netflix.mediaclient.acquisition.components.faq.FaqLogger$$ExternalSyntheticLambda0
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject logFaqItemExpanded$lambda$3;
                logFaqItemExpanded$lambda$3 = FaqLogger.logFaqItemExpanded$lambda$3(str);
                return logFaqItemExpanded$lambda$3;
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject logFaqItemExpanded$lambda$3(String str) {
        C8632dsu.c((Object) str, "");
        return new JSONObject().put("faqQuestion", str);
    }

    @Override // com.netflix.mediaclient.acquisition.components.faq.FaqFragment.FaqInteractionListener
    public void logFaqItemShrunk(String str) {
        C8632dsu.c((Object) str, "");
        Long l = this.faqItemSessionMap.get(str);
        if (l != null) {
            this.signupLogger.endSession(l.longValue());
            this.faqItemSessionMap.put(str, null);
        }
    }
}
