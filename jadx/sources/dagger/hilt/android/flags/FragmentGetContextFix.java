package dagger.hilt.android.flags;

import android.content.Context;
import dagger.Module;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.Preconditions;
import dagger.multibindings.Multibinds;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.Set;
import javax.inject.Qualifier;

/* loaded from: classes5.dex */
public final class FragmentGetContextFix {

    @Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
    @Qualifier
    /* loaded from: classes.dex */
    public @interface DisableFragmentGetContextFix {
    }

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes5.dex */
    public interface FragmentGetContextFixEntryPoint {
        @DisableFragmentGetContextFix
        Set<Boolean> getDisableFragmentGetContextFix();
    }

    public static boolean isFragmentGetContextFixDisabled(Context context) {
        Set<Boolean> disableFragmentGetContextFix = ((FragmentGetContextFixEntryPoint) EntryPointAccessors.fromApplication(context, FragmentGetContextFixEntryPoint.class)).getDisableFragmentGetContextFix();
        Preconditions.checkState(disableFragmentGetContextFix.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (disableFragmentGetContextFix.isEmpty()) {
            return true;
        }
        return disableFragmentGetContextFix.iterator().next().booleanValue();
    }

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    static abstract class FragmentGetContextFixModule {
        @DisableFragmentGetContextFix
        @Multibinds
        abstract Set<Boolean> disableFragmentGetContextFix();

        FragmentGetContextFixModule() {
        }
    }

    private FragmentGetContextFix() {
    }
}
