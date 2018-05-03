package id.ilhamsuaib.kotlinmvp.data.local

import android.content.Context
import android.content.SharedPreferences

/**
 * Created by @ilhamsuaib on 5/3/18.
 * github.com/ilhamsuaib
 */

class PreferenceManager(context: Context) {

    private val sp: SharedPreferences = context.getSharedPreferences("my_app_pref", Context.MODE_PRIVATE)
    private val spe: SharedPreferences.Editor = sp.edit()


}