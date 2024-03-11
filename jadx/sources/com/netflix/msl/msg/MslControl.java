package com.netflix.msl.msg;

import com.netflix.msl.MslConstants;
import com.netflix.msl.MslCryptoException;
import com.netflix.msl.MslEncodingException;
import com.netflix.msl.MslException;
import com.netflix.msl.MslInternalException;
import com.netflix.msl.msg.MessageContext;
import com.netflix.msl.util.MslContext;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.FileLockInterruptionException;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.spec.SecretKeySpec;
import o.AbstractC8393djy;
import o.AbstractC8399dkd;
import o.AbstractC8409dkn;
import o.AbstractC8411dkp;
import o.AbstractC8412dkq;
import o.AbstractC8420dky;
import o.AbstractC8424dlb;
import o.AbstractC8425dlc;
import o.C8401dkf;
import o.C8404dki;
import o.C8415dkt;
import o.C8416dku;
import o.C8421dkz;
import o.C8435dlm;
import o.InterfaceC8413dkr;
import o.InterfaceC8429dlg;
import o.djD;
import o.djG;
import o.djI;
import o.djK;
import o.djS;
import o.dkA;
import o.dkB;
import o.dkD;
import o.dkE;
import o.dkF;
import o.dkG;
import o.dkH;
import o.dkI;
import o.dkL;
import o.dkM;
import o.dkO;
import o.dkQ;
import o.dkR;
import o.dkS;
import o.dkU;
import o.dkZ;

/* loaded from: classes5.dex */
public class MslControl {
    private final dkH a;
    private final ExecutorService b;
    private final dkO d;
    private final dkD f;
    private dkA e = null;
    private final ConcurrentHashMap<MslContext, BlockingQueue<dkO>> j = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<j, ReadWriteLock> c = new ConcurrentHashMap<>();

    /* loaded from: classes5.dex */
    public enum ApplicationError {
        ENTITY_REJECTED,
        USER_REJECTED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public enum Receive {
        ALWAYS,
        RENEWING,
        NEVER
    }

    /* loaded from: classes5.dex */
    public static class g {
        public final dkE b;
        public final dkI e;

        protected g(dkI dki, dkE dke) {
            this.e = dki;
            this.b = dke;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class j {
        private final dkO c;
        private final MslContext d;

        public j(MslContext mslContext, dkO dko) {
            this.d = mslContext;
            this.c = dko;
        }

        public int hashCode() {
            return this.d.hashCode() ^ this.c.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return this.d.equals(jVar.d) && this.c.equals(jVar.c);
            }
            return false;
        }
    }

    /* loaded from: classes5.dex */
    static class n extends AbstractExecutorService {
        private boolean c;

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j, TimeUnit timeUnit) {
            return false;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            return this.c;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            return this.c;
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            this.c = true;
        }

        private n() {
            this.c = false;
        }

        /* synthetic */ n(AnonymousClass5 anonymousClass5) {
            this();
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.c) {
                throw new RejectedExecutionException("Synchronous executor already shut down.");
            }
            runnable.run();
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            this.c = true;
            return Collections.emptyList();
        }
    }

    /* loaded from: classes5.dex */
    static class b extends MslContext {
        @Override // com.netflix.msl.util.MslContext
        public AbstractC8411dkp c(C8415dkt c8415dkt) {
            return null;
        }

        @Override // com.netflix.msl.util.MslContext
        public C8421dkz c() {
            return null;
        }

        @Override // com.netflix.msl.util.MslContext
        public djK d(djI dji) {
            return null;
        }

        @Override // com.netflix.msl.util.MslContext
        public AbstractC8425dlc e(dkZ dkz) {
            return null;
        }

        @Override // com.netflix.msl.util.MslContext
        public boolean g() {
            return false;
        }

        private b() {
        }

        /* synthetic */ b(AnonymousClass5 anonymousClass5) {
            this();
        }

        /* loaded from: classes5.dex */
        static class e extends AbstractC8399dkd {
            private e() {
            }

            /* synthetic */ e(AnonymousClass5 anonymousClass5) {
                this();
            }

            @Override // o.AbstractC8399dkd
            public C8404dki b(Set<C8404dki> set) {
                return C8404dki.b;
            }

            @Override // o.AbstractC8399dkd
            public AbstractC8409dkn d(InputStream inputStream, C8404dki c8404dki) {
                throw new MslInternalException("DummyMslEncoderFactory.generateTokenizer() not supported.");
            }

            @Override // o.AbstractC8399dkd
            public C8401dkf c(byte[] bArr) {
                throw new MslInternalException("DummyMslEncoderFactory.parseObject() not supported.");
            }

            @Override // o.AbstractC8399dkd
            public byte[] c(C8401dkf c8401dkf, C8404dki c8404dki) {
                throw new MslInternalException("DummyMslEncoderFactory.encodeObject() not supported.");
            }
        }

        @Override // com.netflix.msl.util.MslContext
        public long f() {
            return System.currentTimeMillis();
        }

        @Override // com.netflix.msl.util.MslContext
        public Random j() {
            return new Random();
        }

        @Override // com.netflix.msl.util.MslContext
        public djG a(MslContext.ReauthCode reauthCode) {
            return new djS("dummy");
        }

        @Override // com.netflix.msl.util.MslContext
        public AbstractC8393djy b() {
            return new djD();
        }

        @Override // com.netflix.msl.util.MslContext
        public djI a(String str) {
            return djI.a(str);
        }

        @Override // com.netflix.msl.util.MslContext
        public dkZ e(String str) {
            return dkZ.d(str);
        }

        @Override // com.netflix.msl.util.MslContext
        public dkS i() {
            throw new MslInternalException("Dummy token factory should never actually get used.");
        }

        @Override // com.netflix.msl.util.MslContext
        public C8415dkt b(String str) {
            return C8415dkt.e(str);
        }

        @Override // com.netflix.msl.util.MslContext
        public SortedSet<AbstractC8411dkp> d() {
            return new TreeSet();
        }

        @Override // com.netflix.msl.util.MslContext
        public InterfaceC8429dlg h() {
            return new C8435dlm();
        }

        @Override // com.netflix.msl.util.MslContext
        public AbstractC8399dkd e() {
            return new e(null);
        }
    }

    /* loaded from: classes5.dex */
    static class a implements dkD {
        private a() {
        }

        /* synthetic */ a(AnonymousClass5 anonymousClass5) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    static class c implements MessageContext {
        protected final MessageContext e;

        @Override // com.netflix.msl.msg.MessageContext
        public void e(InterfaceC8413dkr interfaceC8413dkr, InputStream inputStream) {
        }

        protected c(MessageContext messageContext) {
            this.e = messageContext;
        }

        @Override // com.netflix.msl.msg.MessageContext
        public Map<String, AbstractC8393djy> c() {
            return this.e.c();
        }

        @Override // com.netflix.msl.msg.MessageContext
        public String b() {
            return this.e.b();
        }

        @Override // com.netflix.msl.msg.MessageContext
        public boolean g() {
            return this.e.g();
        }

        @Override // com.netflix.msl.msg.MessageContext
        public boolean h() {
            return this.e.h();
        }

        @Override // com.netflix.msl.msg.MessageContext
        public boolean j() {
            return this.e.j();
        }

        @Override // com.netflix.msl.msg.MessageContext
        public boolean l() {
            return this.e.l();
        }

        @Override // com.netflix.msl.msg.MessageContext
        public String i() {
            return this.e.i();
        }

        @Override // com.netflix.msl.msg.MessageContext
        public AbstractC8424dlb d(MessageContext.ReauthCode reauthCode, boolean z, boolean z2) {
            return this.e.d(reauthCode, z, z2);
        }

        @Override // com.netflix.msl.msg.MessageContext
        public dkR f() {
            return this.e.f();
        }

        @Override // com.netflix.msl.msg.MessageContext
        public Set<AbstractC8412dkq> a() {
            return this.e.a();
        }

        @Override // com.netflix.msl.msg.MessageContext
        public void c(dkL dkl, boolean z) {
            this.e.c(dkl, z);
        }

        @Override // com.netflix.msl.msg.MessageContext
        public void e(dkE dke) {
            this.e.e(dke);
        }

        @Override // com.netflix.msl.msg.MessageContext
        public dkF e() {
            return this.e.e();
        }

        @Override // com.netflix.msl.msg.MessageContext
        public boolean k() {
            return this.e.k();
        }

        @Override // com.netflix.msl.msg.MessageContext
        public boolean n() {
            return this.e.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class f extends c {
        private final List<dkM> a;

        public f(List<dkM> list, MessageContext messageContext) {
            super(messageContext);
            this.a = list;
        }

        @Override // com.netflix.msl.msg.MslControl.c, com.netflix.msl.msg.MessageContext
        public void e(dkE dke) {
            List<dkM> list = this.a;
            if (list == null || list.isEmpty()) {
                this.e.e(dke);
                return;
            }
            for (dkM dkm : this.a) {
                dke.a(dkm.e());
                dke.write(dkm.d());
                if (dkm.c()) {
                    dke.close();
                } else {
                    dke.flush();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class d extends c {
        @Override // com.netflix.msl.msg.MslControl.c, com.netflix.msl.msg.MessageContext
        public void e(dkE dke) {
        }

        @Override // com.netflix.msl.msg.MslControl.c, com.netflix.msl.msg.MessageContext
        public boolean g() {
            return false;
        }

        @Override // com.netflix.msl.msg.MslControl.c, com.netflix.msl.msg.MessageContext
        public boolean h() {
            return false;
        }

        @Override // com.netflix.msl.msg.MslControl.c, com.netflix.msl.msg.MessageContext
        public boolean j() {
            return false;
        }

        public d(MessageContext messageContext) {
            super(messageContext);
        }
    }

    protected static boolean b(Throwable th) {
        if (Thread.interrupted()) {
            return true;
        }
        while (th != null) {
            if ((th instanceof InterruptedException) || (((th instanceof InterruptedIOException) && !(th instanceof SocketTimeoutException)) || (th instanceof FileLockInterruptionException) || (th instanceof ClosedByInterruptException))) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public MslControl(int i2, dkH dkh, dkD dkd) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Number of threads must be non-negative.");
        }
        this.a = dkh != null ? dkh : new dkH();
        this.f = dkd != null ? dkd : new a(null);
        if (i2 > 0) {
            this.b = Executors.newFixedThreadPool(i2);
        } else {
            this.b = new n(null);
        }
        try {
            b bVar = new b(null);
            byte[] bArr = new byte[16];
            this.d = new dkO(bVar, new Date(), new Date(), 1L, 1L, bVar.e().e(), "dummy", new SecretKeySpec(bArr, "AES"), new SecretKeySpec(bArr, "HmacSHA256"));
        } catch (MslCryptoException e2) {
            throw new MslInternalException("Unexpected exception when constructing dummy master token.", e2);
        } catch (MslEncodingException e3) {
            throw new MslInternalException("Unexpected exception when constructing dummy master token.", e3);
        }
    }

    protected void finalize() {
        this.b.shutdownNow();
        super.finalize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.concurrent.locks.ReadWriteLock] */
    private dkO c(MslContext mslContext) {
        while (true) {
            InterfaceC8429dlg h2 = mslContext.h();
            dkO i2 = h2.i();
            if (i2 == null) {
                return null;
            }
            j jVar = new j(mslContext, i2);
            ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
            ReadWriteLock putIfAbsent = this.c.putIfAbsent(jVar, reentrantReadWriteLock);
            if (putIfAbsent != 0) {
                reentrantReadWriteLock = putIfAbsent;
            }
            reentrantReadWriteLock.readLock().lockInterruptibly();
            if (i2.equals(h2.i())) {
                return i2;
            }
            reentrantReadWriteLock.readLock().unlock();
            reentrantReadWriteLock.writeLock().lockInterruptibly();
            this.c.remove(jVar);
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    private void b(MslContext mslContext, dkO dko) {
        Lock writeLock;
        if (dko == null) {
            return;
        }
        j jVar = new j(mslContext, dko);
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        ReadWriteLock putIfAbsent = this.c.putIfAbsent(jVar, reentrantReadWriteLock);
        if (putIfAbsent != null) {
            putIfAbsent.readLock().unlock();
            writeLock = putIfAbsent.writeLock();
        } else {
            writeLock = reentrantReadWriteLock.writeLock();
        }
        writeLock.lockInterruptibly();
        try {
            mslContext.h().b(dko);
        } finally {
            this.c.remove(jVar);
            writeLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(MslContext mslContext, dkO dko) {
        if (dko != null) {
            ReadWriteLock readWriteLock = this.c.get(new j(mslContext, dko));
            if (readWriteLock != null) {
                readWriteLock.readLock().unlock();
            }
        }
    }

    private void b(MslContext mslContext, dkG dkg, AbstractC8411dkp.d dVar) {
        InterfaceC8429dlg h2 = mslContext.h();
        if (mslContext.g() || dVar == null) {
            return;
        }
        AbstractC8420dky abstractC8420dky = dVar.b;
        h2.e(abstractC8420dky.c(), dVar.c);
        b(mslContext, dkg.a());
    }

    private void b(MslContext mslContext, dkG dkg, dkI dki) {
        dkG a2 = dki.a();
        if (a2 == null) {
            return;
        }
        InterfaceC8429dlg h2 = mslContext.h();
        AbstractC8420dky b2 = a2.b();
        if (b2 != null) {
            dkO c2 = b2.c();
            AbstractC8393djy b3 = dki.b();
            if (c2 == null || b3 == null) {
                return;
            }
            try {
                dki.c();
                h2.e(c2, b3);
                b(mslContext, dkg.a());
            } catch (MslException e2) {
                throw new InterruptedException(e2.getMessage());
            }
        }
    }

    private static void c(MslContext mslContext, dkO dko, dkU dku, Set<dkQ> set) {
        InterfaceC8429dlg h2 = mslContext.h();
        HashSet hashSet = new HashSet();
        for (dkQ dkq : set) {
            if (!dkq.c(dko) || !dko.f()) {
                byte[] a2 = dkq.a();
                if (a2 != null && a2.length == 0) {
                    h2.e(dkq.d(), dkq.c() ? dko : null, dkq.f() ? dku : null);
                } else {
                    hashSet.add(dkq);
                }
            }
        }
        h2.e(hashSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public dkB b(MslContext mslContext, MessageContext messageContext) {
        InterfaceC8429dlg h2 = mslContext.h();
        dkO c2 = c(mslContext);
        dkU dku = null;
        if (c2 != null) {
            try {
                String i2 = messageContext.i();
                dkU a2 = i2 != null ? h2.a(i2) : null;
                if (a2 != null && a2.d(c2)) {
                    dku = a2;
                }
            } catch (MslException e2) {
                d(mslContext, c2);
                throw new MslInternalException("User ID token not bound to master token despite internal check.", e2);
            } catch (RuntimeException e3) {
                d(mslContext, c2);
                throw e3;
            }
        }
        dkB d2 = this.a.d(mslContext, c2, dku);
        d2.e(messageContext.j());
        d2.b(messageContext.k());
        d2.c(messageContext.n());
        return d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public dkB c(MslContext mslContext, MessageContext messageContext, dkG dkg) {
        dkB c2 = this.a.c(mslContext, dkg);
        c2.e(messageContext.j());
        c2.b(messageContext.k());
        c2.c(messageContext.n());
        if (mslContext.g() || dkg.b() != null) {
            dkO c3 = c(mslContext);
            dkU dku = null;
            if (c3 != null) {
                try {
                    String i2 = messageContext.i();
                    dkU a2 = i2 != null ? mslContext.h().a(i2) : null;
                    if (a2 != null && a2.d(c3)) {
                        dku = a2;
                    }
                } catch (RuntimeException e2) {
                    d(mslContext, c3);
                    throw e2;
                }
            }
            c2.c(c3, dku);
            return c2;
        }
        return c2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class e {
        public final dkB a;
        public final MessageContext e;

        public e(dkB dkb, MessageContext messageContext) {
            this.a = dkb;
            this.e = messageContext;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.netflix.msl.msg.MslControl.e d(com.netflix.msl.util.MslContext r12, com.netflix.msl.msg.MessageContext r13, com.netflix.msl.msg.MslControl.m r14, o.C8416dku r15) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.msl.msg.MslControl.d(com.netflix.msl.util.MslContext, com.netflix.msl.msg.MessageContext, com.netflix.msl.msg.MslControl$m, o.dku):com.netflix.msl.msg.MslControl$e");
    }

    private void e(MslContext mslContext, dkG dkg, C8416dku c8416dku) {
        int i2 = AnonymousClass5.c[c8416dku.c().ordinal()];
        if (i2 == 1 || i2 == 2) {
            b(mslContext, dkg.a());
        } else if (i2 == 3 || i2 == 5) {
            dkO a2 = dkg.a();
            dkU r = dkg.r();
            if (a2 == null || r == null) {
                return;
            }
            mslContext.h().e(r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class m {
        public final dkE a;
        public final boolean d;

        /* synthetic */ m(dkE dke, boolean z, AnonymousClass5 anonymousClass5) {
            this(dke, z);
        }

        private m(dkE dke, boolean z) {
            this.a = dke;
            this.d = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0104 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.netflix.msl.msg.MslControl.m b(com.netflix.msl.util.MslContext r9, com.netflix.msl.msg.MessageContext r10, java.io.OutputStream r11, o.dkB r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.msl.msg.MslControl.b(com.netflix.msl.util.MslContext, com.netflix.msl.msg.MessageContext, java.io.OutputStream, o.dkB, boolean):com.netflix.msl.msg.MslControl$m");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x011f, code lost:
        if (r21 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0121, code lost:
        b(r18, r21, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0124, code lost:
        r9 = r4.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012c, code lost:
        if (r18.g() != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012e, code lost:
        if (r9 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0130, code lost:
        r9 = r9.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0135, code lost:
        r9 = r4.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0139, code lost:
        r10 = r4.r();
        r11 = r4.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0142, code lost:
        if (r9 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0144, code lost:
        r9 = r9.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0149, code lost:
        r9 = r4.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014d, code lost:
        r10 = r4.l();
        r11 = r4.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0155, code lost:
        r12 = r19.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0159, code lost:
        if (r12 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x015b, code lost:
        if (r10 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0161, code lost:
        if (r10.c() != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0163, code lost:
        r18.h().e(r12, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x016a, code lost:
        c(r18, r9, r10, r11);
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016f A[Catch: MslException -> 0x0186, TryCatch #0 {MslException -> 0x0186, blocks: (B:39:0x0092, B:45:0x00bb, B:48:0x00c3, B:50:0x00c9, B:53:0x00d0, B:54:0x00ec, B:55:0x00ed, B:57:0x00f3, B:59:0x00f9, B:62:0x0100, B:63:0x011c, B:66:0x0121, B:67:0x0124, B:70:0x0130, B:72:0x0139, B:77:0x0155, B:80:0x015d, B:82:0x0163, B:83:0x016a, B:71:0x0135, B:74:0x0144, B:76:0x014d, B:75:0x0149, B:85:0x016f, B:89:0x017c, B:91:0x0182, B:86:0x0174, B:42:0x009b, B:43:0x00b7), top: B:96:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0174 A[Catch: MslException -> 0x0186, TryCatch #0 {MslException -> 0x0186, blocks: (B:39:0x0092, B:45:0x00bb, B:48:0x00c3, B:50:0x00c9, B:53:0x00d0, B:54:0x00ec, B:55:0x00ed, B:57:0x00f3, B:59:0x00f9, B:62:0x0100, B:63:0x011c, B:66:0x0121, B:67:0x0124, B:70:0x0130, B:72:0x0139, B:77:0x0155, B:80:0x015d, B:82:0x0163, B:83:0x016a, B:71:0x0135, B:74:0x0144, B:76:0x014d, B:75:0x0149, B:85:0x016f, B:89:0x017c, B:91:0x0182, B:86:0x0174, B:42:0x009b, B:43:0x00b7), top: B:96:0x0092 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private o.dkI c(com.netflix.msl.util.MslContext r18, com.netflix.msl.msg.MessageContext r19, java.io.InputStream r20, o.dkG r21) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.msl.msg.MslControl.c(com.netflix.msl.util.MslContext, com.netflix.msl.msg.MessageContext, java.io.InputStream, o.dkG):o.dkI");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class i extends m {
        public final dkI c;

        public i(dkI dki, m mVar) {
            super(mVar.a, mVar.d, null);
            this.c = dki;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Finally extract failed */
    public i e(MslContext mslContext, MessageContext messageContext, InputStream inputStream, OutputStream outputStream, dkB dkb, Receive receive, boolean z, int i2) {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1, true);
        dkI dki = null;
        try {
            boolean e2 = e(mslContext, messageContext, arrayBlockingQueue, dkb, i2);
            try {
                dkb.d(e2);
                m b2 = b(mslContext, messageContext, outputStream, dkb, z);
                dkG e3 = b2.a.e();
                Set<AbstractC8412dkq> d2 = e3.d();
                if (receive == Receive.ALWAYS || b2.d || (receive == Receive.RENEWING && (!d2.isEmpty() || (e3.s() && e3.a() != null && e3.o() != null)))) {
                    dki = c(mslContext, messageContext, inputStream, e3);
                    dki.b(z);
                    C8416dku e4 = dki.e();
                    if (e4 != null) {
                        e(mslContext, e3, e4);
                    }
                }
                if (e2) {
                    a(mslContext, arrayBlockingQueue, dki);
                }
                d(mslContext, dkb.c());
                return new i(dki, b2);
            } catch (Throwable th) {
                if (e2) {
                    a(mslContext, arrayBlockingQueue, dki);
                }
                d(mslContext, dkb.c());
                throw th;
            }
        } catch (InterruptedException unused) {
            d(mslContext, dkb.c());
            return null;
        } catch (RuntimeException e5) {
            e = e5;
            d(mslContext, dkb.c());
            throw e;
        } catch (TimeoutException e6) {
            e = e6;
            d(mslContext, dkb.c());
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x008a, code lost:
        if (r3 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d0, code lost:
        r0 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean e(com.netflix.msl.util.MslContext r7, com.netflix.msl.msg.MessageContext r8, java.util.concurrent.BlockingQueue<o.dkO> r9, o.dkB r10, long r11) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.msl.msg.MslControl.e(com.netflix.msl.util.MslContext, com.netflix.msl.msg.MessageContext, java.util.concurrent.BlockingQueue, o.dkB, long):boolean");
    }

    private void a(MslContext mslContext, BlockingQueue<dkO> blockingQueue, dkI dki) {
        if (this.j.get(mslContext) != blockingQueue) {
            throw new IllegalStateException("Attempt to release renewal lock that is not owned by this queue.");
        }
        if (dki == null) {
            blockingQueue.add(this.d);
            this.j.remove(mslContext);
            return;
        }
        dkG a2 = dki.a();
        if (a2 == null) {
            blockingQueue.add(this.d);
            this.j.remove(mslContext);
            return;
        }
        AbstractC8420dky b2 = a2.b();
        if (b2 != null) {
            blockingQueue.add(b2.c());
        } else if (!mslContext.g()) {
            dkO a3 = a2.a();
            if (a3 != null) {
                blockingQueue.add(a3);
            } else {
                blockingQueue.add(this.d);
            }
        } else {
            dkO i2 = a2.i();
            if (i2 != null) {
                blockingQueue.add(i2);
            } else {
                blockingQueue.add(this.d);
            }
        }
        this.j.remove(mslContext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.msl.msg.MslControl$5  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[ApplicationError.values().length];
            a = iArr;
            try {
                iArr[ApplicationError.ENTITY_REJECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ApplicationError.USER_REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[MslConstants.ResponseCode.values().length];
            c = iArr2;
            try {
                iArr2[MslConstants.ResponseCode.ENTITYDATA_REAUTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[MslConstants.ResponseCode.ENTITY_REAUTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[MslConstants.ResponseCode.USERDATA_REAUTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                c[MslConstants.ResponseCode.SSOTOKEN_REJECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                c[MslConstants.ResponseCode.USER_REAUTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                c[MslConstants.ResponseCode.KEYX_REQUIRED.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                c[MslConstants.ResponseCode.EXPIRED.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                c[MslConstants.ResponseCode.REPLAYED.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes5.dex */
    class h implements Callable<g> {
        private final MslContext b;
        private dkB c;
        private InputStream d;
        private final Receive e;
        private boolean f;
        private final int g;
        private OutputStream h;
        private final MessageContext i;
        private boolean j;
        private final InterfaceC8413dkr k;
        private final int n;

        public h(MslContext mslContext, MessageContext messageContext, InterfaceC8413dkr interfaceC8413dkr, Receive receive, int i) {
            this.f = false;
            this.b = mslContext;
            this.i = messageContext;
            this.k = interfaceC8413dkr;
            this.d = null;
            this.h = null;
            this.j = false;
            this.c = null;
            this.e = receive;
            this.n = i;
            this.g = 0;
        }

        private h(MslContext mslContext, MessageContext messageContext, InterfaceC8413dkr interfaceC8413dkr, dkB dkb, Receive receive, int i, int i2) {
            this.f = false;
            this.b = mslContext;
            this.i = messageContext;
            this.k = interfaceC8413dkr;
            this.d = null;
            this.h = null;
            this.j = false;
            this.c = dkb;
            this.e = receive;
            this.n = i;
            this.g = i2;
        }

        private g d(MessageContext messageContext, dkB dkb, int i, int i2) {
            dkI dki;
            g d;
            int i3 = i2 + 2;
            boolean z = true;
            if (i3 > 12) {
                MslControl.this.d(this.b, dkb.c());
                this.f = true;
                return null;
            }
            i e = MslControl.this.e(this.b, messageContext, this.d, this.h, dkb, this.e, this.j, i);
            dkE dke = e.a;
            dkI dki2 = e.c;
            if (dki2 == null) {
                return new g(dki2, dke);
            }
            dkG a = dki2.a();
            if (a == null) {
                try {
                    dke.close();
                } catch (IOException e2) {
                    if (MslControl.b(e2)) {
                        return null;
                    }
                }
                try {
                    dki2.close();
                } catch (IOException e3) {
                    if (MslControl.b(e3)) {
                        return null;
                    }
                }
                e d2 = MslControl.this.d(this.b, messageContext, e, dki2.e());
                if (d2 == null) {
                    return new g(dki2, null);
                }
                dkB dkb2 = d2.a;
                MessageContext messageContext2 = d2.e;
                if (this.b.g()) {
                    dki = dki2;
                    d = d(messageContext2, dkb2, i, i3);
                } else {
                    dki = dki2;
                    h hVar = new h(this.b, messageContext2, this.k, dkb2, this.e, i, i3);
                    d = hVar.call();
                    this.f = hVar.f;
                }
                return (this.f || (d != null && d.e == null)) ? new g(dki, null) : d;
            } else if (!this.b.g()) {
                if (e.d) {
                    messageContext.e(this.k, this.d);
                    try {
                        dke.close();
                    } catch (IOException e4) {
                        if (MslControl.b(e4)) {
                            return null;
                        }
                    }
                    try {
                        dki2.close();
                    } catch (IOException e5) {
                        if (MslControl.b(e5)) {
                            return null;
                        }
                    }
                    return new h(this.b, new f(null, messageContext), this.k, MslControl.this.c(this.b, messageContext, a), this.e, i, i3).call();
                }
                return new g(dki2, dke);
            } else if (e.d) {
                try {
                    dke.close();
                } catch (IOException e6) {
                    if (MslControl.b(e6)) {
                        return null;
                    }
                }
                try {
                    dki2.close();
                } catch (IOException e7) {
                    if (MslControl.b(e7)) {
                        return null;
                    }
                }
                return d(new f(null, messageContext), MslControl.this.c(this.b, messageContext, a), i, i3);
            } else if (a.d().isEmpty() && (!a.s() || a.a() == null || a.o() == null)) {
                return new g(dki2, dke);
            } else {
                d dVar = new d(messageContext);
                dkB c = MslControl.this.c(this.b, dVar, a);
                try {
                    if (!dki2.j()) {
                        try {
                            dke.close();
                        } catch (IOException e8) {
                            if (MslControl.b(e8)) {
                                MslControl.this.d(this.b, c.c());
                                return null;
                            }
                        }
                        c.d(false);
                        g gVar = new g(dki2, MslControl.this.b(this.b, dVar, this.h, c, this.j).a);
                        MslControl.this.d(this.b, c.c());
                        return gVar;
                    }
                    try {
                        dke.close();
                    } catch (IOException e9) {
                        if (MslControl.b(e9)) {
                            MslControl.this.d(this.b, c.c());
                            return null;
                        }
                    }
                    try {
                        dki2.close();
                    } catch (IOException e10) {
                        if (MslControl.b(e10)) {
                            MslControl.this.d(this.b, c.c());
                            return null;
                        }
                    }
                    try {
                        return d(dVar, c, i, i3);
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                th = th2;
                if (z) {
                    MslControl.this.d(this.b, c.c());
                }
                throw th;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
            if (r0.e == null) goto L35;
         */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0094 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.util.concurrent.Callable
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.netflix.msl.msg.MslControl.g call() {
            /*
                Method dump skipped, instructions count: 234
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netflix.msl.msg.MslControl.h.call():com.netflix.msl.msg.MslControl$g");
        }
    }

    public Future<g> a(MslContext mslContext, MessageContext messageContext, InterfaceC8413dkr interfaceC8413dkr, int i2) {
        if (mslContext.g()) {
            throw new IllegalStateException("This method cannot be used in peer-to-peer mode.");
        }
        return this.b.submit(new h(mslContext, messageContext, interfaceC8413dkr, Receive.ALWAYS, i2));
    }
}
