package o;

import com.netflix.mediaclient.android.app.Status;

/* renamed from: o.bpP  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4940bpP implements InterfaceC4943bpS {
    @Override // o.InterfaceC4943bpS
    public void b(String str, String str2, Status status) {
        if (status.i()) {
            C1044Mm.j("nf_service_resfetcher_callback", "Resource %s could not be fetched, status %d", str, Integer.valueOf(status.c().getValue()));
        } else {
            C1044Mm.c("nf_service_resfetcher_callback", "Resource %s fetched and saved at %s, status %d", str, str2, Integer.valueOf(status.c().getValue()));
        }
    }

    @Override // o.InterfaceC4943bpS
    public void b(String str, String str2, long j, long j2, Status status) {
        if (status.i()) {
            C1044Mm.j("nf_service_resfetcher_callback", "Resource %s could not be fetched or retrieved from cache, status %d", str, Integer.valueOf(status.c().getValue()));
        } else {
            C1044Mm.a("nf_service_resfetcher_callback", "Resource %s fetched and cached, status %d", str, Integer.valueOf(status.c().getValue()));
        }
    }

    @Override // o.InterfaceC4943bpS
    public void d(String str, byte[] bArr, Status status) {
        if (status.i()) {
            C1044Mm.j("nf_service_resfetcher_callback", "Resource %s could NOT be fetched, status %d", str, Integer.valueOf(status.c().getValue()));
        } else {
            C1044Mm.c("nf_service_resfetcher_callback", "Resource %s fetched and response returned raw, status %d", str, Integer.valueOf(status.c().getValue()));
        }
    }
}
