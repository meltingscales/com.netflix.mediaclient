package org.linphone.core;

/* loaded from: classes6.dex */
public interface LinphoneConference {
    LinphoneAddress[] getParticipants();

    int removeParticipant(LinphoneAddress linphoneAddress);
}
