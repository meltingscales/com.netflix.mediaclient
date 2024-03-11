package org.linphone.core;

/* loaded from: classes6.dex */
public class CallDirection {
    private String mStringValue;
    public static CallDirection Outgoing = new CallDirection("CallOutgoing");
    public static CallDirection Incoming = new CallDirection("Callincoming");

    public String toString() {
        return this.mStringValue;
    }

    private CallDirection(String str) {
        this.mStringValue = str;
    }
}
