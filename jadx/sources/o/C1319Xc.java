package o;

import android.app.PendingIntent;
import android.content.Intent;
import com.netflix.mediaclient.commanderinfra.impl.mediacontrols.notification.NotificationIntentRetriever;
import javax.inject.Singleton;

@Singleton
/* renamed from: o.Xc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1319Xc implements NotificationIntentRetriever {
    public static final a e = new a(null);

    /* renamed from: o.Xc$a */
    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("NotificationIntentRetrieverImpl");
        }
    }

    @Override // com.netflix.mediaclient.commanderinfra.impl.mediacontrols.notification.NotificationIntentRetriever
    public PendingIntent e() {
        return e(new Intent("com.netflix.mediaclient.intent.action.CDX_ACTION_RESUME"));
    }

    @Override // com.netflix.mediaclient.commanderinfra.impl.mediacontrols.notification.NotificationIntentRetriever
    public PendingIntent b() {
        return e(new Intent("com.netflix.mediaclient.intent.action.CDX_ACTION_PAUSE"));
    }

    @Override // com.netflix.mediaclient.commanderinfra.impl.mediacontrols.notification.NotificationIntentRetriever
    public PendingIntent c() {
        return e(new Intent("com.netflix.mediaclient.intent.action.CDX_ACTION_REWIND"));
    }

    @Override // com.netflix.mediaclient.commanderinfra.impl.mediacontrols.notification.NotificationIntentRetriever
    public PendingIntent a() {
        return e(new Intent("com.netflix.mediaclient.intent.action.CDX_ACTION_FORWARD"));
    }

    @Override // com.netflix.mediaclient.commanderinfra.impl.mediacontrols.notification.NotificationIntentRetriever
    public PendingIntent b(NotificationIntentRetriever.SegmentType segmentType) {
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.CDX_ACTION_SKIP_INTRO");
        intent.putExtra("segmentType", segmentType != null ? segmentType.name() : null);
        return e(intent);
    }

    private final PendingIntent e(Intent intent) {
        e.getLogTag();
        intent.setClass(AbstractApplicationC1040Mh.d(), aMH.c().c()).addCategory("com.netflix.mediaclient.intent.category.CDX");
        return PendingIntent.getService(AbstractApplicationC1040Mh.d(), 0, intent, 201326592);
    }
}
