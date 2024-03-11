package o;

import com.netflix.model.leafs.PostPlayExperience;
import java.util.Objects;

/* renamed from: o.czz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7641czz {
    private final C7631czp a;
    private final PostPlayExperience b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7631czp a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PostPlayExperience c() {
        return this.b;
    }

    public C7641czz(PostPlayExperience postPlayExperience, C7631czp c7631czp) {
        Objects.requireNonNull(postPlayExperience);
        this.b = postPlayExperience;
        this.a = c7631czp;
    }
}
