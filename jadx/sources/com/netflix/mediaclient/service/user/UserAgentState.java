package com.netflix.mediaclient.service.user;

import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.app.Status;
import o.C8600drp;
import o.C8627dsp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public abstract class UserAgentState {
    private static final /* synthetic */ InterfaceC8598drn f;
    private static final /* synthetic */ UserAgentState[] i;
    public static final UserAgentState d = new UserAgentState("INIT", 0) { // from class: com.netflix.mediaclient.service.user.UserAgentState.INIT
        @Override // com.netflix.mediaclient.service.user.UserAgentState
        public Status b() {
            return new NetflixStatus(StatusCode.INIT_SERVICE_TIMEOUT_USER_LOAD);
        }
    };
    public static final UserAgentState h = new UserAgentState("RECOVER_OVER_MSL", 1) { // from class: com.netflix.mediaclient.service.user.UserAgentState.RECOVER_OVER_MSL
        @Override // com.netflix.mediaclient.service.user.UserAgentState
        public Status b() {
            return new NetflixStatus(StatusCode.INIT_SERVICE_TIMEOUT_USER_RECOVER_OVER_MSL);
        }
    };
    public static final UserAgentState b = new UserAgentState("RECOVER_OVER_COOKIES", 2) { // from class: com.netflix.mediaclient.service.user.UserAgentState.RECOVER_OVER_COOKIES
        @Override // com.netflix.mediaclient.service.user.UserAgentState
        public Status b() {
            return new NetflixStatus(StatusCode.INIT_SERVICE_TIMEOUT_USER_RECOVER_OVER_COOKIES);
        }
    };
    public static final UserAgentState e = new UserAgentState("FETCH_COOKIES", 3) { // from class: com.netflix.mediaclient.service.user.UserAgentState.FETCH_COOKIES
        @Override // com.netflix.mediaclient.service.user.UserAgentState
        public Status b() {
            return new NetflixStatus(StatusCode.INIT_SERVICE_TIMEOUT_USER_MISSING_COOKIES);
        }
    };
    public static final UserAgentState c = new UserAgentState("READY", 4) { // from class: com.netflix.mediaclient.service.user.UserAgentState.READY
        @Override // com.netflix.mediaclient.service.user.UserAgentState
        public Status b() {
            return new NetflixStatus(StatusCode.INIT_SERVICE_TIMEOUT_USER);
        }
    };
    public static final UserAgentState a = new UserAgentState("FAILED", 5) { // from class: com.netflix.mediaclient.service.user.UserAgentState.FAILED
        @Override // com.netflix.mediaclient.service.user.UserAgentState
        public Status b() {
            return new NetflixStatus(StatusCode.INIT_SERVICE_TIMEOUT_USER);
        }
    };

    public /* synthetic */ UserAgentState(String str, int i2, C8627dsp c8627dsp) {
        this(str, i2);
    }

    private static final /* synthetic */ UserAgentState[] e() {
        return new UserAgentState[]{d, h, b, e, c, a};
    }

    public static UserAgentState valueOf(String str) {
        return (UserAgentState) Enum.valueOf(UserAgentState.class, str);
    }

    public static UserAgentState[] values() {
        return (UserAgentState[]) i.clone();
    }

    public abstract Status b();

    private UserAgentState(String str, int i2) {
    }

    static {
        UserAgentState[] e2 = e();
        i = e2;
        f = C8600drp.e(e2);
    }
}
