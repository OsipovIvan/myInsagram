package ru.osipov.myinsagran.activities

import android.os.Bundle
import android.util.Log
import ru.osipov.myinsagran.R

class LikesActivity : BaseActivity(3) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setupBottomNavigation()
        Log.d(TAG, "LikesActivity")
    }
}
