package com.example.business_card

import android.app.Application
import com.example.business_card.data.AppDatabase
import com.example.business_card.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this)}
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}