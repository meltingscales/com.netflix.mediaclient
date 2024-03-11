package com.netflix.mediaclient.api.mdx;

import android.app.PendingIntent;
import com.netflix.model.leafs.originals.interactive.Moment;
import o.C1044Mm;

/* loaded from: classes.dex */
public interface MdxNotificationIntentRetriever {
    PendingIntent a();

    PendingIntent b(SegmentType segmentType);

    PendingIntent c(int i);

    PendingIntent d();

    PendingIntent d(InvocSource invocSource);

    PendingIntent e();

    /* loaded from: classes3.dex */
    public enum SegmentType {
        Unknown("UNKNOWN"),
        Intro("INTRO"),
        Recap("RECAP");
        
        private String b;

        public String b() {
            return this.b;
        }

        SegmentType(String str) {
            this.b = str;
        }

        public static SegmentType d(String str) {
            SegmentType[] values;
            for (SegmentType segmentType : values()) {
                if (segmentType.b().equals(str)) {
                    return segmentType;
                }
            }
            C1044Mm.j("SegmentType", "fromName - unknown type - type: %s", str);
            return Unknown;
        }
    }

    /* loaded from: classes3.dex */
    public enum InvocSource {
        Unknown("unknown"),
        MiniPlayer("miniplayer"),
        PlayerCard("playercard"),
        Notification(Moment.TYPE.NOTIFICATION),
        NotificationPostPlay("notificationpostplay"),
        LockScreen("lockscreen"),
        PostPlay("postplay"),
        Disconnect("disconnect");
        
        private String g;

        public String a() {
            return this.g;
        }

        InvocSource(String str) {
            this.g = str;
        }

        public static InvocSource d(String str) {
            InvocSource[] values;
            for (InvocSource invocSource : values()) {
                if (invocSource.a().equals(str)) {
                    return invocSource;
                }
            }
            C1044Mm.j("InvocSource", "fromName - unknown source - source: %s", str);
            return Unknown;
        }
    }
}
