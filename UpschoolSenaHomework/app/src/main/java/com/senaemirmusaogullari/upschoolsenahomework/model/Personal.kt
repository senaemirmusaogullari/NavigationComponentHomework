package com.senaemirmusaogullari.upschoolsenahomework.model

import android.os.Parcelable
import android.provider.ContactsContract.CommonDataKinds.Email
import kotlinx.parcelize.Parcelize

@Parcelize
data class Personal(

    val ad:String,
    val soyad:String,
    val email:String,
    val telefon:String,
    val adres:String
):Parcelable
