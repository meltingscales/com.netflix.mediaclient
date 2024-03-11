package com.netflix.mediaclient.service.mdx.protocol.target;

/* loaded from: classes3.dex */
public enum TargetStateEvent {
    PairSucceed(0),
    PairFail(1),
    PairFailedNeedRegPair(2),
    RegPairPinSubmitted(3),
    RegPairPinConfirmationCancelled(4),
    StartSessionSucceed(5),
    StartSessionFail(6),
    HandShakeSucceed(7),
    HandShakeFailed(8),
    PingSucceed(9),
    SendMessageSucceed(20),
    SendMessageFail(21),
    SendMessageFailedNeedNewSession(22),
    SendMessageFailedBadPair(23),
    SendMessageRequested(24),
    MessageReceived(25),
    MessageFailRetry(30),
    Timeout(31),
    Start(32),
    PeriodicStateCheck(33),
    RemoteLoginApproved(40),
    RemoteLoginRejected(41),
    RemoteLoginInProgress(42),
    RemoteLoginFail(43);
    
    private int D;

    public boolean a(int i) {
        return this.D == i;
    }

    public int b() {
        return this.D;
    }

    TargetStateEvent(int i) {
        this.D = i;
    }
}
