package androidx.room;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class AutoCloser {
    public static final Companion Companion = new Companion(null);
    private long autoCloseTimeoutInMs;
    private final Runnable autoCloser;
    private SupportSQLiteDatabase delegateDatabase;
    public SupportSQLiteOpenHelper delegateOpenHelper;
    private final Runnable executeAutoCloser;
    private final Executor executor;
    private final Handler handler;
    private long lastDecrementRefCountTimeStamp;
    private final Object lock;
    private boolean manuallyClosed;
    private Runnable onAutoCloseCallback;
    private int refCount;

    public final SupportSQLiteDatabase getDelegateDatabase$room_runtime_release() {
        return this.delegateDatabase;
    }

    public final void setAutoCloseCallback(Runnable runnable) {
        C8632dsu.c((Object) runnable, "");
        this.onAutoCloseCallback = runnable;
    }

    public final void setDelegateOpenHelper(SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        C8632dsu.c((Object) supportSQLiteOpenHelper, "");
        this.delegateOpenHelper = supportSQLiteOpenHelper;
    }

    public AutoCloser(long j, TimeUnit timeUnit, Executor executor) {
        C8632dsu.c((Object) timeUnit, "");
        C8632dsu.c((Object) executor, "");
        this.handler = new Handler(Looper.getMainLooper());
        this.lock = new Object();
        this.autoCloseTimeoutInMs = timeUnit.toMillis(j);
        this.executor = executor;
        this.lastDecrementRefCountTimeStamp = SystemClock.uptimeMillis();
        this.executeAutoCloser = new Runnable() { // from class: androidx.room.AutoCloser$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AutoCloser.executeAutoCloser$lambda$0(AutoCloser.this);
            }
        };
        this.autoCloser = new Runnable() { // from class: androidx.room.AutoCloser$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AutoCloser.autoCloser$lambda$3(AutoCloser.this);
            }
        };
    }

    public final SupportSQLiteOpenHelper getDelegateOpenHelper() {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.delegateOpenHelper;
        if (supportSQLiteOpenHelper != null) {
            return supportSQLiteOpenHelper;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeAutoCloser$lambda$0(AutoCloser autoCloser) {
        C8632dsu.c((Object) autoCloser, "");
        autoCloser.executor.execute(autoCloser.autoCloser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void autoCloser$lambda$3(AutoCloser autoCloser) {
        dpR dpr;
        C8632dsu.c((Object) autoCloser, "");
        synchronized (autoCloser.lock) {
            if (SystemClock.uptimeMillis() - autoCloser.lastDecrementRefCountTimeStamp < autoCloser.autoCloseTimeoutInMs) {
                return;
            }
            if (autoCloser.refCount != 0) {
                return;
            }
            Runnable runnable = autoCloser.onAutoCloseCallback;
            if (runnable != null) {
                runnable.run();
                dpr = dpR.c;
            } else {
                dpr = null;
            }
            if (dpr == null) {
                throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568".toString());
            }
            SupportSQLiteDatabase supportSQLiteDatabase = autoCloser.delegateDatabase;
            if (supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen()) {
                supportSQLiteDatabase.close();
            }
            autoCloser.delegateDatabase = null;
            dpR dpr2 = dpR.c;
        }
    }

    public final void init(SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        C8632dsu.c((Object) supportSQLiteOpenHelper, "");
        setDelegateOpenHelper(supportSQLiteOpenHelper);
    }

    public final <V> V executeRefCountingFunction(drM<? super SupportSQLiteDatabase, ? extends V> drm) {
        C8632dsu.c((Object) drm, "");
        try {
            return drm.invoke(incrementCountAndEnsureDbIsOpen());
        } finally {
            decrementCountAndScheduleClose();
        }
    }

    public final SupportSQLiteDatabase incrementCountAndEnsureDbIsOpen() {
        synchronized (this.lock) {
            this.handler.removeCallbacks(this.executeAutoCloser);
            this.refCount++;
            if (!(!this.manuallyClosed)) {
                throw new IllegalStateException("Attempting to open already closed database.".toString());
            }
            SupportSQLiteDatabase supportSQLiteDatabase = this.delegateDatabase;
            if (supportSQLiteDatabase == null || !supportSQLiteDatabase.isOpen()) {
                SupportSQLiteDatabase writableDatabase = getDelegateOpenHelper().getWritableDatabase();
                this.delegateDatabase = writableDatabase;
                return writableDatabase;
            }
            return supportSQLiteDatabase;
        }
    }

    public final void decrementCountAndScheduleClose() {
        synchronized (this.lock) {
            int i = this.refCount;
            if (i <= 0) {
                throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement".toString());
            }
            int i2 = i - 1;
            this.refCount = i2;
            if (i2 == 0) {
                if (this.delegateDatabase == null) {
                    return;
                }
                this.handler.postDelayed(this.executeAutoCloser, this.autoCloseTimeoutInMs);
            }
            dpR dpr = dpR.c;
        }
    }

    public final void closeDatabaseIfOpen() {
        synchronized (this.lock) {
            this.manuallyClosed = true;
            SupportSQLiteDatabase supportSQLiteDatabase = this.delegateDatabase;
            if (supportSQLiteDatabase != null) {
                supportSQLiteDatabase.close();
            }
            this.delegateDatabase = null;
            dpR dpr = dpR.c;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }
}
