package org.linphone.core;

/* loaded from: classes6.dex */
public enum ToneID {
    Undefined(0),
    Busy(1),
    CallWaiting(2),
    CallOnHold(3),
    CallLost(4);
    
    protected final int mValue;

    ToneID(int i) {
        this.mValue = i;
    }

    protected static ToneID fromInt(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return CallLost;
                        }
                        throw new LinphoneCoreException("Unhandled enum value " + i + " for LinphoneToneID");
                    }
                    return CallOnHold;
                }
                return CallWaiting;
            }
            return Busy;
        }
        return Undefined;
    }
}
