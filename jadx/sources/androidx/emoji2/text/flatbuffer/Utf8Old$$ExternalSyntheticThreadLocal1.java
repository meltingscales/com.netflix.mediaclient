package androidx.emoji2.text.flatbuffer;

import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class Utf8Old$$ExternalSyntheticThreadLocal1 extends ThreadLocal {
    public final /* synthetic */ Supplier initialValueSupplier;

    @Override // java.lang.ThreadLocal
    protected /* synthetic */ Object initialValue() {
        return this.initialValueSupplier.get();
    }
}
