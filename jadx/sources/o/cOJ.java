package o;

import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.ui.profiles.languages.api.LanguageSelectorType;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import java.util.List;

/* loaded from: classes4.dex */
public interface cOJ {
    public static final c d = c.c;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes4.dex */
    public interface e {
        cOJ ay();
    }

    Intent c(Context context, String str, LanguageSelectorType languageSelectorType, String str2, List<String> list);

    /* loaded from: classes4.dex */
    public static final class c {
        static final /* synthetic */ c c = new c();

        private c() {
        }

        public final cOJ c() {
            C1332Xp c1332Xp = C1332Xp.b;
            return ((e) EntryPointAccessors.fromApplication((Context) C1332Xp.b(Context.class), e.class)).ay();
        }
    }
}
