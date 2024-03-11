package com.netflix.mediaclient.service.offline.agent;

import android.content.Intent;

/* loaded from: classes3.dex */
public enum IntentCommandGroupType {
    Unknown(-1),
    DownloadNotification(1);
    
    private final int c;

    private int e() {
        return this.c;
    }

    IntentCommandGroupType(int i) {
        this.c = i;
    }

    private static IntentCommandGroupType c(int i) {
        IntentCommandGroupType[] values;
        for (IntentCommandGroupType intentCommandGroupType : values()) {
            if (intentCommandGroupType.e() == i) {
                return intentCommandGroupType;
            }
        }
        return Unknown;
    }

    public static void c(Intent intent, IntentCommandGroupType intentCommandGroupType) {
        intent.putExtra("of_intent_group_type", intentCommandGroupType.e());
    }

    public static IntentCommandGroupType a(Intent intent) {
        return c(intent.getIntExtra("of_intent_group_type", Unknown.c));
    }
}
