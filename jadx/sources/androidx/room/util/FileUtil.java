package androidx.room.util;

import android.annotation.SuppressLint;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class FileUtil {
    @SuppressLint({"LambdaLast"})
    public static final void copy(ReadableByteChannel readableByteChannel, FileChannel fileChannel) {
        C8632dsu.c((Object) readableByteChannel, "");
        C8632dsu.c((Object) fileChannel, "");
        try {
            fileChannel.transferFrom(readableByteChannel, 0L, Long.MAX_VALUE);
            fileChannel.force(false);
        } finally {
            readableByteChannel.close();
            fileChannel.close();
        }
    }
}
