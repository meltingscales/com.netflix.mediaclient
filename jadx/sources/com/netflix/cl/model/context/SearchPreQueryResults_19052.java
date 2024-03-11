package com.netflix.cl.model.context;

import com.netflix.cl.model.TrackingInfo;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class SearchPreQueryResults_19052 extends DataModel {
    public static final Companion Companion = new Companion(null);
    private static final String CONTEXT_TYPE = CONTEXT_TYPE;
    private static final String CONTEXT_TYPE = CONTEXT_TYPE;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchPreQueryResults_19052(TrackingInfo trackingInfo) {
        super(trackingInfo);
        C8632dsu.d(trackingInfo, "");
        addContextType(CONTEXT_TYPE);
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }
    }
}
