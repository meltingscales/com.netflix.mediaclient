package org.linphone.core;

import java.util.Vector;

/* loaded from: classes6.dex */
public interface LinphoneFriend {
    void addAddress(LinphoneAddress linphoneAddress);

    void addPhoneNumber(String str);

    void done();

    void edit();

    void enableSubscribes(boolean z);

    LinphoneAddress getAddress();

    LinphoneAddress[] getAddresses();

    String getFamilyName();

    String getGivenName();

    SubscribePolicy getIncSubscribePolicy();

    String getName();

    long getNativePtr();

    String getOrganization();

    String[] getPhoneNumbers();

    @Deprecated
    PresenceModel getPresenceModel();

    PresenceModel getPresenceModelForUri(String str);

    String getRefKey();

    @Deprecated
    OnlineStatus getStatus();

    String getVcardToString();

    boolean isAlreadyPresentInFriendList();

    boolean isPresenceReceived();

    boolean isSubscribesEnabled();

    void removeAddress(LinphoneAddress linphoneAddress);

    void removePhoneNumber(String str);

    void setAddress(LinphoneAddress linphoneAddress);

    void setFamilyName(String str);

    void setGivenName(String str);

    void setIncSubscribePolicy(SubscribePolicy subscribePolicy);

    void setName(String str);

    void setOrganization(String str);

    void setPresenceModel(PresenceModel presenceModel);

    void setRefKey(String str);

    String toString();

    /* loaded from: classes6.dex */
    public static class SubscribePolicy {
        private final String mStringValue;
        protected final int mValue;
        private static Vector<SubscribePolicy> values = new Vector<>();
        public static final SubscribePolicy SPWait = new SubscribePolicy(0, "SPWait");
        public static final SubscribePolicy SPDeny = new SubscribePolicy(1, "SPDeny");
        public static final SubscribePolicy SPAccept = new SubscribePolicy(2, "SPAccept");

        public String toString() {
            return this.mStringValue;
        }

        private SubscribePolicy(int i, String str) {
            this.mValue = i;
            values.addElement(this);
            this.mStringValue = str;
        }

        public static SubscribePolicy fromInt(int i) {
            for (int i2 = 0; i2 < values.size(); i2++) {
                SubscribePolicy elementAt = values.elementAt(i2);
                if (elementAt.mValue == i) {
                    return elementAt;
                }
            }
            throw new RuntimeException("Policy not found [" + i + "]");
        }
    }
}
