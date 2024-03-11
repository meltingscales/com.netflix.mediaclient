package com.netflix.mediaclient.ui.mdx2;

import android.content.Intent;
import kotlin.jvm.internal.Lambda;
import o.C8632dsu;
import o.dpR;
import o.drX;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class MdxEventProducer$Companion$notifyPlayVideo$1$1 extends Lambda implements drX<String, Intent, dpR> {
    public static final MdxEventProducer$Companion$notifyPlayVideo$1$1 b = new MdxEventProducer$Companion$notifyPlayVideo$1$1();

    MdxEventProducer$Companion$notifyPlayVideo$1$1() {
        super(2);
    }

    @Override // o.drX
    public /* synthetic */ dpR invoke(String str, Intent intent) {
        a(str, intent);
        return dpR.c;
    }

    public final void a(String str, Intent intent) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) intent, "");
        for (MdxEventProducer mdxEventProducer : MdxEventProducer.b) {
            mdxEventProducer.b(str, intent);
        }
    }
}
