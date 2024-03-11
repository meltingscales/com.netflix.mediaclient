package o;

import android.os.ConditionVariable;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class aFO<T> {
    private static final e a = new e(null);
    private final AtomicReference<T> b;
    private final drM<String, T> c;
    private final Provider<T> d;
    private final drM<T, String> e;
    private final ConditionVariable f;
    private final drM<Throwable, T> g;
    private final InterfaceC8554dpx i;
    private final dBK j;

    /* JADX WARN: Multi-variable type inference failed */
    public aFO(final Provider<File> provider, drM<? super T, String> drm, drM<? super String, ? extends T> drm2, Provider<T> provider2, drM<? super Throwable, ? extends T> drm3) {
        InterfaceC8554dpx b;
        C8632dsu.c((Object) provider, "");
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) drm2, "");
        C8632dsu.c((Object) provider2, "");
        C8632dsu.c((Object) drm3, "");
        this.e = drm;
        this.c = drm2;
        this.d = provider2;
        this.g = drm3;
        this.b = new AtomicReference<>();
        this.f = new ConditionVariable(true);
        b = dpB.b(new drO<File>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.JsonDataStore$fileName$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final File invoke() {
                return provider.get();
            }
        });
        this.i = b;
        this.j = dBL.d(false, 1, null);
    }

    private final File c() {
        return (File) this.i.getValue();
    }

    public final boolean a() {
        return this.b.get() != null;
    }

    public final T d() {
        T t = this.b.get();
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Not Loaded".toString());
    }

    public final void e() {
        a(false);
    }

    public final void b() {
        a(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0033, B:28:0x0083, B:30:0x0089, B:33:0x008f), top: B:42:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f A[Catch: all -> 0x0037, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0033, B:28:0x0083, B:30:0x0089, B:33:0x008f), top: B:42:0x0033 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(o.drX<? super T, ? super o.InterfaceC8585dra<? super T>, ? extends java.lang.Object> r7, o.InterfaceC8585dra<? super o.dpR> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.netflix.mediaclient.hendrixconfig.impl.JsonDataStore$updateData$1
            if (r0 == 0) goto L13
            r0 = r8
            com.netflix.mediaclient.hendrixconfig.impl.JsonDataStore$updateData$1 r0 = (com.netflix.mediaclient.hendrixconfig.impl.JsonDataStore$updateData$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.d = r1
            goto L18
        L13:
            com.netflix.mediaclient.hendrixconfig.impl.JsonDataStore$updateData$1 r0 = new com.netflix.mediaclient.hendrixconfig.impl.JsonDataStore$updateData$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L54
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = r0.e
            o.dBK r1 = (o.dBK) r1
            java.lang.Object r0 = r0.c
            o.aFO r0 = (o.aFO) r0
            o.C8556dpz.d(r8)     // Catch: java.lang.Throwable -> L37
            goto L83
        L37:
            r7 = move-exception
            goto La5
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L42:
            java.lang.Object r7 = r0.a
            o.dBK r7 = (o.dBK) r7
            java.lang.Object r2 = r0.e
            o.drX r2 = (o.drX) r2
            java.lang.Object r4 = r0.c
            o.aFO r4 = (o.aFO) r4
            o.C8556dpz.d(r8)
            r8 = r7
            r7 = r2
            goto L6c
        L54:
            o.C8556dpz.d(r8)
            r6.b()
            o.dBK r8 = r6.j
            r0.c = r6
            r0.e = r7
            r0.a = r8
            r0.d = r4
            java.lang.Object r2 = r8.a(r5, r0)
            if (r2 != r1) goto L6b
            return r1
        L6b:
            r4 = r6
        L6c:
            java.lang.Object r2 = r4.d()     // Catch: java.lang.Throwable -> La7
            r0.c = r4     // Catch: java.lang.Throwable -> La7
            r0.e = r8     // Catch: java.lang.Throwable -> La7
            r0.a = r2     // Catch: java.lang.Throwable -> La7
            r0.d = r3     // Catch: java.lang.Throwable -> La7
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> La7
            if (r7 != r1) goto L7f
            return r1
        L7f:
            r1 = r8
            r0 = r4
            r8 = r7
            r7 = r2
        L83:
            boolean r7 = o.C8632dsu.c(r7, r8)     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L8f
            o.dpR r7 = o.dpR.c     // Catch: java.lang.Throwable -> L37
            r1.d(r5)
            return r7
        L8f:
            o.drM<T, java.lang.String> r7 = r0.e     // Catch: java.lang.Throwable -> L37
            java.lang.Object r7 = r7.invoke(r8)     // Catch: java.lang.Throwable -> L37
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L37
            r0.a(r7)     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.atomic.AtomicReference<T> r7 = r0.b     // Catch: java.lang.Throwable -> L37
            r7.set(r8)     // Catch: java.lang.Throwable -> L37
            o.dpR r7 = o.dpR.c     // Catch: java.lang.Throwable -> L37
            r1.d(r5)
            return r7
        La5:
            r8 = r1
            goto La8
        La7:
            r7 = move-exception
        La8:
            r8.d(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aFO.b(o.drX, o.dra):java.lang.Object");
    }

    private final void a(boolean z) {
        if (a()) {
            return;
        }
        synchronized (this.b) {
            this.f.block();
            if (a()) {
                return;
            }
            a aVar = new a(this);
            this.f.close();
            aVar.start();
            if (z) {
                this.f.block();
            }
            dpR dpr = dpR.c;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a extends Thread {
        final /* synthetic */ aFO<T> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(aFO<T> afo) {
            super("JsonDataStoreLoader");
            this.c = afo;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            try {
                Object j = this.c.j();
                if (j == null) {
                    j = ((aFO) this.c).d.get();
                }
                ((aFO) this.c).b.set(j);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T j() {
        if (!c().exists()) {
            return null;
        }
        File c = c();
        C8632dsu.a(c, "");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(c), C8674dui.i);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            T invoke = this.c.invoke(drJ.e((Reader) bufferedReader));
            C8608drx.a(bufferedReader, null);
            return invoke;
        } finally {
        }
    }

    private final void a(String str) {
        File parentFile = c().getParentFile();
        if (parentFile == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        if (!parentFile.mkdirs() && !parentFile.isDirectory()) {
            throw new IOException("Could not create parent directory");
        }
        String name = c().getName();
        File file = new File(parentFile, name + ".tmp");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), C8674dui.i);
        BufferedWriter bufferedWriter = outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
        try {
            bufferedWriter.write(str);
            dpR dpr = dpR.c;
            C8608drx.a(bufferedWriter, null);
            if (!file.renameTo(c())) {
                throw new IOException("Could not write data");
            }
        } finally {
        }
    }

    /* loaded from: classes3.dex */
    static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("JsonDataStore");
        }
    }
}
