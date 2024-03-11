package org.linphone.core;

/* loaded from: classes6.dex */
public enum PublishState {
    None(0),
    Progress(1),
    Ok(2),
    Error(3),
    Expiring(4),
    Cleared(5);
    
    protected final int mValue;

    PublishState(int i) {
        this.mValue = i;
    }

    protected static PublishState fromInt(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return Cleared;
                            }
                            throw new LinphoneCoreException("Unhandled enum value " + i + " for PublishState");
                        }
                        return Expiring;
                    }
                    return Error;
                }
                return Ok;
            }
            return Progress;
        }
        return None;
    }
}
