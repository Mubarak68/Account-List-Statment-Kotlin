package com.example.accountstatmentlist.AccountStatmentRepo

import com.example.accountstatmentlist.TransactionStatment.TransactionData
import com.example.accountstatmentlist.TransactionStatment.TransactionType

class AccountStatmentRepo{
    companion object {
        var dummyDataTransactionData = listOf(
            TransactionData("Saving", 1312.2, "KWD", "11/12/2023", transactionType = TransactionType.DEPOSIT,13000.0 ,1000123),
            TransactionData("Family", 123.2, "KWD", "15/2/2023", transactionType = TransactionType.WITHDRAW, 12332.0 ,1000234),
            TransactionData("Salary", 1965.890, "KWD", "15/2/2024", transactionType = TransactionType.DEPOSIT,3094.890 , 1000029),
            TransactionData("Oasis", 343.2, "KWD", "20/12/2022", transactionType = TransactionType.WITHDRAW, 4321.4 ,3000213),
            TransactionData("Foreign", 98.2, "KWD", "13/2/2021", transactionType = TransactionType.DEPOSIT, 8776.6 ,1000920),
            TransactionData("Main", 690.2, "KWD", "15/5/2023", transactionType = TransactionType.DEPOSIT,797.0 , 1000112),
        )
    }
}
