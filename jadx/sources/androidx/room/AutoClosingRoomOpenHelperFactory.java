package androidx.room;

import androidx.sqlite.db.SupportSQLiteOpenHelper;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class AutoClosingRoomOpenHelperFactory implements SupportSQLiteOpenHelper.Factory {
    private final AutoCloser autoCloser;
    private final SupportSQLiteOpenHelper.Factory delegate;

    public AutoClosingRoomOpenHelperFactory(SupportSQLiteOpenHelper.Factory factory, AutoCloser autoCloser) {
        C8632dsu.c((Object) factory, "");
        C8632dsu.c((Object) autoCloser, "");
        this.delegate = factory;
        this.autoCloser = autoCloser;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public AutoClosingRoomOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
        C8632dsu.c((Object) configuration, "");
        return new AutoClosingRoomOpenHelper(this.delegate.create(configuration), this.autoCloser);
    }
}
