package com.rajendra.dicodingsubmm.adapter

import com.rajendra.dicodingsubmm.datasource.UserResponse

interface OnItemClickCallback {
    fun onItemClicked(user: UserResponse)
}