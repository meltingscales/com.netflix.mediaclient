package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.tasks.Tasks;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* loaded from: classes5.dex */
final class bu {
    private final com.google.android.play.core.assetpacks.internal.aq a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bu(com.google.android.play.core.assetpacks.internal.aq aqVar) {
        this.a = aqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final InputStream a(int i, String str, String str2, int i2) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) Tasks.await(((y) this.a.a()).a(i, str, str2, i2));
            if (parcelFileDescriptor == null || parcelFileDescriptor.getFileDescriptor() == null) {
                throw new ck(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i), str, str2, Integer.valueOf(i2)), i);
            }
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        } catch (InterruptedException e) {
            throw new ck("Extractor was interrupted while waiting for chunk file.", e, i);
        } catch (ExecutionException e2) {
            throw new ck(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i), str, str2, Integer.valueOf(i2)), e2, i);
        }
    }
}
