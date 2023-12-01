package me.hani.ausbildung.data.model

import java.util.Date

data class AusPage(
    val title: String,
    val duration: String,
    val certificate: String,
    val content: String,
    val categoryId: Int,
    val userId: Int,
    val publishedDate: Date,
    val updatedDate: Date,
    val imageUrl: String? = null,
    val shiftType: String? = null,
    val firstYearSalary: Int = 0,
    val secondYearSalary: Int = 0,
    val thirdYearSalary: Int = 0,
    val fourthYearSalary: Int = 0,
    val bestPaid: Boolean = false,
    val popular: Boolean = false,
    val links: String? = null,
    val published: Boolean = false
)