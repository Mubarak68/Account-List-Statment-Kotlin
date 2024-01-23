package com.example.accountstatmentlist.TransactionStatment



data class TransactionData(
    val name: String,
    val amount: Double,
    val currency: String,
    val date : String,
    val transactionType: TransactionType,
    val balance: Double,
    val accountNumber: Int)

enum class TransactionType{
    DEPOSIT,
    WITHDRAW
}
