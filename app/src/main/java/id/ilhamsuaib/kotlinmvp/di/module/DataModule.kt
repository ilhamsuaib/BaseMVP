package id.ilhamsuaib.kotlinmvp.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import id.ilhamsuaib.kotlinmvp.data.local.PreferenceManager
import id.ilhamsuaib.kotlinmvp.di.scope.ApplicationContext
import javax.inject.Singleton

/**
 * Created by ilham on 10/13/17.
 */
@Module
class DataModule {

    @Provides
    @Singleton
    fun providePreferenceManager(@ApplicationContext context: Context): PreferenceManager
            = PreferenceManager(context)
}