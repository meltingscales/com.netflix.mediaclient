package com.netflix.mediaclient.ui.messaging.impl;

import android.content.Context;
import com.airbnb.epoxy.TypedEpoxyController;
import o.AbstractC6677chn;
import o.C6651chN;
import o.C8632dsu;
import o.bJH;
import o.dpR;

/* loaded from: classes4.dex */
public final class MessagingEpoxyController extends TypedEpoxyController<C6651chN> {
    public static final int $stable = 8;
    private final Context context;

    public MessagingEpoxyController(Context context) {
        C8632dsu.c((Object) context, "");
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(C6651chN c6651chN) {
        AbstractC6677chn e;
        if (c6651chN == null || (e = c6651chN.e()) == null) {
            return;
        }
        bJH.c(e, this, this.context, dpR.c);
    }
}
