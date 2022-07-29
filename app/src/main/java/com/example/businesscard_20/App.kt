package com.example.businesscard_20

import android.app.Application
import com.example.businesscard_20.data.AppDatabase
import com.example.businesscard_20.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}