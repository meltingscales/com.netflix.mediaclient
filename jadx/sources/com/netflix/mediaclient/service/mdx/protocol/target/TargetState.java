package com.netflix.mediaclient.service.mdx.protocol.target;

import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes3.dex */
public enum TargetState {
    StateInit(TargetStateId.STATE_INIT, "STATE_INIT", 0, 0),
    StateHasPair(TargetStateId.STATE_HASPAIR, "STATE_HASPAIR", 0, 0),
    StateNoPair(TargetStateId.STATE_NOPAIR, "STATE_NOPAIR", 0, 0),
    StateSessionReady(TargetStateId.STATE_SESSION_READY, "STATE_SESSION_READY", 0, 0),
    StateMdxPing(TargetStateId.STATE_MDXPING, "STATE_MDXPING", 3, 8000),
    StateAcquireRemoteLoginConsent(TargetStateId.STATE_ACQUIRE_REMOTE_LOGIN_CONSENT, "STATE_ACQUIRE_REMOTE_LOGIN_CONSENT", 0, 120000),
    StateVerifyRemoteLoginPin(TargetStateId.STATE_VERIFY_REMOTE_LOGIN_PIN, "STATE_VERIFY_REMOTE_LOGIN_PIN", 0, 120000),
    StateRemoteLogin(TargetStateId.STATE_REMOTE_LOGIN, "STATE_REMOTE_LOGIN", 0, 120000),
    StateAcquirePair(TargetStateId.STATE_ACQUIRE_PAIR, "STATE_ACQUIRE_PAIR", 3, 16000),
    StateVerifyRegPairPin(TargetStateId.STATE_VERIFY_REGPAIR_PIN, "STATE_VERIFY_REGPAIR_PIN", 0, 120000),
    StateRegPair(TargetStateId.STATE_REGPAIR, "STATE_REGPAIR", 3, 32000),
    StateStartSession(TargetStateId.STATE_START_SESSION, "STATE_START_SESSION", 3, 8000),
    StateHandShake(TargetStateId.STATE_HAND_SHAKE, "STATE_HAND_SHAKE", 3, 8000),
    StateGetCapabilities(TargetStateId.STATE_GET_CAPABILITIES, "STATE_GET_CAPABILITIES", 3, 8000),
    StateGetState(TargetStateId.STATE_GET_STATE, "STATE_GET_STATE", 3, 8000),
    StateSendingMessage(TargetStateId.STATE_SENDING_MESSAGE, "STATE_SENDING_MESSAGE", 3, 8000);
    
    private int p;
    private int q = 0;
    private TargetStateId t;
    private int u;
    private String v;
    private int x;

    public String a() {
        return this.v;
    }

    public void b() {
        int i = this.x;
        if (i > 0) {
            this.x = i - 1;
        }
    }

    public TargetStateId d() {
        return this.t;
    }

    public int e() {
        return this.u;
    }

    public boolean h() {
        return this.p <= 0 || this.x <= 0;
    }

    public void i() {
        this.q = 0;
        this.x = this.p;
    }

    TargetState(TargetStateId targetStateId, String str, int i, int i2) {
        this.v = str;
        i = i > 0 ? Math.max(i, 3) : i;
        this.p = i;
        this.x = i;
        this.t = targetStateId;
        this.u = i2;
    }

    public int c() {
        int i = this.q;
        if (i < this.p) {
            this.q = i + 1;
        }
        int i2 = this.q;
        return ThreadLocalRandom.current().nextInt(i2 > 0 ? 1 << (i2 - 1) : 0, 1 << i2) * 1000;
    }

    public boolean c(TargetState targetState) {
        return d(targetState.d());
    }

    public boolean d(TargetStateId targetStateId) {
        return d() == targetStateId;
    }
}
