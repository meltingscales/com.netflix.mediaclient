package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.LocalTestingException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.do  reason: invalid class name */
/* loaded from: classes5.dex */
public final class Cdo implements y {
    private static final com.google.android.play.core.assetpacks.internal.o a = new com.google.android.play.core.assetpacks.internal.o("FakeAssetPackService");
    private static final AtomicInteger b = new AtomicInteger(1);
    private final String c;
    private final bb d;
    private final co e;
    private final Context f;
    private final ed g;
    private final eb h;
    private final Handler i = new Handler(Looper.getMainLooper());
    private final com.google.android.play.core.assetpacks.internal.aq j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Cdo(File file, bb bbVar, co coVar, Context context, ed edVar, com.google.android.play.core.assetpacks.internal.aq aqVar, eb ebVar) {
        this.c = file.getAbsolutePath();
        this.d = bbVar;
        this.e = coVar;
        this.f = context;
        this.g = edVar;
        this.j = aqVar;
        this.h = ebVar;
    }

    static long k(int i, long j) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return j;
            }
            return 0L;
        }
        return j / 2;
    }

    private final Bundle p(int i, String str, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.g.a());
        bundle.putInt("session_id", i);
        File[] s = s(str);
        ArrayList<String> arrayList = new ArrayList<>();
        long j = 0;
        for (File file : s) {
            j += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(i2 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String a2 = com.google.android.play.core.assetpacks.internal.ak.a(file);
            bundle.putParcelableArrayList(com.google.android.play.core.assetpacks.model.b.b("chunk_intents", str, a2), arrayList2);
            bundle.putString(com.google.android.play.core.assetpacks.model.b.b("uncompressed_hash_sha256", str, a2), r(file));
            bundle.putLong(com.google.android.play.core.assetpacks.model.b.b("uncompressed_size", str, a2), file.length());
            arrayList.add(a2);
        }
        bundle.putStringArrayList(com.google.android.play.core.assetpacks.model.b.a("slice_ids", str), arrayList);
        bundle.putLong(com.google.android.play.core.assetpacks.model.b.a("pack_version", str), this.g.a());
        bundle.putInt(com.google.android.play.core.assetpacks.model.b.a("status", str), i2);
        bundle.putInt(com.google.android.play.core.assetpacks.model.b.a("error_code", str), 0);
        bundle.putLong(com.google.android.play.core.assetpacks.model.b.a("bytes_downloaded", str), k(i2, j));
        bundle.putLong(com.google.android.play.core.assetpacks.model.b.a("total_bytes_to_download", str), j);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", k(i2, j));
        bundle.putLong("total_bytes_to_download", j);
        final Intent putExtra = new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle);
        this.i.post(new Runnable() { // from class: com.google.android.play.core.assetpacks.dm
            @Override // java.lang.Runnable
            public final void run() {
                Cdo.this.l(putExtra);
            }
        });
        return bundle;
    }

    private static String r(File file) {
        try {
            return dq.a(Arrays.asList(file));
        } catch (IOException e) {
            throw new LocalTestingException(String.format("Could not digest file: %s.", file), e);
        } catch (NoSuchAlgorithmException e2) {
            throw new LocalTestingException("SHA256 algorithm not supported.", e2);
        }
    }

    private final File[] s(final String str) {
        File file = new File(this.c);
        if (!file.isDirectory()) {
            throw new LocalTestingException(String.format("Local testing directory '%s' not found.", file));
        }
        File[] listFiles = file.listFiles(new FilenameFilter() { // from class: com.google.android.play.core.assetpacks.dl
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str2) {
                return str2.startsWith(String.valueOf(str).concat("-")) && str2.endsWith(".apk");
            }
        });
        if (listFiles != null) {
            if (listFiles.length != 0) {
                for (File file2 : listFiles) {
                    if (com.google.android.play.core.assetpacks.internal.ak.a(file2).equals(str)) {
                        return listFiles;
                    }
                }
                throw new LocalTestingException(String.format("No main slice available for pack '%s'.", str));
            }
            throw new LocalTestingException(String.format("No APKs available for pack '%s'.", str));
        }
        throw new LocalTestingException(String.format("Failed fetching APKs for pack '%s'.", str));
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final Task a(int i, String str, String str2, int i2) {
        File[] s;
        int i3;
        a.d("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i), str, str2, Integer.valueOf(i2));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        try {
        } catch (LocalTestingException e) {
            a.e("getChunkFileDescriptor failed", e);
            taskCompletionSource.setException(e);
        } catch (FileNotFoundException e2) {
            a.e("getChunkFileDescriptor failed", e2);
            taskCompletionSource.setException(new LocalTestingException("Asset Slice file not found.", e2));
        }
        for (File file : s(str)) {
            if (com.google.android.play.core.assetpacks.internal.ak.a(file).equals(str2)) {
                taskCompletionSource.setResult(ParcelFileDescriptor.open(file, 268435456));
                return taskCompletionSource.getTask();
            }
        }
        throw new LocalTestingException(String.format("Local testing slice for '%s' not found.", str2));
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final Task d(Map map) {
        a.d("syncPacks()", new Object[0]);
        return Tasks.forResult(new ArrayList());
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final void e(List list) {
        a.d("cancelDownload(%s)", list);
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final void f() {
        a.d("keepAlive", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final void g(int i, String str, String str2, int i2) {
        a.d("notifyChunkTransferred", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final void h(final int i, final String str) {
        a.d("notifyModuleCompleted", new Object[0]);
        ((Executor) this.j.a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.dn
            @Override // java.lang.Runnable
            public final void run() {
                Cdo.this.n(i, str);
            }
        });
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final void i(int i) {
        a.d("notifySessionFailed", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void l(Intent intent) {
        this.d.c(this.f, intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void n(int i, String str) {
        try {
            p(i, str, 4);
        } catch (LocalTestingException e) {
            a.e("notifyModuleCompleted failed", e);
        }
    }
}
