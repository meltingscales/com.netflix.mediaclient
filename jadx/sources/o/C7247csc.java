package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Singleton;

@Singleton
/* renamed from: o.csc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7247csc implements InterfaceC4209baG, InterfaceC7249cse {
    private final Set<String> b = new HashSet();
    private InterfaceC4208baF c;
    private long d;

    @Override // o.InterfaceC4209baG
    public boolean c() {
        return false;
    }

    @Override // o.InterfaceC7249cse
    public void c(InterfaceC4208baF interfaceC4208baF) {
        InterfaceC4208baF interfaceC4208baF2;
        if (interfaceC4208baF == null || (interfaceC4208baF2 = this.c) == interfaceC4208baF) {
            return;
        }
        if (interfaceC4208baF2 != null) {
            interfaceC4208baF2.d(this);
        }
        this.c = interfaceC4208baF;
        interfaceC4208baF.e((InterfaceC4208baF) this);
        b();
    }

    @Override // o.InterfaceC4209baG
    public void b(String str) {
        this.b.add(str);
        b();
    }

    @Override // o.InterfaceC4209baG
    public void b(String str, Status status) {
        this.b.remove(str);
        b();
    }

    @Override // o.InterfaceC4209baG
    public void c(InterfaceC5206buQ interfaceC5206buQ, int i) {
        b();
    }

    @Override // o.InterfaceC4209baG
    public void a(InterfaceC5206buQ interfaceC5206buQ) {
        C7353cuc.d(AbstractApplicationC1040Mh.d());
        b();
    }

    @Override // o.InterfaceC4209baG
    public void b(InterfaceC5206buQ interfaceC5206buQ) {
        b();
    }

    @Override // o.InterfaceC4209baG
    public void d(InterfaceC5206buQ interfaceC5206buQ, StopReason stopReason) {
        b();
    }

    @Override // o.InterfaceC4209baG
    public void b(String str, Status status, boolean z) {
        b();
    }

    @Override // o.InterfaceC4209baG
    public void c(List<String> list, Status status) {
        b();
    }

    @Override // o.InterfaceC4209baG
    public void d(Status status) {
        b();
    }

    @Override // o.InterfaceC4209baG
    public void b(Status status) {
        b();
    }

    @Override // o.InterfaceC4209baG
    public void e(InterfaceC5206buQ interfaceC5206buQ, Status status) {
        b();
    }

    @Override // o.InterfaceC4209baG
    public void d(InterfaceC5206buQ interfaceC5206buQ, Status status) {
        b();
    }

    @Override // o.InterfaceC4209baG
    public void e(boolean z) {
        b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void b() {
        int i;
        int i2;
        int i3;
        if (this.c == null) {
            return;
        }
        int size = this.b.size();
        int size2 = this.b.size();
        InterfaceC7281ctJ a = C7353cuc.a();
        long e = e();
        long j = 0;
        long j2 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (InterfaceC5206buQ interfaceC5206buQ : a.d()) {
            switch (AnonymousClass4.c[interfaceC5206buQ.au_().ordinal()]) {
                case 1:
                    size2++;
                    size++;
                    break;
                case 2:
                case 4:
                    size++;
                    break;
                case 3:
                    if (interfaceC5206buQ.A() > e) {
                        size++;
                        i4++;
                        break;
                    }
                    break;
                case 5:
                    if (interfaceC5206buQ.A() > e) {
                        i5++;
                        size++;
                        break;
                    }
                    break;
                case 6:
                    if (interfaceC5206buQ.aM_().a()) {
                        if (interfaceC5206buQ.A() > e) {
                            i4++;
                        }
                    } else {
                        j2 += interfaceC5206buQ.h();
                        j += interfaceC5206buQ.aP_();
                        i6++;
                    }
                    size++;
                    break;
            }
            if (interfaceC5206buQ.au_() != DownloadState.InProgress) {
                if (interfaceC5206buQ.au_() == DownloadState.Complete) {
                    i2 = size;
                    i3 = size2;
                    if (interfaceC5206buQ.A() <= this.d) {
                    }
                } else {
                    i2 = size;
                    i3 = size2;
                }
                size = i2;
                size2 = i3;
            } else {
                i2 = size;
                i3 = size2;
            }
            j2 += interfaceC5206buQ.h();
            j += interfaceC5206buQ.aP_();
            size = i2;
            size2 = i3;
        }
        if (size <= 0 || j <= 0) {
            if (size2 <= 0) {
                i = 100;
            }
            i = 0;
        } else {
            if (j2 != j) {
                if (size2 > 0) {
                    j += (size2 * j) / (size - size2);
                }
                i = (int) ((j2 * 100) / j);
            }
            i = 0;
        }
        AbstractC7233csO e2 = AbstractC7233csO.g().d(i5).c(size).e(i6).b(i4).e(this.c.o()).a(i).e();
        if (!e2.i()) {
            this.d = System.currentTimeMillis();
        }
        AbstractC7233csO.a(e2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.csc$4  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[DownloadState.values().length];
            c = iArr;
            try {
                iArr[DownloadState.Creating.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[DownloadState.InProgress.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[DownloadState.CreateFailed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[DownloadState.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[DownloadState.Complete.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                c[DownloadState.Stopped.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // o.InterfaceC7249cse
    public void d() {
        C8157dfA.e(AbstractApplicationC1040Mh.d(), "download_badge_clear_time", System.currentTimeMillis());
        b();
    }

    @Override // o.InterfaceC7249cse
    public long e() {
        return C8157dfA.b(AbstractApplicationC1040Mh.d(), "download_badge_clear_time", 0L);
    }
}
