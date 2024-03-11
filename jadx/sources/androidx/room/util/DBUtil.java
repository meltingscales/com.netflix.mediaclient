package androidx.room.util;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import o.C8566dqi;
import o.C8608drx;
import o.C8632dsu;
import o.C8691duz;
import o.dpR;

/* loaded from: classes2.dex */
public final class DBUtil {
    public static final Cursor query(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, boolean z, CancellationSignal cancellationSignal) {
        C8632dsu.c((Object) roomDatabase, "");
        C8632dsu.c((Object) supportSQLiteQuery, "");
        Cursor query = roomDatabase.query(supportSQLiteQuery, cancellationSignal);
        if (z && (query instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) query;
            int count = abstractWindowedCursor.getCount();
            return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? CursorUtil.copyAndClose(query) : query;
        }
        return query;
    }

    public static final void dropFtsSyncTriggers(SupportSQLiteDatabase supportSQLiteDatabase) {
        List a;
        List<String> o2;
        boolean i;
        C8632dsu.c((Object) supportSQLiteDatabase, "");
        a = C8566dqi.a();
        Cursor query = supportSQLiteDatabase.query("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (query.moveToNext()) {
            try {
                a.add(query.getString(0));
            } finally {
            }
        }
        dpR dpr = dpR.c;
        C8608drx.a(query, null);
        o2 = C8566dqi.o(a);
        for (String str : o2) {
            C8632dsu.a(str, "");
            i = C8691duz.i(str, "room_fts_content_sync_", false, 2, null);
            if (i) {
                supportSQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static final int readVersion(File file) {
        C8632dsu.c((Object) file, "");
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            allocate.rewind();
            int i = allocate.getInt();
            C8608drx.a(channel, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C8608drx.a(channel, th);
                throw th2;
            }
        }
    }

    public static final CancellationSignal createCancellationSignal() {
        return SupportSQLiteCompat.Api16Impl.createCancellationSignal();
    }
}
