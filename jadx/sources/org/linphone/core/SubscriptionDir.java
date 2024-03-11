package org.linphone.core;

/* loaded from: classes6.dex */
public enum SubscriptionDir {
    Incoming(0),
    Outgoing(1),
    Invalid(2);
    
    protected final int mValue;

    /* JADX INFO: Access modifiers changed from: protected */
    public static SubscriptionDir fromInt(int i) {
        return i != 0 ? i != 1 ? Invalid : Outgoing : Incoming;
    }

    SubscriptionDir(int i) {
        this.mValue = i;
    }
}
