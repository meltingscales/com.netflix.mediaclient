package o;

import android.content.Context;
import com.netflix.mediaclient.media.BookmarkStore;
import com.netflix.mediaclient.service.offline.agent.CreateRequest;
import com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import com.netflix.mediaclient.storage.db.OfflineDatabase;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.json.JSONObject;

/* renamed from: o.bbQ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4272bbQ implements OfflineRegistryInterface {
    private final Context c;
    private final C5293bvy f;
    private final List<C4281bbZ> d = new ArrayList();
    private final C5099bsP i = new C5099bsP();
    private OfflineRegistryInterface.RegistryState b = OfflineRegistryInterface.RegistryState.NOT_READY;
    private C4281bbZ e = null;
    private List<C4276bbU> a = new ArrayList();

    @Override // com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface
    public List<C4281bbZ> j() {
        return this.d;
    }

    @Override // com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface
    public InterfaceC5204buO l() {
        return this.i;
    }

    @Override // com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface
    public OfflineRegistryInterface.RegistryState n() {
        return this.b;
    }

    @Override // com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface
    public InterfaceC4299bbr b(CreateRequest createRequest, String str, String str2, String str3) {
        C4276bbU c4276bbU;
        synchronized (this) {
            int i = this.e.i();
            Iterator<C4276bbU> it = this.a.iterator();
            while (it.hasNext()) {
                C4276bbU next = it.next();
                if (next.h().equals(createRequest.e) && next.aa() == i) {
                    it.remove();
                }
            }
            c4276bbU = new C4276bbU(C4277bbV.e(createRequest, str, str2, str3, i, new C4284bbc(C1842aQg.a.j())));
            this.e.c(c4276bbU);
            this.a.add(c4276bbU);
        }
        return c4276bbU;
    }

    @Override // com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface
    public void a(List<InterfaceC4290bbi> list) {
        for (C4281bbZ c4281bbZ : this.d) {
            c4281bbZ.b(0L);
        }
        for (InterfaceC4290bbi interfaceC4290bbi : list) {
            if (interfaceC4290bbi.au_() != DownloadState.Complete) {
                Iterator<C4281bbZ> it = this.d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C4281bbZ next = it.next();
                        long aP_ = interfaceC4290bbi.aP_() - interfaceC4290bbi.h();
                        if (interfaceC4290bbi.d().startsWith(next.b().getAbsolutePath())) {
                            C1044Mm.c("nf_offline_registry", "storageVolume=%s dataRemaining=%d", next.b(), Long.valueOf(aP_));
                            next.a(aP_);
                            break;
                        }
                    }
                }
            }
        }
    }

    public C4272bbQ(Context context) {
        this.c = context;
        this.f = C5293bvy.e.b(OfflineDatabase.d.c(context));
    }

    @Override // com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface
    public OfflineRegistryInterface.RegistryState e(C4278bbW c4278bbW) {
        s();
        return c(c4278bbW);
    }

    private OfflineRegistryInterface.RegistryState c(C4278bbW c4278bbW) {
        boolean z;
        File file = new File(C4336bcb.e(this.c.getFilesDir()));
        if (file.exists()) {
            file.delete();
            z = true;
        } else {
            z = false;
        }
        this.b = OfflineRegistryInterface.RegistryState.NOT_READY;
        this.d.clear();
        this.a.clear();
        try {
            List<C4276bbU> b = C4277bbV.b(this.f);
            this.a = b;
            C1044Mm.c("nf_offline_registry", "postMigrateInit count=%d", Integer.valueOf(b.size()));
            for (C4280bbY c4280bbY : c4278bbW.c()) {
                File file2 = new File(c4280bbY.d().getAbsolutePath() + "/.of");
                if (!file2.isDirectory() && !file2.mkdirs()) {
                    C1044Mm.e("nf_offline_registry", "OfflineRegistry can't create directory %s", file2.getAbsolutePath());
                } else {
                    Integer e = e(file2);
                    if (e != null) {
                        C1044Mm.c("nf_offline_registry", "postMigrateInit %d", e);
                        ArrayList arrayList = new ArrayList();
                        a(this.f, arrayList, this.a, e.intValue(), file2);
                        if (z && this.a.size() == 0) {
                            C1044Mm.d("nf_offline_registry", "postMigrateInit deleting pre-room");
                            C8106deC.e(file2);
                            file2.mkdirs();
                        }
                        this.d.add(new C4281bbZ(this, arrayList, c4280bbY, e.intValue(), file2.getAbsolutePath()));
                    }
                }
            }
            this.i.b(this.d);
            if (this.d.size() > 0) {
                this.b = OfflineRegistryInterface.RegistryState.SUCCESS;
                this.e = this.d.get(0);
                Iterator<C4281bbZ> it = this.d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C4281bbZ next = it.next();
                    if (C4273bbR.d(this.c, next.i())) {
                        C1044Mm.c("nf_offline_registry", "found selected regId=%d", Integer.valueOf(next.i()));
                        this.e = next;
                        break;
                    }
                }
            } else {
                this.b = OfflineRegistryInterface.RegistryState.STORAGE_ERROR;
            }
            if (this.b == OfflineRegistryInterface.RegistryState.SUCCESS && !((BookmarkStore) C1332Xp.b(BookmarkStore.class)).init(this.c)) {
                this.b = OfflineRegistryInterface.RegistryState.SQL_DB_ERROR;
            }
            return this.b;
        } catch (Exception e2) {
            C1044Mm.e("nf_offline_registry", "postMigrateInit getAllData:", e2);
            OfflineDatabase.d.a(this.c, e2);
            OfflineRegistryInterface.RegistryState registryState = OfflineRegistryInterface.RegistryState.SQL_DB_ERROR;
            this.b = registryState;
            return registryState;
        }
    }

    private Integer e(File file) {
        File file2 = new File(C4336bcb.a(file.getAbsolutePath()));
        Integer num = null;
        try {
            C4339bce.b(file2);
            if (file2.exists()) {
                C1044Mm.a("nf_offline_registry", "buildRegistryIdFromFile read existing file");
                JSONObject jSONObject = new JSONObject(C8168dfL.d(C8106deC.j(file2), "utf-8"));
                if (jSONObject.has("regId")) {
                    num = Integer.valueOf(jSONObject.getInt("regId"));
                }
            } else {
                int nextInt = new Random().nextInt();
                num = Integer.valueOf(nextInt);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("regId", nextInt);
                C1044Mm.c("nf_offline_registry", "buildRegistryIdFromFile creating registry.json registrySaved=%b", Boolean.valueOf(C4339bce.e(file2, jSONObject2.toString())));
            }
        } catch (Exception e) {
            InterfaceC1598aHf.a(new C1596aHd("buildRegistryIdFromFile").d(e).b(false));
            try {
                file2.delete();
            } catch (Exception unused) {
            }
        }
        C1044Mm.c("nf_offline_registry", "buildRegistryIdFromFile regId=%d", num);
        return num;
    }

    @Override // com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface
    public void m() {
        C4277bbV.a(this.a, this.f);
    }

    @Override // com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface
    public boolean o() {
        for (C4281bbZ c4281bbZ : this.d) {
            if (c4281bbZ.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface
    public int g() {
        return this.d.size();
    }

    @Override // com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface
    public void e(boolean z) {
        C4273bbR.d(this.c, z);
    }

    @Override // com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface
    public boolean e() {
        return C4273bbR.c(this.c);
    }

    @Override // com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface
    public int a() {
        return this.i.b();
    }

    @Override // com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface
    public boolean a(int i) {
        if (i >= 0 && i < this.d.size()) {
            C4281bbZ c4281bbZ = this.d.get(i);
            this.e = c4281bbZ;
            C4273bbR.b(this.c, c4281bbZ.i());
            return true;
        }
        C1044Mm.c("nf_offline_registry", "setCurrentOfflineVolume invalid selectedVolumeIndex=%d", Integer.valueOf(i));
        return false;
    }

    @Override // com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface
    public String d() {
        return this.e.d();
    }

    @Override // com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface
    public void d(InterfaceC4299bbr interfaceC4299bbr, boolean z) {
        synchronized (this) {
            c(Collections.singletonList(interfaceC4299bbr), z);
        }
    }

    @Override // com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface
    public String h() {
        return C4273bbR.b(this.c);
    }

    @Override // com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface
    public String f() {
        return C4273bbR.e(this.c);
    }

    @Override // com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface
    public void b(String str) {
        C4273bbR.e(this.c, str);
    }

    @Override // com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface
    public void e(String str) {
        C4273bbR.c(this.c, str);
    }

    @Override // com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface
    public void b(InterfaceC4299bbr interfaceC4299bbr) {
        c(Collections.singletonList(interfaceC4299bbr), false);
    }

    @Override // com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface
    public void t() {
        for (C4281bbZ c4281bbZ : this.d) {
            c4281bbZ.k();
        }
    }

    @Override // com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface
    public List<InterfaceC4299bbr> i() {
        ArrayList arrayList = new ArrayList();
        for (C4276bbU c4276bbU : this.a) {
            if (c4276bbU.t() != DownloadState.DeleteComplete) {
                arrayList.add(c4276bbU);
            }
        }
        return arrayList;
    }

    @Override // com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface
    public List<InterfaceC4299bbr> c() {
        ArrayList arrayList = new ArrayList();
        for (C4276bbU c4276bbU : this.a) {
            if (c4276bbU.t() != DownloadState.DeleteComplete && c4276bbU.t() == DownloadState.Deleted) {
                arrayList.add(c4276bbU);
            }
        }
        return arrayList;
    }

    @Override // com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface
    public boolean k() {
        return this.a.size() > 0;
    }

    private static void a(C5293bvy c5293bvy, List<C4276bbU> list, List<C4276bbU> list2, int i, File file) {
        ArrayList arrayList = new ArrayList();
        String absolutePath = file.getAbsolutePath();
        for (C4276bbU c4276bbU : list2) {
            if (c4276bbU.aa() == i) {
                C5332bwk Z = c4276bbU.Z();
                DownloadState t = c4276bbU.t();
                String b = C4336bcb.b(absolutePath, c4276bbU.h());
                if (t == DownloadState.Creating || t == DownloadState.CreateFailed || t == DownloadState.DeleteComplete || c4276bbU.Y()) {
                    boolean d = C4338bcd.d(b);
                    arrayList.add(c4276bbU.Z());
                    C1044Mm.c("nf_offline_registry", "buildOpeListsFrom deleting %s downloads path=%s state=%s success=%b", c4276bbU.h(), b, t, Boolean.valueOf(d));
                } else if (t == DownloadState.Deleted) {
                    C1044Mm.c("nf_offline_registry", "buildOpeListsFrom keeping deleted Item %s state=%s", c4276bbU.h(), t);
                } else if (!C8106deC.c(b)) {
                    C1044Mm.c("nf_offline_registry", "buildOpeListsFrom skip %s without playable directory state=%s", c4276bbU.h(), t);
                    arrayList.add(Z);
                } else {
                    list.add(c4276bbU);
                }
            }
        }
        c5293bvy.e(arrayList);
    }

    @Override // com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface
    public int b() {
        return this.e.i();
    }

    @Override // com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface
    public void c(List<InterfaceC4299bbr> list, boolean z) {
        C1044Mm.c("nf_offline_registry", "deleteOpds count=%d addToDeletedList=%b", Integer.valueOf(list.size()), Boolean.valueOf(z));
        ArrayList arrayList = new ArrayList();
        for (InterfaceC4299bbr interfaceC4299bbr : list) {
            C4276bbU c4276bbU = (C4276bbU) interfaceC4299bbr;
            arrayList.add(c4276bbU.Z());
            if (!z) {
                this.a.remove(c4276bbU);
            }
            for (C4281bbZ c4281bbZ : this.d) {
                if (interfaceC4299bbr.n() == c4281bbZ.i()) {
                    c4281bbZ.e(interfaceC4299bbr);
                }
            }
        }
        if (z) {
            C1044Mm.a("nf_offline_registry", "deleteOpds updating");
            this.f.b(arrayList);
            return;
        }
        C1044Mm.a("nf_offline_registry", "deleteOpds deleting");
        this.f.e(arrayList);
        Iterator<C5332bwk> it = this.f.e().iterator();
        while (it.hasNext()) {
            C1044Mm.a("nf_offline_registry", "deleteOpds after delete, reading " + it.next().z);
        }
    }

    @Override // com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface
    public void c(InterfaceC4299bbr interfaceC4299bbr) {
        int indexOf = this.a.indexOf(interfaceC4299bbr);
        if (indexOf != -1) {
            this.f.b(this.a.get(indexOf).Z());
            C1044Mm.c("nf_offline_registry", "persistNewItem %s", this.a.get(indexOf).Z().z);
            return;
        }
        InterfaceC1598aHf.a("persistNewItem not found " + interfaceC4299bbr.h());
    }

    @Override // com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface
    public void d(InterfaceC4299bbr interfaceC4299bbr) {
        C5332bwk Z = ((C4276bbU) interfaceC4299bbr).Z();
        C1044Mm.c("nf_offline_registry", "onChanged %s", Z.z);
        this.f.b(Z);
    }

    private void s() {
        try {
            for (File file : this.c.getFilesDir().listFiles(new FilenameFilter() { // from class: o.bbS
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str) {
                    boolean e;
                    e = C4272bbQ.e(file2, str);
                    return e;
                }
            })) {
                C8106deC.e(file);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean e(File file, String str) {
        return str.matches("falkor.realm.*") || str.matches("offline.realm.*");
    }
}
