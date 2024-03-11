package org.linphone.core;

import java.util.Vector;

/* loaded from: classes6.dex */
public interface LinphoneFriendList {

    /* loaded from: classes6.dex */
    public interface LinphoneFriendListListener {
        void onLinphoneFriendCreated(LinphoneFriendList linphoneFriendList, LinphoneFriend linphoneFriend);

        void onLinphoneFriendDeleted(LinphoneFriendList linphoneFriendList, LinphoneFriend linphoneFriend);

        void onLinphoneFriendSyncStatusChanged(LinphoneFriendList linphoneFriendList, State state, String str);

        void onLinphoneFriendUpdated(LinphoneFriendList linphoneFriendList, LinphoneFriend linphoneFriend, LinphoneFriend linphoneFriend2);
    }

    void addFriend(LinphoneFriend linphoneFriend);

    void addLocalFriend(LinphoneFriend linphoneFriend);

    void enableSubscriptions(boolean z);

    void exportFriendsToVCardFile(String str);

    LinphoneFriend findFriendByUri(String str);

    LinphoneFriend[] getFriendList();

    long getNativePtr();

    String getRLSUri();

    int importFriendsFromVCardBuffer(String str);

    int importFriendsFromVCardFile(String str);

    void setListener(LinphoneFriendListListener linphoneFriendListListener);

    void setRLSAddress(LinphoneAddress linphoneAddress);

    void setRLSUri(String str);

    void setUri(String str);

    void synchronizeFriendsFromServer();

    void updateSubscriptions();

    /* loaded from: classes6.dex */
    public static class State {
        private final String mStringValue;
        private final int mValue;
        private static Vector<State> values = new Vector<>();
        public static final State SyncStarted = new State(0, "SyncStarted");
        public static final State SyncSuccessful = new State(1, "SyncSuccessful");
        public static final State SyncFailure = new State(2, "SyncFailure");

        public int toInt() {
            return this.mValue;
        }

        public String toString() {
            return this.mStringValue;
        }

        public final int value() {
            return this.mValue;
        }

        private State(int i, String str) {
            this.mValue = i;
            values.addElement(this);
            this.mStringValue = str;
        }

        public static State fromInt(int i) {
            for (int i2 = 0; i2 < values.size(); i2++) {
                State elementAt = values.elementAt(i2);
                if (elementAt.mValue == i) {
                    return elementAt;
                }
            }
            throw new RuntimeException("state not found [" + i + "]");
        }
    }
}
