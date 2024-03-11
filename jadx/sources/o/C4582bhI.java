package o;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* renamed from: o.bhI  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4582bhI implements AnalyticsListener {
    private ExoPlayer a;
    private final Handler b = new Handler(Looper.getMainLooper());

    protected void a(AnalyticsListener.EventTime eventTime) {
    }

    protected void b(AnalyticsListener.EventTime eventTime, boolean z) {
    }

    public final void d(ExoPlayer exoPlayer) {
        this.a = exoPlayer;
    }

    protected void d(AnalyticsListener.EventTime eventTime) {
    }

    protected void d(AnalyticsListener.EventTime eventTime, long j) {
    }

    protected void e(AnalyticsListener.EventTime eventTime, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        a(d());
    }

    public final void e() {
        this.b.post(new Runnable() { // from class: o.bhH
            @Override // java.lang.Runnable
            public final void run() {
                C4582bhI.this.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(int i) {
        e(d(), i);
    }

    public final void b(final int i) {
        this.b.post(new Runnable() { // from class: o.bhE
            @Override // java.lang.Runnable
            public final void run() {
                C4582bhI.this.d(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(boolean z) {
        b(d(), z);
    }

    public final void e(final boolean z) {
        this.b.post(new Runnable() { // from class: o.bhJ
            @Override // java.lang.Runnable
            public final void run() {
                C4582bhI.this.d(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(long j) {
        d(d(), j);
    }

    public final void a(final long j) {
        this.b.post(new Runnable() { // from class: o.bhG
            @Override // java.lang.Runnable
            public final void run() {
                C4582bhI.this.b(j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        d(d());
    }

    public final void b() {
        this.b.post(new Runnable() { // from class: o.bhM
            @Override // java.lang.Runnable
            public final void run() {
                C4582bhI.this.c();
            }
        });
    }

    private AnalyticsListener.EventTime d() {
        return new AnalyticsListener.EventTime(SystemClock.elapsedRealtime(), this.a.getCurrentTimeline(), this.a.getCurrentWindowIndex(), null, this.a.getContentPosition(), this.a.getCurrentTimeline(), this.a.getCurrentWindowIndex(), null, this.a.getCurrentPosition(), this.a.getTotalBufferedDuration());
    }
}
