package org.linphone.core;

/* loaded from: classes6.dex */
public enum PresenceBasicStatus {
    Open(0),
    Closed(1),
    Invalid(2);
    
    protected final int mValue;

    /* JADX INFO: Access modifiers changed from: protected */
    public static PresenceBasicStatus fromInt(int i) {
        return i != 0 ? i != 1 ? Invalid : Closed : Open;
    }

    public int toInt() {
        return this.mValue;
    }

    PresenceBasicStatus(int i) {
        this.mValue = i;
    }
}
