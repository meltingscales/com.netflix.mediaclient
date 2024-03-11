package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C8632dsu;
import o.drM;
import o.dtQ;

/* JADX INFO: Add missing generic type declarations: [R] */
/* loaded from: classes.dex */
public final /* synthetic */ class SequencesKt___SequencesKt$flatMap$2<R> extends FunctionReferenceImpl implements drM<dtQ<? extends R>, Iterator<? extends R>> {
    public static final SequencesKt___SequencesKt$flatMap$2 b = new SequencesKt___SequencesKt$flatMap$2();

    SequencesKt___SequencesKt$flatMap$2() {
        super(1, dtQ.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // o.drM
    /* renamed from: d */
    public final Iterator<R> invoke(dtQ<? extends R> dtq) {
        C8632dsu.c((Object) dtq, "");
        return (Iterator<? extends R>) dtq.iterator();
    }
}
