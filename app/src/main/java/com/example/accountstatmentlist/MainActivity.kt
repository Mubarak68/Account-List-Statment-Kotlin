package com.example.accountstatmentlist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.accountstatmentlist.AccountStatmentRepo.AccountStatmentRepo
import com.example.accountstatmentlist.Composable.AccountCard
import com.example.accountstatmentlist.TransactionStatment.TransactionData
import com.example.accountstatmentlist.TransactionStatment.TransactionType
import com.example.accountstatmentlist.ui.theme.AccountStatmentListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val transData = AccountStatmentRepo.dummyDataTransactionData
        setContent {
            AccountStatmentListTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ) {

                    AccountsList(transData)
                }
            }
        }
    }
}

@Composable
fun AccountsList(transData : List<TransactionData>,modifier: Modifier = Modifier) {

    LazyColumn(modifier = Modifier){
        items(transData)
        {
            AccountCard(
                name = it.name,
                amount = it.amount,
                currency = it.currency,
                date = it.date,
                transactionType = it.transactionType ,
                balance = it.balance,
                accountNumber = it.accountNumber)
            Divider(color = Color.Black)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AccountPreview() {
    AccountStatmentListTheme {
        AccountsList(AccountStatmentRepo.dummyDataTransactionData)
    }
}