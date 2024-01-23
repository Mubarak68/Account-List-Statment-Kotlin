package com.example.accountstatmentlist.Composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.accountstatmentlist.R
import com.example.accountstatmentlist.TransactionStatment.TransactionData
import com.example.accountstatmentlist.TransactionStatment.TransactionType

@Composable
fun AccountCard( name: String,
                 amount: Double,
                 currency: String,
                 date : String,
                 transactionType: TransactionType,
                 balance: Double,
                 accountNumber: Int,
                modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Row(horizontalArrangement = Arrangement.SpaceBetween,
            modifier = modifier
                .fillMaxSize()
                .padding(5.dp)) {
            Text(text = "Type: $transactionType")
        }
        Row(horizontalArrangement = Arrangement.SpaceBetween,
            modifier = modifier
                .fillMaxSize()
                .background(Color.Cyan)
                .padding(5.dp)) {
            Text(text = stringResource(R.string.account, name))
            Text(text = "Balance: $balance")
            Text(text = "$amount $currency")
        }
        Row (horizontalArrangement = Arrangement.SpaceBetween,
            modifier = modifier
                .fillMaxSize()
                .background(Color.Cyan)
                .padding(5.dp)){
            Text(text = "$accountNumber")
            Text(text = "$date")
        }

    }
}