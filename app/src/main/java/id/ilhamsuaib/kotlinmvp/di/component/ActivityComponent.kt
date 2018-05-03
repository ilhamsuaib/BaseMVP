package id.ilhamsuaib.kotlinmvp.di.component

import dagger.Subcomponent
import id.ilhamsuaib.kotlinmvp.di.module.ActivityModule
import id.ilhamsuaib.kotlinmvp.di.scope.ActivityScope

/**
 * Created by ilham on 10/12/17.
 */

@ActivityScope
@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {

    @Subcomponent.Builder
    interface Builder {
        fun activityModule(activityModule: ActivityModule): Builder

        fun build(): ActivityComponent
    }
}