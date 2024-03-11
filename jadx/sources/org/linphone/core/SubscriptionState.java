package org.linphone.core;

/* loaded from: classes6.dex */
public enum SubscriptionState {
    None(0),
    OutoingProgress(1),
    IncomingReceived(2),
    Pending(3),
    Active(4),
    Terminated(5),
    Error(6),
    Expiring(7);
    
    protected final int mValue;

    SubscriptionState(int i) {
        this.mValue = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static SubscriptionState fromInt(int i) {
        switch (i) {
            case 0:
                return None;
            case 1:
                return OutoingProgress;
            case 2:
                return IncomingReceived;
            case 3:
                return Pending;
            case 4:
                return Active;
            case 5:
                return Terminated;
            case 6:
                return Error;
            case 7:
                return Expiring;
            default:
                throw new LinphoneCoreException("Unhandled enum value " + i + " for SubscriptionState");
        }
    }
}
