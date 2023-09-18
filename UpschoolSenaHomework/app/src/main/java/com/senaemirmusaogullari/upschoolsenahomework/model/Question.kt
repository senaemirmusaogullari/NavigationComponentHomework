package com.senaemirmusaogullari.upschoolsenahomework.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Question(

    val personalInfo:Personal,
    val yas:String,
    val meslek:String,
    val hobiler:String
):Parcelable
