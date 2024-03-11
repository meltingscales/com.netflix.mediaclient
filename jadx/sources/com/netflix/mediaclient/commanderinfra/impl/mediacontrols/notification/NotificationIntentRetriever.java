package com.netflix.mediaclient.commanderinfra.impl.mediacontrols.notification;

import android.app.PendingIntent;
import o.C1045Mp;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8598drn;

/* loaded from: classes3.dex */
public interface NotificationIntentRetriever {
    public static final e d = e.d;

    PendingIntent a();

    PendingIntent b();

    PendingIntent b(SegmentType segmentType);

    PendingIntent c();

    PendingIntent e();

    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        static final /* synthetic */ e d = new e();

        private e() {
            super("NotificationIntentRetriever");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class SegmentType {
        public static final b a;
        private static final /* synthetic */ InterfaceC8598drn d;
        private static final /* synthetic */ SegmentType[] f;
        public static final SegmentType e = new SegmentType("Unknown", 0);
        public static final SegmentType c = new SegmentType("Intro", 1);
        public static final SegmentType b = new SegmentType("Recap", 2);

        private static final /* synthetic */ SegmentType[] d() {
            return new SegmentType[]{e, c, b};
        }

        public static InterfaceC8598drn<SegmentType> e() {
            return d;
        }

        public static SegmentType valueOf(String str) {
            return (SegmentType) Enum.valueOf(SegmentType.class, str);
        }

        public static SegmentType[] values() {
            return (SegmentType[]) f.clone();
        }

        private SegmentType(String str, int i) {
        }

        static {
            SegmentType[] d2 = d();
            f = d2;
            d = C8600drp.e(d2);
            a = new b(null);
        }

        /* loaded from: classes3.dex */
        public static final class b {
            public /* synthetic */ b(C8627dsp c8627dsp) {
                this();
            }

            private b() {
            }

            public final SegmentType d(String str) {
                for (SegmentType segmentType : SegmentType.e()) {
                    if (C8632dsu.c((Object) segmentType.name(), (Object) str)) {
                        return segmentType;
                    }
                }
                e eVar = NotificationIntentRetriever.d;
                return SegmentType.e;
            }
        }
    }
}
