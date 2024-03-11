package com.netflix.mediaclient.media;

import android.content.Context;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.storage.db.OfflineDatabase;
import com.netflix.model.leafs.Bookmark;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import o.C1044Mm;
import o.C1531aEt;
import o.C1596aHd;
import o.C5096bsM;
import o.C5290bvv;
import o.C5328bwg;
import o.C8106deC;
import o.C8118deO;
import o.C8141del;
import o.C8157dfA;
import o.C8168dfL;
import o.C8329diN;
import o.InterfaceC1597aHe;
import o.InterfaceC1598aHf;
import o.InterfaceC5160btX;
import o.InterfaceC5198buI;
import o.InterfaceC5283bvo;

/* loaded from: classes.dex */
public class BookmarkStoreRoom implements BookmarkStore {
    private static final int MAX_BOOKMARKS_PER_PROFILE = 100;
    private static final String TAG = "nf_bookmarkRoom";
    private final C5290bvv mBookmarkRepo;
    private File mBookmarkStoreFile;
    public Context mContext;
    private final OfflineDatabase mOfflineDatabase;
    private BookmarkData mBookmarkData = new BookmarkData();
    private final AtomicBoolean mInitDone = new AtomicBoolean(false);

    @Inject
    public BookmarkStoreRoom(@ApplicationContext Context context) {
        OfflineDatabase c = OfflineDatabase.d.c(context);
        this.mOfflineDatabase = c;
        this.mBookmarkRepo = C5290bvv.e.a(c);
    }

    @Override // com.netflix.mediaclient.media.BookmarkStore
    public boolean init(Context context) {
        if (this.mInitDone.getAndSet(true)) {
            return true;
        }
        if (C8141del.a()) {
            this.mContext = context;
            return true;
        }
        return doInit(context);
    }

    private boolean doInit(final Context context) {
        File file = new File(context.getFilesDir() + "/bookmarkStore.json");
        this.mBookmarkStoreFile = file;
        if (file.exists()) {
            this.mOfflineDatabase.C().execute(new Runnable() { // from class: com.netflix.mediaclient.media.BookmarkStoreRoom$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    BookmarkStoreRoom.this.lambda$doInit$0(context);
                }
            });
        } else {
            try {
                List<C5328bwg> a = this.mBookmarkRepo.a();
                C8157dfA.a(context, "db_exception_count", 0);
                for (C5328bwg c5328bwg : a) {
                    ensureEntryForProfile(c5328bwg.c()).put(c5328bwg.b(), new C5096bsM(c5328bwg.a(), c5328bwg.d(), c5328bwg.b()));
                }
                this.mContext = context;
            } catch (Exception e) {
                OfflineDatabase.d.a(context, e);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doInit$0(Context context) {
        synchronized (BookmarkStoreRoom.class) {
            try {
                if (this.mBookmarkStoreFile.exists()) {
                    this.mBookmarkData = (BookmarkData) C8118deO.a().fromJson(C8168dfL.d(C8106deC.j(this.mBookmarkStoreFile), "utf-8"), (Class<Object>) BookmarkData.class);
                }
            } catch (Exception e) {
                C1044Mm.b(TAG, e, "init error", new Object[0]);
                InterfaceC1598aHf.a(new C1596aHd().d(e));
            }
            BookmarkData bookmarkData = this.mBookmarkData;
            if (bookmarkData == null || bookmarkData.mBookmarkMap == null) {
                BookmarkData bookmarkData2 = new BookmarkData();
                this.mBookmarkData = bookmarkData2;
                bookmarkData2.mBookmarkMap = new HashMap();
            }
            this.mContext = context;
            BookmarkUtil.INSTANCE.migrateDataToRoom(this.mBookmarkRepo, this.mBookmarkData.mBookmarkMap);
            this.mBookmarkStoreFile.delete();
        }
    }

    @Override // com.netflix.mediaclient.media.BookmarkStore
    public void updateValidProfiles(List<? extends InterfaceC5283bvo> list) {
        BookmarkData bookmarkData;
        synchronized (this) {
            if (this.mContext == null) {
                return;
            }
            if (list != null && list.size() > 0 && (bookmarkData = this.mBookmarkData) != null && bookmarkData.mBookmarkMap != null) {
                ArrayList<String> arrayList = new ArrayList();
                for (Map.Entry<String, Map<String, C5096bsM>> entry : this.mBookmarkData.mBookmarkMap.entrySet()) {
                    if (!isProfileStillValid(entry.getKey(), list)) {
                        arrayList.add(entry.getKey());
                    }
                }
                for (String str : arrayList) {
                    this.mBookmarkData.mBookmarkMap.remove(str);
                }
                this.mBookmarkRepo.b(arrayList);
            }
        }
    }

    @Override // com.netflix.mediaclient.media.BookmarkStore
    public void setBookmark(String str, C5096bsM c5096bsM) {
        String str2;
        synchronized (this) {
            if (this.mContext == null) {
                return;
            }
            if (str != null && c5096bsM != null && (str2 = c5096bsM.b) != null) {
                C1044Mm.c(TAG, "setBookmark videoId=%s, bookmarkTimeInMilliSeconds=%d", str2, Long.valueOf(c5096bsM.c));
                Map<String, C5096bsM> ensureEntryForProfile = ensureEntryForProfile(str);
                ensureEntryForProfile.put(c5096bsM.b, c5096bsM);
                try {
                    this.mBookmarkRepo.b(new C5328bwg(c5096bsM.b, str, c5096bsM.c, c5096bsM.a));
                } catch (Exception e) {
                    InterfaceC1598aHf.a(new C1596aHd().d(e));
                }
                trimSizeIfNeeded(str, ensureEntryForProfile);
                return;
            }
            C1044Mm.d(TAG, "setBookmark not valid data");
        }
    }

    @Override // com.netflix.mediaclient.media.BookmarkStore
    public C5096bsM getBookmark(String str, String str2) {
        synchronized (this) {
            if (this.mContext == null) {
                return null;
            }
            Map<String, C5096bsM> map = this.mBookmarkData.mBookmarkMap.get(str);
            if (map == null) {
                return null;
            }
            return map.get(str2);
        }
    }

    @Override // com.netflix.mediaclient.media.BookmarkStore
    public void onPlayablesFetched(List<? extends InterfaceC5160btX> list, String str) {
        synchronized (this) {
            if (this.mContext != null && list != null && str != null) {
                Map<String, C5096bsM> ensureEntryForProfile = ensureEntryForProfile(str);
                ArrayList arrayList = new ArrayList();
                for (InterfaceC5160btX interfaceC5160btX : list) {
                    String aH_ = interfaceC5160btX.aH_();
                    if (aH_ != null) {
                        C5096bsM bookmark = getBookmark(str, aH_);
                        if (bookmark == null) {
                            C1044Mm.a(TAG, "got a new bookmark");
                        } else {
                            long seconds = TimeUnit.MILLISECONDS.toSeconds(bookmark.a - interfaceC5160btX.aG_());
                            C1044Mm.c(TAG, "bookMarkStoreTimeIsNewBySeconds=%d", Long.valueOf(seconds));
                            if (seconds < 0) {
                            }
                        }
                        ensureEntryForProfile.put(aH_, new C5096bsM((int) interfaceC5160btX.aF_(), interfaceC5160btX.aG_(), aH_));
                        arrayList.add(new C5328bwg(aH_, str, (int) interfaceC5160btX.aF_(), interfaceC5160btX.aG_()));
                    }
                }
                try {
                    this.mBookmarkRepo.d(arrayList);
                } catch (Exception e) {
                    InterfaceC1598aHf.a(new C1596aHd().d(e));
                }
            }
        }
    }

    @Override // com.netflix.mediaclient.media.BookmarkStore
    public void createOrUpdateBookmark(InterfaceC5198buI interfaceC5198buI, String str) {
        if (interfaceC5198buI == null || this.mContext == null) {
            return;
        }
        InterfaceC5160btX aE_ = interfaceC5198buI.aE_();
        Bookmark bookmark = null;
        C8329diN c8329diN = aE_ instanceof C8329diN ? (C8329diN) aE_ : null;
        if (c8329diN != null) {
            bookmark = c8329diN.aC();
        } else if (!(aE_ instanceof C1531aEt)) {
            InterfaceC1597aHe.e("SPY-32723 - Unable to get bookmark for video. ");
        }
        long bookmarkPositionMs = bookmark != null ? bookmark.getBookmarkPositionMs() : aE_.aF_();
        long aG_ = aE_.aG_();
        String aH_ = aE_.aH_();
        if (aH_ == null) {
            C1044Mm.d(TAG, "Unable to createOrUpdateBookmark on a null playableId");
            return;
        }
        C5096bsM bookmark2 = getBookmark(str, aH_);
        if (bookmark2 == null) {
            C1044Mm.a(TAG, "createOrUpdateBookmark bookmarkStore has no bookmark");
        } else if (bookmark2.a < aG_) {
            C1044Mm.a(TAG, "createOrUpdateBookmark bookmarkStore is older");
        } else {
            C1044Mm.a(TAG, "createOrUpdateBookmark bookmarkStore is newer");
            return;
        }
        C1044Mm.c(TAG, "createOrUpdateBookmark calling BookmarkStore.setBookmark time=%d", Long.valueOf(bookmarkPositionMs));
        setBookmark(str, new C5096bsM(bookmarkPositionMs, aG_, aE_.aH_()));
    }

    @Override // com.netflix.mediaclient.media.BookmarkStore
    public void updateBookmarkIfExists(String str, Bookmark bookmark, String str2) {
        if (str == null || bookmark == null || this.mContext == null) {
            return;
        }
        long bookmarkPositionMs = bookmark.getBookmarkPositionMs();
        long lastModified = bookmark.getLastModified();
        C5096bsM bookmark2 = getBookmark(str2, str);
        if (bookmark2 != null) {
            C1044Mm.c(TAG, "updateBookmarkIfExists playableId=%s falkorBookmarkPosition=%d falkorBookmarkUpdateTime=%d", str, Long.valueOf(bookmarkPositionMs), Long.valueOf(lastModified));
            long j = bookmark2.a;
            if (j < lastModified) {
                C1044Mm.a(TAG, "updateBookmarkIfExists updating");
                setBookmark(str2, new C5096bsM(bookmarkPositionMs, lastModified, str));
                return;
            }
            C1044Mm.c(TAG, "updateBookmarkIfExists storeTime=%d falkorBookmarkUpdateTime=%d", Long.valueOf(j), Long.valueOf(lastModified));
        }
    }

    private void trimSizeIfNeeded(String str, Map<String, C5096bsM> map) {
        String str2 = null;
        if (map.size() > MAX_BOOKMARKS_PER_PROFILE) {
            long j = 2147483647L;
            for (String str3 : map.keySet()) {
                if (map.get(str3).a < j) {
                    j = map.get(str3).a;
                    str2 = str3;
                }
            }
        }
        if (str2 != null) {
            C1044Mm.c(TAG, "trimming videoId %s", str2);
            map.remove(str2);
            this.mBookmarkRepo.a(str2, str);
        }
    }

    private Map<String, C5096bsM> ensureEntryForProfile(String str) {
        if (this.mBookmarkData.mBookmarkMap.get(str) == null) {
            this.mBookmarkData.mBookmarkMap.put(str, new HashMap());
        }
        return this.mBookmarkData.mBookmarkMap.get(str);
    }

    private boolean isProfileStillValid(String str, List<? extends InterfaceC5283bvo> list) {
        for (InterfaceC5283bvo interfaceC5283bvo : list) {
            if (C8168dfL.c(interfaceC5283bvo.getProfileGuid(), str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class BookmarkData {
        @SerializedName("bookmarks")
        public Map<String, Map<String, C5096bsM>> mBookmarkMap;

        private BookmarkData() {
            this.mBookmarkMap = new HashMap();
        }
    }
}
