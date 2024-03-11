package com.netflix.mediaclient.servicemgr;

import androidx.annotation.Keep;
import com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface;
import java.util.Random;
import o.InterfaceC1979aVj;
import o.InterfaceC5090bsG;
import o.aTU;
import o.aTX;

/* loaded from: classes.dex */
public interface IClientLogging {
    public static final long c = new Random().nextLong();

    String a();

    boolean addDataRequest(NetflixDataRequest netflixDataRequest);

    long c();

    InterfaceC5090bsG e();

    String f();

    aTX g();

    aTU h();

    InterfaceC1979aVj j();

    void k();

    void n();

    @Keep
    /* loaded from: classes.dex */
    public enum CompletionReason {
        success,
        canceled,
        failed;

        public static CompletionReason fromImageLoaderReason(InteractiveTrackerInterface.Reason reason) {
            int i = AnonymousClass5.e[reason.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return failed;
                    }
                    throw new IllegalStateException("Invalid image loader reason: " + reason);
                }
                return canceled;
            }
            return success;
        }

        public InteractiveTrackerInterface.Reason toImageLoaderReason() {
            int i = AnonymousClass5.a[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return InteractiveTrackerInterface.Reason.failed;
                    }
                    throw new IllegalStateException("Invalid completion reason: " + this);
                }
                return InteractiveTrackerInterface.Reason.canceled;
            }
            return InteractiveTrackerInterface.Reason.success;
        }
    }

    /* renamed from: com.netflix.mediaclient.servicemgr.IClientLogging$5  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[CompletionReason.values().length];
            a = iArr;
            try {
                iArr[CompletionReason.success.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[CompletionReason.canceled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[CompletionReason.failed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[InteractiveTrackerInterface.Reason.values().length];
            e = iArr2;
            try {
                iArr2[InteractiveTrackerInterface.Reason.success.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[InteractiveTrackerInterface.Reason.canceled.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                e[InteractiveTrackerInterface.Reason.failed.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }
}
