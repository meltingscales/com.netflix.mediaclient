package o;

import com.netflix.falkor.BranchMap;
import com.netflix.model.leafs.PostPlayExperienceImpl;

/* renamed from: o.diT  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8335diT implements InterfaceC0943Io {
    private PostPlayExperienceImpl b;
    private BranchMap<BranchMap<IF>> d;
    private InterfaceC1240Ub<? extends InterfaceC0943Io> e;

    public C8335diT(InterfaceC1240Ub<? extends InterfaceC0943Io> interfaceC1240Ub) {
        this.e = interfaceC1240Ub;
    }

    @Override // o.InterfaceC0943Io
    public InterfaceC8322diG b(String str) {
        str.hashCode();
        if (str.equals("experienceData")) {
            return this.b;
        }
        if (str.equals("playbackVideos")) {
            return this.d;
        }
        throw new IllegalStateException("Can't get node for key: " + str);
    }

    @Override // o.InterfaceC0943Io
    public InterfaceC8322diG e(String str) {
        InterfaceC8322diG b = b(str);
        if (b != null) {
            return b;
        }
        str.hashCode();
        if (str.equals("experienceData")) {
            PostPlayExperienceImpl postPlayExperienceImpl = new PostPlayExperienceImpl(this.e);
            this.b = postPlayExperienceImpl;
            return postPlayExperienceImpl;
        } else if (str.equals("playbackVideos")) {
            BranchMap<BranchMap<IF>> branchMap = new BranchMap<>(new IN<BranchMap<IF>>() { // from class: o.diT.3
                @Override // o.IN
                /* renamed from: b */
                public BranchMap<IF> d() {
                    return new BranchMap<>(C8370djb.n);
                }
            });
            this.d = branchMap;
            return branchMap;
        } else {
            throw new IllegalStateException("Can't create node for key: " + str);
        }
    }

    @Override // o.InterfaceC0943Io
    public void d(String str, InterfaceC8322diG interfaceC8322diG) {
        str.hashCode();
        if (str.equals("experienceData")) {
            this.b = (PostPlayExperienceImpl) interfaceC8322diG;
        } else if (str.equals("playbackVideos")) {
            this.d = interfaceC8322diG instanceof BranchMap ? (BranchMap) interfaceC8322diG : null;
        } else {
            C1044Mm.e("PostPlayExperienceMap", "Don't know how to set key: " + str);
        }
    }

    @Override // o.InterfaceC0943Io
    public void a(String str) {
        d(str, null);
    }
}
