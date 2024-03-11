package o;

import android.content.Context;
import com.google.android.gms.auth.blockstore.BlockstoreClient;
import com.netflix.mediaclient.util.BlockStoreClientModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
/* renamed from: o.ddV  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8072ddV implements Factory<BlockstoreClient> {
    private final BlockStoreClientModule b;
    private final Provider<Context> c;

    @Override // javax.inject.Provider
    /* renamed from: e */
    public BlockstoreClient get() {
        return b(this.b, this.c.get());
    }

    public static BlockstoreClient b(BlockStoreClientModule blockStoreClientModule, Context context) {
        return (BlockstoreClient) Preconditions.checkNotNullFromProvides(blockStoreClientModule.d(context));
    }
}
