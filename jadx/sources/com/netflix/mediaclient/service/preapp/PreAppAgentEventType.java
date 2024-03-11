package com.netflix.mediaclient.service.preapp;

/* loaded from: classes4.dex */
public enum PreAppAgentEventType {
    ALL_MEMBER_UPDATED,
    CW_UPDATED,
    IQ_UPDATED,
    NON_MEMBER_UPDATED,
    ACCOUNT_DEACTIVATED;

    public static boolean b(PreAppAgentEventType preAppAgentEventType) {
        return ALL_MEMBER_UPDATED.equals(preAppAgentEventType);
    }

    public static boolean e(PreAppAgentEventType preAppAgentEventType) {
        return NON_MEMBER_UPDATED.equals(preAppAgentEventType);
    }

    public static boolean j(PreAppAgentEventType preAppAgentEventType) {
        return ALL_MEMBER_UPDATED.equals(preAppAgentEventType);
    }

    public static boolean c(PreAppAgentEventType preAppAgentEventType) {
        return ALL_MEMBER_UPDATED.equals(preAppAgentEventType);
    }

    public static boolean a(PreAppAgentEventType preAppAgentEventType) {
        return CW_UPDATED.equals(preAppAgentEventType) || ALL_MEMBER_UPDATED.equals(preAppAgentEventType);
    }

    public static boolean d(PreAppAgentEventType preAppAgentEventType) {
        return IQ_UPDATED.equals(preAppAgentEventType) || ALL_MEMBER_UPDATED.equals(preAppAgentEventType);
    }

    public static boolean f(PreAppAgentEventType preAppAgentEventType) {
        return ACCOUNT_DEACTIVATED.equals(preAppAgentEventType);
    }
}
