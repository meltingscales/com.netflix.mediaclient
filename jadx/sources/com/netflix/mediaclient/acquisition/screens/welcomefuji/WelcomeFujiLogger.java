package com.netflix.mediaclient.acquisition.screens.welcomefuji;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.discrete.Selected;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.cl.model.event.session.Session;
import com.netflix.cl.model.event.session.action.ActionFailed;
import com.netflix.cl.model.event.session.command.SignUpCommand;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupLogger;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment;
import com.netflix.mediaclient.clutils.CLv2Utils;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import o.C8632dsu;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class WelcomeFujiLogger implements WelcomeFujiFragment.WelcomeFujiInteractionListener {
    public static final int $stable = 8;
    private final AppView cardAppView;
    private Long currentCardSessionId;
    private final SignupLogger signupLogger;

    @AssistedFactory
    /* loaded from: classes3.dex */
    public interface Factory {
        WelcomeFujiLogger create(AppView appView);
    }

    public final AppView getCardAppView() {
        return this.cardAppView;
    }

    public final SignupLogger getSignupLogger() {
        return this.signupLogger;
    }

    @AssistedInject
    public WelcomeFujiLogger(SignupLogger signupLogger, @Assisted AppView appView) {
        C8632dsu.c((Object) signupLogger, "");
        C8632dsu.c((Object) appView, "");
        this.signupLogger = signupLogger;
        this.cardAppView = appView;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment.WelcomeFujiInteractionListener
    public void logOnPageSelected(final String str) {
        Long l = this.currentCardSessionId;
        if (l != null) {
            this.signupLogger.endSession(l.longValue());
        }
        this.currentCardSessionId = this.signupLogger.startSession(new Presentation(this.cardAppView, new TrackingInfo() { // from class: com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiLogger$$ExternalSyntheticLambda0
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject logOnPageSelected$lambda$1;
                logOnPageSelected$lambda$1 = WelcomeFujiLogger.logOnPageSelected$lambda$1(str);
                return logOnPageSelected$lambda$1;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject logOnPageSelected$lambda$1(String str) {
        return new JSONObject().put("cardName", str);
    }

    @Override // com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment.WelcomeFujiInteractionListener
    public void logNavigate() {
        Long l = this.currentCardSessionId;
        if (l != null) {
            this.signupLogger.endSession(l.longValue());
        }
    }

    @Override // com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment.WelcomeFujiInteractionListener
    public void logCtaClick(boolean z, boolean z2) {
        if (z) {
            this.signupLogger.logEvent(new Selected(AppView.restartMembershipButton, null, CommandValue.RestartMembershipCommand, null));
        } else if (z2) {
            CLv2Utils.d(new SignUpCommand());
        } else {
            Logger logger = Logger.INSTANCE;
            Session session = logger.getSession(logger.startSession(new SignUpCommand()));
            if (session != null) {
                logger.endSession(new ActionFailed(session, "Invalid email"));
            }
        }
    }
}
