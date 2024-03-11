package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.falkor.FalkorAgentStatus;
import com.netflix.model.leafs.ListOfMoviesSummary;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.List;
import o.InterfaceC5223buh;

/* renamed from: o.bsq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5126bsq<T extends InterfaceC5223buh> extends C5087bsD {
    private final int a;
    private final String b;
    private final InterfaceC6394ccV d;
    private final c<T> e;
    private final int f;
    private final long h;
    private final boolean i;

    /* renamed from: o.bsq$c */
    /* loaded from: classes4.dex */
    public interface c<T extends InterfaceC5223buh> {
        long b();

        void b(ListOfMoviesSummary listOfMoviesSummary);

        void c(List<InterfaceC5222bug<T>> list, String str, int i, int i2);

        void d();
    }

    public C5126bsq(String str, c<T> cVar, String str2, int i, int i2, boolean z, InterfaceC6394ccV interfaceC6394ccV) {
        super(str);
        this.e = cVar;
        this.h = cVar.b();
        this.b = str2;
        this.f = i;
        this.a = i2;
        this.i = z;
        this.d = interfaceC6394ccV;
    }

    @Override // o.C5087bsD, o.InterfaceC5094bsK
    public void d(List<InterfaceC5222bug<InterfaceC5223buh>> list, Status status) {
        super.d(list, status);
        m(list, status);
    }

    @Override // o.C5087bsD, o.InterfaceC5094bsK
    public void a(List<InterfaceC5222bug<InterfaceC5179btq>> list, Status status) {
        super.a(list, status);
        m(list, status);
    }

    @Override // o.C5087bsD, o.InterfaceC5094bsK
    public void b(List<InterfaceC5222bug<InterfaceC5180btr>> list, Status status) {
        super.b(list, status);
        m(list, status);
    }

    @Override // o.C5087bsD, o.InterfaceC5094bsK
    public void e(List<InterfaceC5222bug<InterfaceC5216bua>> list, Status status) {
        super.e(list, status);
        m(list, status);
    }

    @Override // o.C5087bsD, o.InterfaceC5094bsK
    public void d(ListOfMoviesSummary listOfMoviesSummary, List<InterfaceC5222bug<InterfaceC5223buh>> list, Status status) {
        super.d(listOfMoviesSummary, list, status);
        if (listOfMoviesSummary != null) {
            this.e.b(listOfMoviesSummary);
        }
        m(list, status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void m(List<InterfaceC5222bug<InterfaceC5223buh>> list, Status status) {
        if (this.h != this.e.b()) {
            C1044Mm.b(this.c, "Ignoring stale onVideosFetched callback");
        } else if (status.i()) {
            C1044Mm.j(this.c, "Invalid status code");
            this.e.d();
        } else {
            if (status instanceof FalkorAgentStatus) {
                FalkorAgentStatus falkorAgentStatus = (FalkorAgentStatus) status;
                if (this.i && !falkorAgentStatus.o() && !C8153dex.A()) {
                    InterfaceC6394ccV interfaceC6394ccV = this.d;
                    if (interfaceC6394ccV instanceof C6393ccU) {
                        C6393ccU c6393ccU = (C6393ccU) interfaceC6394ccV;
                        if (c6393ccU.a() instanceof FalkorAgentStatus) {
                            InterfaceC1593aHa.b("prefetch: " + URLEncoder.encode(((FalkorAgentStatus) c6393ccU.a()).m()));
                        }
                    }
                    InterfaceC1593aHa.b("requested: " + URLEncoder.encode(falkorAgentStatus.m()));
                    InterfaceC1593aHa.b("network: " + URLEncoder.encode(falkorAgentStatus.n()));
                    e("'" + this.b + "': Call generated a network call where it should not. Please verify prefetch vs fetch PQLs");
                }
            } else {
                e("'" + this.b + "': Any fetch happening in lolomo should return a FalkorAgentStatus, Found " + status.getClass().getSimpleName());
            }
            if (list == null) {
                list = Collections.emptyList();
            }
            this.e.c(list, this.b, this.f, this.a);
        }
    }

    private void e(String str) {
        InterfaceC1598aHf.a(new C1596aHd(str).b(false).e(true));
    }
}
