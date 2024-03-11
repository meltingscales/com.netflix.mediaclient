package org.linphone.core;

import java.util.Vector;

/* loaded from: classes6.dex */
public interface LinphoneCallLog {
    int getCallDuration();

    String getCallId();

    CallDirection getDirection();

    LinphoneAddress getFrom();

    String getStartDate();

    CallStatus getStatus();

    long getTimestamp();

    LinphoneAddress getTo();

    boolean wasConference();

    /* loaded from: classes6.dex */
    public static class CallStatus {
        private final String mStringValue;
        private final int mValue;
        private static Vector<CallStatus> values = new Vector<>();
        public static final CallStatus Success = new CallStatus(0, "Success");
        public static final CallStatus Aborted = new CallStatus(1, "Aborted");
        public static final CallStatus Missed = new CallStatus(2, "Missed");
        public static final CallStatus Declined = new CallStatus(3, "Declined");
        public static final CallStatus EarlyAborted = new CallStatus(4, "Early Aborted");
        public static final CallStatus AcceptedElsewhere = new CallStatus(5, "Accepted Elsewhere");
        public static final CallStatus DeclinedElsewhere = new CallStatus(6, "Declined Elsewhere");

        public int toInt() {
            return this.mValue;
        }

        public String toString() {
            return this.mStringValue;
        }

        private CallStatus(int i, String str) {
            this.mValue = i;
            values.addElement(this);
            this.mStringValue = str;
        }

        public static CallStatus fromInt(int i) {
            for (int i2 = 0; i2 < values.size(); i2++) {
                CallStatus elementAt = values.elementAt(i2);
                if (elementAt.mValue == i) {
                    return elementAt;
                }
            }
            throw new RuntimeException("CallStatus not found [" + i + "]");
        }
    }
}
