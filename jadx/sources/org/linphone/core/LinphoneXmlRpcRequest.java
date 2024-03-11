package org.linphone.core;

import java.util.Vector;

/* loaded from: classes6.dex */
public interface LinphoneXmlRpcRequest {

    /* loaded from: classes6.dex */
    public interface LinphoneXmlRpcRequestListener {
        void onXmlRpcRequestResponse(LinphoneXmlRpcRequest linphoneXmlRpcRequest);
    }

    void addIntArg(int i);

    void addStringArg(String str);

    String getContent();

    int getIntResponse();

    Status getStatus();

    String getStringResponse();

    void setListener(LinphoneXmlRpcRequestListener linphoneXmlRpcRequestListener);

    /* loaded from: classes6.dex */
    public static class ArgType {
        private final String mStringValue;
        private final int mValue;
        private static Vector<ArgType> values = new Vector<>();
        public static final ArgType None = new ArgType(0, "None");
        public static final ArgType Int = new ArgType(1, "Int");
        public static final ArgType String = new ArgType(2, "String");

        public int toInt() {
            return this.mValue;
        }

        public String toString() {
            return this.mStringValue;
        }

        public final int value() {
            return this.mValue;
        }

        private ArgType(int i, String str) {
            this.mValue = i;
            values.addElement(this);
            this.mStringValue = str;
        }

        public static ArgType fromInt(int i) {
            for (int i2 = 0; i2 < values.size(); i2++) {
                ArgType elementAt = values.elementAt(i2);
                if (elementAt.mValue == i) {
                    return elementAt;
                }
            }
            throw new RuntimeException("ArgType not found [" + i + "]");
        }
    }

    /* loaded from: classes6.dex */
    public static class Status {
        private final String mStringValue;
        private final int mValue;
        private static Vector<Status> values = new Vector<>();
        public static final Status Pending = new Status(0, "Pending");
        public static final Status Ok = new Status(1, "Ok");
        public static final Status Failed = new Status(2, "Failed");

        public int toInt() {
            return this.mValue;
        }

        public String toString() {
            return this.mStringValue;
        }

        public final int value() {
            return this.mValue;
        }

        private Status(int i, String str) {
            this.mValue = i;
            values.addElement(this);
            this.mStringValue = str;
        }

        public static Status fromInt(int i) {
            for (int i2 = 0; i2 < values.size(); i2++) {
                Status elementAt = values.elementAt(i2);
                if (elementAt.mValue == i) {
                    return elementAt;
                }
            }
            throw new RuntimeException("Status not found [" + i + "]");
        }
    }
}
