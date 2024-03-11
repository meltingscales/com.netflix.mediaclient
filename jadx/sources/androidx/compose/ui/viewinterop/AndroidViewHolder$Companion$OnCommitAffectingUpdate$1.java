package androidx.compose.ui.viewinterop;

import android.os.Handler;
import kotlin.jvm.internal.Lambda;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
final class AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 extends Lambda implements drM<AndroidViewHolder, dpR> {
    public static final AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 INSTANCE = new AndroidViewHolder$Companion$OnCommitAffectingUpdate$1();

    AndroidViewHolder$Companion$OnCommitAffectingUpdate$1() {
        super(1);
    }

    @Override // o.drM
    public /* bridge */ /* synthetic */ dpR invoke(AndroidViewHolder androidViewHolder) {
        invoke2(androidViewHolder);
        return dpR.c;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AndroidViewHolder androidViewHolder) {
        final drO dro;
        Handler handler = androidViewHolder.getHandler();
        dro = androidViewHolder.runUpdate;
        handler.post(new Runnable() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$Companion$OnCommitAffectingUpdate$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                drO.this.invoke();
            }
        });
    }
}
