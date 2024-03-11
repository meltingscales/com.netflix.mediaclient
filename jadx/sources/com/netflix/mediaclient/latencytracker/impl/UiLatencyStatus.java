package com.netflix.mediaclient.latencytracker.impl;

import com.netflix.cl.model.NetflixTraceStatus;
import com.netflix.mediaclient.acquisition.components.faq.FaqViewModel;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import kotlin.NoWhenBranchMatchedException;
import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class UiLatencyStatus {
    private static final /* synthetic */ UiLatencyStatus[] a;
    private static final /* synthetic */ InterfaceC8598drn c;
    private final IClientLogging.CompletionReason f;
    private final String g;
    public static final UiLatencyStatus e = new UiLatencyStatus("SUCCESS", 0, "success", IClientLogging.CompletionReason.success);
    public static final UiLatencyStatus d = new UiLatencyStatus("FAILURE", 1, "failure", IClientLogging.CompletionReason.failed);
    public static final UiLatencyStatus b = new UiLatencyStatus("CANCEL", 2, FaqViewModel.ITEM_ID_CANCEL, IClientLogging.CompletionReason.canceled);

    /* loaded from: classes3.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[UiLatencyStatus.values().length];
            try {
                iArr[UiLatencyStatus.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UiLatencyStatus.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UiLatencyStatus.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            e = iArr;
        }
    }

    private static final /* synthetic */ UiLatencyStatus[] b() {
        return new UiLatencyStatus[]{e, d, b};
    }

    public static UiLatencyStatus valueOf(String str) {
        return (UiLatencyStatus) Enum.valueOf(UiLatencyStatus.class, str);
    }

    public static UiLatencyStatus[] values() {
        return (UiLatencyStatus[]) a.clone();
    }

    public final IClientLogging.CompletionReason c() {
        return this.f;
    }

    public final String d() {
        return this.g;
    }

    private UiLatencyStatus(String str, int i, String str2, IClientLogging.CompletionReason completionReason) {
        this.g = str2;
        this.f = completionReason;
    }

    static {
        UiLatencyStatus[] b2 = b();
        a = b2;
        c = C8600drp.e(b2);
    }

    public final NetflixTraceStatus e() {
        int i = a.e[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return NetflixTraceStatus.cancel;
                }
                throw new NoWhenBranchMatchedException();
            }
            return NetflixTraceStatus.fail;
        }
        return NetflixTraceStatus.success;
    }
}
